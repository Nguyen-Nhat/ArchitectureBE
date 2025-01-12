package org.archi.bff.request;

import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
public class CreatePuzzleRequest {
  private String title;
  private String image;
  private Date startDate;
  private Date endDate;
  private Integer numberOfPieces;
  private String status;
}