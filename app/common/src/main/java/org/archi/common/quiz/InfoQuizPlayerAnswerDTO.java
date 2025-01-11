package org.archi.common.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoQuizPlayerAnswerDTO {
    private Long gameId;
    private Long playerId;
    private long timeGetAnswer;
    private QuizPlayerAnswerDTO quizPlayerAnswerDTO;
}
