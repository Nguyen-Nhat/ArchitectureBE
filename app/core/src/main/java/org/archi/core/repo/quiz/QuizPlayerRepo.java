package org.archi.core.repo.quiz;

import org.archi.core.entity.quiz.QuizPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizPlayerRepo extends JpaRepository<QuizPlayer, Long> {
}
