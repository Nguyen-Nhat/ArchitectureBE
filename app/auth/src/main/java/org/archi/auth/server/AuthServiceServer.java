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

  /// done.
  @Override
  public void postRegister(PostRegisterRequest request, StreamObserver<PostRegisterResponse> streamObserver) { /// done
    PostRegisterResponse response = authenticationService.register(request);
    streamObserver.onNext(response);
    streamObserver.onCompleted();
  }


  /// done
  @Override
  public void postLogin(PostLoginRequest request, StreamObserver<PostLoginResponse> responseObserver) { /// done
    PostLoginResponse response = authenticationService.login(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  /// done
  @Override
  public void postLogout(PostLogoutRequest request, StreamObserver<PostLogoutResponse> responseObserver) { /// done
    PostLogoutResponse response = authenticationService.logout(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }


  /// done
  @Override
  public void postRefreshToken(PostRefreshTokenRequest request, StreamObserver<PostRefreshTokenResponse> responseObserver) { /// done
    PostRefreshTokenResponse response = authenticationService.refreshToken(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  /// done
  @Override
  public void getVerifyEmail(GetVerifyEmailRequest request, StreamObserver<GetVerifyEmailResponse> responseObserver) { /// done
    GetVerifyEmailResponse response = authenticationService.verifyEmail(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }


  /// done
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

  /// done
  @Override
  public void getAccountInfo(GetAccountInfoRequest request, StreamObserver<GetAccountInfoResponse> responseObserver) {
    GetAccountInfoResponse response = authenticationService.getAccountInfo(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  /// done
  @Override
  public void postCreateAccount(PostCreateAccountRequest request, StreamObserver<PostCreateAccountResponse> responseObserver) { /// done
    PostCreateAccountResponse response = authenticationService.createAccount(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  /// done
  @Override
  public void putUpdateAccount(PutUpdateAccountRequest request, StreamObserver<PutUpdateAccountResponse> responseObserver) {
    PutUpdateAccountResponse response = authenticationService.updateAccount(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }


  /// done
  @Override
  public void deleteAccount(DeleteAccountRequest request, StreamObserver<DeleteAccountResponse> responseObserver) {
    DeleteAccountResponse response = authenticationService.deleteAccount(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }


  /// done
  @Override
  public void getBrandInfo(GetBrandInfoRequest request, StreamObserver<GetBrandInfoResponse> responseObserver) {
    GetBrandInfoResponse response = authenticationService.getBrandInfo(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  /// done
  @Override
  public void getBrandProfile(GetBrandProfileRequest request, StreamObserver<GetBrandProfileResponse> responseObserver) {
    GetBrandProfileResponse response = authenticationService.getBrandProfile(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  /// done
  @Override
  public void updateBrand(UpdateBrandRequest request, StreamObserver<UpdateBrandResponse> responseObserver) {
    UpdateBrandResponse response = authenticationService.updateBrand(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  /// done
  @Override
  public void getPlayerInfo(GetPlayerInfoRequest request, StreamObserver<GetPlayerInfoResponse> responseObserver) {
    GetPlayerInfoResponse response = authenticationService.getPlayerInfo(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  /// done
  @Override
  public void getPlayerProfile(PlayerProfileRequest request, StreamObserver<PlayerProfileResponse> responseObserver) {
    PlayerProfileResponse response = authenticationService.getPlayerProfile(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  /// done
  @Override
  public void updatePlayer(UpdatePlayerRequest request, StreamObserver<UpdatePlayerResponse> responseObserver) {
    UpdatePlayerResponse response = authenticationService.updatePlayer(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }


  @Override
  public void getAccounts(GetAccountsRequest request, StreamObserver<GetAccountsResponse> responseObserver) {
    GetAccountsResponse response = authenticationService.getAccounts(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getBrands(GetBrandsRequest request, StreamObserver<GetBrandsResponse> responseObserver) {
    GetBrandsResponse response = authenticationService.getBrands(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getPlayers(GetPlayersRequest request, StreamObserver<GetPlayersResponse> responseObserver) {
    GetPlayersResponse response = authenticationService.getPlayers(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void retrievePlayerProfile(RetrievePlayerProfileRequest request, StreamObserver<RetrievePlayerProfileResponse> responseObserver) {
    RetrievePlayerProfileResponse response = authenticationService.retrievePlayerProfile(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getPlayerByEmail(GetPlayerByEmailRequest request, StreamObserver<GetPlayerByEmailResponse> responseObserver) {
    GetPlayerByEmailResponse response = authenticationService.getPlayerByEmail(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getPlayerByPhoneNumber(GetPlayerByPhoneNumberRequest request, StreamObserver<GetPlayerByPhoneNumberResponse> responseObserver) {
    GetPlayerByPhoneNumberResponse response = authenticationService.getPlayerByPhoneNumber(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
