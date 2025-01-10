package org.archi.common.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduledQuizDTO {
    private Long gameId;
    private LocalDateTime startAt;
}

