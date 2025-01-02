package org.archi.bff.controller;


import lombok.AllArgsConstructor;
import org.archi.bff.request.*;
import org.archi.bff.response.ResponseData;
import org.archi.bff.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/auth")
@AllArgsConstructor
public class AuthController {
  private final AuthService authService;

  @PostMapping(value = "/register")
  public ResponseEntity<ResponseData> register(@RequestBody RegisterRequest request) {
    /*
      {
        "username": "",
        "password": "",
        "email": "",
        "phoneNumber": "",
        "role": ""
        }
    */
    ResponseData responseData = authService.register(request);
    return ResponseEntity.ok(responseData);
  }

  @GetMapping(value = "/verify-email")
  ///  done
  public ResponseEntity<ResponseData> verifyEmail(@RequestParam String token) {
    ResponseData responseData = authService.verifyEmail(token);
    return ResponseEntity.ok(responseData);
  }

  @PostMapping(value = "/login")
  /// done
  public ResponseEntity<ResponseData> login(@RequestBody LoginRequest request) {
    /*
      {
        "username": "",
        "password": "",
        }
    */
    ResponseData responseData = authService.login(request);
    return ResponseEntity.ok(responseData);
  }

  @PostMapping(value = "/logout")
  /// done
  public ResponseEntity<ResponseData> logout(@RequestBody LogoutRequest request) {
    /*
      {
        "token": ""
      }
    */
    ResponseData responseData = authService.logout(request.getToken());
    return ResponseEntity.ok(responseData);
  }

  @PostMapping(value = "/refresh-token")
  /// done
  public ResponseEntity<ResponseData> refreshToken(@RequestBody RefreshRequest request) {
    /*
      {
        "refreshToken": ""
       }
    */
    ResponseData responseData = authService.refreshToken(request);
    return ResponseEntity.ok(responseData);
  }

  @GetMapping(value = "/account-info")
  public ResponseEntity<ResponseData> getAccountInfo() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    long accountId = Long.parseLong(auth.getName());
    System.out.println("Account ID: " + accountId);
    ResponseData response = authService.getAccountInfo(accountId);
    return ResponseEntity.ok(response);
  }

  @PreAuthorize("hasRole('BRAND')")
  @GetMapping(value = "/brand-info")
  /// done
  public ResponseEntity<ResponseData> getBrandInfo() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    long accountId = Long.parseLong(auth.getName());
    ResponseData response = authService.getBrandInfo(accountId);
    return ResponseEntity.ok(response);
  }

  @PreAuthorize("hasRole('PLAYER')")
  @GetMapping(value = "/player-info")
  ///  done
  public ResponseEntity<ResponseData> getPlayerInfo() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    long accountId = Long.parseLong(auth.getName());
    ResponseData response = authService.getPlayerInfo(accountId);
    return ResponseEntity.ok(response);
  }


  @PreAuthorize("hasRole('ADMIN')")
  @PostMapping(value = "/accounts")
  public ResponseEntity<ResponseData> createAccount(@RequestBody RegisterRequest request) {
    ResponseData responseData = authService.createAccount(request);
    return ResponseEntity.ok(responseData);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping(value = "/accounts/{accountId}")
  public ResponseEntity<ResponseData> deleteAccount(@PathVariable String accountId) {
    ResponseData responseData = authService.deleteAccount(Long.parseLong(accountId));
    return ResponseEntity.ok(responseData);
  }
}
