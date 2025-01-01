package org.archi.bff.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.archi.bff.adapter.AuthAdapter;
import org.archi.bff.request.LoginRequest;
import org.archi.bff.request.RefreshRequest;
import org.archi.bff.request.RegisterRequest;
import org.archi.bff.response.LoginResponse;
import org.archi.bff.response.ResponseData;
import org.archi.common.auth.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthService {
  private final AuthAdapter adapter;

  public ResponseData register(RegisterRequest request) {
    // Thực hiện register a new user.
    PostRegisterRequest postRequest = PostRegisterRequest.newBuilder()
            .setUsername(request.getUsername())
            .setPassword(request.getPassword())
            .setEmail(request.getEmail())
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
    // Xác thực token.
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
    return new ResponseData(response.getStatus(), response.getMessage(), new LoginResponse(response.getAccessToken(), request.getRefreshToken(), response.getTokenType(), response.getExpiresIn()));
  }
}
