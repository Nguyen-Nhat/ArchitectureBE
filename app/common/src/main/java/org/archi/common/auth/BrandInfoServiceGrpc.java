package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Get Brand Info
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BrandInfoServiceGrpc {

  private BrandInfoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BrandInfoService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getGetBrandInfoMethod = BrandInfoServiceGrpc.getGetBrandInfoMethod) == null) {
      synchronized (BrandInfoServiceGrpc.class) {
        if ((getGetBrandInfoMethod = BrandInfoServiceGrpc.getGetBrandInfoMethod) == null) {
          BrandInfoServiceGrpc.getGetBrandInfoMethod = getGetBrandInfoMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetBrandInfoRequest, org.archi.common.auth.GetBrandInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrandInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetBrandInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetBrandInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrandInfoServiceMethodDescriptorSupplier("GetBrandInfo"))
              .build();
        }
      }
    }
    return getGetBrandInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrandInfoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrandInfoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrandInfoServiceStub>() {
        @java.lang.Override
        public BrandInfoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrandInfoServiceStub(channel, callOptions);
        }
      };
    return BrandInfoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrandInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrandInfoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrandInfoServiceBlockingStub>() {
        @java.lang.Override
        public BrandInfoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrandInfoServiceBlockingStub(channel, callOptions);
        }
      };
    return BrandInfoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrandInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrandInfoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrandInfoServiceFutureStub>() {
        @java.lang.Override
        public BrandInfoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrandInfoServiceFutureStub(channel, callOptions);
        }
      };
    return BrandInfoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Get Brand Info
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getBrandInfo(org.archi.common.auth.GetBrandInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBrandInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BrandInfoService.
   * <pre>
   *Get Brand Info
   * </pre>
   */
  public static abstract class BrandInfoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BrandInfoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BrandInfoService.
   * <pre>
   *Get Brand Info
   * </pre>
   */
  public static final class BrandInfoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BrandInfoServiceStub> {
    private BrandInfoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrandInfoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrandInfoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBrandInfo(org.archi.common.auth.GetBrandInfoRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBrandInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BrandInfoService.
   * <pre>
   *Get Brand Info
   * </pre>
   */
  public static final class BrandInfoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BrandInfoServiceBlockingStub> {
    private BrandInfoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrandInfoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrandInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.GetBrandInfoResponse getBrandInfo(org.archi.common.auth.GetBrandInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBrandInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BrandInfoService.
   * <pre>
   *Get Brand Info
   * </pre>
   */
  public static final class BrandInfoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BrandInfoServiceFutureStub> {
    private BrandInfoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrandInfoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrandInfoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetBrandInfoResponse> getBrandInfo(
        org.archi.common.auth.GetBrandInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBrandInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BRAND_INFO = 0;

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
        case METHODID_GET_BRAND_INFO:
          serviceImpl.getBrandInfo((org.archi.common.auth.GetBrandInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetBrandInfoResponse>) responseObserver);
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
          getGetBrandInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetBrandInfoRequest,
              org.archi.common.auth.GetBrandInfoResponse>(
                service, METHODID_GET_BRAND_INFO)))
        .build();
  }

  private static abstract class BrandInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BrandInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BrandInfoService");
    }
  }

  private static final class BrandInfoServiceFileDescriptorSupplier
      extends BrandInfoServiceBaseDescriptorSupplier {
    BrandInfoServiceFileDescriptorSupplier() {}
  }

  private static final class BrandInfoServiceMethodDescriptorSupplier
      extends BrandInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BrandInfoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BrandInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrandInfoServiceFileDescriptorSupplier())
              .addMethod(getGetBrandInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
