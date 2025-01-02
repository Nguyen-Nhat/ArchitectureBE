package org.archi.auth.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class AuthServiceEndpointImpl extends AuthServiceGrpc.AuthServiceImplBase{
	@Override
	public void getUserInfo(GetUserInfoRequest request, StreamObserver<GetUserInfoResponse> responseObserver) {
		super.getUserInfo(request, responseObserver);
	}
}
