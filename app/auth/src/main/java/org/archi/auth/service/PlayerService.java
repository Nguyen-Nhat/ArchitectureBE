package org.archi.auth.service;

import lombok.AllArgsConstructor;
import org.archi.auth.model.Player;
import org.archi.auth.repo.PlayerRepo;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerService {
  private final PlayerRepo playerRepo;
  public Player save(Player player) {
    return playerRepo.save(player);
  }

}
