package org.archi.bff.controller;


import lombok.AllArgsConstructor;
import org.archi.bff.request.LoginRequest;
import org.archi.bff.request.LogoutRequest;
import org.archi.bff.request.RefreshRequest;
import org.archi.bff.request.RegisterRequest;
import org.archi.bff.response.ResponseData;
import org.archi.bff.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/auth")
@AllArgsConstructor
public class AuthController {
  private final AuthService authService;

  @PostMapping(value = "/register") ///  done.
  public ResponseEntity<ResponseData> register(@RequestBody RegisterRequest request) {
    ResponseData responseData = authService.register(request);
    return ResponseEntity.ok(responseData);
  }

  @GetMapping(value = "/verify-email")  ///  done
  public ResponseEntity<ResponseData> verifyEmail(@RequestParam String token) {
    ResponseData responseData = authService.verifyEmail(token);
    return ResponseEntity.ok(responseData);
  }

  @PostMapping(value = "/login")  /// done
  public ResponseEntity<ResponseData> login(@RequestBody LoginRequest request) {
    ResponseData responseData = authService.login(request);
    return ResponseEntity.ok(responseData);
  }

  @PostMapping(value = "/logout") /// done
  public ResponseEntity<ResponseData> logout(@RequestBody LogoutRequest request) {
    ResponseData responseData = authService.logout(request.getToken());
    return ResponseEntity.ok(responseData);
  }

  @PostMapping(value = "/refresh-token")
  public ResponseEntity<ResponseData> refreshToken(@RequestBody RefreshRequest request) {
    ResponseData responseData = authService.refreshToken(request);
    return ResponseEntity.ok(responseData);
  }

}
