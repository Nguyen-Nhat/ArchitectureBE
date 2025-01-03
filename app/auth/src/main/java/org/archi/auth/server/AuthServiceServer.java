package org.archi.auth.server;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.security.authentication.GrpcAuthenticationReader;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.auth.model.Account;
import org.archi.auth.model.Brand;
import org.archi.auth.model.Player;
import org.archi.auth.service.*;
import org.archi.common.auth.*;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Nullable;

@GrpcService
@Service
@AllArgsConstructor
public class AuthServiceServer extends AuthServiceGrpc.AuthServiceImplBase {
  private final AccountService accountService;
  private final RoleService roleService;
  private final PasswordEncoder passwordEncoder;
  private final EmailService emailService;
  private final PlayerService playerService;
  private final BrandService brandService;
  private final AuthenticationService authenticationService;
  private final JwtService jwtService;

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
  public void postRegister(PostRegisterRequest request, StreamObserver<PostRegisterResponse> streamObserver) { /// done
    PostRegisterResponse response = authenticationService.register(request);
    streamObserver.onNext(response);
    streamObserver.onCompleted();
  }

  @Override
  public void postLogin(PostLoginRequest request, StreamObserver<PostLoginResponse> responseObserver) { /// done
    PostLoginResponse response = authenticationService.login(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void postLogout(PostLogoutRequest request, StreamObserver<PostLogoutResponse> responseObserver) { /// done
    PostLogoutResponse response = authenticationService.logout(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void postRefreshToken(PostRefreshTokenRequest request, StreamObserver<PostRefreshTokenResponse> responseObserver) { /// done
    PostRefreshTokenResponse response = authenticationService.refreshToken(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getVerifyEmail(GetVerifyEmailRequest request, StreamObserver<GetVerifyEmailResponse> responseObserver) { /// done
    GetVerifyEmailResponse response = authenticationService.verifyEmail(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void postVerifyToken(PostVerifyTokenRequest request, StreamObserver<PostVerifyTokenResponse> responseObserver) {
    String token = request.getToken();
    if (jwtService.isValid(token)) {
      Long id = jwtService.getAccountId(token);
      if (id == null) {
        responseObserver.onNext(PostVerifyTokenResponse.newBuilder()
                .setStatus(401)
                .setMessage("Account not found")
                .build());
      } else {
        Account account = accountService.findById(id);
        if (account == null) {
          responseObserver.onNext(PostVerifyTokenResponse.newBuilder()
                  .setStatus(401)
                  .setMessage("Account not found")
                  .build());
        } else {
          responseObserver.onNext(PostVerifyTokenResponse.newBuilder()
                  .setStatus(200)
                  .setMessage("Success")
                  .setId(id)
                  .setRole(account.getRole().getName().toString())
                  .build());
        }
      }
    } else {
      responseObserver.onNext(PostVerifyTokenResponse.newBuilder()
              .setStatus(400)
              .setMessage("Invalid token")
              .build());
    }
    responseObserver.onCompleted();
  }

  @Override
  public void getAccountInfo(GetAccountInfoRequest request, StreamObserver<GetAccountInfoResponse> responseObserver) {
    long id = request.getId();
    Account account = accountService.findById(id);
    if (account == null || account.getId() <= 0) {
      responseObserver.onNext(GetAccountInfoResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Account not found")
              .build());
    } else {
      responseObserver.onNext(GetAccountInfoResponse.newBuilder()
              .setStatus(HttpStatus.OK.value())
              .setMessage("Success")
              .setId(account.getId())
              .setUsername(account.getUsername())
              .setEmail(account.getEmail())
              .setPhoneNumber(account.getPhoneNumber())
              .setIsActive(account.getIsActive())
              .setRole(account.getRole().getName().toString())
              .build());
    }
    responseObserver.onCompleted();
  }

  @Override
  public void getBrandInfo(GetBrandInfoRequest request, StreamObserver<GetBrandInfoResponse> responseObserver) {
    long accountId = request.getId();
    Account account = accountService.findById(accountId);
    if (account == null || account.getId() <= 0) {
      responseObserver.onNext(GetBrandInfoResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Account not found")
              .build());
    } else {
      Brand brand = brandService.findByAccount(account);
      if (brand == null || brand.getId() <= 0) {
        responseObserver.onNext(GetBrandInfoResponse.newBuilder()
                .setStatus(HttpStatus.NOT_FOUND.value())
                .setMessage("Brand not found")
                .build());
      } else {
        responseObserver.onNext(GetBrandInfoResponse.newBuilder()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .setId(brand.getId())
                .setName(brand.getName())
                .setField(brand.getField())
                .setAddress(brand.getAddress())
                .setGps(brand.getGps())
                .setIsEnable(brand.getIsEnable())
                .build());
      }
    }
    responseObserver.onCompleted();
  }

  @Override
  public void getPlayerInfo(GetPlayerInfoRequest request, StreamObserver<GetPlayerInfoResponse> responseObserver) {
    long accountId = request.getId();
    Account account = accountService.findById(accountId);
    if (account == null || account.getId() <= 0) {
      responseObserver.onNext(GetPlayerInfoResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Account not found")
              .build());
    } else {
      Player player = playerService.findByAccount(account);
      if (player == null || player.getId() <= 0) {
        responseObserver.onNext(GetPlayerInfoResponse.newBuilder()
                .setStatus(HttpStatus.NOT_FOUND.value())
                .setMessage("Player not found")
                .build());
      } else {
        responseObserver.onNext(GetPlayerInfoResponse.newBuilder()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .setId(player.getId())
                .setName(player.getName())
                .setAvatar(player.getAvatar())
                .setBirthDate(player.getBirthDate().getTime())
                .setGender(player.getGender().name())
                .setFacebook(player.getFacebook())
                .build());
      }
    }
    responseObserver.onCompleted();
  }

  @Override
  public void postCreateAccount(PostCreateAccountRequest request, StreamObserver<PostCreateAccountResponse> responseObserver) {
    PostCreateAccountResponse response = authenticationService.createAccount(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void deleteAccount(DeleteAccountRequest request, StreamObserver<DeleteAccountResponse> responseObserver) {
      DeleteAccountResponse response = authenticationService.deleteAccount(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted(); }
}
