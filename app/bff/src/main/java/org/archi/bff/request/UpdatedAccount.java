package org.archi.bff.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UpdatedAccount {
  private String email;
  private String phoneNumber;
  private Boolean isActive;
}
