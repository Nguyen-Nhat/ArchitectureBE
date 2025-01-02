package org.archi.auth.security;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.archi.auth.model.Account;
import org.archi.auth.service.AccountService;
import org.archi.auth.service.BrandService;
import org.archi.auth.service.JwtService;
import org.archi.auth.service.PlayerService;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
@AllArgsConstructor
public class OwnAuthenticationProvider implements AuthenticationProvider {
  private final OwnUserDetailsService userDetailsService;
  private final PasswordEncoder passwordEncoder;

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    // Hàm thực hiện xác thực {username, password} của User khi thực hiện Sign-In.
    String username = authentication.getName();
    String rawPassword = authentication.getCredentials().toString();
    try {
      UserDetails userDetails = userDetailsService.loadUserByUsername(username);
      if (passwordEncoder.matches(rawPassword, userDetails.getPassword())) {
        return new UsernamePasswordAuthenticationToken(username, userDetails.getPassword(), userDetails.getAuthorities());
      } else {
        log.error("Password does not match for user with email: {}", username);
        return new UsernamePasswordAuthenticationToken(username, rawPassword);
      }
    } catch (UsernameNotFoundException e1) {
      log.error("User with email: {} not found", username);
      throw e1;
    } catch (Exception e) {
      log.error("Failed to authenticate user with email: {}", username, e);
      throw new AuthenticationException("Authentication failed!") {
      };
    }
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
  }
}