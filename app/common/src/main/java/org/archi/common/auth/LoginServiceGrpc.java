package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Login Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LoginServiceGrpc {

  private LoginServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "LoginService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getPostLoginMethod = LoginServiceGrpc.getPostLoginMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getPostLoginMethod = LoginServiceGrpc.getPostLoginMethod) == null) {
          LoginServiceGrpc.getPostLoginMethod = getPostLoginMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostLoginRequest, org.archi.common.auth.PostLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("PostLogin"))
              .build();
        }
      }
    }
    return getPostLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoginServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginServiceStub>() {
        @java.lang.Override
        public LoginServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginServiceStub(channel, callOptions);
        }
      };
    return LoginServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginServiceBlockingStub>() {
        @java.lang.Override
        public LoginServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginServiceBlockingStub(channel, callOptions);
        }
      };
    return LoginServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginServiceFutureStub>() {
        @java.lang.Override
        public LoginServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginServiceFutureStub(channel, callOptions);
        }
      };
    return LoginServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Login Service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void postLogin(org.archi.common.auth.PostLoginRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostLoginMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LoginService.
   * <pre>
   *Login Service
   * </pre>
   */
  public static abstract class LoginServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LoginServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LoginService.
   * <pre>
   *Login Service
   * </pre>
   */
  public static final class LoginServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LoginServiceStub> {
    private LoginServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginServiceStub(channel, callOptions);
    }

    /**
     */
    public void postLogin(org.archi.common.auth.PostLoginRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LoginService.
   * <pre>
   *Login Service
   * </pre>
   */
  public static final class LoginServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LoginServiceBlockingStub> {
    private LoginServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.PostLoginResponse postLogin(org.archi.common.auth.PostLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LoginService.
   * <pre>
   *Login Service
   * </pre>
   */
  public static final class LoginServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LoginServiceFutureStub> {
    private LoginServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostLoginResponse> postLogin(
        org.archi.common.auth.PostLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_LOGIN = 0;

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
        case METHODID_POST_LOGIN:
          serviceImpl.postLogin((org.archi.common.auth.PostLoginRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostLoginResponse>) responseObserver);
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
          getPostLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostLoginRequest,
              org.archi.common.auth.PostLoginResponse>(
                service, METHODID_POST_LOGIN)))
        .build();
  }

  private static abstract class LoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoginServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoginService");
    }
  }

  private static final class LoginServiceFileDescriptorSupplier
      extends LoginServiceBaseDescriptorSupplier {
    LoginServiceFileDescriptorSupplier() {}
  }

  private static final class LoginServiceMethodDescriptorSupplier
      extends LoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LoginServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LoginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoginServiceFileDescriptorSupplier())
              .addMethod(getPostLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
