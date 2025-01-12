package org.archi.core.entity.campaign;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "piece_players")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PiecePlayer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "piece_id", referencedColumnName = "id")
  private Piece piece;

  private Long playerId;
  private Integer quantity;
}