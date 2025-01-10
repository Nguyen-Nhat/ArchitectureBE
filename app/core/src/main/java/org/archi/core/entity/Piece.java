package org.archi.core.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "pieces")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Piece {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String image;
  private Integer ordinal;
  private Integer quantity;

  @ManyToOne(targetEntity = Puzzle.class)
  @JoinColumn(name = "puzzle_id", referencedColumnName = "id")
  private Puzzle puzzle;
}
