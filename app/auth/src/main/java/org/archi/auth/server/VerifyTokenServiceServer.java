package org.archi.auth.server;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.auth.model.Account;
import org.archi.auth.service.AccountService;
import org.archi.auth.service.AuthenticationService;
import org.archi.auth.service.JwtService;
import org.archi.common.auth.*;
import org.springframework.stereotype.Service;

@GrpcService
@Service
@AllArgsConstructor
public class VerifyTokenServiceServer extends VerifyTokenServiceGrpc.VerifyTokenServiceImplBase {
  private final AuthenticationService authenticationService;
  private final JwtService jwtService;
  private final AccountService accountService;

  @Override
  public void postVerifyToken(PostVerifyTokenRequest request, StreamObserver<PostVerifyTokenResponse> responseObserver) {
    String token = request.getToken();
    if (jwtService.isValid(token)) {
      Long id = jwtService.getAccountId(token);
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
    } else {
      responseObserver.onNext(PostVerifyTokenResponse.newBuilder()
              .setStatus(400)
              .setMessage("Invalid token")
              .build());
    }
    responseObserver.onCompleted();
  }
}
