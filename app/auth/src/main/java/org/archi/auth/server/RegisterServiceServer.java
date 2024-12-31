package org.archi.auth.server;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.security.authentication.GrpcAuthenticationReader;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.auth.enums.ROLE;
import org.archi.auth.exceptions.ResourceNotFoundException;
import org.archi.auth.model.Account;
import org.archi.auth.model.Brand;
import org.archi.auth.model.Player;
import org.archi.auth.model.Role;
import org.archi.auth.service.*;
import org.archi.common.auth.PostRegisterRequest;
import org.archi.common.auth.PostRegisterResponse;
import org.archi.common.auth.RegisterServiceGrpc;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Nullable;
import java.util.Locale;

@GrpcService
@Service
@AllArgsConstructor
public class RegisterServiceServer extends RegisterServiceGrpc.RegisterServiceImplBase {
  private final RoleService roleService;
  private final AccountService accountService;
  private final PasswordEncoder passwordEncoder;
  private final PlayerService playerService;
  private final BrandService brandService;
  private final EmailService emailService;

  @Bean
  public GrpcAuthenticationReader grpcAuthenticationReader() {
    return new GrpcAuthenticationReader() {
      @Nullable
      @Override
      public Authentication readAuthentication(ServerCall<?, ?> call, Metadata headers) throws AuthenticationException {
        return null;
      }
    };
  }

  @Override
  @Transactional(rollbackFor = {ResourceNotFoundException.class, RuntimeException.class})
  public void postRegister(PostRegisterRequest request, StreamObserver<PostRegisterResponse> streamObserver) {
    ROLE name = ROLE.valueOf(request.getRole().toUpperCase(Locale.ROOT));
    Role role = roleService.findByName(name);
    if (role == null) {
      streamObserver.onError(Status.INTERNAL
              .withDescription("Role not found")
              .withCause(new ResourceNotFoundException("Role not found", null))
              .asRuntimeException());
    }

    String username = request.getUsername();
    String password = request.getPassword();
    String phoneNumber = request.getPhoneNumber();
    String email = request.getEmail();
    if (accountService.findByUsername(username) != null || accountService.findByEmail(email) != null || accountService.findByPhoneNumber(phoneNumber) != null) {
      streamObserver.onError(Status.INTERNAL
              .withDescription("Account credentials already exists")
              .withCause(new ResourceNotFoundException("Account already exists", null))
              .asRuntimeException());
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
                .account(saved)
                .isEnable(false)
                .build();

        brand = brandService.save(brand);
        if (brand == null || brand.getId() <= 0) {
          throw new RuntimeException("Failed to save brand");
        }
        break;
      }
      default:
        break;
    }
    streamObserver.onNext(PostRegisterResponse.newBuilder().setStatus(HttpStatus.CREATED.value()).setMessage("Success").build());
    streamObserver.onCompleted();
  }
}
