package org.archi.auth.service;

import lombok.AllArgsConstructor;
import org.archi.auth.model.AccessToken;
import org.archi.auth.model.Account;
import org.archi.auth.repo.AccessTokenRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccessTokenService {
  private final AccessTokenRepo accessTokenRepo;

  public List<AccessToken> findAllValidTokenByUser(Long id) {
    return accessTokenRepo.findAllValidTokenByUser(id);
  }

  public AccessToken findByToken(String token) {
    return accessTokenRepo.findByToken(token).orElse(null);
  }

  public AccessToken saveAccessToken(AccessToken accessToken) {
    return accessTokenRepo.save(accessToken);
  }

  public void deleteAccessTokenByAccount(Account account) {
    try {
      accessTokenRepo.deleteByAccount(account.getId());
    } catch (RuntimeException e) {
      throw new RuntimeException("Error: " + e.getMessage());
    }
  }

}
