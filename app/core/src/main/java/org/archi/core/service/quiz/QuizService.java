package org.archi.core.service.quiz;

import lombok.RequiredArgsConstructor;
import org.archi.core.entity.game.Game;
import org.archi.core.entity.quiz.QuizPlayer;
import org.archi.core.entity.quiz.QuizQuestion;
import org.archi.core.repo.quiz.QuizPlayerRepo;
import org.archi.core.repo.quiz.QuizQuestionRepo;
import org.archi.core.service.game.GameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {
    private static final Logger logger = LoggerFactory.getLogger(QuizService.class);
    private final QuizPlayerRepo quizPlayerRepo;
    private final QuizQuestionRepo quizQuestionRepo;
    private final GameService gameService;

    public List<Game> getUpcomingQuizzes() {
        return gameService.getUpcomingGames();
    }

    public QuizQuestion getQuizQuestionById(Long id) {
        return quizQuestionRepo.findById(id)
                .orElseGet(() -> {
                    logger.warn("Quiz question not found with id: {}", id);
                    return null;
                });
    }

    public List<QuizQuestion> getQuizQuestionsByGame(Game game) {
        return quizQuestionRepo.findByGame(game);
    }

    public QuizPlayer addQuizPlayer(QuizPlayer quizPlayer) {
        return quizPlayerRepo.save(quizPlayer);
    }

    public QuizQuestion addQuizQuestion(QuizQuestion quizQuestion) {
        return quizQuestionRepo.save(quizQuestion);
    }

    public QuizQuestion updateQuizQuestion(Long id, QuizQuestion updatedQuizQuestion) {
        QuizQuestion quizQuestion = getQuizQuestionById(id);

        if (updatedQuizQuestion.getGame() != null) {
            quizQuestion.setGame(updatedQuizQuestion.getGame());
        }

        if (updatedQuizQuestion.getQuestionNumber() != null) {
            quizQuestion.setQuestionNumber(updatedQuizQuestion.getQuestionNumber());
        }

        if (updatedQuizQuestion.getQuestionTitle() != null) {
            quizQuestion.setQuestionTitle(updatedQuizQuestion.getQuestionTitle());
        }

        if (updatedQuizQuestion.getQuestionContent() != null) {
            quizQuestion.setQuestionContent(updatedQuizQuestion.getQuestionContent());
        }

        if (updatedQuizQuestion.getAnswerA() != null) {
            quizQuestion.setAnswerA(updatedQuizQuestion.getAnswerA());
        }

        if (updatedQuizQuestion.getAnswerB() != null) {
            quizQuestion.setAnswerB(updatedQuizQuestion.getAnswerB());
        }

        if (updatedQuizQuestion.getAnswerC() != null) {
            quizQuestion.setAnswerC(updatedQuizQuestion.getAnswerC());
        }

        if (updatedQuizQuestion.getAnswerD() != null) {
            quizQuestion.setAnswerD(updatedQuizQuestion.getAnswerD());
        }

        if (updatedQuizQuestion.getCorrectAnswer() != null) {
            quizQuestion.setCorrectAnswer(updatedQuizQuestion.getCorrectAnswer());
        }

        return quizQuestionRepo.save(quizQuestion);
    }

    public void deleteQuizQuestion(Long questionId) {
        quizQuestionRepo.deleteById(questionId);
    }
}
