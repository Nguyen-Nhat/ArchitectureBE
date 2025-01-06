package org.archi.bff.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class ExceptionResponse {
  private int status;
  private String message;
  private Map<String, String> details;

  public ExceptionResponse(int status, String message, Map<String, String> details) {
    this.status = status;
    this.message = message;
    this.details = details;
  }
}
