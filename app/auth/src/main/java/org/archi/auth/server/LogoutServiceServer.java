package org.archi.auth.server;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.auth.service.AuthenticationService;
import org.archi.common.auth.LogoutServiceGrpc;
import org.archi.common.auth.PostLogoutRequest;
import org.archi.common.auth.PostLogoutResponse;

@GrpcService
@AllArgsConstructor
public class LogoutServiceServer extends LogoutServiceGrpc.LogoutServiceImplBase {
  private final AuthenticationService authenticationService;

  @Override
  public void postLogout(PostLogoutRequest request, StreamObserver<PostLogoutResponse> responseObserver) {
    PostLogoutResponse response = authenticationService.logout(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
