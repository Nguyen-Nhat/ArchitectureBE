package org.archi.auth.repo;

import org.archi.auth.model.Account;
import org.archi.auth.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Long> {
  Optional<Player> findByAccount(Account account);

  @Transactional
  void deleteByAccount(Account account);
}
