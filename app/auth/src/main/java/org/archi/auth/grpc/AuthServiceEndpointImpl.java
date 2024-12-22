package org.archi.auth.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.common.auth.AuthServiceGrpc;
import org.archi.common.auth.GetUserInfoRequest;
import org.archi.common.auth.GetUserInfoResponse;

@GrpcService
public class AuthServiceEndpointImpl extends AuthServiceGrpc.AuthServiceImplBase{
	@Override
	public void getUserInfo(GetUserInfoRequest request, StreamObserver<GetUserInfoResponse> responseObserver) {
		super.getUserInfo(request, responseObserver);
	}
}
