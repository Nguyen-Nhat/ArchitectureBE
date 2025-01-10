package org.archi.bff.service;

import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.archi.bff.adapter.AuthAdapter;
import org.archi.bff.adapter.CoreAdapter;
import org.archi.bff.request.*;
import org.archi.bff.response.*;
import org.archi.common.auth.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AuthService {
  private final AuthAdapter adapter;
  private final CoreAdapter coreAdapter;

  public ResponseData register(RegisterRequest request) {
    // Thực hiện register a new user.
    PostRegisterRequest postRequest = PostRegisterRequest.newBuilder()
            .setUsername(request.getUsername())
            .setPassword(request.getPassword())
            .setEmail(request.getEmail())
            .setPhoneNumber(request.getPhoneNumber())
            .setRole(request.getRole())
            .build();
    PostRegisterResponse response = adapter.postRegister(postRequest);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData verifyEmail(String token) {
    GetVerifyEmailRequest request = GetVerifyEmailRequest.newBuilder()
            .setToken(token)
            .build();
    GetVerifyEmailResponse response = adapter.getVerifyEmail(request);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData login(LoginRequest request) {
    PostLoginRequest postRequest = PostLoginRequest.newBuilder()
            .setUsername(request.getUsername())
            .setPassword(request.getPassword())
            .build();
    PostLoginResponse response = adapter.postLogin(postRequest);
    return new ResponseData(response.getStatus(), response.getMessage(), new LoginResponse(response.getAccessToken(), response.getRefreshToken(), response.getTokenType(), response.getExpiresIn()));
  }

  public ResponseData logout(String token) {
    // Thực hiện logout.
    PostLogoutRequest request = PostLogoutRequest.newBuilder()
            .setAccessToken(token)
            .build();
    PostLogoutResponse response = adapter.postLogout(request);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public UserDetails verifyToken(String token) {
    // Xác thực access token.
    PostVerifyTokenRequest request = PostVerifyTokenRequest.newBuilder()
            .setToken(token)
            .build();
    PostVerifyTokenResponse response = adapter.postVerifyToken(request);
    if (response.getStatus() == HttpStatus.OK.value()) {
      List<GrantedAuthority> roles = List.of(new SimpleGrantedAuthority("ROLE_" + response.getRole()));
      return new User(String.valueOf(response.getId()), "", roles);
    }
    return null;
  }


  public ResponseData refreshToken(RefreshRequest request) {
    PostRefreshTokenRequest postRequest = PostRefreshTokenRequest.newBuilder()
            .setRefreshToken(request.getRefreshToken())
            .build();
    PostRefreshTokenResponse response = adapter.postRefreshToken(postRequest);
    return new ResponseData(response.getStatus(), response.getMessage(), new LoginResponse(response.getAccessToken(), "", response.getTokenType(), response.getExpiresIn()));
  }

  public ResponseData getAccountInfo(long accountId) {
    GetAccountInfoRequest request = GetAccountInfoRequest.newBuilder()
            .setId(accountId)
            .build();
    GetAccountInfoResponse response = adapter.getAccountInfo(request);
    return new ResponseData(response.getStatus(), response.getMessage(), AccountInfo.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .id(response.getId())
            .username(response.getUsername())
            .email(response.getEmail())
            .role(response.getRole())
            .isActive(response.getIsActive())
            .build());
  }

  public ResponseData getBrandInfo(long accountId) {
    GetBrandInfoRequest request = GetBrandInfoRequest.newBuilder()
            .setId(accountId)
            .build();
    GetBrandInfoResponse response = adapter.getBrandInfo(request);
    return new ResponseData(response.getStatus(), response.getMessage(), BrandInfo.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .id(response.getId())
            .name(response.getName())
            .field(response.getField())
            .address(response.getAddress())
            .gps(response.getGps())
            .isEnable(response.getIsEnable())
            .build());
  }

  public ResponseData getPlayerInfo(long playerId) {
    GetPlayerInfoRequest request = GetPlayerInfoRequest.newBuilder()
            .setId(playerId)
            .build();
    GetPlayerInfoResponse response = adapter.getPlayerInfo(request);
    return new ResponseData(response.getStatus(), response.getMessage(), PlayerInfo.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .id(response.getId())
            .name(response.getName())
            .avatar(response.getAvatar())
            .gender(response.getGender())
            .facebook(response.getFacebook())
            .build());
  }

  public ResponseData createAccount(RegisterRequest request) {
    PostCreateAccountRequest postRequest = PostCreateAccountRequest.newBuilder()
            .setUsername(request.getUsername())
            .setPassword(request.getPassword())
            .setEmail(request.getEmail())
            .setPhoneNumber(request.getPhoneNumber())
            .setRole(request.getRole())
            .build();
    PostCreateAccountResponse response = adapter.postCreateAccount(postRequest);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData deleteAccount(long accountId) {
    DeleteAccountRequest request = DeleteAccountRequest.newBuilder()
            .setId(accountId)
            .build();
    DeleteAccountResponse response = adapter.deleteAccount(request);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData updateAccount(long l, UpdatedAccount request) {
    PutUpdateAccountRequest.Builder requestBuilder = PutUpdateAccountRequest.newBuilder();
    if (StringUtils.hasText(request.getEmail())) {
      requestBuilder.setEmail(StringValue.of(request.getEmail()));
    }
    if (StringUtils.hasText(request.getPhoneNumber())) {
      requestBuilder.setPhoneNumber(StringValue.of(request.getPhoneNumber()));
    }
    if (request.getIsActive() != null) {
      requestBuilder.setIsActive(BoolValue.of(request.getIsActive()));
    }
    requestBuilder.setId(l);
    PutUpdateAccountRequest putRequest = requestBuilder.build();
    PutUpdateAccountResponse response = adapter.putUpdateAccount(putRequest);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData getBrandProfile(long l) {
    GetBrandProfileRequest request = GetBrandProfileRequest.newBuilder()
            .setId(l)
            .build();
    GetBrandProfileResponse response = adapter.getBrandProfile(request);
    return new ResponseData(response.getStatus(), response.getMessage(), BrandInfo.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .id(response.getId())
            .name(response.getName())
            .field(response.getField())
            .address(response.getAddress())
            .gps(response.getGps())
            .isEnable(response.getIsEnable())
            .build());
  }

  public ResponseData updateBrand(long l, UpdatedBrand brand) {
    UpdateBrandRequest.Builder builder = UpdateBrandRequest.newBuilder();
    builder.setId(l);
    if (StringUtils.hasText(brand.getName())) {
      builder.setName(StringValue.of(brand.getName()));
    }
    if (StringUtils.hasText(brand.getField())) {
      builder.setField(StringValue.of(brand.getField()));
    }
    if (StringUtils.hasText(brand.getAddress())) {
      builder.setAddress(StringValue.of(brand.getAddress()));
    }
    if (StringUtils.hasText(brand.getGps())) {
      builder.setGps(StringValue.of(brand.getGps()));
    }
    UpdateBrandResponse response = adapter.updateBrand(builder.build());
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData getPlayerProfile(long l) {
    PlayerProfileRequest request = PlayerProfileRequest.newBuilder()
            .setId(l) // account id.
            .build();
    PlayerProfileResponse response = adapter.getPlayerProfile(request);
    return new ResponseData(response.getStatus(), response.getMessage(), PlayerInfo.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .id(response.getId())
            .name(response.getName())
            .avatar(response.getAvatar())
            .birthDate(Date.valueOf(response.getBirthDate()))
            .gender(response.getGender())
            .facebook(response.getFacebook())
            .build());
  }

  public ResponseData updatePlayer(long l, UpdatedPlayer request) {
    UpdatePlayerRequest.Builder builder = UpdatePlayerRequest.newBuilder();
    builder.setId(l);
    if (StringUtils.hasText(request.getName())) {
      builder.setName(StringValue.of(request.getName()));
    }
    if (StringUtils.hasText(request.getBirthDate())) {
      builder.setBirthDate(StringValue.of(request.getBirthDate()));
    }
    if (StringUtils.hasText(request.getGender())) {
      builder.setGender(StringValue.of(request.getGender()));
    }
    if (StringUtils.hasText(request.getFacebook())) {
      builder.setFacebook(StringValue.of(request.getFacebook()));
    }
    if (StringUtils.hasText(request.getAvatar())) {
      builder.setAvatar(StringValue.of(request.getAvatar()));
    }
    UpdatePlayerResponse response = adapter.updatePlayer(builder.build());
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData getAccounts(int pageNumber, int pageSize, String sort, String username) {
    GetAccountsRequest.Builder builder = GetAccountsRequest.newBuilder();
    builder.setPage(pageNumber);
    builder.setSize(pageSize);
    if (StringUtils.hasText(sort)) {
      builder.setSort(StringValue.of(sort));
    }
    if (StringUtils.hasText(username)) {
      builder.setUsername(StringValue.of(username));
    }
    GetAccountsRequest request = builder.build();
    GetAccountsResponse response = adapter.getAccounts(request);

    List<AccountResponse> accounts = response.getAccountsList().stream().map(account -> AccountResponse.builder()
            .id(account.getId())
            .username(account.getUsername())
            .email(account.getEmail())
            .phoneNumber(account.getPhoneNumber())
            .role(account.getRole())
            .isActive(account.getIsActive())
            .build()).toList();

    return new ResponseData(response.getStatus(), response.getMessage(), Map.of("accounts", accounts, "totalPage", response.getTotalPage(), "totalElement", response.getTotalElement(), "page", response.getPage() + 1, "size", response.getSize()));
  }

  public ResponseData getBrands(int pageNumber, int pageSize, String sort, String name) {
    GetBrandsRequest.Builder builder = GetBrandsRequest.newBuilder();
    builder.setPage(pageNumber);
    builder.setSize(pageSize);
    if (StringUtils.hasText(sort)) {
      builder.setSort(StringValue.of(sort));
    }
    if (StringUtils.hasText(name)) {
      builder.setName(StringValue.of(name));
    }
    GetBrandsResponse response = adapter.getBrands(builder.build());

    List<BrandResponse> brands = response.getBrandsList().stream().map(brand -> BrandResponse.builder()
            .id(brand.getId())
            .name(brand.getName())
            .field(brand.getField())
            .address(brand.getAddress())
            .gps(brand.getGps())
            .isEnable(brand.getIsEnable())
            .build()).toList();
    return new ResponseData(response.getStatus(), response.getMessage(), Map.of("brands", brands, "totalPage", response.getTotalPage(), "totalElement", response.getTotalElement(), "page", response.getPage() + 1, "size", response.getSize()));
  }

  public ResponseData getPlayers(int pageNumber, int pageSize, String sort, String name) {
    GetPlayersRequest.Builder builder = GetPlayersRequest.newBuilder();
    builder.setPage(pageNumber);
    builder.setSize(pageSize);
    if (StringUtils.hasText(sort)) {
      builder.setSort(StringValue.of(sort));
    }
    if (StringUtils.hasText(name)) {
      builder.setName(StringValue.of(name));
    }
    GetPlayersRequest request = builder.build();
    GetPlayersResponse response = adapter.getPlayers(request);
    List<PlayerResponse> players = response.getPlayersList().stream().map(player -> PlayerResponse.builder()
            .id(player.getId())
            .name(player.getName())
            .avatar(player.getAvatar())
            .birthDate(Date.valueOf(player.getBirthDate()))
            .facebook(player.getFacebook())
            .build()).toList();
    return new ResponseData(response.getStatus(), response.getMessage(), Map.of("players", players, "totalPage", response.getTotalPage(), "totalElement", response.getTotalElement(), "page", response.getPage() + 1, "size", response.getSize()));
  }

}
