package org.archi.bff.websocket;

import lombok.RequiredArgsConstructor;
import org.archi.common.quiz.QuizAllResultsDTO;
import org.archi.common.quiz.ScheduledCorrectAnswerDTO;
import org.archi.common.quiz.ScheduledQuestionDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizEventListener {
    private final QuizWebSocketHandler quizWebSocketHandler;

    @RabbitListener(queues = "quiz.open.queue")
    public void handleQuizOpenEvent(Long gameId) {
        quizWebSocketHandler.addGame(gameId);
    }

    @RabbitListener(queues = "quiz.start.queue")
    public void handleQuizStartEvent(Long gameId) {
        quizWebSocketHandler.removePendingGame(gameId);
    }

    @RabbitListener(queues = "quiz.question.queue")
    public void handleQuizQuestionEvent(ScheduledQuestionDTO data) {
        quizWebSocketHandler.broadcastQuestion(data);
    }

    @RabbitListener(queues = "quiz.answer.queue")
    public void handleQuizCorrectAnswerEvent(ScheduledCorrectAnswerDTO data) {
        quizWebSocketHandler.broadcastAnswer(data);
    }

    @RabbitListener(queues = "quiz.result.queue")
    public void handleQuizResultEvent(QuizAllResultsDTO data) {
        quizWebSocketHandler.sendResultToAllPlayer(data);
        quizWebSocketHandler.removeGame(data.getGameId());
    }
}
