package org.archi.core.entity.campaign;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "piece_player_transfers")
public class PiecePlayerTransfer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "piece_id", referencedColumnName = "id")
  private Piece piece;

  @Column(name = "sender_id")
  private Long sender;
  @Column(name = "recipient_id")
  private Long recipient;
}