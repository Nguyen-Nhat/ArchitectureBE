package org.archi.bff.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AccountResponse {
  private long id;
  private String username;
  private String email;
  private String phoneNumber;
  private String role;
  private boolean isActive;
}
