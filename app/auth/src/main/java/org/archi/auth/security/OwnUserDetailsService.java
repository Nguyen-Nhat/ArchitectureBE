package org.archi.auth.security;

import lombok.AllArgsConstructor;
import org.archi.auth.model.Account;
import org.archi.auth.service.AccountService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class OwnUserDetailsService implements UserDetailsService {
  // Class chịu trách nhiệm load thông tin của User lên hệ thống. Được sử dụng trong AuthenticationProvider.
  private final AccountService accountService;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Account account = accountService.findByUsername(username);
    if (account != null && account.getId() > 0) {
      List<GrantedAuthority> roles = List.of(new SimpleGrantedAuthority("ROLE_" + account.getRole().getName()));
      return new User(username, account.getPassword(), roles );
    }
    throw new UsernameNotFoundException("Failed to load user by username");
  }
}