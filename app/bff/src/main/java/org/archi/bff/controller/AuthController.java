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


  /// done
  @GetMapping(value = "/accounts/profile")
  public ResponseEntity<ResponseData> getProfile() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String accountId = authentication.getName();
    ResponseData responseData = authService.getAccountInfo(Long.parseLong(accountId));
    return ResponseEntity.ok(responseData);
  }

  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @GetMapping(value = "/accounts/{accountId}")
  public ResponseEntity<ResponseData> getAccountInfo(@PathVariable String accountId) {
    ResponseData responseData = authService.getAccountInfo(Long.parseLong(accountId));
    return ResponseEntity.ok(responseData);
  }


  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @PostMapping(value = "/accounts")
  public ResponseEntity<ResponseData> createAccount(@RequestBody RegisterRequest request) { /// done
    ResponseData responseData = authService.createAccount(request);
    return ResponseEntity.ok(responseData);
  }

  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @PatchMapping(value = "/accounts/{accountId}", consumes = "application/json")
  /// done
  public ResponseEntity<ResponseData> updateAccount(@PathVariable String accountId, @RequestBody UpdatedAccount request) {
    ResponseData responseData = authService.updateAccount(Long.parseLong(accountId), request);
    return ResponseEntity.ok(responseData);
  }

  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping(value = "/accounts/{accountId}")
  public ResponseEntity<ResponseData> deleteAccount(@PathVariable String accountId) {
    ResponseData responseData = authService.deleteAccount(Long.parseLong(accountId));
    return ResponseEntity.ok(responseData);
  }


  /// done
  @GetMapping(value = "/brands/profile")
  public ResponseEntity<ResponseData> getBrandProfile() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String accountId = authentication.getName();
    ResponseData responseData = authService.getBrandProfile(Long.parseLong(accountId));
    return ResponseEntity.ok(responseData);
  }

  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @GetMapping(value = "/brands/{brandId}")
  public ResponseEntity<ResponseData> getBrandInfo(@PathVariable String brandId) {
    ResponseData responseData = authService.getBrandInfo(Long.parseLong(brandId));
    return ResponseEntity.ok(responseData);
  }

  /// done
  @PatchMapping(value = "/brands/{brandId}", consumes = "application/json")
  public ResponseEntity<ResponseData> updateBrand(@PathVariable String brandId, @RequestBody UpdatedBrand request) {
    ResponseData responseData = authService.updateBrand(Long.parseLong(brandId), request);
    return ResponseEntity.ok(responseData);
  }


  /// done.
  @GetMapping(value = "/players/profile")
  public ResponseEntity<ResponseData> getPlayerProfile() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String accountId = authentication.getName();
    ResponseData responseData = authService.getPlayerProfile(Long.parseLong(accountId));
    return ResponseEntity.ok(responseData);
  }

  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @GetMapping(value = "/players/{playerId}")
  public ResponseEntity<ResponseData> getPlayerInfo(@PathVariable String playerId) {
    ResponseData responseData = authService.getPlayerInfo(Long.parseLong(playerId));
    return ResponseEntity.ok(responseData);
  }

  /// done
  @PatchMapping(value = "/players/{playerId}", consumes = "application/json")
  public ResponseEntity<ResponseData> updatePlayer(@PathVariable String playerId, @RequestBody UpdatedPlayer request) {
    ResponseData responseData = authService.updatePlayer(Long.parseLong(playerId), request);
    return ResponseEntity.ok(responseData);
  }


  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @GetMapping(value = "/accounts")
  public ResponseEntity<ResponseData> getAccounts(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                                  @RequestParam(name = "size", defaultValue = "10") Integer size,
                                                  @RequestParam(value = "sort", required = false) String sort,
                                                  @RequestParam(name = "username", required = false) String username) {

    /// GET /api/auth/accounts?page=1&size=10&sort=id:desc,username:asc
    page = page - 1;
    ResponseData responseData = authService.getAccounts(page, size, sort, username);
    return ResponseEntity.ok(responseData);
  }


  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @GetMapping(value = "/brands")
  public ResponseEntity<ResponseData> getBrands(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                                @RequestParam(name = "size", defaultValue = "10") Integer size,
                                                @RequestParam(value = "sort", required = false) String sort,
                                                @RequestParam(name = "name", required = false) String name) {

    /// GET /api/auth/brands?page=1&size=10&sort=id:desc,username:asc
    page = page - 1;
    ResponseData responseData = authService.getBrands(page, size, sort, name);
    return ResponseEntity.ok(responseData);
  }


  @PreAuthorize("hasRole('ADMIN')")
  @GetMapping(value = "/players")
  public ResponseEntity<ResponseData> getPlayers(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                                 @RequestParam(name = "size", defaultValue = "10") Integer size,
                                                 @RequestParam(value = "sort", required = false) String sort,
                                                 @RequestParam(name = "name", required = false) String name) {

    /// GET /api/auth/players?page=1&size=10&sort=id:desc,username:asc
    page = page - 1;
    ResponseData responseData = authService.getPlayers(page, size, sort, name);
    return ResponseEntity.ok(responseData);
  }
}
