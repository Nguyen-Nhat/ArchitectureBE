package org.archi.bff.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Builder
public class PlayerInfo {
  private long status;
  private String message;
  private long id;
  private String name;
  private String avatar;
  private Date birthDate;
  private String gender;
  private String facebook;
}
