package org.archi.auth.server;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.auth.service.AuthenticationService;
import org.archi.common.auth.LoginServiceGrpc;
import org.archi.common.auth.PostLoginRequest;
import org.archi.common.auth.PostLoginResponse;

@GrpcService
@AllArgsConstructor
public class LoginServiceServer  extends LoginServiceGrpc.LoginServiceImplBase {
  private final AuthenticationService authenticationService;

  @Override
  public void postLogin(PostLoginRequest request, StreamObserver<PostLoginResponse> responseObserver) {
    PostLoginResponse response = authenticationService.login(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
