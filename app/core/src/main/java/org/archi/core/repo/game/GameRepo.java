package org.archi.core.repo.game;

import org.archi.core.entity.game.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface GameRepo extends JpaRepository<Game, Long> {
    List<Game> findByCampaign_Id(Long campaignId);

    @Query("SELECT g FROM Game g WHERE g.startAt >= :currentDateTime")
    List<Game> findUpcomingGames(@Param("currentDateTime") LocalDateTime currentDateTime);
}
