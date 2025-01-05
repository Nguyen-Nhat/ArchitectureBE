package org.archi.auth.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.archi.auth.enums.GENDER;
import org.archi.auth.enums.ROLE;
import org.archi.auth.exceptions.ResourceNotFoundException;
import org.archi.auth.model.*;
import org.archi.auth.repo.AccessTokenRepo;
import org.archi.common.auth.*;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

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
  private final RoleService roleService;
  private final PasswordEncoder passwordEncoder;
  private final PlayerService playerService;
  private final BrandService brandService;
  private final EmailService emailService;


  /// done
  @Transactional(rollbackFor = {ResourceNotFoundException.class, RuntimeException.class})
  public PostRegisterResponse register(PostRegisterRequest request) {
    ROLE name = ROLE.valueOf(request.getRole().toUpperCase(Locale.ROOT));
    Role role = roleService.findByName(name);
    if (role == null) {
      return PostRegisterResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Role not found").build();
    }

    String username = request.getUsername();
    String password = request.getPassword();
    String phoneNumber = request.getPhoneNumber();
    String email = request.getEmail();
    if (accountService.findByUsername(username) != null || accountService.findByEmail(email) != null || accountService.findByPhoneNumber(phoneNumber) != null) {
      return PostRegisterResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Account already exists").build();
    }

    Account account = Account.builder()
            .username(username)
            .password(passwordEncoder.encode(password))
            .email(email)
            .phoneNumber(phoneNumber)
            .isActive(false)  ///  Chưa active, phải thực hiện xác thực thông qua email trước.
            .role(role)
            .build();

    Account saved = accountService.save(account);
    if (saved == null || saved.getId() <= 0) {
      throw new RuntimeException("Failed to save account");
    }

    String body = emailService.generateBodyText(saved);
    emailService.sendEmail(saved.getEmail(), "Verify Your Account", body);

    switch (name) {
      case ROLE.PLAYER: {
        // Tạo mới tài khoản player.
        Player player = Player.builder()
                .name("")
                .avatar("")
                .birthDate(new java.sql.Date(new Date().getTime()))
                .gender(GENDER.OTHER)
                .facebook("")
                .account(saved)
                .build();
        player = playerService.save(player);
        if (player == null || player.getId() <= 0) {
          throw new RuntimeException("Failed to save player");
        }
        break;
      }
      case ROLE.BRAND: {
        // Tạo mới tài khoản brand.
        Brand brand = Brand.builder()
                .name("")
                .field("")
                .address("")
                .gps("")
                .isEnable(false)
                .account(saved)
                .build();
        brand = brandService.save(brand);
        if (brand == null || brand.getId() <= 0) {
          throw new RuntimeException("Failed to save brand");
        }
        break;
      }
      default:
        return PostRegisterResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Role not found").build();
    }
    return PostRegisterResponse.newBuilder().setStatus(HttpStatus.CREATED.value()).setMessage("Success").build();
  }

  /// done
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

  /// done
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

  /// done
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

  /// done
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

  /// done
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

  /// done
  public GetVerifyEmailResponse verifyEmail(GetVerifyEmailRequest request) {
    if (jwtService.isValid(request.getToken())) {
      // Cập nhật trạng thái của email đã được xác thực
      Long accountId = jwtService.getAccountId(request.getToken());
      if (accountId == null)
        return GetVerifyEmailResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Invalid token").build();
      Account account = accountService.findById(accountId);
      if (account == null)
        return GetVerifyEmailResponse.newBuilder().setStatus(HttpStatus.NOT_FOUND.value()).setMessage("Account not found").build();
      account.setIsActive(true);
      accountService.save(account);
      return GetVerifyEmailResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Email verified").build();
    } else if (jwtService.isExpired(request.getToken())) {
      return GetVerifyEmailResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Token expired").build();
    }
    return GetVerifyEmailResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Invalid token").build();
  }

  ///  done
  @Transactional(rollbackFor = {ResourceNotFoundException.class, RuntimeException.class})
  public PostCreateAccountResponse createAccount(PostCreateAccountRequest request) {
    ROLE name = ROLE.valueOf(request.getRole().toUpperCase(Locale.ROOT));
    Role role = roleService.findByName(name);
    if (role == null) {
      return PostCreateAccountResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Role not found").build();
    }

    String username = request.getUsername();
    String password = request.getPassword();
    String phoneNumber = request.getPhoneNumber();
    String email = request.getEmail();
    if (accountService.findByUsername(username) != null || accountService.findByEmail(email) != null || accountService.findByPhoneNumber(phoneNumber) != null) {
      return PostCreateAccountResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Account already exists").build();
    }


    Account account = Account.builder()
            .username(username)
            .password(passwordEncoder.encode(password))
            .email(email)
            .phoneNumber(phoneNumber)
            .isActive(false)  ///  Chưa active, admin phải sử dụng chức năng cập nhật để bật active.
            .role(role)
            .build();

    Account saved = accountService.save(account);
    if (saved == null || saved.getId() <= 0) {
      throw new RuntimeException("Failed to save account");
    }

    switch (name) {
      case ROLE.PLAYER: {
        // Tạo mới tài khoản player.
        Player player = Player.builder()
                .name("")
                .avatar("")
                .birthDate(new java.sql.Date(new Date().getTime()))
                .gender(GENDER.OTHER)
                .facebook("")
                .account(saved)
                .build();
        player = playerService.save(player);
        if (player == null || player.getId() <= 0) {
          throw new RuntimeException("Failed to save player");
        }
        break;
      }
      case ROLE.BRAND: {
        // Tạo mới tài khoản brand.
        Brand brand = Brand.builder()
                .name("")
                .field("")
                .address("")
                .gps("")
                .isEnable(false)
                .account(saved)
                .build();
        brand = brandService.save(brand);
        if (brand == null || brand.getId() <= 0) {
          throw new RuntimeException("Failed to save brand");
        }
        break;
      }
      default:
        return PostCreateAccountResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Role not found").build();
    }
    return PostCreateAccountResponse.newBuilder().setStatus(HttpStatus.CREATED.value()).setMessage("Success").build();
  }

  /// done
  public PutUpdateAccountResponse updateAccount(PutUpdateAccountRequest request) {
    Account account = accountService.findById(request.getId());
    if (account == null || account.getId() <= 0) {
      return PutUpdateAccountResponse.newBuilder().setStatus(HttpStatus.NOT_FOUND.value()).setMessage("Account not found").build();
    }
    if (StringUtils.hasText(request.getEmail()) && !request.getEmail().equals(account.getEmail())) {
      Account existed = accountService.findByEmail(request.getEmail());
      if (existed != null && existed.getId() >= 0) {
        return PutUpdateAccountResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Email already exists").build();
      }
      account.setEmail(request.getEmail());
    }
    if (StringUtils.hasText(request.getPhoneNumber()) && !request.getPhoneNumber().equals(account.getPhoneNumber())) {
      account.setPhoneNumber(request.getPhoneNumber());
      Account existed = accountService.findByPhoneNumber(request.getPhoneNumber());
      if (existed != null && existed.getId() >= 0) {
        return PutUpdateAccountResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Phone number already exists").build();
      }
    }
    Boolean isActive = request.getIsActive();
    if (isActive != null && isActive != account.getIsActive()) {
      account.setIsActive(isActive);
    }
    accountService.save(account);
    return PutUpdateAccountResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public GetAccountInfoResponse getAccountInfo(GetAccountInfoRequest request) {
    Account account = accountService.findById(request.getId());
    if (account == null || account.getId() <= 0) {
      return GetAccountInfoResponse.newBuilder().setStatus(HttpStatus.NOT_FOUND.value()).setMessage("Account not found").build();
    }
    return GetAccountInfoResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setId(account.getId())
            .setUsername(account.getUsername())
            .setEmail(account.getEmail())
            .setPhoneNumber(account.getPhoneNumber())
            .setIsActive(account.getIsActive())
            .setRole(account.getRole().getName().toString())
            .build();
  }

  public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) {
    Account account = accountService.findById(request.getId());
    if (account == null || account.getId() <= 0) {
      return DeleteAccountResponse.newBuilder().setStatus(HttpStatus.NOT_FOUND.value()).setMessage("Account not found").build();
    }
    try {
      accessTokenService.deleteAccessTokenByAccount(account); // Xóa tất cả access token của account.
    } catch (RuntimeException e) {
      return DeleteAccountResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to delete access token").build();
    }
    try {
      if (account.getRole().getName().equals(ROLE.PLAYER)) {
        playerService.deletePlayerByAccount(account);
      } else if (account.getRole().getName().equals(ROLE.BRAND)) {
        brandService.deleteBrandByAccount(account);
      }
    } catch (RuntimeException e) {
      return DeleteAccountResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to delete account").build();
    }
    accountService.delete(account);
    return DeleteAccountResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }
}
