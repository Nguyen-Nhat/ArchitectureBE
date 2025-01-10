package org.archi.core.service.quiz;

import lombok.RequiredArgsConstructor;
import org.archi.common.quiz.InfoQuizPlayerAnswerDTO;
import org.archi.common.quiz.PlayingPlayerDTO;
import org.archi.common.quiz.QuizPlayerAnswerDTO;
import org.archi.common.quiz.QuizResultDTO;
import org.archi.core.entity.game.Game;
import org.archi.core.entity.game.GamePlayer;
import org.archi.core.entity.quiz.QuizPlayer;
import org.archi.core.service.game.GameService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuizPlayingService {
    private final GameService gameService;
    private final QuizService quizService;
    private final RedisTemplate<String, Object> redisTemplate;

    @RabbitListener(queues = "quiz.newplayer.queue")
    public void handleQuizNewPlayerEvent(PlayingPlayerDTO newPlayer) {
        Long gameId = newPlayer.getGameId();
        Long playerId = newPlayer.getPlayerId();

        // Save to Postgres database
        GamePlayer gamePlayer = new GamePlayer();
        Game game = gameService.getGameById(gameId);
        gamePlayer.setGame(game);
        gamePlayer.setPlayerId(playerId);
        gamePlayer = gameService.addGamePlayer(gamePlayer);

        // Add to Redis
        String key = "game:" + gameId + ":player:" + playerId;
        redisTemplate.opsForHash().put(key, "gamePlayerId", gamePlayer.getId());
        redisTemplate.opsForHash().put(key, "currentScore", 0);
        redisTemplate.opsForHash().put(key, "currentTime", 0L);
    }

    @RabbitListener(queues = "quiz.leftplayer.queue")
    public void handleQuizLeftPlayerEvent(PlayingPlayerDTO leftPlayer) {
        Long gameId = leftPlayer.getGameId();
        Long playerId = leftPlayer.getPlayerId();

        String key = "game:" + gameId + ":player:" + playerId;
        redisTemplate.delete(key);
    }

    @RabbitListener(queues = "quiz.playeranswer.queue")
    public void handleQuizPlayerAnswerEvent(InfoQuizPlayerAnswerDTO info) {
        Long gameId = info.getGameId();
        Long playerId = info.getPlayerId();
        long timeGetAnswer = info.getTimeGetAnswer();
        QuizPlayerAnswerDTO playerAnswer = info.getQuizPlayerAnswerDTO();


        String keyGame = "game:" + gameId + ":status";
        Long questionStartTime = (Long) redisTemplate.opsForHash().get(keyGame, "questionStartTime");
        Integer questionNumber = (Integer) redisTemplate.opsForHash().get(keyGame, "questionNumber");
        String strQuestionCorrectAnswer = (String) redisTemplate.opsForHash().get(keyGame, "questionCorrectAnswer");
        Character questionCorrectAnswer = strQuestionCorrectAnswer.charAt(0);


        if (questionNumber.equals(playerAnswer.getQuestionNumber())) {
            String keyPlayer = "game:" + gameId + ":player:" + playerId;
            Integer currentScore = (Integer) redisTemplate.opsForHash().get(keyPlayer, "currentScore");
            Object objCurrentTime = redisTemplate.opsForHash().get(keyPlayer, "currentTime");
            Long currentTime = Long.parseLong(objCurrentTime.toString());


            long timeTaken = timeGetAnswer - questionStartTime;
            redisTemplate.opsForHash().put(keyPlayer, "currentTime", currentTime + timeTaken);

            if (questionCorrectAnswer.equals(playerAnswer.getAnswer())) {
                redisTemplate.opsForHash().put(keyPlayer, "currentScore", currentScore + 10);
            }
        }
    }


    private Map<Long, QuizResultDTO> loadResults(Long gameId) {
        String keyPattern = "game:" + gameId + ":player:*";
        Set<String> playerKeys = redisTemplate.keys(keyPattern);

        Map<Long, QuizResultDTO> quizResults = new HashMap<>();

        if (playerKeys != null) {
            for (String playerKey : playerKeys) {
                Long playerId = Long.valueOf(playerKey.substring(playerKey.lastIndexOf(":") + 1));

                Map<Object, Object> playerData = redisTemplate.opsForHash().entries(playerKey);
                Long gamePlayerId = Long.parseLong(playerData.get("gamePlayerId").toString());
                Integer totalScore = Integer.parseInt(playerData.get("currentScore").toString());
                Long lTotalTime = Long.parseLong(playerData.get("currentTime").toString());
                BigDecimal totalTime = new BigDecimal(lTotalTime).divide(BigDecimal.valueOf(1000), 3, RoundingMode.HALF_UP);

                QuizResultDTO result = new QuizResultDTO();
                result.setTotalScore(totalScore);
                result.setTotalTime(totalTime);
                quizResults.put(playerId, result);

                saveResult(gamePlayerId, totalScore, totalTime);
            }
        }

        return quizResults;
    }

    private void saveResult(Long gamePlayerId, Integer totalScore, BigDecimal totalTime) {
        QuizPlayer quizPlayer = new QuizPlayer();
        quizPlayer.setId(gamePlayerId);
        quizPlayer.setTotalScore(totalScore);
        quizPlayer.setTotalTime(totalTime);

        quizService.addQuizPlayer(quizPlayer);
    }

    private List<Map.Entry<Long, QuizResultDTO>> sortResults(Map<Long, QuizResultDTO> quizResults) {
        List<Map.Entry<Long, QuizResultDTO>> results = new ArrayList<>(quizResults.entrySet());

        results.sort((entry1, entry2) -> {
            QuizResultDTO p1 = entry1.getValue();
            QuizResultDTO p2 = entry2.getValue();

            // Compare scores (descending)
            int scoreComparison = p2.getTotalScore().compareTo(p1.getTotalScore());
            if (scoreComparison != 0) {
                return scoreComparison;
            }

            // If scores are equal, compare time (ascending)
            return p1.getTotalTime().compareTo(p2.getTotalTime());
        });

        return results;
    }

    private void addRankResults(List<Map.Entry<Long, QuizResultDTO>> results) {
        int rank = 1;

        for (Map.Entry<Long, QuizResultDTO> result : results) {
            result.getValue().setRank(rank++);
        }
    }

    public Map<Long, QuizResultDTO> calculateResults(Long gameId) {
        Map<Long, QuizResultDTO> results = loadResults(gameId);
        List<Map.Entry<Long, QuizResultDTO>> sortedResults = sortResults(results);
        addRankResults(sortedResults);

        Map<Long, QuizResultDTO> finalResults = sortedResults.stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return finalResults;
    }
}
