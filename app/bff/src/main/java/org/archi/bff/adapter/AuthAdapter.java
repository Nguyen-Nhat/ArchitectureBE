package org.archi.bff.adapter;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.archi.common.auth.*;
import org.springframework.stereotype.Service;

@Service
public class AuthAdapter {

  @GrpcClient("authService")
  private AuthServiceGrpc.AuthServiceBlockingStub authServiceClient;


  public PostRegisterResponse postRegister(PostRegisterRequest request) {
    return authServiceClient.postRegister(request);
  }

  public GetVerifyEmailResponse getVerifyEmail(GetVerifyEmailRequest request) {
    return authServiceClient.getVerifyEmail(request);
  }

  public PostLoginResponse postLogin(PostLoginRequest request) {
    return authServiceClient.postLogin(request);
  }

  public PostLogoutResponse postLogout(PostLogoutRequest request) {
    return authServiceClient.postLogout(request);
  }

  public PostRefreshTokenResponse postRefreshToken(PostRefreshTokenRequest postRequest) {
    return authServiceClient.postRefreshToken(postRequest);
  }

  public PostVerifyTokenResponse postVerifyToken(PostVerifyTokenRequest request) {
    return authServiceClient.postVerifyToken(request);
  }

  public GetAccountInfoResponse getAccountInfo(GetAccountInfoRequest request) {
    return authServiceClient.getAccountInfo(request);
  }

  public GetBrandInfoResponse getBrandInfo(GetBrandInfoRequest request) {
    return authServiceClient.getBrandInfo(request);
  }
  public GetPlayerInfoResponse getPlayerInfo(GetPlayerInfoRequest request) {
    return authServiceClient.getPlayerInfo(request);
  }

  public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) {
    return authServiceClient.deleteAccount(request);
  }
}
