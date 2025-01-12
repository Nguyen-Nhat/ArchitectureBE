package org.archi.bff.response;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PuzzleResponse {
  private Long id;
  private String title;
  private String image;
  private Date startDate;
  private Date endDate;
  private Integer numberOfPieces;
  private String status;
}