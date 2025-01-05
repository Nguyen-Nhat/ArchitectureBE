package org.archi.bff.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BrandResponse {
  private long id;
  private String name;
  private String field;
  private String address;
  private String gps;
  private boolean isEnable;
}
