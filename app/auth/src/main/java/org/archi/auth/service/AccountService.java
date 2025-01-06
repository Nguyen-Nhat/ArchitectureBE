package org.archi.auth.service;

import lombok.AllArgsConstructor;
import org.archi.auth.exceptions.ResourceNotFoundException;
import org.archi.auth.model.Account;
import org.archi.auth.repo.AccountRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class AccountService {
  private final AccountRepo accountRepo;

  public Account findByUsername(String username) {
    return accountRepo.findByUsername(username).orElse(null);
  }

  public Account findByUsernameOrElseThrow(String username) {
    return accountRepo.findByUsername(username).orElseThrow(() -> new RuntimeException("Account not found"));
  }

  public Account findByEmail(String email) {
    return accountRepo.findByEmail(email).orElse(null);
  }

  public Account findByPhoneNumber(String phoneNumber) {
    return accountRepo.findByPhoneNumber(phoneNumber).orElse(null);
  }

  public Account save(Account account) {
    return accountRepo.save(account);
  }

  public Account findByIdOrElseThrow(Long l) {
    if (l == null) {
      throw new ResourceNotFoundException("Account not found", Map.of("account_id", "null"));
    }
    return accountRepo.findById(l).orElseThrow(() -> new ResourceNotFoundException("Account not found", Map.of("account_id", String.valueOf(l))));
  }

  public Account findById(long l) {
    return accountRepo.findById(l).orElse(null);
  }

  public void delete(Account account) {
    accountRepo.delete(account);
  }

  public Page<Account> findAll(Specification<Account> specification, Pageable pageable) {
    try {
      return accountRepo.findAll(specification, pageable);
    } catch (Exception e) {
      throw new RuntimeException("Error while fetching accounts");
    }
  }
}
