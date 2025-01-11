package org.archi.common.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduledCorrectAnswerDTO {
    private Long gameId;
    private QuizCorrectAnswerDTO answer;
}
