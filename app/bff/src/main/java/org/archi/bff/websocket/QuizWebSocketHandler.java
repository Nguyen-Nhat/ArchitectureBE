package org.archi.bff.websocket;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.archi.bff.service.CoreService;
import org.archi.bff.util.JsonUtil;
import org.archi.common.core.GetWinItemResponse;
import org.archi.common.quiz.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
@RequiredArgsConstructor
public class QuizWebSocketHandler extends TextWebSocketHandler {
    private static final Logger logger = LoggerFactory.getLogger(QuizWebSocketHandler.class);
    private final List<Long> pendingGames = new ArrayList<>();
    private final Map<Long, List<WebSocketSession>> gameSessions = new HashMap<>();
    private final RabbitTemplate rabbitTemplate;
    private final CoreService coreService;

    public void addGame(Long gameId) {

        pendingGames.add(gameId);
        gameSessions.put(gameId, new ArrayList<>());
    }

    public void removePendingGame(Long gameId) {
        pendingGames.remove(gameId);
    }

    public void removeGame(Long gameId) {
        List<WebSocketSession> sessions = gameSessions.get(gameId);
        List<WebSocketSession> sessionsCopy = new ArrayList<>(sessions);

        for (WebSocketSession session : sessionsCopy) {
            try {
                session.close();
            } catch (IOException e) {
                logger.error("Failed to close session: {}", session.getId(), e);
            }
        }

        gameSessions.remove(gameId);
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        Long gameId = extractGameId(session);

        if (!pendingGames.contains(gameId)) {
            session.sendMessage(new TextMessage("Game is not open."));
            session.close(CloseStatus.NOT_ACCEPTABLE);

        } else {
            session.sendMessage(new TextMessage("Welcome to Quiz game!"));
            session.getAttributes().put("gameId", gameId);
            Long playerId = (Long) session.getAttributes().get("playerId");

            rabbitTemplate.convertAndSend("quiz.newplayer.exchange", "quiz.newplayer", new PlayingPlayerDTO(gameId, playerId));
            gameSessions.get(gameId).add(session);
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        Long gameId = (Long) session.getAttributes().get("gameId");
        gameSessions.get(gameId).remove(session);

        Long playerId = (Long) session.getAttributes().get("playerId");
        rabbitTemplate.convertAndSend("quiz.leftplayer.exchange", "quiz.leftplayer", new PlayingPlayerDTO(gameId, playerId));

    }

    public void broadcastQuestion(ScheduledQuestionDTO data) {
        Long gameId = data.getGameId();
        QuizQuestionDTO question = data.getQuestion();

        String jsonQuestion = null;

        try {
            jsonQuestion = JsonUtil.convertObjectToJson(question);
        } catch (JsonProcessingException e) {
            logger.error("Failed to serialize question: " + data, e);
            return;
        }

        final String finalJsonQuestion = jsonQuestion;

        gameSessions.get(gameId).forEach(session -> {
            try {
                session.sendMessage(new TextMessage(finalJsonQuestion));
            } catch (IOException e) {
                logger.error("Failed to send question to session: " + session.getId(), e);
            }
        });
    }

    public void broadcastAnswer(ScheduledCorrectAnswerDTO data) {
        Long gameId = data.getGameId();
        QuizCorrectAnswerDTO answer = data.getAnswer();

        String jsonAnswer = null;

        try {
            jsonAnswer = JsonUtil.convertObjectToJson(answer);
        } catch (JsonProcessingException e) {
            logger.error("Failed to serialize answer: " + data, e);
            return;
        }

        final String finalJsonAnswer = jsonAnswer;

        gameSessions.get(gameId).forEach(session -> {
            try {
                session.sendMessage(new TextMessage(finalJsonAnswer));
            } catch (IOException e) {
                logger.error("Failed to send answer to session: " + session.getId(), e);
            }
        });
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        long timeGetAnswer = System.currentTimeMillis();
        Long gameId = (Long) session.getAttributes().get("gameId");

        if (!pendingGames.contains(gameId) && gameSessions.containsKey(gameId)) {

            Long playerId = (Long) session.getAttributes().get("playerId");
            String payload = message.getPayload();

            QuizPlayerAnswerDTO playerAnswer = null;
            try {
                playerAnswer = JsonUtil.convertJsonToAnswer(payload);
            } catch (JsonProcessingException e) {
                logger.error("Failed to convert player answer: " + payload, e);
                return;
            }

            rabbitTemplate.convertAndSend("quiz.playeranswer.exchange", "quiz.playeranswer",
                    new InfoQuizPlayerAnswerDTO(gameId, playerId, timeGetAnswer, playerAnswer));
        }
    }

    private Long extractGameId(WebSocketSession session) {
        String uri = session.getUri().toString();
        String gameIdParam = uri.split("\\?")[1].split("=")[1];
        return Long.valueOf(gameIdParam);
    }

    public void sendResultToAllPlayer(QuizAllResultsDTO data) {
        Map<Long, QuizResultDTO> results = data.getResults().get();
        List<WebSocketSession> sessions = gameSessions.get(data.getGameId());

        for (WebSocketSession session : sessions) {
            Long playerId = (Long) session.getAttributes().get("playerId");
            QuizResultDTO result = results.get(playerId);

            if (results.containsKey(playerId)) {
                String jsonResult = null;

                try {
                    jsonResult = JsonUtil.convertObjectToJson(result);
                } catch (JsonProcessingException e) {
                    logger.error("Failed to serialize result: " + data, e);
                    continue;
                }

                try {
                    session.sendMessage(new TextMessage(jsonResult));
                } catch (IOException e) {
                    logger.error("Failed to send result to session: " + session.getId(), e);
                }


                if (result.getRank() <= 3) {
                    GetWinItemResponse winItem = coreService.getWinItem(playerId, data.getGameId());

                    try {
                        String jsonWinItem = JsonUtil.convertWinItemToJson(winItem);
                        session.sendMessage(new TextMessage(jsonWinItem));
                    } catch (IOException e) {
                        logger.error("Failed to send win item to session: " + session.getId(), e);
                    }
                }
            }
        }
    }
}
