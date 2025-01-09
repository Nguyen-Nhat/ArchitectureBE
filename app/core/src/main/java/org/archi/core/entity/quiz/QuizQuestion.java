package org.archi.core.entity.quiz;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.archi.core.entity.game.Game;

@Entity
@Table(name = "quiz_question", uniqueConstraints = @UniqueConstraint(columnNames = {"game_id", "question_number"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long questionId;

    @ManyToOne
    @JoinColumn(name = "game_id", referencedColumnName = "game_id", nullable = false)
    private Game game;

    @Column(name = "question_number", nullable = false)
    private Integer questionNumber;

    @Column(name = "question_title", nullable = false)
    private String questionTitle;

    @Column(name = "question_content")
    private String questionContent;

    @Column(name = "answer_a", nullable = false)
    private String answerA;

    @Column(name = "answer_b", nullable = false)
    private String answerB;

    @Column(name = "answer_c", nullable = false)
    private String answerC;

    @Column(name = "answer_d", nullable = false)
    private String answerD;

    @Column(name = "correct_answer", nullable = false, length = 1)
    private Character correctAnswer;

    @Column(name = "answer_explanation")
    private String answerExplanation;
}
