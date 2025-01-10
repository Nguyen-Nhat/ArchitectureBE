package org.archi.auth.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.archi.auth.enums.GENDER;
import org.archi.auth.enums.ROLE;
import org.archi.auth.exceptions.ResourceNotFoundException;
import org.archi.auth.model.*;
import org.archi.auth.model.Account;
import org.archi.auth.model.Brand;
import org.archi.auth.model.Player;
import org.archi.auth.repo.AccessTokenRepo;
import org.archi.auth.repo.AccountRepo;
import org.archi.auth.specification.AccountSpecs;
import org.archi.auth.specification.BrandSpecs;
import org.archi.auth.specification.PlayerSpecs;
import org.archi.common.auth.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

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
  private final AccountRepo accountRepo;


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
    if (request.hasEmail() && !request.getEmail().getValue().equals(account.getEmail())) {
      Account existed = accountService.findByEmail(request.getEmail().getValue());
      if (existed != null && existed.getId() >= 0) {
        return PutUpdateAccountResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Email already exists").build();
      }
      account.setEmail(request.getEmail().getValue());
    }
    if (request.hasPhoneNumber() && !request.getPhoneNumber().getValue().equals(account.getPhoneNumber())) {
      account.setPhoneNumber(request.getPhoneNumber().getValue());
      Account existed = accountService.findByPhoneNumber(request.getPhoneNumber().getValue());
      if (existed != null && existed.getId() >= 0) {
        return PutUpdateAccountResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Phone number already exists").build();
      }
    }

    if (request.hasIsActive()) {
      account.setIsActive(request.getIsActive().getValue());
    }
    accountService.save(account);
    return PutUpdateAccountResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  /// done
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

  /// done
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

  /// done
  public GetBrandInfoResponse getBrandInfo(GetBrandInfoRequest request) {
    long brandId = request.getId();
    Brand brand = brandService.findById(brandId);
    if (brand == null || brand.getId() <= 0) {
      return GetBrandInfoResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Brand not found")
              .build();
    }
    return GetBrandInfoResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setId(brand.getId())
            .setName(brand.getName())
            .setField(brand.getField())
            .setAddress(brand.getAddress())
            .setGps(brand.getGps())
            .setIsEnable(brand.getIsEnable())
            .build();
  }

  public GetBrandProfileResponse getBrandProfile(GetBrandProfileRequest request) {
    long accountId = request.getId();
    Account account = accountService.findById(accountId);
    if (account == null || account.getId() <= 0) {
      return GetBrandProfileResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Account not found")
              .build();
    }
    Brand brand = brandService.findByAccount(account);
    if (brand == null || brand.getId() <= 0) {
      return GetBrandProfileResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Brand not found")
              .build();
    }
    return GetBrandProfileResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setId(brand.getId())
            .setName(brand.getName())
            .setField(brand.getField())
            .setAddress(brand.getAddress())
            .setGps(brand.getGps())
            .setIsEnable(brand.getIsEnable())
            .build();
  }

  public UpdateBrandResponse updateBrand(UpdateBrandRequest request) {
    long brandId = request.getId();
    Brand brand = brandService.findById(brandId);
    if (brand == null || brand.getId() <= 0) {
      return UpdateBrandResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Brand not found")
              .build();
    }

    if (request.hasName()) brand.setName(request.getName().getValue());
    if (request.hasField()) brand.setField(request.getField().getValue());
    if (request.hasAddress()) brand.setAddress(request.getAddress().getValue());
    if (request.hasGps()) brand.setGps(request.getGps().getValue());

    if (StringUtils.hasText(brand.getName())) {
      brand.setIsEnable(true);
    }
    brandService.save(brand);
    return UpdateBrandResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .build();
  }

  public PlayerProfileResponse getPlayerProfile(PlayerProfileRequest request) {
    long accountId = request.getId();
    Account account = accountService.findById(accountId);
    if (account == null || account.getId() <= 0) {
      return PlayerProfileResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Account not found")
              .build();
    }
    Player player = playerService.findByAccount(account);
    if (player == null || player.getId() <= 0) {
      return PlayerProfileResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Player not found")
              .build();
    }
    return PlayerProfileResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setId(player.getId())
            .setName(player.getName())
            .setAvatar(player.getAvatar())
            .setBirthDate(player.getBirthDate().toString())
            .setGender(player.getGender().name())
            .setFacebook(player.getFacebook())
            .build();
  }

  public GetPlayerInfoResponse getPlayerInfo(GetPlayerInfoRequest request) {
    long playerId = request.getId();
    Player player = playerService.findById(playerId);
    if (player == null || player.getId() <= 0) {
      return GetPlayerInfoResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Player not found")
              .build();
    }
    return GetPlayerInfoResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setId(player.getId())
            .setName(player.getName())
            .setAvatar(player.getAvatar())
            .setBirthDate(player.getBirthDate().toString())
            .setGender(player.getGender().name())
            .setFacebook(player.getFacebook())
            .build();
  }

  public UpdatePlayerResponse updatePlayer(UpdatePlayerRequest request) {
    long playerId = request.getId();
    Player player = playerService.findById(playerId);
    if (player == null || player.getId() <= 0) {
      return UpdatePlayerResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Player not found")
              .build();
    }

    if (request.hasName()) player.setName(request.getName().getValue());
    if (request.hasAvatar()) player.setAvatar(request.getAvatar().getValue());
    if (request.hasBirthDate()) {
      java.sql.Date birthDate = java.sql.Date.valueOf(request.getBirthDate().getValue());
      player.setBirthDate(birthDate);
    }
    if (request.hasFacebook()) player.setFacebook(request.getFacebook().getValue());
    if (request.hasGender()) {
      GENDER gender = GENDER.valueOf(request.getGender().getValue().toUpperCase(Locale.ROOT));
      player.setGender(gender);
    }

    playerService.save(player);
    return UpdatePlayerResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .build();
  }

  public GetAccountsResponse getAccounts(GetAccountsRequest request) {
    int page = request.getPage();
    int size = request.getSize();

    Pageable pageable = null;
    if (request.hasSort()) {
      String sort = request.getSort().getValue();
      List<Sort.Order> orders = new ArrayList<>();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = PageRequest.of(page, size);
    Page<Account> accounts = null;

    Specification<Account> specs = Specification.where(null);
    if (request.hasUsername()) {
      String username = request.getUsername().getValue();
      specs = specs.and(AccountSpecs.containsUsername(username));
    }
    try {
      accounts = accountService.findAll(specs, pageable);
    } catch (RuntimeException e) {
      return GetAccountsResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Failed to get accounts")
              .build();
    }

    return GetAccountsResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .addAllAccounts(accounts.stream().map(account -> org.archi.common.auth.Account.newBuilder()
                    .setId(account.getId())
                    .setUsername(account.getUsername())
                    .setEmail(account.getEmail())
                    .setPhoneNumber(account.getPhoneNumber())
                    .setIsActive(account.getIsActive())
                    .setRole(account.getRole().getName().toString())
                    .build()).collect(Collectors.toList()))
            .setTotalElement(accounts.getTotalElements())
            .setTotalPage(accounts.getTotalPages())
            .setPage(accounts.getNumber())
            .setSize(accounts.getSize())
            .build();
  }

  public GetBrandsResponse getBrands(GetBrandsRequest request) {
    int page = request.getPage();
    int size = request.getSize();

    Pageable pageable = null;
    if (request.hasSort()) {
      List<Sort.Order> orders = new ArrayList<>();
      String sort = request.getSort().getValue();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = PageRequest.of(page, size);
    Specification<Brand> specs = null;
    if (request.hasName()) {
      specs = BrandSpecs.containsName(request.getName().getValue());
    }

    Page<Brand> brands = null;
    try {
      brands = brandService.findAll(specs, pageable);
    } catch (RuntimeException e) {
      return GetBrandsResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Failed to get accounts")
              .build();
    }

    return GetBrandsResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .addAllBrands(brands.stream().map(account -> org.archi.common.auth.Brand.newBuilder()
                    .setId(account.getId())
                    .setName(account.getName())
                    .setField(account.getField())
                    .setAddress(account.getAddress())
                    .setGps(account.getGps())
                    .setIsEnable(account.getIsEnable())
                    .build()).collect(Collectors.toList()))
            .setTotalElement(brands.getTotalElements())
            .setTotalPage(brands.getTotalPages())
            .setPage(brands.getNumber())
            .setSize(brands.getSize())
            .build();
  }

  public GetPlayersResponse getPlayers(GetPlayersRequest request) {
    int page = request.getPage();
    int size = request.getSize();

    Pageable pageable = null;
    if (request.hasSort()) {
      List<Sort.Order> orders = new ArrayList<>();
      String sort = request.getSort().getValue();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = PageRequest.of(page, size);

    Specification<Player> specs = null;
    if (request.hasName()) {
      specs = PlayerSpecs.containsName(request.getName().getValue());
    }


    Page<Player> players = null;
    try {
      players = playerService.findAll(specs, pageable);
    } catch (RuntimeException e) {
      return GetPlayersResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Failed to get accounts")
              .build();
    }

    return GetPlayersResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .addAllPlayers(players.stream().map(account -> org.archi.common.auth.Player.newBuilder()
                    .setId(account.getId())
                    .setName(account.getName())
                    .setAvatar(account.getAvatar())
                    .setFacebook(account.getFacebook())
                    .setBirthDate(account.getBirthDate().toString())
                    .build()).collect(Collectors.toList()))
            .setTotalElement(players.getTotalElements())
            .setTotalPage(players.getTotalPages())
            .setPage(players.getNumber())
            .setSize(players.getSize())
            .build();
  }

  public RetrievePlayerProfileResponse retrievePlayerProfile(RetrievePlayerProfileRequest request) {
    long accountId = request.getId();
    Account account = accountService.findById(accountId);

    if (account == null || account.getId() <= 0) {
      return RetrievePlayerProfileResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Account not found")
              .build();
    }

    Player player = playerService.findByAccount(account);
    if (player == null || player.getId() <= 0) {
      return RetrievePlayerProfileResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Player not found")
              .build();
    }

    return RetrievePlayerProfileResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setPlayer(org.archi.common.auth.Player.newBuilder()
                    .setId(player.getId())
                    .setName(player.getName())
                    .setAvatar(player.getAvatar())
                    .setBirthDate(player.getBirthDate().toString())
                    .setFacebook(player.getFacebook())
                    .build())
            .build();
  }

  public GetPlayerByEmailResponse getPlayerByEmail(GetPlayerByEmailRequest request) {
    String email = request.getEmail();
    Account account = accountService.findByEmail(email);
    if (account == null || account.getId() <= 0) {
      return GetPlayerByEmailResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Account not found")
              .build();
    }
    Player player = playerService.findByAccount(account);
    if (player == null || player.getId() <= 0) {
      return GetPlayerByEmailResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Player not found")
              .build();
    }
    return GetPlayerByEmailResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setPlayer(org.archi.common.auth.Player.newBuilder()
                    .setId(player.getId())
                    .setName(player.getName())
                    .setAvatar(player.getAvatar())
                    .setBirthDate(player.getBirthDate().toString())
                    .setFacebook(player.getFacebook())
                    .build())
            .build();
  }

  public GetPlayerByPhoneNumberResponse getPlayerByPhoneNumber(GetPlayerByPhoneNumberRequest request) {
    String phoneNumber = request.getPhoneNumber();
    Account account = accountService.findByPhoneNumber(phoneNumber);
    if (account == null || account.getId() <= 0) {
      return GetPlayerByPhoneNumberResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Account not found")
              .build();
    }
    Player player = playerService.findByAccount(account);
    if (player == null || player.getId() <= 0) {
      return GetPlayerByPhoneNumberResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Player not found")
              .build();
    }
    return GetPlayerByPhoneNumberResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setPlayer(org.archi.common.auth.Player.newBuilder()
                    .setId(player.getId())
                    .setName(player.getName())
                    .setAvatar(player.getAvatar())
                    .setBirthDate(player.getBirthDate().toString())
                    .setFacebook(player.getFacebook())
                    .build())
            .build();
  }
}
