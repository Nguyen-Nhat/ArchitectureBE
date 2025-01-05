package org.archi.auth.repo;

import org.archi.auth.model.AccessToken;
import org.archi.auth.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface AccessTokenRepo extends JpaRepository<AccessToken, Long> {
  @Query(value = "SELECT * FROM access_tokens WHERE account_id = :id AND (expired = false OR revoked = false)", nativeQuery = true)
  List<AccessToken> findAllValidTokenByUser(Long id);

  Optional<AccessToken> findByToken(String token);

  @Modifying
  @Transactional
  @Query(value = "DELETE FROM access_tokens WHERE account_id = :accountId", nativeQuery = true)
  void deleteByAccount(long accountId);
}
