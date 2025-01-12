package org.archi.bff.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferRequest {
  private Long pieceId;
  private String info;
}