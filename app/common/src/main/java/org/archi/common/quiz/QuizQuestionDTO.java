package org.archi.common.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizQuestionDTO {
    private Integer questionNumber;
    private String questionTitle;
    private String questionContent;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
}
