package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostRegisterRequest,
      org.archi.common.auth.PostRegisterResponse> getPostRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostRegister",
      requestType = org.archi.common.auth.PostRegisterRequest.class,
      responseType = org.archi.common.auth.PostRegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostRegisterRequest,
      org.archi.common.auth.PostRegisterResponse> getPostRegisterMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostRegisterRequest, org.archi.common.auth.PostRegisterResponse> getPostRegisterMethod;
    if ((getPostRegisterMethod = AuthServiceGrpc.getPostRegisterMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostRegisterMethod = AuthServiceGrpc.getPostRegisterMethod) == null) {
          AuthServiceGrpc.getPostRegisterMethod = getPostRegisterMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostRegisterRequest, org.archi.common.auth.PostRegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostRegister"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostLoginRequest,
      org.archi.common.auth.PostLoginResponse> getPostLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostLogin",
      requestType = org.archi.common.auth.PostLoginRequest.class,
      responseType = org.archi.common.auth.PostLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostLoginRequest,
      org.archi.common.auth.PostLoginResponse> getPostLoginMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostLoginRequest, org.archi.common.auth.PostLoginResponse> getPostLoginMethod;
    if ((getPostLoginMethod = AuthServiceGrpc.getPostLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostLoginMethod = AuthServiceGrpc.getPostLoginMethod) == null) {
          AuthServiceGrpc.getPostLoginMethod = getPostLoginMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostLoginRequest, org.archi.common.auth.PostLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostLogin"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostLogoutRequest,
      org.archi.common.auth.PostLogoutResponse> getPostLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostLogout",
      requestType = org.archi.common.auth.PostLogoutRequest.class,
      responseType = org.archi.common.auth.PostLogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostLogoutRequest,
      org.archi.common.auth.PostLogoutResponse> getPostLogoutMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostLogoutRequest, org.archi.common.auth.PostLogoutResponse> getPostLogoutMethod;
    if ((getPostLogoutMethod = AuthServiceGrpc.getPostLogoutMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostLogoutMethod = AuthServiceGrpc.getPostLogoutMethod) == null) {
          AuthServiceGrpc.getPostLogoutMethod = getPostLogoutMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostLogoutRequest, org.archi.common.auth.PostLogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostLogout"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostRefreshTokenRequest,
      org.archi.common.auth.PostRefreshTokenResponse> getPostRefreshTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostRefreshToken",
      requestType = org.archi.common.auth.PostRefreshTokenRequest.class,
      responseType = org.archi.common.auth.PostRefreshTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostRefreshTokenRequest,
      org.archi.common.auth.PostRefreshTokenResponse> getPostRefreshTokenMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostRefreshTokenRequest, org.archi.common.auth.PostRefreshTokenResponse> getPostRefreshTokenMethod;
    if ((getPostRefreshTokenMethod = AuthServiceGrpc.getPostRefreshTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostRefreshTokenMethod = AuthServiceGrpc.getPostRefreshTokenMethod) == null) {
          AuthServiceGrpc.getPostRefreshTokenMethod = getPostRefreshTokenMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostRefreshTokenRequest, org.archi.common.auth.PostRefreshTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostRefreshToken"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetVerifyEmailRequest,
      org.archi.common.auth.GetVerifyEmailResponse> getGetVerifyEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVerifyEmail",
      requestType = org.archi.common.auth.GetVerifyEmailRequest.class,
      responseType = org.archi.common.auth.GetVerifyEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetVerifyEmailRequest,
      org.archi.common.auth.GetVerifyEmailResponse> getGetVerifyEmailMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetVerifyEmailRequest, org.archi.common.auth.GetVerifyEmailResponse> getGetVerifyEmailMethod;
    if ((getGetVerifyEmailMethod = AuthServiceGrpc.getGetVerifyEmailMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetVerifyEmailMethod = AuthServiceGrpc.getGetVerifyEmailMethod) == null) {
          AuthServiceGrpc.getGetVerifyEmailMethod = getGetVerifyEmailMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetVerifyEmailRequest, org.archi.common.auth.GetVerifyEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVerifyEmail"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostVerifyTokenRequest,
      org.archi.common.auth.PostVerifyTokenResponse> getPostVerifyTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostVerifyToken",
      requestType = org.archi.common.auth.PostVerifyTokenRequest.class,
      responseType = org.archi.common.auth.PostVerifyTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostVerifyTokenRequest,
      org.archi.common.auth.PostVerifyTokenResponse> getPostVerifyTokenMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostVerifyTokenRequest, org.archi.common.auth.PostVerifyTokenResponse> getPostVerifyTokenMethod;
    if ((getPostVerifyTokenMethod = AuthServiceGrpc.getPostVerifyTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostVerifyTokenMethod = AuthServiceGrpc.getPostVerifyTokenMethod) == null) {
          AuthServiceGrpc.getPostVerifyTokenMethod = getPostVerifyTokenMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostVerifyTokenRequest, org.archi.common.auth.PostVerifyTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostVerifyToken"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandInfoRequest,
      org.archi.common.auth.GetBrandInfoResponse> getGetBrandInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrandInfo",
      requestType = org.archi.common.auth.GetBrandInfoRequest.class,
      responseType = org.archi.common.auth.GetBrandInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandInfoRequest,
      org.archi.common.auth.GetBrandInfoResponse> getGetBrandInfoMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandInfoRequest, org.archi.common.auth.GetBrandInfoResponse> getGetBrandInfoMethod;
    if ((getGetBrandInfoMethod = AuthServiceGrpc.getGetBrandInfoMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetBrandInfoMethod = AuthServiceGrpc.getGetBrandInfoMethod) == null) {
          AuthServiceGrpc.getGetBrandInfoMethod = getGetBrandInfoMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetBrandInfoRequest, org.archi.common.auth.GetBrandInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrandInfo"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerInfoRequest,
      org.archi.common.auth.GetPlayerInfoResponse> getGetPlayerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerInfo",
      requestType = org.archi.common.auth.GetPlayerInfoRequest.class,
      responseType = org.archi.common.auth.GetPlayerInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerInfoRequest,
      org.archi.common.auth.GetPlayerInfoResponse> getGetPlayerInfoMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerInfoRequest, org.archi.common.auth.GetPlayerInfoResponse> getGetPlayerInfoMethod;
    if ((getGetPlayerInfoMethod = AuthServiceGrpc.getGetPlayerInfoMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetPlayerInfoMethod = AuthServiceGrpc.getGetPlayerInfoMethod) == null) {
          AuthServiceGrpc.getGetPlayerInfoMethod = getGetPlayerInfoMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetPlayerInfoRequest, org.archi.common.auth.GetPlayerInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerInfo"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountInfoRequest,
      org.archi.common.auth.GetAccountInfoResponse> getGetAccountInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountInfo",
      requestType = org.archi.common.auth.GetAccountInfoRequest.class,
      responseType = org.archi.common.auth.GetAccountInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountInfoRequest,
      org.archi.common.auth.GetAccountInfoResponse> getGetAccountInfoMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountInfoRequest, org.archi.common.auth.GetAccountInfoResponse> getGetAccountInfoMethod;
    if ((getGetAccountInfoMethod = AuthServiceGrpc.getGetAccountInfoMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetAccountInfoMethod = AuthServiceGrpc.getGetAccountInfoMethod) == null) {
          AuthServiceGrpc.getGetAccountInfoMethod = getGetAccountInfoMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetAccountInfoRequest, org.archi.common.auth.GetAccountInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountInfo"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PostCreateAccountRequest,
      org.archi.common.auth.PostCreateAccountResponse> getPostCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostCreateAccount",
      requestType = org.archi.common.auth.PostCreateAccountRequest.class,
      responseType = org.archi.common.auth.PostCreateAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PostCreateAccountRequest,
      org.archi.common.auth.PostCreateAccountResponse> getPostCreateAccountMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PostCreateAccountRequest, org.archi.common.auth.PostCreateAccountResponse> getPostCreateAccountMethod;
    if ((getPostCreateAccountMethod = AuthServiceGrpc.getPostCreateAccountMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostCreateAccountMethod = AuthServiceGrpc.getPostCreateAccountMethod) == null) {
          AuthServiceGrpc.getPostCreateAccountMethod = getPostCreateAccountMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostCreateAccountRequest, org.archi.common.auth.PostCreateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostCreateAccount"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.DeleteAccountRequest,
      org.archi.common.auth.DeleteAccountResponse> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = org.archi.common.auth.DeleteAccountRequest.class,
      responseType = org.archi.common.auth.DeleteAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.DeleteAccountRequest,
      org.archi.common.auth.DeleteAccountResponse> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.DeleteAccountRequest, org.archi.common.auth.DeleteAccountResponse> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = AuthServiceGrpc.getDeleteAccountMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDeleteAccountMethod = AuthServiceGrpc.getDeleteAccountMethod) == null) {
          AuthServiceGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.DeleteAccountRequest, org.archi.common.auth.DeleteAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccount"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PutUpdateAccountRequest,
      org.archi.common.auth.PutUpdateAccountResponse> getPutUpdateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutUpdateAccount",
      requestType = org.archi.common.auth.PutUpdateAccountRequest.class,
      responseType = org.archi.common.auth.PutUpdateAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PutUpdateAccountRequest,
      org.archi.common.auth.PutUpdateAccountResponse> getPutUpdateAccountMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PutUpdateAccountRequest, org.archi.common.auth.PutUpdateAccountResponse> getPutUpdateAccountMethod;
    if ((getPutUpdateAccountMethod = AuthServiceGrpc.getPutUpdateAccountMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPutUpdateAccountMethod = AuthServiceGrpc.getPutUpdateAccountMethod) == null) {
          AuthServiceGrpc.getPutUpdateAccountMethod = getPutUpdateAccountMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PutUpdateAccountRequest, org.archi.common.auth.PutUpdateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutUpdateAccount"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandProfileRequest,
      org.archi.common.auth.GetBrandProfileResponse> getGetBrandProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrandProfile",
      requestType = org.archi.common.auth.GetBrandProfileRequest.class,
      responseType = org.archi.common.auth.GetBrandProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandProfileRequest,
      org.archi.common.auth.GetBrandProfileResponse> getGetBrandProfileMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandProfileRequest, org.archi.common.auth.GetBrandProfileResponse> getGetBrandProfileMethod;
    if ((getGetBrandProfileMethod = AuthServiceGrpc.getGetBrandProfileMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetBrandProfileMethod = AuthServiceGrpc.getGetBrandProfileMethod) == null) {
          AuthServiceGrpc.getGetBrandProfileMethod = getGetBrandProfileMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetBrandProfileRequest, org.archi.common.auth.GetBrandProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrandProfile"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.UpdateBrandRequest,
      org.archi.common.auth.UpdateBrandResponse> getUpdateBrandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBrand",
      requestType = org.archi.common.auth.UpdateBrandRequest.class,
      responseType = org.archi.common.auth.UpdateBrandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.UpdateBrandRequest,
      org.archi.common.auth.UpdateBrandResponse> getUpdateBrandMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.UpdateBrandRequest, org.archi.common.auth.UpdateBrandResponse> getUpdateBrandMethod;
    if ((getUpdateBrandMethod = AuthServiceGrpc.getUpdateBrandMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdateBrandMethod = AuthServiceGrpc.getUpdateBrandMethod) == null) {
          AuthServiceGrpc.getUpdateBrandMethod = getUpdateBrandMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.UpdateBrandRequest, org.archi.common.auth.UpdateBrandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBrand"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.PlayerProfileRequest,
      org.archi.common.auth.PlayerProfileResponse> getGetPlayerProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerProfile",
      requestType = org.archi.common.auth.PlayerProfileRequest.class,
      responseType = org.archi.common.auth.PlayerProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.PlayerProfileRequest,
      org.archi.common.auth.PlayerProfileResponse> getGetPlayerProfileMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.PlayerProfileRequest, org.archi.common.auth.PlayerProfileResponse> getGetPlayerProfileMethod;
    if ((getGetPlayerProfileMethod = AuthServiceGrpc.getGetPlayerProfileMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetPlayerProfileMethod = AuthServiceGrpc.getGetPlayerProfileMethod) == null) {
          AuthServiceGrpc.getGetPlayerProfileMethod = getGetPlayerProfileMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PlayerProfileRequest, org.archi.common.auth.PlayerProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerProfile"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.UpdatePlayerRequest,
      org.archi.common.auth.UpdatePlayerResponse> getUpdatePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePlayer",
      requestType = org.archi.common.auth.UpdatePlayerRequest.class,
      responseType = org.archi.common.auth.UpdatePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.UpdatePlayerRequest,
      org.archi.common.auth.UpdatePlayerResponse> getUpdatePlayerMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.UpdatePlayerRequest, org.archi.common.auth.UpdatePlayerResponse> getUpdatePlayerMethod;
    if ((getUpdatePlayerMethod = AuthServiceGrpc.getUpdatePlayerMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdatePlayerMethod = AuthServiceGrpc.getUpdatePlayerMethod) == null) {
          AuthServiceGrpc.getUpdatePlayerMethod = getUpdatePlayerMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.UpdatePlayerRequest, org.archi.common.auth.UpdatePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePlayer"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountsRequest,
      org.archi.common.auth.GetAccountsResponse> getGetAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccounts",
      requestType = org.archi.common.auth.GetAccountsRequest.class,
      responseType = org.archi.common.auth.GetAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountsRequest,
      org.archi.common.auth.GetAccountsResponse> getGetAccountsMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetAccountsRequest, org.archi.common.auth.GetAccountsResponse> getGetAccountsMethod;
    if ((getGetAccountsMethod = AuthServiceGrpc.getGetAccountsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetAccountsMethod = AuthServiceGrpc.getGetAccountsMethod) == null) {
          AuthServiceGrpc.getGetAccountsMethod = getGetAccountsMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetAccountsRequest, org.archi.common.auth.GetAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccounts"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandsRequest,
      org.archi.common.auth.GetBrandsResponse> getGetBrandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrands",
      requestType = org.archi.common.auth.GetBrandsRequest.class,
      responseType = org.archi.common.auth.GetBrandsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandsRequest,
      org.archi.common.auth.GetBrandsResponse> getGetBrandsMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetBrandsRequest, org.archi.common.auth.GetBrandsResponse> getGetBrandsMethod;
    if ((getGetBrandsMethod = AuthServiceGrpc.getGetBrandsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetBrandsMethod = AuthServiceGrpc.getGetBrandsMethod) == null) {
          AuthServiceGrpc.getGetBrandsMethod = getGetBrandsMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetBrandsRequest, org.archi.common.auth.GetBrandsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrands"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayersRequest,
      org.archi.common.auth.GetPlayersResponse> getGetPlayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayers",
      requestType = org.archi.common.auth.GetPlayersRequest.class,
      responseType = org.archi.common.auth.GetPlayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayersRequest,
      org.archi.common.auth.GetPlayersResponse> getGetPlayersMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayersRequest, org.archi.common.auth.GetPlayersResponse> getGetPlayersMethod;
    if ((getGetPlayersMethod = AuthServiceGrpc.getGetPlayersMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetPlayersMethod = AuthServiceGrpc.getGetPlayersMethod) == null) {
          AuthServiceGrpc.getGetPlayersMethod = getGetPlayersMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetPlayersRequest, org.archi.common.auth.GetPlayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayers"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.RetrievePlayerRequest,
      org.archi.common.auth.RetrievePlayerResponse> getRetrievePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrievePlayer",
      requestType = org.archi.common.auth.RetrievePlayerRequest.class,
      responseType = org.archi.common.auth.RetrievePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.RetrievePlayerRequest,
      org.archi.common.auth.RetrievePlayerResponse> getRetrievePlayerMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.RetrievePlayerRequest, org.archi.common.auth.RetrievePlayerResponse> getRetrievePlayerMethod;
    if ((getRetrievePlayerMethod = AuthServiceGrpc.getRetrievePlayerMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRetrievePlayerMethod = AuthServiceGrpc.getRetrievePlayerMethod) == null) {
          AuthServiceGrpc.getRetrievePlayerMethod = getRetrievePlayerMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.RetrievePlayerRequest, org.archi.common.auth.RetrievePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrievePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.RetrievePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.RetrievePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("RetrievePlayer"))
              .build();
        }
      }
    }
    return getRetrievePlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerByUsernameRequest,
      org.archi.common.auth.GetPlayerByUsernameResponse> getGetPlayerByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerByUsername",
      requestType = org.archi.common.auth.GetPlayerByUsernameRequest.class,
      responseType = org.archi.common.auth.GetPlayerByUsernameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerByUsernameRequest,
      org.archi.common.auth.GetPlayerByUsernameResponse> getGetPlayerByUsernameMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerByUsernameRequest, org.archi.common.auth.GetPlayerByUsernameResponse> getGetPlayerByUsernameMethod;
    if ((getGetPlayerByUsernameMethod = AuthServiceGrpc.getGetPlayerByUsernameMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetPlayerByUsernameMethod = AuthServiceGrpc.getGetPlayerByUsernameMethod) == null) {
          AuthServiceGrpc.getGetPlayerByUsernameMethod = getGetPlayerByUsernameMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetPlayerByUsernameRequest, org.archi.common.auth.GetPlayerByUsernameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerByUsernameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerByUsernameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetPlayerByUsername"))
              .build();
        }
      }
    }
    return getGetPlayerByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerByEmailRequest,
      org.archi.common.auth.GetPlayerByEmailResponse> getGetPlayerByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerByEmail",
      requestType = org.archi.common.auth.GetPlayerByEmailRequest.class,
      responseType = org.archi.common.auth.GetPlayerByEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerByEmailRequest,
      org.archi.common.auth.GetPlayerByEmailResponse> getGetPlayerByEmailMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerByEmailRequest, org.archi.common.auth.GetPlayerByEmailResponse> getGetPlayerByEmailMethod;
    if ((getGetPlayerByEmailMethod = AuthServiceGrpc.getGetPlayerByEmailMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetPlayerByEmailMethod = AuthServiceGrpc.getGetPlayerByEmailMethod) == null) {
          AuthServiceGrpc.getGetPlayerByEmailMethod = getGetPlayerByEmailMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetPlayerByEmailRequest, org.archi.common.auth.GetPlayerByEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerByEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerByEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetPlayerByEmail"))
              .build();
        }
      }
    }
    return getGetPlayerByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerByPhoneNumberRequest,
      org.archi.common.auth.GetPlayerByPhoneNumberResponse> getGetPlayerByPhoneNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerByPhoneNumber",
      requestType = org.archi.common.auth.GetPlayerByPhoneNumberRequest.class,
      responseType = org.archi.common.auth.GetPlayerByPhoneNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerByPhoneNumberRequest,
      org.archi.common.auth.GetPlayerByPhoneNumberResponse> getGetPlayerByPhoneNumberMethod() {
    io.grpc.MethodDescriptor<org.archi.common.auth.GetPlayerByPhoneNumberRequest, org.archi.common.auth.GetPlayerByPhoneNumberResponse> getGetPlayerByPhoneNumberMethod;
    if ((getGetPlayerByPhoneNumberMethod = AuthServiceGrpc.getGetPlayerByPhoneNumberMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetPlayerByPhoneNumberMethod = AuthServiceGrpc.getGetPlayerByPhoneNumberMethod) == null) {
          AuthServiceGrpc.getGetPlayerByPhoneNumberMethod = getGetPlayerByPhoneNumberMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetPlayerByPhoneNumberRequest, org.archi.common.auth.GetPlayerByPhoneNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerByPhoneNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerByPhoneNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerByPhoneNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetPlayerByPhoneNumber"))
              .build();
        }
      }
    }
    return getGetPlayerByPhoneNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void postRegister(org.archi.common.auth.PostRegisterRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostRegisterMethod(), responseObserver);
    }

    /**
     */
    default void postLogin(org.archi.common.auth.PostLoginRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostLoginMethod(), responseObserver);
    }

    /**
     */
    default void postLogout(org.archi.common.auth.PostLogoutRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLogoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostLogoutMethod(), responseObserver);
    }

    /**
     */
    default void postRefreshToken(org.archi.common.auth.PostRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRefreshTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostRefreshTokenMethod(), responseObserver);
    }

    /**
     */
    default void getVerifyEmail(org.archi.common.auth.GetVerifyEmailRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetVerifyEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVerifyEmailMethod(), responseObserver);
    }

    /**
     */
    default void postVerifyToken(org.archi.common.auth.PostVerifyTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostVerifyTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostVerifyTokenMethod(), responseObserver);
    }

    /**
     */
    default void getBrandInfo(org.archi.common.auth.GetBrandInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBrandInfoMethod(), responseObserver);
    }

    /**
     */
    default void getPlayerInfo(org.archi.common.auth.GetPlayerInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerInfoMethod(), responseObserver);
    }

    /**
     */
    default void getAccountInfo(org.archi.common.auth.GetAccountInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountInfoMethod(), responseObserver);
    }

    /**
     */
    default void postCreateAccount(org.archi.common.auth.PostCreateAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostCreateAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostCreateAccountMethod(), responseObserver);
    }

    /**
     */
    default void deleteAccount(org.archi.common.auth.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.DeleteAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     */
    default void putUpdateAccount(org.archi.common.auth.PutUpdateAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PutUpdateAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutUpdateAccountMethod(), responseObserver);
    }

    /**
     */
    default void getBrandProfile(org.archi.common.auth.GetBrandProfileRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBrandProfileMethod(), responseObserver);
    }

    /**
     */
    default void updateBrand(org.archi.common.auth.UpdateBrandRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.UpdateBrandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBrandMethod(), responseObserver);
    }

    /**
     */
    default void getPlayerProfile(org.archi.common.auth.PlayerProfileRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PlayerProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerProfileMethod(), responseObserver);
    }

    /**
     */
    default void updatePlayer(org.archi.common.auth.UpdatePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.UpdatePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePlayerMethod(), responseObserver);
    }

    /**
     */
    default void getAccounts(org.archi.common.auth.GetAccountsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountsMethod(), responseObserver);
    }

    /**
     */
    default void getBrands(org.archi.common.auth.GetBrandsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBrandsMethod(), responseObserver);
    }

    /**
     */
    default void getPlayers(org.archi.common.auth.GetPlayersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayersMethod(), responseObserver);
    }

    /**
     */
    default void retrievePlayer(org.archi.common.auth.RetrievePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.RetrievePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrievePlayerMethod(), responseObserver);
    }

    /**
     */
    default void getPlayerByUsername(org.archi.common.auth.GetPlayerByUsernameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerByUsernameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerByUsernameMethod(), responseObserver);
    }

    /**
     */
    default void getPlayerByEmail(org.archi.common.auth.GetPlayerByEmailRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerByEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerByEmailMethod(), responseObserver);
    }

    /**
     */
    default void getPlayerByPhoneNumber(org.archi.common.auth.GetPlayerByPhoneNumberRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerByPhoneNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerByPhoneNumberMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void postRegister(org.archi.common.auth.PostRegisterRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postLogin(org.archi.common.auth.PostLoginRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postLogout(org.archi.common.auth.PostLogoutRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLogoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postRefreshToken(org.archi.common.auth.PostRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRefreshTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostRefreshTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVerifyEmail(org.archi.common.auth.GetVerifyEmailRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetVerifyEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVerifyEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postVerifyToken(org.archi.common.auth.PostVerifyTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostVerifyTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostVerifyTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrandInfo(org.archi.common.auth.GetBrandInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBrandInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerInfo(org.archi.common.auth.GetPlayerInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountInfo(org.archi.common.auth.GetAccountInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postCreateAccount(org.archi.common.auth.PostCreateAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostCreateAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(org.archi.common.auth.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.DeleteAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putUpdateAccount(org.archi.common.auth.PutUpdateAccountRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PutUpdateAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrandProfile(org.archi.common.auth.GetBrandProfileRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBrandProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBrand(org.archi.common.auth.UpdateBrandRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.UpdateBrandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBrandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerProfile(org.archi.common.auth.PlayerProfileRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PlayerProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePlayer(org.archi.common.auth.UpdatePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.UpdatePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccounts(org.archi.common.auth.GetAccountsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrands(org.archi.common.auth.GetBrandsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBrandsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayers(org.archi.common.auth.GetPlayersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrievePlayer(org.archi.common.auth.RetrievePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.RetrievePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrievePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerByUsername(org.archi.common.auth.GetPlayerByUsernameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerByUsernameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerByEmail(org.archi.common.auth.GetPlayerByEmailRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerByEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerByPhoneNumber(org.archi.common.auth.GetPlayerByPhoneNumberRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerByPhoneNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerByPhoneNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.PostRegisterResponse postRegister(org.archi.common.auth.PostRegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostLoginResponse postLogin(org.archi.common.auth.PostLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostLogoutResponse postLogout(org.archi.common.auth.PostLogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostRefreshTokenResponse postRefreshToken(org.archi.common.auth.PostRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostRefreshTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetVerifyEmailResponse getVerifyEmail(org.archi.common.auth.GetVerifyEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVerifyEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostVerifyTokenResponse postVerifyToken(org.archi.common.auth.PostVerifyTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostVerifyTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetBrandInfoResponse getBrandInfo(org.archi.common.auth.GetBrandInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBrandInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetPlayerInfoResponse getPlayerInfo(org.archi.common.auth.GetPlayerInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetAccountInfoResponse getAccountInfo(org.archi.common.auth.GetAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PostCreateAccountResponse postCreateAccount(org.archi.common.auth.PostCreateAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.DeleteAccountResponse deleteAccount(org.archi.common.auth.DeleteAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PutUpdateAccountResponse putUpdateAccount(org.archi.common.auth.PutUpdateAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetBrandProfileResponse getBrandProfile(org.archi.common.auth.GetBrandProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBrandProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.UpdateBrandResponse updateBrand(org.archi.common.auth.UpdateBrandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBrandMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.PlayerProfileResponse getPlayerProfile(org.archi.common.auth.PlayerProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.UpdatePlayerResponse updatePlayer(org.archi.common.auth.UpdatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetAccountsResponse getAccounts(org.archi.common.auth.GetAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetBrandsResponse getBrands(org.archi.common.auth.GetBrandsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBrandsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetPlayersResponse getPlayers(org.archi.common.auth.GetPlayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.RetrievePlayerResponse retrievePlayer(org.archi.common.auth.RetrievePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrievePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetPlayerByUsernameResponse getPlayerByUsername(org.archi.common.auth.GetPlayerByUsernameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetPlayerByEmailResponse getPlayerByEmail(org.archi.common.auth.GetPlayerByEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerByEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.auth.GetPlayerByPhoneNumberResponse getPlayerByPhoneNumber(org.archi.common.auth.GetPlayerByPhoneNumberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerByPhoneNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostRegisterResponse> postRegister(
        org.archi.common.auth.PostRegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostLoginResponse> postLogin(
        org.archi.common.auth.PostLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostLogoutResponse> postLogout(
        org.archi.common.auth.PostLogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostRefreshTokenResponse> postRefreshToken(
        org.archi.common.auth.PostRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostRefreshTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetVerifyEmailResponse> getVerifyEmail(
        org.archi.common.auth.GetVerifyEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVerifyEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostVerifyTokenResponse> postVerifyToken(
        org.archi.common.auth.PostVerifyTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostVerifyTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetBrandInfoResponse> getBrandInfo(
        org.archi.common.auth.GetBrandInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBrandInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetPlayerInfoResponse> getPlayerInfo(
        org.archi.common.auth.GetPlayerInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetAccountInfoResponse> getAccountInfo(
        org.archi.common.auth.GetAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostCreateAccountResponse> postCreateAccount(
        org.archi.common.auth.PostCreateAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.DeleteAccountResponse> deleteAccount(
        org.archi.common.auth.DeleteAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PutUpdateAccountResponse> putUpdateAccount(
        org.archi.common.auth.PutUpdateAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetBrandProfileResponse> getBrandProfile(
        org.archi.common.auth.GetBrandProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBrandProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.UpdateBrandResponse> updateBrand(
        org.archi.common.auth.UpdateBrandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBrandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PlayerProfileResponse> getPlayerProfile(
        org.archi.common.auth.PlayerProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.UpdatePlayerResponse> updatePlayer(
        org.archi.common.auth.UpdatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetAccountsResponse> getAccounts(
        org.archi.common.auth.GetAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetBrandsResponse> getBrands(
        org.archi.common.auth.GetBrandsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBrandsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetPlayersResponse> getPlayers(
        org.archi.common.auth.GetPlayersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.RetrievePlayerResponse> retrievePlayer(
        org.archi.common.auth.RetrievePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrievePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetPlayerByUsernameResponse> getPlayerByUsername(
        org.archi.common.auth.GetPlayerByUsernameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetPlayerByEmailResponse> getPlayerByEmail(
        org.archi.common.auth.GetPlayerByEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerByEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetPlayerByPhoneNumberResponse> getPlayerByPhoneNumber(
        org.archi.common.auth.GetPlayerByPhoneNumberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerByPhoneNumberMethod(), getCallOptions()), request);
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
  private static final int METHODID_RETRIEVE_PLAYER = 19;
  private static final int METHODID_GET_PLAYER_BY_USERNAME = 20;
  private static final int METHODID_GET_PLAYER_BY_EMAIL = 21;
  private static final int METHODID_GET_PLAYER_BY_PHONE_NUMBER = 22;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
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
        case METHODID_RETRIEVE_PLAYER:
          serviceImpl.retrievePlayer((org.archi.common.auth.RetrievePlayerRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.RetrievePlayerResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_BY_USERNAME:
          serviceImpl.getPlayerByUsername((org.archi.common.auth.GetPlayerByUsernameRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerByUsernameResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_BY_EMAIL:
          serviceImpl.getPlayerByEmail((org.archi.common.auth.GetPlayerByEmailRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerByEmailResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_BY_PHONE_NUMBER:
          serviceImpl.getPlayerByPhoneNumber((org.archi.common.auth.GetPlayerByPhoneNumberRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerByPhoneNumberResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPostRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostRegisterRequest,
              org.archi.common.auth.PostRegisterResponse>(
                service, METHODID_POST_REGISTER)))
        .addMethod(
          getPostLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostLoginRequest,
              org.archi.common.auth.PostLoginResponse>(
                service, METHODID_POST_LOGIN)))
        .addMethod(
          getPostLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostLogoutRequest,
              org.archi.common.auth.PostLogoutResponse>(
                service, METHODID_POST_LOGOUT)))
        .addMethod(
          getPostRefreshTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostRefreshTokenRequest,
              org.archi.common.auth.PostRefreshTokenResponse>(
                service, METHODID_POST_REFRESH_TOKEN)))
        .addMethod(
          getGetVerifyEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetVerifyEmailRequest,
              org.archi.common.auth.GetVerifyEmailResponse>(
                service, METHODID_GET_VERIFY_EMAIL)))
        .addMethod(
          getPostVerifyTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostVerifyTokenRequest,
              org.archi.common.auth.PostVerifyTokenResponse>(
                service, METHODID_POST_VERIFY_TOKEN)))
        .addMethod(
          getGetBrandInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetBrandInfoRequest,
              org.archi.common.auth.GetBrandInfoResponse>(
                service, METHODID_GET_BRAND_INFO)))
        .addMethod(
          getGetPlayerInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetPlayerInfoRequest,
              org.archi.common.auth.GetPlayerInfoResponse>(
                service, METHODID_GET_PLAYER_INFO)))
        .addMethod(
          getGetAccountInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetAccountInfoRequest,
              org.archi.common.auth.GetAccountInfoResponse>(
                service, METHODID_GET_ACCOUNT_INFO)))
        .addMethod(
          getPostCreateAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostCreateAccountRequest,
              org.archi.common.auth.PostCreateAccountResponse>(
                service, METHODID_POST_CREATE_ACCOUNT)))
        .addMethod(
          getDeleteAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.DeleteAccountRequest,
              org.archi.common.auth.DeleteAccountResponse>(
                service, METHODID_DELETE_ACCOUNT)))
        .addMethod(
          getPutUpdateAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PutUpdateAccountRequest,
              org.archi.common.auth.PutUpdateAccountResponse>(
                service, METHODID_PUT_UPDATE_ACCOUNT)))
        .addMethod(
          getGetBrandProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetBrandProfileRequest,
              org.archi.common.auth.GetBrandProfileResponse>(
                service, METHODID_GET_BRAND_PROFILE)))
        .addMethod(
          getUpdateBrandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.UpdateBrandRequest,
              org.archi.common.auth.UpdateBrandResponse>(
                service, METHODID_UPDATE_BRAND)))
        .addMethod(
          getGetPlayerProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PlayerProfileRequest,
              org.archi.common.auth.PlayerProfileResponse>(
                service, METHODID_GET_PLAYER_PROFILE)))
        .addMethod(
          getUpdatePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.UpdatePlayerRequest,
              org.archi.common.auth.UpdatePlayerResponse>(
                service, METHODID_UPDATE_PLAYER)))
        .addMethod(
          getGetAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetAccountsRequest,
              org.archi.common.auth.GetAccountsResponse>(
                service, METHODID_GET_ACCOUNTS)))
        .addMethod(
          getGetBrandsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetBrandsRequest,
              org.archi.common.auth.GetBrandsResponse>(
                service, METHODID_GET_BRANDS)))
        .addMethod(
          getGetPlayersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetPlayersRequest,
              org.archi.common.auth.GetPlayersResponse>(
                service, METHODID_GET_PLAYERS)))
        .addMethod(
          getRetrievePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.RetrievePlayerRequest,
              org.archi.common.auth.RetrievePlayerResponse>(
                service, METHODID_RETRIEVE_PLAYER)))
        .addMethod(
          getGetPlayerByUsernameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetPlayerByUsernameRequest,
              org.archi.common.auth.GetPlayerByUsernameResponse>(
                service, METHODID_GET_PLAYER_BY_USERNAME)))
        .addMethod(
          getGetPlayerByEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetPlayerByEmailRequest,
              org.archi.common.auth.GetPlayerByEmailResponse>(
                service, METHODID_GET_PLAYER_BY_EMAIL)))
        .addMethod(
          getGetPlayerByPhoneNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetPlayerByPhoneNumberRequest,
              org.archi.common.auth.GetPlayerByPhoneNumberResponse>(
                service, METHODID_GET_PLAYER_BY_PHONE_NUMBER)))
        .build();
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
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getRetrievePlayerMethod())
              .addMethod(getGetPlayerByUsernameMethod())
              .addMethod(getGetPlayerByEmailMethod())
              .addMethod(getGetPlayerByPhoneNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
