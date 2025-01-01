package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Verify Token Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VerifyTokenServiceGrpc {

  private VerifyTokenServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "VerifyTokenService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getPostVerifyTokenMethod = VerifyTokenServiceGrpc.getPostVerifyTokenMethod) == null) {
      synchronized (VerifyTokenServiceGrpc.class) {
        if ((getPostVerifyTokenMethod = VerifyTokenServiceGrpc.getPostVerifyTokenMethod) == null) {
          VerifyTokenServiceGrpc.getPostVerifyTokenMethod = getPostVerifyTokenMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostVerifyTokenRequest, org.archi.common.auth.PostVerifyTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostVerifyToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostVerifyTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostVerifyTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VerifyTokenServiceMethodDescriptorSupplier("PostVerifyToken"))
              .build();
        }
      }
    }
    return getPostVerifyTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VerifyTokenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VerifyTokenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VerifyTokenServiceStub>() {
        @java.lang.Override
        public VerifyTokenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VerifyTokenServiceStub(channel, callOptions);
        }
      };
    return VerifyTokenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VerifyTokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VerifyTokenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VerifyTokenServiceBlockingStub>() {
        @java.lang.Override
        public VerifyTokenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VerifyTokenServiceBlockingStub(channel, callOptions);
        }
      };
    return VerifyTokenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VerifyTokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VerifyTokenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VerifyTokenServiceFutureStub>() {
        @java.lang.Override
        public VerifyTokenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VerifyTokenServiceFutureStub(channel, callOptions);
        }
      };
    return VerifyTokenServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Verify Token Service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void postVerifyToken(org.archi.common.auth.PostVerifyTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostVerifyTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostVerifyTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VerifyTokenService.
   * <pre>
   *Verify Token Service
   * </pre>
   */
  public static abstract class VerifyTokenServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VerifyTokenServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VerifyTokenService.
   * <pre>
   *Verify Token Service
   * </pre>
   */
  public static final class VerifyTokenServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VerifyTokenServiceStub> {
    private VerifyTokenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerifyTokenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VerifyTokenServiceStub(channel, callOptions);
    }

    /**
     */
    public void postVerifyToken(org.archi.common.auth.PostVerifyTokenRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostVerifyTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostVerifyTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VerifyTokenService.
   * <pre>
   *Verify Token Service
   * </pre>
   */
  public static final class VerifyTokenServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VerifyTokenServiceBlockingStub> {
    private VerifyTokenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerifyTokenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VerifyTokenServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.PostVerifyTokenResponse postVerifyToken(org.archi.common.auth.PostVerifyTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostVerifyTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VerifyTokenService.
   * <pre>
   *Verify Token Service
   * </pre>
   */
  public static final class VerifyTokenServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VerifyTokenServiceFutureStub> {
    private VerifyTokenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerifyTokenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VerifyTokenServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostVerifyTokenResponse> postVerifyToken(
        org.archi.common.auth.PostVerifyTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostVerifyTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_VERIFY_TOKEN = 0;

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
        case METHODID_POST_VERIFY_TOKEN:
          serviceImpl.postVerifyToken((org.archi.common.auth.PostVerifyTokenRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostVerifyTokenResponse>) responseObserver);
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
          getPostVerifyTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostVerifyTokenRequest,
              org.archi.common.auth.PostVerifyTokenResponse>(
                service, METHODID_POST_VERIFY_TOKEN)))
        .build();
  }

  private static abstract class VerifyTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VerifyTokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VerifyTokenService");
    }
  }

  private static final class VerifyTokenServiceFileDescriptorSupplier
      extends VerifyTokenServiceBaseDescriptorSupplier {
    VerifyTokenServiceFileDescriptorSupplier() {}
  }

  private static final class VerifyTokenServiceMethodDescriptorSupplier
      extends VerifyTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VerifyTokenServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VerifyTokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VerifyTokenServiceFileDescriptorSupplier())
              .addMethod(getPostVerifyTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
