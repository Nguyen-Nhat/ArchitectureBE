package org.archi.bff.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UpdatedPuzzle {
  private String title;
  private String image;
  private Date startDate;
  private Date endDate;
  private Integer numberOfPieces;
  private String status;
}
