package org.archi.core.entity.quiz;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.archi.core.entity.game.GamePlayer;

import java.math.BigDecimal;

@Entity
@Table(name = "quiz_player")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizPlayer {
    @Id
    @Column(name = "gameplayer_id")
    private Long id;

    @Column(name = "total_score", nullable = false)
    private Integer totalScore;

    @Column(name = "total_time", nullable = false, precision = 10, scale = 3)
    private BigDecimal totalTime;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "gameplayer_id", referencedColumnName = "gameplayer_id")
    private GamePlayer gamePlayer;
}
