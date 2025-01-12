package org.archi.core.service.campaign;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.archi.core.repo.campaign.GameTurnRepo;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class GameTurnScheduler {
  private final GameTurnRepo gameTurnRepo;
  @Scheduled(cron = "0 0 0 * * *")
  @Async("jobExecutor")
  public void scheduleGameTurns() {
    try {
      gameTurnRepo.resetAllGameTurns();
    } catch (Exception e) {
      log.error("Error when reset all game turns", e);
    }
  }
}
