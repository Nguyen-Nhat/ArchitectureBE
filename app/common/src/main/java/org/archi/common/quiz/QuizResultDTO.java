package org.archi.common.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizResultDTO {
    private int rank;
    private Integer totalScore;
    private BigDecimal totalTime;
}
