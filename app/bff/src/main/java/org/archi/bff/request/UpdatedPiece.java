package org.archi.bff.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatedPiece {
  private String image;
  private Integer ordinal;
  private Integer quantity;
}
