package org.archi.bff.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PieceResponse {
  private Long id;
  private Long puzzleId;
  private String image;
  private Integer ordinal;
  private Integer quantity;
}
