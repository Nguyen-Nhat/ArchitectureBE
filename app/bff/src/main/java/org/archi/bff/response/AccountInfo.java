package org.archi.bff.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class AccountInfo {
  private long status;
  private String message;
  private long id;
  private String username;
  private String email;
  private String phoneNumber;
  private String role;
  private Boolean isActive;
}
