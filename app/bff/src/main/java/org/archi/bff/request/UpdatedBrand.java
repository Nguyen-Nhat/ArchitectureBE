package org.archi.bff.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatedBrand {
  private String name;
  private String field;
  private String address;
  private String gps;
}
