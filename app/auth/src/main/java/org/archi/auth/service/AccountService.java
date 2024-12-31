package org.archi.auth.service;

import lombok.AllArgsConstructor;
import org.archi.auth.exceptions.ResourceNotFoundException;
import org.archi.auth.model.Account;
import org.archi.auth.repo.AccountRepo;
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

  public Account findByIdOrElseThrow(long l) {
    return accountRepo.findById(l).orElseThrow(() -> new ResourceNotFoundException("Account not found", Map.of("account_id", String.valueOf(l))));
  }
}
