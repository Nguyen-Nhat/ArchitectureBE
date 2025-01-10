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
  public GetBrandProfileResponse getBrandProfile(GetBrandProfileRequest request) {
    return authServiceClient.getBrandProfile(request);
  }
  public GetPlayerInfoResponse getPlayerInfo(GetPlayerInfoRequest request) {
    return authServiceClient.getPlayerInfo(request);
  }

  public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) {
    return authServiceClient.deleteAccount(request);
  }

  public PostCreateAccountResponse postCreateAccount(PostCreateAccountRequest postRequest) {
    return authServiceClient.postCreateAccount(postRequest);
  }

  public PutUpdateAccountResponse putUpdateAccount(PutUpdateAccountRequest putRequest) {
    return authServiceClient.putUpdateAccount(putRequest);
  }

  public UpdateBrandResponse updateBrand(UpdateBrandRequest request) {
    return authServiceClient.updateBrand(request);
  }

  public PlayerProfileResponse getPlayerProfile(PlayerProfileRequest request) {
    return authServiceClient.getPlayerProfile(request);
  }

  public UpdatePlayerResponse updatePlayer(UpdatePlayerRequest request) {
    return authServiceClient.updatePlayer(request);
  }

  public GetAccountsResponse getAccounts(GetAccountsRequest request) {
    return authServiceClient.getAccounts(request);
  }

  public GetBrandsResponse getBrands(GetBrandsRequest request) {
    return authServiceClient.getBrands(request);
  }

  public GetPlayersResponse getPlayers(GetPlayersRequest request) {
    return authServiceClient.getPlayers(request);
  }

  public RetrievePlayerProfileResponse retrievePlayerProfile(RetrievePlayerProfileRequest request) {
    return authServiceClient.retrievePlayerProfile(request);
  }

  public GetPlayerByPhoneNumberResponse getPlayerByPhoneNumber(GetPlayerByPhoneNumberRequest request) {
    return authServiceClient.getPlayerByPhoneNumber(request);
  }

  public GetPlayerByEmailResponse getPlayerByEmail(GetPlayerByEmailRequest emailRequest) {
    return authServiceClient.getPlayerByEmail(emailRequest);
  }
}
