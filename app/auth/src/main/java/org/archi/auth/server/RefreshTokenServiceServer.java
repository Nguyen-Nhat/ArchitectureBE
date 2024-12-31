package org.archi.auth.server;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.common.auth.PostRefreshTokenRequest;
import org.archi.common.auth.PostRefreshTokenResponse;
import org.archi.common.auth.RefreshTokenServiceGrpc;

@GrpcService
@AllArgsConstructor
public class RefreshTokenServiceServer extends RefreshTokenServiceGrpc.RefreshTokenServiceImplBase {
    private final org.archi.auth.service.AuthenticationService authenticationService;

    @Override
    public void postRefreshToken(PostRefreshTokenRequest request, StreamObserver<PostRefreshTokenResponse> responseObserver) {
        org.archi.common.auth.PostRefreshTokenResponse response = authenticationService.refreshToken(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
