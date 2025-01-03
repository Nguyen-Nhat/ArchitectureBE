package org.archi.bff.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PlayerInfo {
  private long status;
  private String message;
  private long id;
  private String name;
  private String avatar;
  private long birthDate;
  private String gender;
  private String facebook;
}
