package org.archi.core.service;

import lombok.AllArgsConstructor;
import org.archi.core.entity.GameTurn;
import org.archi.core.repo.GameTurnRepo;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GameTurnService {
  private final GameTurnRepo gameTurnRepo;

  public GameTurn findByPlayerId(long playerId) {
    return gameTurnRepo.findByPlayerId(playerId);
  }

  public GameTurn save(GameTurn gameTurn) {
    return gameTurnRepo.save(gameTurn);
  }
}
