package org.archi.bff.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TurnTransferRequest {
  private String info;
  private Integer times;
}
