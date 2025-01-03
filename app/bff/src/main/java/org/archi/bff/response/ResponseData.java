package org.archi.bff.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class ResponseData {
  private long status;
  private String message;
  @JsonInclude(JsonInclude.Include.NON_NULL)  // Khi data = null thì sẽ không có trong Response.
  private Object data;

  public ResponseData(int status, String message) {
    this.status = status;
    this.message = message;
    data = null;
  }
}
