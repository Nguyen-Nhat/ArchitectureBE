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
              .build();
        }
      }
    }
    return result;
  }
}
