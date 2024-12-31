package org.archi.auth.server;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.auth.model.Account;
import org.archi.auth.service.AccountService;
import org.archi.auth.service.JwtService;
import org.archi.common.auth.GetVerifyEmailRequest;
import org.archi.common.auth.GetVerifyEmailResponse;
import org.archi.common.auth.VerifyEmailServiceGrpc;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@GrpcService
@Service
@AllArgsConstructor
public class VerifyEmailServer extends VerifyEmailServiceGrpc.VerifyEmailServiceImplBase {
  private final JwtService jwtService;
  private final AccountService accountService;

  @Override
  public void getVerifyEmail(GetVerifyEmailRequest request, StreamObserver<GetVerifyEmailResponse> responseObserver) {
    if (jwtService.isValid(request.getToken())) {
      // Cập nhật trạng thái của email đã được xác thực
      Account result = accountService.findByIdOrElseThrow(jwtService.getAccountId(request.getToken()));
      result.setIsActive(true);
      accountService.save(result);
      GetVerifyEmailResponse response = GetVerifyEmailResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Email verified").build();
      responseObserver.onNext(response);
    } else if (jwtService.isExpired(request.getToken())) {
      GetVerifyEmailResponse response = GetVerifyEmailResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Token expired").build();
      responseObserver.onNext(response);
    } else {
      GetVerifyEmailResponse response = GetVerifyEmailResponse.newBuilder().setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("Invalid token").build();
      responseObserver.onNext(response);
    }
    responseObserver.onCompleted();
  }
}
