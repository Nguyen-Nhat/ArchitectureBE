package org.archi.bff.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogoutRequest {
  private String token;
}
