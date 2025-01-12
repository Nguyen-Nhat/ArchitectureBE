package org.archi.core.repo.campaign;

import org.archi.core.entity.campaign.GameTurn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GameTurnRepo extends JpaRepository<GameTurn, Long> {

  GameTurn findByPlayerId(Long playerId);

  @Modifying
  @Query(value = "update game_turns set turns = 10 where true", nativeQuery = true)
  void resetAllGameTurns();
}
