package org.archi.auth.service;

import com.google.api.Http;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.archi.auth.exceptions.ResourceNotFoundException;
import org.archi.auth.model.*;
import org.archi.auth.repo.AccessTokenRepo;
import org.archi.common.auth.*;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Locale;

@Slf4j
@Service
@AllArgsConstructor
public class AuthenticationService {
  private final AccountService accountService;
  private final AuthenticationManager authenticationManager;
  private final JwtService jwtService;
  private final AccessTokenRepo accessTokenRepo;
  private final AccessTokenService accessTokenService;
  public PostLoginResponse login(PostLoginRequest request) {
    Authentication authentication = UsernamePasswordAuthenticationToken.unauthenticated(request.getUsername(), request.getPassword());
    Authentication response = authenticationManager.authenticate(authentication); // Thực hiện authenticate bằng cách dùng @Bean Manager đã tạo trong ProjectConfigSecurity để xác thực.

    if (response != null && response.isAuthenticated()) {
      // Xác thực thành công.
      Account account = accountService.findByUsername(request.getUsername());

      if (!account.getIsActive()) {
        return PostLoginResponse.newBuilder()
                .setStatus(HttpStatus.FORBIDDEN.value())
                .setMessage("Account is not active")
                .build();
      }

      String accessToken = jwtService.generateAccessToken(account);
      String refreshToken = jwtService.generateRefreshToken(account);
      revokeAllAccessToken(account);
      AccessToken saved = saveAccessToken(accessToken, account);
      if (saved == null || saved.getId() <= 0) {
        return PostLoginResponse.newBuilder()
                .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .setMessage("Failed to save access token")
                .build();
      }
      Date expire = new Date(System.currentTimeMillis() + jwtService.getAccessExpiration());
      return PostLoginResponse.newBuilder()
              .setStatus(HttpStatus.OK.value())
              .setAccessToken(accessToken)
              .setRefreshToken(refreshToken)
              .setMessage("Success")
              .setTokenType("Bearer")
              .setExpiresIn(expire.getTime())
              .build();
    }
    return PostLoginResponse.newBuilder()
            .setStatus(HttpStatus.UNAUTHORIZED.value())
            .setMessage("Unauthorized")
            .build();
  }

  public PostRefreshTokenResponse refreshToken(PostRefreshTokenRequest request) {
    // Hàm thực hiện refresh token.
    if (!jwtService.isValid(request.getRefreshToken())) {
      return PostRefreshTokenResponse.newBuilder()
              .setStatus(HttpStatus.UNAUTHORIZED.value())
              .setMessage("Token is invalid")
              .build();
    }
    try {
      Long id = jwtService.getAccountId(request.getRefreshToken());
      Account account = accountService.findByIdOrElseThrow(id);
      String accessToken = jwtService.generateAccessToken(account);
      revokeAllAccessToken(account);
      AccessToken saved = saveAccessToken(accessToken, account);
      if (saved == null || saved.getId() <= 0) {
        return PostRefreshTokenResponse.newBuilder()
                .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .setMessage("Failed to save access token")
                .build();
      }
      Date expire = new Date(System.currentTimeMillis() + jwtService.getAccessExpiration());
      return PostRefreshTokenResponse.newBuilder()
              .setStatus(HttpStatus.OK.value())
              .setAccessToken(accessToken)
              .setExpiresIn(expire.getTime())
              .setTokenType("Bearer")
              .setMessage("Success")
              .build();
    } catch (ResourceNotFoundException rs) {
      return PostRefreshTokenResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Resource not found")
              .build();
    } catch (RuntimeException e) {
      return PostRefreshTokenResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Internal server error")
              .build();
    }
  }


  public void revokeAllAccessToken(Account account) {
    // Xóa tất cả access token của account.
    var validUserTokens = accessTokenRepo.findAllValidTokenByUser(account.getId());
    if (validUserTokens.isEmpty())
      return;
    validUserTokens.forEach(token -> {
      token.setExpired(true);
      token.setRevoked(true);
    });
    accessTokenRepo.saveAll(validUserTokens);
  }

  public AccessToken saveAccessToken(String token, Account account) {
    // Lưu access token vào database.
    AccessToken accessToken = AccessToken.builder()
            .token(token)
            .account(account)
            .expired(false)
            .revoked(false)
            .build();
    return accessTokenService.saveAccessToken(accessToken);
  }

  public PostLogoutResponse logout(PostLogoutRequest request) {
    // Hàm thực hiện logout.

    // Kiểm tra xem token còn hợp lệ không.
    if (!jwtService.isValid(request.getAccessToken())) {
      return PostLogoutResponse.newBuilder()
              .setStatus(HttpStatus.UNAUTHORIZED.value())
              .setMessage("Token is invalid")
              .build();
    }
    try {
      Long id = jwtService.getAccountId(request.getAccessToken());
      Account account = accountService.findByIdOrElseThrow(id);
      revokeAllAccessToken(account);
      return PostLogoutResponse.newBuilder()
              .setStatus(HttpStatus.OK.value())
              .setMessage("Success")
              .build();
    } catch (ResourceNotFoundException rs) {
      return PostLogoutResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Resource not found")
              .build();
    } catch (RuntimeException e) {
      return PostLogoutResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Internal server error")
              .build();
    }
  }

  public void verifyToken(String token) {
    // Hàm thực hiện xác thực token.
    if (!jwtService.isValid(token)) {
      throw new RuntimeException("Invalid token");
    }


  }
}
