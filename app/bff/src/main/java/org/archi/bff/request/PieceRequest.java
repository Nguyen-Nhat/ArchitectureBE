package org.archi.bff.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PieceRequest {
  private String image;
  private Integer ordinal;
  private Integer quantity;
  private Long puzzleId;
}
