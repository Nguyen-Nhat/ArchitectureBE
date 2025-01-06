package org.archi.auth.service;

import lombok.AllArgsConstructor;
import org.archi.auth.model.Account;
import org.archi.auth.model.Player;
import org.archi.auth.repo.PlayerRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerService {
  private final PlayerRepo playerRepo;

  public Player save(Player player) {
    return playerRepo.save(player);
  }

  public Player findById(long id) {
    return playerRepo.findById(id).orElse(null);
  }

  public Player findByAccount(Account account) {
    return playerRepo.findByAccount(account).orElse(null);
  }

  public void deletePlayerByAccount(Account account) {
    try {
      playerRepo.deleteByAccount(account);
    } catch (RuntimeException e) {
      throw new RuntimeException("Error: " + e.getMessage());
    }
  }

  public Page<Player> findAll(Specification<Player> specs, Pageable pageable) {
    return playerRepo.findAll(specs, pageable);
  }
}
