package org.archi.core.service;

import lombok.AllArgsConstructor;
import org.archi.core.entity.TurnTransfer;
import org.archi.core.repo.TurnTransferRepo;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TurnTransferService {
  private final TurnTransferRepo turnTransferRepo;
}
