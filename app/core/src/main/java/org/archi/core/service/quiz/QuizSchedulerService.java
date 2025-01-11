package org.archi.core.service.quiz;

import lombok.RequiredArgsConstructor;
import org.archi.common.quiz.*;
import org.archi.core.entity.quiz.QuizQuestion;
import org.archi.core.mapper.QuizMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@Component
@RequiredArgsConstructor
public class QuizSchedulerService {
    private final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(15);
    private final RedisTemplate<String, Object> redisTemplate;
    private final RabbitTemplate rabbitTemplate;
    private final QuizPlayingService quizPlayingService;
    private final QuizService quizService;
    private final QuizMapper quizMapper;

    @RabbitListener(queues = "quiz.schedule.queue")
    public void handleQuizScheduleEvent(ScheduledQuizDTO quiz) {
        openQuiz(quiz);
        executorService.schedule(() -> playQuiz(quiz), TimeUnit.MINUTES.toMillis(5), TimeUnit.MILLISECONDS);
    }

    public void openQuiz(ScheduledQuizDTO quiz) {
        // RabbitMQ
        rabbitTemplate.convertAndSend("quiz.open.exchange", "", quiz.getGameId());

        // Redis
        String key = "game:" + quiz.getGameId() + ":status";
        redisTemplate.opsForHash().put(key, "questionStartTime", 0L);
        redisTemplate.opsForHash().put(key, "questionNumber", 0);
        redisTemplate.opsForHash().put(key, "questionCorrectAnswer", "N/A");
    }

    public void playQuiz(ScheduledQuizDTO quiz) {
        rabbitTemplate.convertAndSend("quiz.start.exchange", "", quiz.getGameId());

        AtomicReference<Map<Long, QuizResultDTO>> results = new AtomicReference<>();
        List<QuizQuestion> questions =  quizService.getQuizQuestionsByGameId(quiz.getGameId());

        for (int i = 0; i < questions.size(); i++) {
            QuizQuestion question = questions.get(i);
            long questionDelay = i * 20L;

            executorService.schedule(() -> {
                String key = "game:" + quiz.getGameId() + ":status";
                redisTemplate.opsForHash().put(key, "questionStartTime", System.currentTimeMillis());
                redisTemplate.opsForHash().put(key, "questionNumber", question.getQuestionNumber());
                redisTemplate.opsForHash().put(key, "questionCorrectAnswer", question.getCorrectAnswer());

                rabbitTemplate.convertAndSend("quiz.question.exchange", "",
                        new ScheduledQuestionDTO(quiz.getGameId(), quizMapper.toQuizQuestionDTO(question)));

            }, questionDelay, TimeUnit.SECONDS);


            executorService.schedule(() -> {

                rabbitTemplate.convertAndSend("quiz.answer.exchange", "",
                        new ScheduledCorrectAnswerDTO(quiz.getGameId(), quizMapper.toQuizAnswerDTO(question)));

            }, questionDelay + 10, TimeUnit.SECONDS);
        }

        executorService.schedule(() -> {
            results.set(quizPlayingService.calculateResults(quiz.getGameId()));
        }, (questions.size() * 20L) - 5L, TimeUnit.SECONDS);

        executorService.schedule(() -> endQuiz(quiz.getGameId(), results), questions.size() * 20L, TimeUnit.SECONDS);

    }

    private void endQuiz(Long gameId, AtomicReference<Map<Long, QuizResultDTO>> results) {
        rabbitTemplate.convertAndSend("quiz.result.exchange", "", new QuizAllResultsDTO(gameId, results));

        String pattern = "game:" + gameId + ":*";
        Set<String> keys = redisTemplate.keys(pattern);

        if (keys != null && !keys.isEmpty()) {
            redisTemplate.delete(keys);
        }
    }
}
