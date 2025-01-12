package org.archi.core.entity.campaign;

import jakarta.persistence.*;
import lombok.*;
import org.archi.core.entity.PuzzleStatus;
import org.archi.core.entity.campaign.Piece;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "puzzles")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Puzzle {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String image;
  private Date startDate;
  private Date endDate;
  private Integer numberOfPieces;
  @Enumerated(EnumType.STRING)
  private PuzzleStatus status;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
  @JoinColumn(name = "puzzle_id", referencedColumnName = "id")
  private List<Piece> pieces;
}