package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Register Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RegisterServiceGrpc {

  private RegisterServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "RegisterService";

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
    if ((getPostRegisterMethod = RegisterServiceGrpc.getPostRegisterMethod) == null) {
      synchronized (RegisterServiceGrpc.class) {
        if ((getPostRegisterMethod = RegisterServiceGrpc.getPostRegisterMethod) == null) {
          RegisterServiceGrpc.getPostRegisterMethod = getPostRegisterMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostRegisterRequest, org.archi.common.auth.PostRegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostRegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostRegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegisterServiceMethodDescriptorSupplier("PostRegister"))
              .build();
        }
      }
    }
    return getPostRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegisterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegisterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegisterServiceStub>() {
        @java.lang.Override
        public RegisterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegisterServiceStub(channel, callOptions);
        }
      };
    return RegisterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegisterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegisterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegisterServiceBlockingStub>() {
        @java.lang.Override
        public RegisterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegisterServiceBlockingStub(channel, callOptions);
        }
      };
    return RegisterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegisterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegisterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegisterServiceFutureStub>() {
        @java.lang.Override
        public RegisterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegisterServiceFutureStub(channel, callOptions);
        }
      };
    return RegisterServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Register Service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void postRegister(org.archi.common.auth.PostRegisterRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostRegisterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RegisterService.
   * <pre>
   *Register Service
   * </pre>
   */
  public static abstract class RegisterServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RegisterServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RegisterService.
   * <pre>
   *Register Service
   * </pre>
   */
  public static final class RegisterServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RegisterServiceStub> {
    private RegisterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegisterServiceStub(channel, callOptions);
    }

    /**
     */
    public void postRegister(org.archi.common.auth.PostRegisterRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostRegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RegisterService.
   * <pre>
   *Register Service
   * </pre>
   */
  public static final class RegisterServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RegisterServiceBlockingStub> {
    private RegisterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegisterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.PostRegisterResponse postRegister(org.archi.common.auth.PostRegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RegisterService.
   * <pre>
   *Register Service
   * </pre>
   */
  public static final class RegisterServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RegisterServiceFutureStub> {
    private RegisterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegisterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostRegisterResponse> postRegister(
        org.archi.common.auth.PostRegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_REGISTER = 0;

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
        .build();
  }

  private static abstract class RegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegisterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegisterService");
    }
  }

  private static final class RegisterServiceFileDescriptorSupplier
      extends RegisterServiceBaseDescriptorSupplier {
    RegisterServiceFileDescriptorSupplier() {}
  }

  private static final class RegisterServiceMethodDescriptorSupplier
      extends RegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RegisterServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RegisterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegisterServiceFileDescriptorSupplier())
              .addMethod(getPostRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
