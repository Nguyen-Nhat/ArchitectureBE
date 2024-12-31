package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: verifyEmail.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VerifyEmailServiceGrpc {

  private VerifyEmailServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "VerifyEmailService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getGetVerifyEmailMethod = VerifyEmailServiceGrpc.getGetVerifyEmailMethod) == null) {
      synchronized (VerifyEmailServiceGrpc.class) {
        if ((getGetVerifyEmailMethod = VerifyEmailServiceGrpc.getGetVerifyEmailMethod) == null) {
          VerifyEmailServiceGrpc.getGetVerifyEmailMethod = getGetVerifyEmailMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.GetVerifyEmailRequest, org.archi.common.auth.GetVerifyEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVerifyEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetVerifyEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.GetVerifyEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VerifyEmailServiceMethodDescriptorSupplier("GetVerifyEmail"))
              .build();
        }
      }
    }
    return getGetVerifyEmailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VerifyEmailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VerifyEmailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VerifyEmailServiceStub>() {
        @java.lang.Override
        public VerifyEmailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VerifyEmailServiceStub(channel, callOptions);
        }
      };
    return VerifyEmailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VerifyEmailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VerifyEmailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VerifyEmailServiceBlockingStub>() {
        @java.lang.Override
        public VerifyEmailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VerifyEmailServiceBlockingStub(channel, callOptions);
        }
      };
    return VerifyEmailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VerifyEmailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VerifyEmailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VerifyEmailServiceFutureStub>() {
        @java.lang.Override
        public VerifyEmailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VerifyEmailServiceFutureStub(channel, callOptions);
        }
      };
    return VerifyEmailServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getVerifyEmail(org.archi.common.auth.GetVerifyEmailRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetVerifyEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVerifyEmailMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VerifyEmailService.
   */
  public static abstract class VerifyEmailServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VerifyEmailServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VerifyEmailService.
   */
  public static final class VerifyEmailServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VerifyEmailServiceStub> {
    private VerifyEmailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerifyEmailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VerifyEmailServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVerifyEmail(org.archi.common.auth.GetVerifyEmailRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.GetVerifyEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVerifyEmailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VerifyEmailService.
   */
  public static final class VerifyEmailServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VerifyEmailServiceBlockingStub> {
    private VerifyEmailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerifyEmailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VerifyEmailServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.GetVerifyEmailResponse getVerifyEmail(org.archi.common.auth.GetVerifyEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVerifyEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VerifyEmailService.
   */
  public static final class VerifyEmailServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VerifyEmailServiceFutureStub> {
    private VerifyEmailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerifyEmailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VerifyEmailServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.GetVerifyEmailResponse> getVerifyEmail(
        org.archi.common.auth.GetVerifyEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVerifyEmailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VERIFY_EMAIL = 0;

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
        case METHODID_GET_VERIFY_EMAIL:
          serviceImpl.getVerifyEmail((org.archi.common.auth.GetVerifyEmailRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.GetVerifyEmailResponse>) responseObserver);
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
          getGetVerifyEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.GetVerifyEmailRequest,
              org.archi.common.auth.GetVerifyEmailResponse>(
                service, METHODID_GET_VERIFY_EMAIL)))
        .build();
  }

  private static abstract class VerifyEmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VerifyEmailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.auth.VerifyEmailProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VerifyEmailService");
    }
  }

  private static final class VerifyEmailServiceFileDescriptorSupplier
      extends VerifyEmailServiceBaseDescriptorSupplier {
    VerifyEmailServiceFileDescriptorSupplier() {}
  }

  private static final class VerifyEmailServiceMethodDescriptorSupplier
      extends VerifyEmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VerifyEmailServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VerifyEmailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VerifyEmailServiceFileDescriptorSupplier())
              .addMethod(getGetVerifyEmailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
