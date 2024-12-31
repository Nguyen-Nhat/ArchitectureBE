package org.archi.auth.config;

import org.archi.auth.security.OwnAuthenticationProvider;
import org.archi.auth.security.OwnUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ProjectConfigSecurity {

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.sessionManagement(config -> config.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    http.csrf(AbstractHttpConfigurer::disable);
    http.authorizeHttpRequests(config -> config.anyRequest().permitAll());
    return http.build();
  }


  @Bean
  PasswordEncoder passwordEncoder() {
    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  }

  @Bean
  public AuthenticationManager authenticationManager(OwnUserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
    OwnAuthenticationProvider authenticationProvider =
            new OwnAuthenticationProvider(userDetailsService, passwordEncoder);
    ProviderManager providerManager = new ProviderManager(authenticationProvider);
    providerManager.setEraseCredentialsAfterAuthentication(false);
    return providerManager;
  }

  // CORS Configuration
  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowCredentials(false).exposedHeaders("*").allowedMethods("*");
      }
    };
  }

}
