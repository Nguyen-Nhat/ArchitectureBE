package org.archi.core.repo;

import org.archi.core.entity.GameTurn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameTurnRepo extends JpaRepository<GameTurn, Long> {
  GameTurn findByPlayerId(long playerId);
}
