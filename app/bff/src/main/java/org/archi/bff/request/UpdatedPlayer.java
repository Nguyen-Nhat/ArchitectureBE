package org.archi.bff.request;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class UpdatedPlayer {
  private String name;
  private String avatar;
  private String birthDate;
  private String gender;
  private String facebook;
}
