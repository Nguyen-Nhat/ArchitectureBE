package org.archi.core.repo.game;

import org.archi.core.entity.game.GamePlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamePlayerRepo extends JpaRepository<GamePlayer, Long> {
}
