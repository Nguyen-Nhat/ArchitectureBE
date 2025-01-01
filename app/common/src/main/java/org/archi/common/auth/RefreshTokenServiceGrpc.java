package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Refresh token service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RefreshTokenServiceGrpc {

  private RefreshTokenServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "RefreshTokenService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getPostRefreshTokenMethod = RefreshTokenServiceGrpc.getPostRefreshTokenMethod) == null) {
      synchronized (RefreshTokenServiceGrpc.class) {
        if ((getPostRefreshTokenMethod = RefreshTokenServiceGrpc.getPostRefreshTokenMethod) == null) {
          RefreshTokenServiceGrpc.getPostRefreshTokenMethod = getPostRefreshTokenMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostRefreshTokenRequest, org.archi.common.auth.PostRefreshTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostRefreshToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostRefreshTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostRefreshTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RefreshTokenServiceMethodDescriptorSupplier("PostRefreshToken"))
              .build();
        }
      }
    }
    return getPostRefreshTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RefreshTokenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceStub>() {
        @java.lang.Override
        public RefreshTokenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RefreshTokenServiceStub(channel, callOptions);
        }
      };
    return RefreshTokenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RefreshTokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceBlockingStub>() {
        @java.lang.Override
        public RefreshTokenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RefreshTokenServiceBlockingStub(channel, callOptions);
        }
      };
    return RefreshTokenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RefreshTokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceFutureStub>() {
        @java.lang.Override
        public RefreshTokenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RefreshTokenServiceFutureStub(channel, callOptions);
        }
      };
    return RefreshTokenServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Refresh token service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void postRefreshToken(org.archi.common.auth.PostRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRefreshTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostRefreshTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RefreshTokenService.
   * <pre>
   *Refresh token service
   * </pre>
   */
  public static abstract class RefreshTokenServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RefreshTokenServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RefreshTokenService.
   * <pre>
   *Refresh token service
   * </pre>
   */
  public static final class RefreshTokenServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RefreshTokenServiceStub> {
    private RefreshTokenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RefreshTokenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RefreshTokenServiceStub(channel, callOptions);
    }

    /**
     */
    public void postRefreshToken(org.archi.common.auth.PostRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRefreshTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostRefreshTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RefreshTokenService.
   * <pre>
   *Refresh token service
   * </pre>
   */
  public static final class RefreshTokenServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RefreshTokenServiceBlockingStub> {
    private RefreshTokenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RefreshTokenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RefreshTokenServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.PostRefreshTokenResponse postRefreshToken(org.archi.common.auth.PostRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostRefreshTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RefreshTokenService.
   * <pre>
   *Refresh token service
   * </pre>
   */
  public static final class RefreshTokenServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RefreshTokenServiceFutureStub> {
    private RefreshTokenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RefreshTokenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RefreshTokenServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostRefreshTokenResponse> postRefreshToken(
        org.archi.common.auth.PostRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostRefreshTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_REFRESH_TOKEN = 0;

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
        case METHODID_POST_REFRESH_TOKEN:
          serviceImpl.postRefreshToken((org.archi.common.auth.PostRefreshTokenRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostRefreshTokenResponse>) responseObserver);
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
          getPostRefreshTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostRefreshTokenRequest,
              org.archi.common.auth.PostRefreshTokenResponse>(
                service, METHODID_POST_REFRESH_TOKEN)))
        .build();
  }

  private static abstract class RefreshTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RefreshTokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RefreshTokenService");
    }
  }

  private static final class RefreshTokenServiceFileDescriptorSupplier
      extends RefreshTokenServiceBaseDescriptorSupplier {
    RefreshTokenServiceFileDescriptorSupplier() {}
  }

  private static final class RefreshTokenServiceMethodDescriptorSupplier
      extends RefreshTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RefreshTokenServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RefreshTokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RefreshTokenServiceFileDescriptorSupplier())
              .addMethod(getPostRefreshTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
