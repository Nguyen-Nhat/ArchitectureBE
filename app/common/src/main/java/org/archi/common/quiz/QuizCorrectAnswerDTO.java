package org.archi.common.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizCorrectAnswerDTO {
    private Integer questionNumber;
    private Character correctAnswer;
    private String answerExplanation;
}
