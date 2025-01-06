package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: auth.proto")
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "AuthService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPostRegisterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.PostRegisterRequest,
      org.archi.common.auth.PostRegisterResponse> METHOD_POST_REGISTER = getPostRegisterMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostRegisterRequest,
      org.archi.common.auth.PostRegisterResponse> getPostRegisterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostRegisterRequest,
      org.archi.common.auth.PostRegisterResponse> getPostRegisterMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostRegisterRequest, org.archi.common.auth.PostRegisterResponse> getPostRegisterMethod;
    if ((getPostRegisterMethod = AuthServiceGrpc.getPostRegisterMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostRegisterMethod = AuthServiceGrpc.getPostRegisterMethod) == null) {
          AuthServiceGrpc.getPostRegisterMethod = getPostRegisterMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostRegisterRequest, org.archi.common.auth.PostRegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "PostRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostRegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostRegisterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("PostRegister"))
                  .build();
          }
        }
     }
     return getPostRegisterMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPostLoginMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.PostLoginRequest,
      org.archi.common.auth.PostLoginResponse> METHOD_POST_LOGIN = getPostLoginMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostLoginRequest,
      org.archi.common.auth.PostLoginResponse> getPostLoginMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostLoginRequest,
      org.archi.common.auth.PostLoginResponse> getPostLoginMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostLoginRequest, org.archi.common.auth.PostLoginResponse> getPostLoginMethod;
    if ((getPostLoginMethod = AuthServiceGrpc.getPostLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostLoginMethod = AuthServiceGrpc.getPostLoginMethod) == null) {
          AuthServiceGrpc.getPostLoginMethod = getPostLoginMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostLoginRequest, org.archi.common.auth.PostLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "PostLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostLoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("PostLogin"))
                  .build();
          }
        }
     }
     return getPostLoginMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPostLogoutMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.PostLogoutRequest,
      org.archi.common.auth.PostLogoutResponse> METHOD_POST_LOGOUT = getPostLogoutMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostLogoutRequest,
      org.archi.common.auth.PostLogoutResponse> getPostLogoutMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostLogoutRequest,
      org.archi.common.auth.PostLogoutResponse> getPostLogoutMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostLogoutRequest, org.archi.common.auth.PostLogoutResponse> getPostLogoutMethod;
    if ((getPostLogoutMethod = AuthServiceGrpc.getPostLogoutMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostLogoutMethod = AuthServiceGrpc.getPostLogoutMethod) == null) {
          AuthServiceGrpc.getPostLogoutMethod = getPostLogoutMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostLogoutRequest, org.archi.common.auth.PostLogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "PostLogout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostLogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostLogoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("PostLogout"))
                  .build();
          }
        }
     }
     return getPostLogoutMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPostRefreshTokenMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.PostRefreshTokenRequest,
      org.archi.common.auth.PostRefreshTokenResponse> METHOD_POST_REFRESH_TOKEN = getPostRefreshTokenMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostRefreshTokenRequest,
      org.archi.common.auth.PostRefreshTokenResponse> getPostRefreshTokenMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostRefreshTokenRequest,
      org.archi.common.auth.PostRefreshTokenResponse> getPostRefreshTokenMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostRefreshTokenRequest, org.archi.common.auth.PostRefreshTokenResponse> getPostRefreshTokenMethod;
    if ((getPostRefreshTokenMethod = AuthServiceGrpc.getPostRefreshTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostRefreshTokenMethod = AuthServiceGrpc.getPostRefreshTokenMethod) == null) {
          AuthServiceGrpc.getPostRefreshTokenMethod = getPostRefreshTokenMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostRefreshTokenRequest, org.archi.common.auth.PostRefreshTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "PostRefreshToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostRefreshTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostRefreshTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("PostRefreshToken"))
                  .build();
          }
        }
     }
     return getPostRefreshTokenMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetVerifyEmailMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.GetVerifyEmailRequest,
      org.archi.common.auth.GetVerifyEmailResponse> METHOD_GET_VERIFY_EMAIL = getGetVerifyEmailMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetVerifyEmailRequest,
      org.archi.common.auth.GetVerifyEmailResponse> getGetVerifyEmailMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetVerifyEmailRequest,
      org.archi.common.auth.GetVerifyEmailResponse> getGetVerifyEmailMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetVerifyEmailRequest, org.archi.common.auth.GetVerifyEmailResponse> getGetVerifyEmailMethod;
    if ((getGetVerifyEmailMethod = AuthServiceGrpc.getGetVerifyEmailMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetVerifyEmailMethod = AuthServiceGrpc.getGetVerifyEmailMethod) == null) {
          AuthServiceGrpc.getGetVerifyEmailMethod = getGetVerifyEmailMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetVerifyEmailRequest, org.archi.common.auth.GetVerifyEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "GetVerifyEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetVerifyEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetVerifyEmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetVerifyEmail"))
                  .build();
          }
        }
     }
     return getGetVerifyEmailMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPostVerifyTokenMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.PostVerifyTokenRequest,
      org.archi.common.auth.PostVerifyTokenResponse> METHOD_POST_VERIFY_TOKEN = getPostVerifyTokenMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostVerifyTokenRequest,
      org.archi.common.auth.PostVerifyTokenResponse> getPostVerifyTokenMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostVerifyTokenRequest,
      org.archi.common.auth.PostVerifyTokenResponse> getPostVerifyTokenMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostVerifyTokenRequest, org.archi.common.auth.PostVerifyTokenResponse> getPostVerifyTokenMethod;
    if ((getPostVerifyTokenMethod = AuthServiceGrpc.getPostVerifyTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostVerifyTokenMethod = AuthServiceGrpc.getPostVerifyTokenMethod) == null) {
          AuthServiceGrpc.getPostVerifyTokenMethod = getPostVerifyTokenMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostVerifyTokenRequest, org.archi.common.auth.PostVerifyTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "PostVerifyToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostVerifyTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostVerifyTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("PostVerifyToken"))
                  .build();
          }
        }
     }
     return getPostVerifyTokenMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBrandInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandInfoRequest,
      org.archi.common.auth.GetBrandInfoResponse> METHOD_GET_BRAND_INFO = getGetBrandInfoMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandInfoRequest,
      org.archi.common.auth.GetBrandInfoResponse> getGetBrandInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandInfoRequest,
      org.archi.common.auth.GetBrandInfoResponse> getGetBrandInfoMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandInfoRequest, org.archi.common.auth.GetBrandInfoResponse> getGetBrandInfoMethod;
    if ((getGetBrandInfoMethod = AuthServiceGrpc.getGetBrandInfoMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetBrandInfoMethod = AuthServiceGrpc.getGetBrandInfoMethod) == null) {
          AuthServiceGrpc.getGetBrandInfoMethod = getGetBrandInfoMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetBrandInfoRequest, org.archi.common.auth.GetBrandInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "GetBrandInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetBrandInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetBrandInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetBrandInfo"))
                  .build();
          }
        }
     }
     return getGetBrandInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPlayerInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerInfoRequest,
      org.archi.common.auth.GetPlayerInfoResponse> METHOD_GET_PLAYER_INFO = getGetPlayerInfoMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerInfoRequest,
      org.archi.common.auth.GetPlayerInfoResponse> getGetPlayerInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerInfoRequest,
      org.archi.common.auth.GetPlayerInfoResponse> getGetPlayerInfoMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerInfoRequest, org.archi.common.auth.GetPlayerInfoResponse> getGetPlayerInfoMethod;
    if ((getGetPlayerInfoMethod = AuthServiceGrpc.getGetPlayerInfoMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetPlayerInfoMethod = AuthServiceGrpc.getGetPlayerInfoMethod) == null) {
          AuthServiceGrpc.getGetPlayerInfoMethod = getGetPlayerInfoMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetPlayerInfoRequest, org.archi.common.auth.GetPlayerInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "GetPlayerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetPlayerInfo"))
                  .build();
          }
        }
     }
     return getGetPlayerInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAccountInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountInfoRequest,
      org.archi.common.auth.GetAccountInfoResponse> METHOD_GET_ACCOUNT_INFO = getGetAccountInfoMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountInfoRequest,
      org.archi.common.auth.GetAccountInfoResponse> getGetAccountInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountInfoRequest,
      org.archi.common.auth.GetAccountInfoResponse> getGetAccountInfoMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountInfoRequest, org.archi.common.auth.GetAccountInfoResponse> getGetAccountInfoMethod;
    if ((getGetAccountInfoMethod = AuthServiceGrpc.getGetAccountInfoMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetAccountInfoMethod = AuthServiceGrpc.getGetAccountInfoMethod) == null) {
          AuthServiceGrpc.getGetAccountInfoMethod = getGetAccountInfoMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetAccountInfoRequest, org.archi.common.auth.GetAccountInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "GetAccountInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetAccountInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetAccountInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetAccountInfo"))
                  .build();
          }
        }
     }
     return getGetAccountInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPostCreateAccountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.PostCreateAccountRequest,
      org.archi.common.auth.PostCreateAccountResponse> METHOD_POST_CREATE_ACCOUNT = getPostCreateAccountMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostCreateAccountRequest,
      org.archi.common.auth.PostCreateAccountResponse> getPostCreateAccountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostCreateAccountRequest,
      org.archi.common.auth.PostCreateAccountResponse> getPostCreateAccountMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostCreateAccountRequest, org.archi.common.auth.PostCreateAccountResponse> getPostCreateAccountMethod;
    if ((getPostCreateAccountMethod = AuthServiceGrpc.getPostCreateAccountMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostCreateAccountMethod = AuthServiceGrpc.getPostCreateAccountMethod) == null) {
          AuthServiceGrpc.getPostCreateAccountMethod = getPostCreateAccountMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostCreateAccountRequest, org.archi.common.auth.PostCreateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "PostCreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostCreateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostCreateAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("PostCreateAccount"))
                  .build();
          }
        }
     }
     return getPostCreateAccountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteAccountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.DeleteAccountRequest,
      org.archi.common.auth.DeleteAccountResponse> METHOD_DELETE_ACCOUNT = getDeleteAccountMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.DeleteAccountRequest,
      org.archi.common.auth.DeleteAccountResponse> getDeleteAccountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.DeleteAccountRequest,
      org.archi.common.auth.DeleteAccountResponse> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.DeleteAccountRequest, org.archi.common.auth.DeleteAccountResponse> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = AuthServiceGrpc.getDeleteAccountMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDeleteAccountMethod = AuthServiceGrpc.getDeleteAccountMethod) == null) {
          AuthServiceGrpc.getDeleteAccountMethod = getDeleteAccountMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.DeleteAccountRequest, org.archi.common.auth.DeleteAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.DeleteAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.DeleteAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DeleteAccount"))
                  .build();
          }
        }
     }
     return getDeleteAccountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPutUpdateAccountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.PutUpdateAccountRequest,
      org.archi.common.auth.PutUpdateAccountResponse> METHOD_PUT_UPDATE_ACCOUNT = getPutUpdateAccountMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PutUpdateAccountRequest,
      org.archi.common.auth.PutUpdateAccountResponse> getPutUpdateAccountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PutUpdateAccountRequest,
      org.archi.common.auth.PutUpdateAccountResponse> getPutUpdateAccountMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PutUpdateAccountRequest, org.archi.common.auth.PutUpdateAccountResponse> getPutUpdateAccountMethod;
    if ((getPutUpdateAccountMethod = AuthServiceGrpc.getPutUpdateAccountMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPutUpdateAccountMethod = AuthServiceGrpc.getPutUpdateAccountMethod) == null) {
          AuthServiceGrpc.getPutUpdateAccountMethod = getPutUpdateAccountMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.PutUpdateAccountRequest, org.archi.common.auth.PutUpdateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "PutUpdateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PutUpdateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PutUpdateAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("PutUpdateAccount"))
                  .build();
          }
        }
     }
     return getPutUpdateAccountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBrandProfileMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandProfileRequest,
      org.archi.common.auth.GetBrandProfileResponse> METHOD_GET_BRAND_PROFILE = getGetBrandProfileMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandProfileRequest,
      org.archi.common.auth.GetBrandProfileResponse> getGetBrandProfileMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandProfileRequest,
      org.archi.common.auth.GetBrandProfileResponse> getGetBrandProfileMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandProfileRequest, org.archi.common.auth.GetBrandProfileResponse> getGetBrandProfileMethod;
    if ((getGetBrandProfileMethod = AuthServiceGrpc.getGetBrandProfileMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetBrandProfileMethod = AuthServiceGrpc.getGetBrandProfileMethod) == null) {
          AuthServiceGrpc.getGetBrandProfileMethod = getGetBrandProfileMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetBrandProfileRequest, org.archi.common.auth.GetBrandProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "GetBrandProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetBrandProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetBrandProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetBrandProfile"))
                  .build();
          }
        }
     }
     return getGetBrandProfileMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateBrandMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.UpdateBrandRequest,
      org.archi.common.auth.UpdateBrandResponse> METHOD_UPDATE_BRAND = getUpdateBrandMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.UpdateBrandRequest,
      org.archi.common.auth.UpdateBrandResponse> getUpdateBrandMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.UpdateBrandRequest,
      org.archi.common.auth.UpdateBrandResponse> getUpdateBrandMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.UpdateBrandRequest, org.archi.common.auth.UpdateBrandResponse> getUpdateBrandMethod;
    if ((getUpdateBrandMethod = AuthServiceGrpc.getUpdateBrandMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdateBrandMethod = AuthServiceGrpc.getUpdateBrandMethod) == null) {
          AuthServiceGrpc.getUpdateBrandMethod = getUpdateBrandMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.UpdateBrandRequest, org.archi.common.auth.UpdateBrandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "UpdateBrand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.UpdateBrandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.UpdateBrandResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("UpdateBrand"))
                  .build();
          }
        }
     }
     return getUpdateBrandMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPlayerProfileMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.PlayerProfileRequest,
      org.archi.common.auth.PlayerProfileResponse> METHOD_GET_PLAYER_PROFILE = getGetPlayerProfileMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PlayerProfileRequest,
      org.archi.common.auth.PlayerProfileResponse> getGetPlayerProfileMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PlayerProfileRequest,
      org.archi.common.auth.PlayerProfileResponse> getGetPlayerProfileMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PlayerProfileRequest, org.archi.common.auth.PlayerProfileResponse> getGetPlayerProfileMethod;
    if ((getGetPlayerProfileMethod = AuthServiceGrpc.getGetPlayerProfileMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetPlayerProfileMethod = AuthServiceGrpc.getGetPlayerProfileMethod) == null) {
          AuthServiceGrpc.getGetPlayerProfileMethod = getGetPlayerProfileMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.PlayerProfileRequest, org.archi.common.auth.PlayerProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "GetPlayerProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PlayerProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PlayerProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetPlayerProfile"))
                  .build();
          }
        }
     }
     return getGetPlayerProfileMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdatePlayerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.UpdatePlayerRequest,
      org.archi.common.auth.UpdatePlayerResponse> METHOD_UPDATE_PLAYER = getUpdatePlayerMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.UpdatePlayerRequest,
      org.archi.common.auth.UpdatePlayerResponse> getUpdatePlayerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.UpdatePlayerRequest,
      org.archi.common.auth.UpdatePlayerResponse> getUpdatePlayerMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.UpdatePlayerRequest, org.archi.common.auth.UpdatePlayerResponse> getUpdatePlayerMethod;
    if ((getUpdatePlayerMethod = AuthServiceGrpc.getUpdatePlayerMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdatePlayerMethod = AuthServiceGrpc.getUpdatePlayerMethod) == null) {
          AuthServiceGrpc.getUpdatePlayerMethod = getUpdatePlayerMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.UpdatePlayerRequest, org.archi.common.auth.UpdatePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "UpdatePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.UpdatePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.UpdatePlayerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("UpdatePlayer"))
                  .build();
          }
        }
     }
     return getUpdatePlayerMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAccountsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountsRequest,
      org.archi.common.auth.GetAccountsResponse> METHOD_GET_ACCOUNTS = getGetAccountsMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountsRequest,
      org.archi.common.auth.GetAccountsResponse> getGetAccountsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountsRequest,
      org.archi.common.auth.GetAccountsResponse> getGetAccountsMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountsRequest, org.archi.common.auth.GetAccountsResponse> getGetAccountsMethod;
    if ((getGetAccountsMethod = AuthServiceGrpc.getGetAccountsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetAccountsMethod = AuthServiceGrpc.getGetAccountsMethod) == null) {
          AuthServiceGrpc.getGetAccountsMethod = getGetAccountsMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetAccountsRequest, org.archi.common.auth.GetAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "GetAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetAccountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetAccounts"))
                  .build();
          }
        }
     }
     return getGetAccountsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBrandsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandsRequest,
      org.archi.common.auth.GetBrandsResponse> METHOD_GET_BRANDS = getGetBrandsMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandsRequest,
      org.archi.common.auth.GetBrandsResponse> getGetBrandsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandsRequest,
      org.archi.common.auth.GetBrandsResponse> getGetBrandsMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandsRequest, org.archi.common.auth.GetBrandsResponse> getGetBrandsMethod;
    if ((getGetBrandsMethod = AuthServiceGrpc.getGetBrandsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetBrandsMethod = AuthServiceGrpc.getGetBrandsMethod) == null) {
          AuthServiceGrpc.getGetBrandsMethod = getGetBrandsMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetBrandsRequest, org.archi.common.auth.GetBrandsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "GetBrands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetBrandsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetBrandsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetBrands"))
                  .build();
          }
        }
     }
     return getGetBrandsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPlayersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayersRequest,
      org.archi.common.auth.GetPlayersResponse> METHOD_GET_PLAYERS = getGetPlayersMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayersRequest,
      org.archi.common.auth.GetPlayersResponse> getGetPlayersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayersRequest,
      org.archi.common.auth.GetPlayersResponse> getGetPlayersMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayersRequest, org.archi.common.auth.GetPlayersResponse> getGetPlayersMethod;
    if ((getGetPlayersMethod = AuthServiceGrpc.getGetPlayersMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetPlayersMethod = AuthServiceGrpc.getGetPlayersMethod) == null) {
          AuthServiceGrpc.getGetPlayersMethod = getGetPlayersMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetPlayersRequest, org.archi.common.auth.GetPlayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "GetPlayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetPlayers"))
                  .build();
          }
        }
     }
     return getGetPlayersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    return new AuthServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void postRegister(org.archi.common.auth.PostRegisterRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostRegisterMethod(), responseObserver);
    }

    /**
     */
    public void postLogin(org.archi.common.auth.PostLoginRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostLoginMethod(), responseObserver);
    }

    /**
     */
    public void postLogout(org.archi.common.auth.PostLogoutRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLogoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostLogoutMethod(), responseObserver);
    }

    /**
     */
    public void postRefreshToken(org.archi.common.auth.PostRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRefreshTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostRefreshTokenMethod(), responseObserver);
    }

    /**
     */
    public void getVerifyEmail(org.archi.common.auth.GetVerifyEmailRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetVerifyEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVerifyEmailMethod(), responseObserver);
    }

    /**
     */
    public void postVerifyToken(org.archi.common.auth.PostVerifyTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostVerifyTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostVerifyTokenMethod(), responseObserver);
    }

    /**
     */
    public void getBrandInfo(org.archi.common.auth.GetBrandInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBrandInfoMethod(), responseObserver);
    }

    /**
     */
    public void getPlayerInfo(org.archi.common.auth.GetPlayerInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerInfoMethod(), responseObserver);
    }

    /**
     */
    public void getAccountInfo(org.archi.common.auth.GetAccountInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountInfoMethod(), responseObserver);
    }

    /**
     */
    public void postCreateAccount(org.archi.common.auth.PostCreateAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostCreateAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostCreateAccountMethod(), responseObserver);
    }

    /**
     */
    public void deleteAccount(org.archi.common.auth.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.DeleteAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     */
    public void putUpdateAccount(org.archi.common.auth.PutUpdateAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PutUpdateAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutUpdateAccountMethod(), responseObserver);
    }

    /**
     */
    public void getBrandProfile(org.archi.common.auth.GetBrandProfileRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBrandProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateBrand(org.archi.common.auth.UpdateBrandRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.UpdateBrandResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBrandMethod(), responseObserver);
    }

    /**
     */
    public void getPlayerProfile(org.archi.common.auth.PlayerProfileRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PlayerProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerProfileMethod(), responseObserver);
    }

    /**
     */
    public void updatePlayer(org.archi.common.auth.UpdatePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.UpdatePlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePlayerMethod(), responseObserver);
    }

    /**
     */
    public void getAccounts(org.archi.common.auth.GetAccountsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountsMethod(), responseObserver);
    }

    /**
     */
    public void getBrands(org.archi.common.auth.GetBrandsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBrandsMethod(), responseObserver);
    }

    /**
     */
    public void getPlayers(org.archi.common.auth.GetPlayersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPostRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.PostRegisterRequest,
                org.archi.common.auth.PostRegisterResponse>(
                  this, METHODID_POST_REGISTER)))
          .addMethod(
            getPostLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.PostLoginRequest,
                org.archi.common.auth.PostLoginResponse>(
                  this, METHODID_POST_LOGIN)))
          .addMethod(
            getPostLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.PostLogoutRequest,
                org.archi.common.auth.PostLogoutResponse>(
                  this, METHODID_POST_LOGOUT)))
          .addMethod(
            getPostRefreshTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.PostRefreshTokenRequest,
                org.archi.common.auth.PostRefreshTokenResponse>(
                  this, METHODID_POST_REFRESH_TOKEN)))
          .addMethod(
            getGetVerifyEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.GetVerifyEmailRequest,
                org.archi.common.auth.GetVerifyEmailResponse>(
                  this, METHODID_GET_VERIFY_EMAIL)))
          .addMethod(
            getPostVerifyTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.PostVerifyTokenRequest,
                org.archi.common.auth.PostVerifyTokenResponse>(
                  this, METHODID_POST_VERIFY_TOKEN)))
          .addMethod(
            getGetBrandInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.GetBrandInfoRequest,
                org.archi.common.auth.GetBrandInfoResponse>(
                  this, METHODID_GET_BRAND_INFO)))
          .addMethod(
            getGetPlayerInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.GetPlayerInfoRequest,
                org.archi.common.auth.GetPlayerInfoResponse>(
                  this, METHODID_GET_PLAYER_INFO)))
          .addMethod(
            getGetAccountInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.GetAccountInfoRequest,
                org.archi.common.auth.GetAccountInfoResponse>(
                  this, METHODID_GET_ACCOUNT_INFO)))
          .addMethod(
            getPostCreateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.PostCreateAccountRequest,
                org.archi.common.auth.PostCreateAccountResponse>(
                  this, METHODID_POST_CREATE_ACCOUNT)))
          .addMethod(
            getDeleteAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.DeleteAccountRequest,
                org.archi.common.auth.DeleteAccountResponse>(
                  this, METHODID_DELETE_ACCOUNT)))
          .addMethod(
            getPutUpdateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.PutUpdateAccountRequest,
                org.archi.common.auth.PutUpdateAccountResponse>(
                  this, METHODID_PUT_UPDATE_ACCOUNT)))
          .addMethod(
            getGetBrandProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.GetBrandProfileRequest,
                org.archi.common.auth.GetBrandProfileResponse>(
                  this, METHODID_GET_BRAND_PROFILE)))
          .addMethod(
            getUpdateBrandMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.UpdateBrandRequest,
                org.archi.common.auth.UpdateBrandResponse>(
                  this, METHODID_UPDATE_BRAND)))
          .addMethod(
            getGetPlayerProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.PlayerProfileRequest,
                org.archi.common.auth.PlayerProfileResponse>(
                  this, METHODID_GET_PLAYER_PROFILE)))
          .addMethod(
            getUpdatePlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.UpdatePlayerRequest,
                org.archi.common.auth.UpdatePlayerResponse>(
                  this, METHODID_UPDATE_PLAYER)))
          .addMethod(
            getGetAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.GetAccountsRequest,
                org.archi.common.auth.GetAccountsResponse>(
                  this, METHODID_GET_ACCOUNTS)))
          .addMethod(
            getGetBrandsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.GetBrandsRequest,
                org.archi.common.auth.GetBrandsResponse>(
                  this, METHODID_GET_BRANDS)))
          .addMethod(
            getGetPlayersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.auth.GetPlayersRequest,
                org.archi.common.auth.GetPlayersResponse>(
                  this, METHODID_GET_PLAYERS)))
          .build();
    }
  }

  /**
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractStub<AuthServiceStub> {
    private AuthServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void postRegister(org.archi.common.auth.PostRegisterRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postLogin(org.archi.common.auth.PostLoginRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postLogout(org.archi.common.auth.PostLogoutRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLogoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postRefreshToken(org.archi.common.auth.PostRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRefreshTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostRefreshTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVerifyEmail(org.archi.common.auth.GetVerifyEmailRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetVerifyEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVerifyEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postVerifyToken(org.archi.common.auth.PostVerifyTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostVerifyTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostVerifyTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrandInfo(org.archi.common.auth.GetBrandInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBrandInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerInfo(org.archi.common.auth.GetPlayerInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountInfo(org.archi.common.auth.GetAccountInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postCreateAccount(org.archi.common.auth.PostCreateAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostCreateAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(org.archi.common.auth.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.DeleteAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putUpdateAccount(org.archi.common.auth.PutUpdateAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PutUpdateAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrandProfile(org.archi.common.auth.GetBrandProfileRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBrandProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBrand(org.archi.common.auth.UpdateBrandRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.UpdateBrandResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBrandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerProfile(org.archi.common.auth.PlayerProfileRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PlayerProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePlayer(org.archi.common.auth.UpdatePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.UpdatePlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccounts(org.archi.common.auth.GetAccountsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrands(org.archi.common.auth.GetBrandsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBrandsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayers(org.archi.common.auth.GetPlayersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.PostRegisterResponse postRegister(org.archi.common.auth.PostRegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostLoginResponse postLogin(org.archi.common.auth.PostLoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostLogoutResponse postLogout(org.archi.common.auth.PostLogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostRefreshTokenResponse postRefreshToken(org.archi.common.auth.PostRefreshTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostRefreshTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetVerifyEmailResponse getVerifyEmail(org.archi.common.auth.GetVerifyEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVerifyEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostVerifyTokenResponse postVerifyToken(org.archi.common.auth.PostVerifyTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostVerifyTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetBrandInfoResponse getBrandInfo(org.archi.common.auth.GetBrandInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBrandInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetPlayerInfoResponse getPlayerInfo(org.archi.common.auth.GetPlayerInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetAccountInfoResponse getAccountInfo(org.archi.common.auth.GetAccountInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostCreateAccountResponse postCreateAccount(org.archi.common.auth.PostCreateAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.DeleteAccountResponse deleteAccount(org.archi.common.auth.DeleteAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PutUpdateAccountResponse putUpdateAccount(org.archi.common.auth.PutUpdateAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetBrandProfileResponse getBrandProfile(org.archi.common.auth.GetBrandProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBrandProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.UpdateBrandResponse updateBrand(org.archi.common.auth.UpdateBrandRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBrandMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PlayerProfileResponse getPlayerProfile(org.archi.common.auth.PlayerProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.UpdatePlayerResponse updatePlayer(org.archi.common.auth.UpdatePlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetAccountsResponse getAccounts(org.archi.common.auth.GetAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetBrandsResponse getBrands(org.archi.common.auth.GetBrandsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBrandsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetPlayersResponse getPlayers(org.archi.common.auth.GetPlayersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostRegisterResponse> postRegister(
        org.archi.common.auth.PostRegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostLoginResponse> postLogin(
        org.archi.common.auth.PostLoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostLogoutResponse> postLogout(
        org.archi.common.auth.PostLogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostRefreshTokenResponse> postRefreshToken(
        org.archi.common.auth.PostRefreshTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostRefreshTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetVerifyEmailResponse> getVerifyEmail(
        org.archi.common.auth.GetVerifyEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVerifyEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostVerifyTokenResponse> postVerifyToken(
        org.archi.common.auth.PostVerifyTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostVerifyTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetBrandInfoResponse> getBrandInfo(
        org.archi.common.auth.GetBrandInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBrandInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetPlayerInfoResponse> getPlayerInfo(
        org.archi.common.auth.GetPlayerInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetAccountInfoResponse> getAccountInfo(
        org.archi.common.auth.GetAccountInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostCreateAccountResponse> postCreateAccount(
        org.archi.common.auth.PostCreateAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.DeleteAccountResponse> deleteAccount(
        org.archi.common.auth.DeleteAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PutUpdateAccountResponse> putUpdateAccount(
        org.archi.common.auth.PutUpdateAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetBrandProfileResponse> getBrandProfile(
        org.archi.common.auth.GetBrandProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBrandProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.UpdateBrandResponse> updateBrand(
        org.archi.common.auth.UpdateBrandRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBrandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PlayerProfileResponse> getPlayerProfile(
        org.archi.common.auth.PlayerProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.UpdatePlayerResponse> updatePlayer(
        org.archi.common.auth.UpdatePlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetAccountsResponse> getAccounts(
        org.archi.common.auth.GetAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetBrandsResponse> getBrands(
        org.archi.common.auth.GetBrandsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBrandsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetPlayersResponse> getPlayers(
        org.archi.common.auth.GetPlayersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_REGISTER = 0;
  private static final int METHODID_POST_LOGIN = 1;
  private static final int METHODID_POST_LOGOUT = 2;
  private static final int METHODID_POST_REFRESH_TOKEN = 3;
  private static final int METHODID_GET_VERIFY_EMAIL = 4;
  private static final int METHODID_POST_VERIFY_TOKEN = 5;
  private static final int METHODID_GET_BRAND_INFO = 6;
  private static final int METHODID_GET_PLAYER_INFO = 7;
  private static final int METHODID_GET_ACCOUNT_INFO = 8;
  private static final int METHODID_POST_CREATE_ACCOUNT = 9;
  private static final int METHODID_DELETE_ACCOUNT = 10;
  private static final int METHODID_PUT_UPDATE_ACCOUNT = 11;
  private static final int METHODID_GET_BRAND_PROFILE = 12;
  private static final int METHODID_UPDATE_BRAND = 13;
  private static final int METHODID_GET_PLAYER_PROFILE = 14;
  private static final int METHODID_UPDATE_PLAYER = 15;
  private static final int METHODID_GET_ACCOUNTS = 16;
  private static final int METHODID_GET_BRANDS = 17;
  private static final int METHODID_GET_PLAYERS = 18;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST_REGISTER:
          serviceImpl.postRegister((org.archi.common.auth.PostRegisterRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostRegisterResponse>) responseObserver);
          break;
        case METHODID_POST_LOGIN:
          serviceImpl.postLogin((org.archi.common.auth.PostLoginRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostLoginResponse>) responseObserver);
          break;
        case METHODID_POST_LOGOUT:
          serviceImpl.postLogout((org.archi.common.auth.PostLogoutRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostLogoutResponse>) responseObserver);
          break;
        case METHODID_POST_REFRESH_TOKEN:
          serviceImpl.postRefreshToken((org.archi.common.auth.PostRefreshTokenRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostRefreshTokenResponse>) responseObserver);
          break;
        case METHODID_GET_VERIFY_EMAIL:
          serviceImpl.getVerifyEmail((org.archi.common.auth.GetVerifyEmailRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetVerifyEmailResponse>) responseObserver);
          break;
        case METHODID_POST_VERIFY_TOKEN:
          serviceImpl.postVerifyToken((org.archi.common.auth.PostVerifyTokenRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostVerifyTokenResponse>) responseObserver);
          break;
        case METHODID_GET_BRAND_INFO:
          serviceImpl.getBrandInfo((org.archi.common.auth.GetBrandInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandInfoResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_INFO:
          serviceImpl.getPlayerInfo((org.archi.common.auth.GetPlayerInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerInfoResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_INFO:
          serviceImpl.getAccountInfo((org.archi.common.auth.GetAccountInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountInfoResponse>) responseObserver);
          break;
        case METHODID_POST_CREATE_ACCOUNT:
          serviceImpl.postCreateAccount((org.archi.common.auth.PostCreateAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostCreateAccountResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((org.archi.common.auth.DeleteAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.DeleteAccountResponse>) responseObserver);
          break;
        case METHODID_PUT_UPDATE_ACCOUNT:
          serviceImpl.putUpdateAccount((org.archi.common.auth.PutUpdateAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PutUpdateAccountResponse>) responseObserver);
          break;
        case METHODID_GET_BRAND_PROFILE:
          serviceImpl.getBrandProfile((org.archi.common.auth.GetBrandProfileRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandProfileResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BRAND:
          serviceImpl.updateBrand((org.archi.common.auth.UpdateBrandRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.UpdateBrandResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_PROFILE:
          serviceImpl.getPlayerProfile((org.archi.common.auth.PlayerProfileRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PlayerProfileResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PLAYER:
          serviceImpl.updatePlayer((org.archi.common.auth.UpdatePlayerRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.UpdatePlayerResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNTS:
          serviceImpl.getAccounts((org.archi.common.auth.GetAccountsRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountsResponse>) responseObserver);
          break;
        case METHODID_GET_BRANDS:
          serviceImpl.getBrands((org.archi.common.auth.GetBrandsRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandsResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYERS:
          serviceImpl.getPlayers((org.archi.common.auth.GetPlayersRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getPostRegisterMethod())
              .addMethod(getPostLoginMethod())
              .addMethod(getPostLogoutMethod())
              .addMethod(getPostRefreshTokenMethod())
              .addMethod(getGetVerifyEmailMethod())
              .addMethod(getPostVerifyTokenMethod())
              .addMethod(getGetBrandInfoMethod())
              .addMethod(getGetPlayerInfoMethod())
              .addMethod(getGetAccountInfoMethod())
              .addMethod(getPostCreateAccountMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getPutUpdateAccountMethod())
              .addMethod(getGetBrandProfileMethod())
              .addMethod(getUpdateBrandMethod())
              .addMethod(getGetPlayerProfileMethod())
              .addMethod(getUpdatePlayerMethod())
              .addMethod(getGetAccountsMethod())
              .addMethod(getGetBrandsMethod())
              .addMethod(getGetPlayersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
