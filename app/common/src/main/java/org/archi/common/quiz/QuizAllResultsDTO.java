package org.archi.common.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizAllResultsDTO {
    private Long gameId;
    private AtomicReference<Map<Long, QuizResultDTO>> results;
}
