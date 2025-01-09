package org.archi.core.repo.quiz;

import org.archi.core.entity.game.Game;
import org.archi.core.entity.quiz.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizQuestionRepo extends JpaRepository<QuizQuestion, Long> {
    List<QuizQuestion> findByGame(Game game);
}
