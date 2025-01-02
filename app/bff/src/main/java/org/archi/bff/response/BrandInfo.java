package org.archi.bff.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class BrandInfo {
  private long status;
  private String message;
  private long id;
  private String name;
  private String field;
  private String address;
  private String gps;
  private Boolean isEnable;
}
