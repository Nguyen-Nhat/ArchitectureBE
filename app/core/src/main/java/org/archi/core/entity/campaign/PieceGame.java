package org.archi.core.entity.campaign;

import jakarta.persistence.*;
import lombok.*;
import org.archi.core.entity.game.Game;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "piece_games")
public class PieceGame {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "piece_id", referencedColumnName = "id")
  private Piece piece;

  @ManyToOne
  @JoinColumn(name = "game_id", referencedColumnName = "game_id")
  private Game game;
  private Integer quantity;
}
