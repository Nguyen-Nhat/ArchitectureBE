package org.archi.core.repo.game;

import org.archi.core.entity.game.GameType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameTypeRepo extends JpaRepository<GameType, Integer> {
}
