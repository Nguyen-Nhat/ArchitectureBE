package org.archi.bff.adapter;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.archi.common.auth.AuthServiceGrpc;
import org.archi.common.auth.GetUserInfoRequest;
import org.archi.common.auth.GetUserInfoResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthAdapter {
    @GrpcClient("authService")
    private AuthServiceGrpc.AuthServiceBlockingStub client;

    public GetUserInfoResponse temp(GetUserInfoRequest request) {
        return client.getUserInfo(request);
    }
}
