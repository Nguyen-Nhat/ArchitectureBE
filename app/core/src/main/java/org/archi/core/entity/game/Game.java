package org.archi.core.entity.game;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.archi.core.entity.campaign.Campaign;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "game")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private Long id;

    @Column(name = "allow_pieces_exchange", nullable = false)
    private Boolean allowPiecesExchange = true;

    @Column(name = "start_at")
    private LocalDateTime startAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id", nullable = false)
    private GameType type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "campaign_id", nullable = false)
    private Campaign campaign;
}

