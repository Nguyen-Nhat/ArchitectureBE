package org.archi.auth.repo;

import org.archi.auth.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
  Optional<Account> findByUsername(String username);
  Optional<Account> findByEmail(String email);
  Optional<Account> findByPhoneNumber(String phoneNumber);
  Page<Account> findAll(Specification<Account> specification, Pageable pageable);
}
