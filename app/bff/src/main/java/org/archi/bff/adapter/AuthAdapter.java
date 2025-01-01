package org.archi.bff.adapter;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.archi.common.auth.*;
import org.springframework.stereotype.Service;

@Service
public class AuthAdapter {

  @GrpcClient("registerService")
  private RegisterServiceGrpc.RegisterServiceBlockingStub registerServiceClient;

  @GrpcClient("loginService")
  private LoginServiceGrpc.LoginServiceBlockingStub loginServiceClient;

  @GrpcClient("verifyEmailService")
  private VerifyEmailServiceGrpc.VerifyEmailServiceBlockingStub verifyEmailServiceClient;

  @GrpcClient("logoutService")
  private LogoutServiceGrpc.LogoutServiceBlockingStub logoutServiceClient;

  @GrpcClient("refreshTokenService")
  private RefreshTokenServiceGrpc.RefreshTokenServiceBlockingStub refreshTokenServiceClient;

  @GrpcClient("verifyTokenService")
  private VerifyTokenServiceGrpc.VerifyTokenServiceBlockingStub verifyTokenServiceClient;


  public PostRegisterResponse postRegister(PostRegisterRequest request) {
    return registerServiceClient.postRegister(request);
  }

  public GetVerifyEmailResponse getVerifyEmail(GetVerifyEmailRequest request) {
    return verifyEmailServiceClient.getVerifyEmail(request);
  }

  public PostLoginResponse postLogin(PostLoginRequest request) {
    return loginServiceClient.postLogin(request);
  }

  public PostLogoutResponse postLogout(PostLogoutRequest request) {
    return logoutServiceClient.postLogout(request);
  }

  public PostRefreshTokenResponse postRefreshToken(PostRefreshTokenRequest postRequest) {
    return refreshTokenServiceClient.postRefreshToken(postRequest);
  }

  public PostVerifyTokenResponse postVerifyToken(PostVerifyTokenRequest request) {
    return verifyTokenServiceClient.postVerifyToken(request);
  }
}
