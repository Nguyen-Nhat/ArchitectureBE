package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Get Player Info
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlayerInfoServiceGrpc {

  private PlayerInfoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "PlayerInfoService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getGetPlayerInfoMethod = PlayerInfoServiceGrpc.getGetPlayerInfoMethod) == null) {
      synchronized (PlayerInfoServiceGrpc.class) {
        if ((getGetPlayerInfoMethod = PlayerInfoServiceGrpc.getGetPlayerInfoMethod) == null) {
          PlayerInfoServiceGrpc.getGetPlayerInfoMethod = getGetPlayerInfoMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetPlayerInfoRequest, org.archi.common.auth.GetPlayerInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetPlayerInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerInfoServiceMethodDescriptorSupplier("GetPlayerInfo"))
              .build();
        }
      }
    }
    return getGetPlayerInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayerInfoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerInfoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerInfoServiceStub>() {
        @java.lang.Override
        public PlayerInfoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerInfoServiceStub(channel, callOptions);
        }
      };
    return PlayerInfoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerInfoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerInfoServiceBlockingStub>() {
        @java.lang.Override
        public PlayerInfoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerInfoServiceBlockingStub(channel, callOptions);
        }
      };
    return PlayerInfoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerInfoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerInfoServiceFutureStub>() {
        @java.lang.Override
        public PlayerInfoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerInfoServiceFutureStub(channel, callOptions);
        }
      };
    return PlayerInfoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Get Player Info
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getPlayerInfo(org.archi.common.auth.GetPlayerInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PlayerInfoService.
   * <pre>
   *Get Player Info
   * </pre>
   */
  public static abstract class PlayerInfoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PlayerInfoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PlayerInfoService.
   * <pre>
   *Get Player Info
   * </pre>
   */
  public static final class PlayerInfoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PlayerInfoServiceStub> {
    private PlayerInfoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerInfoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerInfoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPlayerInfo(org.archi.common.auth.GetPlayerInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PlayerInfoService.
   * <pre>
   *Get Player Info
   * </pre>
   */
  public static final class PlayerInfoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PlayerInfoServiceBlockingStub> {
    private PlayerInfoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerInfoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.GetPlayerInfoResponse getPlayerInfo(org.archi.common.auth.GetPlayerInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PlayerInfoService.
   * <pre>
   *Get Player Info
   * </pre>
   */
  public static final class PlayerInfoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PlayerInfoServiceFutureStub> {
    private PlayerInfoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerInfoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerInfoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetPlayerInfoResponse> getPlayerInfo(
        org.archi.common.auth.GetPlayerInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PLAYER_INFO = 0;

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
        case METHODID_GET_PLAYER_INFO:
          serviceImpl.getPlayerInfo((org.archi.common.auth.GetPlayerInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetPlayerInfoResponse>) responseObserver);
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
          getGetPlayerInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetPlayerInfoRequest,
              org.archi.common.auth.GetPlayerInfoResponse>(
                service, METHODID_GET_PLAYER_INFO)))
        .build();
  }

  private static abstract class PlayerInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayerInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlayerInfoService");
    }
  }

  private static final class PlayerInfoServiceFileDescriptorSupplier
      extends PlayerInfoServiceBaseDescriptorSupplier {
    PlayerInfoServiceFileDescriptorSupplier() {}
  }

  private static final class PlayerInfoServiceMethodDescriptorSupplier
      extends PlayerInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PlayerInfoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PlayerInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayerInfoServiceFileDescriptorSupplier())
              .addMethod(getGetPlayerInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
