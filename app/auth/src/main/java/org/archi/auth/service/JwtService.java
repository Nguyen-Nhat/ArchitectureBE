package org.archi.auth.service;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.archi.auth.model.Account;
import org.archi.common.auth.PostRefreshTokenRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Service
@Getter
public class JwtService {
  @Value("${application.security.jwt.secret-key}")
  private String secretKey;
  @Value("${application.security.jwt.expiration}")
  private long accessExpiration;
  @Value("${application.security.jwt.refresh-token.expiration}")
  private long refreshExpiration;

  public String generateAccessToken(Account account) {
    return buildToken(account, accessExpiration);
  }

  public String generateToken(Account account, long expiration) {
    return buildToken(account, expiration);
  }

  public String generateRefreshToken(Account account) {
    return buildToken(account, refreshExpiration);
  }

  public String buildToken(Account account, long expiration) {
    SecretKey secretKey = getSecretKey();
    return Jwts.builder().setIssuer("Auth service")
            .claim("account_id", account.getId())
            .setIssuedAt(new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis() + expiration))
            .signWith(secretKey).compact();
  }

  public SecretKey getSecretKey() {
    return Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));
  }

  public boolean isExpired(String token) {
    try {
      Jwts.parserBuilder().setSigningKey(getSecretKey()).build().parseClaimsJws(token);
      return false;
    } catch (ExpiredJwtException e) {
      return true;
    } catch (RuntimeException e) {
      return false;
    }
  }

  public boolean isValid(String token) {
    try {
      Jwts.parserBuilder().setSigningKey(getSecretKey()).build().parseClaimsJws(token);
      return true;
    } catch (RuntimeException e) {
      return false;
    }
  }

  public Long getAccountId(String token) {
    try {
      return Jwts.parserBuilder().setSigningKey(getSecretKey()).build().parseClaimsJws(token).getBody().get("account_id", Long.class);
    } catch (ExpiredJwtException e) {
      return null;
    }
  }
}
