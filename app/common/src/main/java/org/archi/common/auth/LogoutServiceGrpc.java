package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Logout Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogoutServiceGrpc {

  private LogoutServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "LogoutService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getPostLogoutMethod = LogoutServiceGrpc.getPostLogoutMethod) == null) {
      synchronized (LogoutServiceGrpc.class) {
        if ((getPostLogoutMethod = LogoutServiceGrpc.getPostLogoutMethod) == null) {
          LogoutServiceGrpc.getPostLogoutMethod = getPostLogoutMethod =
              io.grpc.MethodDescriptor.<org.archi.common.auth.PostLogoutRequest, org.archi.common.auth.PostLogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostLogout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostLogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.auth.PostLogoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogoutServiceMethodDescriptorSupplier("PostLogout"))
              .build();
        }
      }
    }
    return getPostLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogoutServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogoutServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogoutServiceStub>() {
        @java.lang.Override
        public LogoutServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogoutServiceStub(channel, callOptions);
        }
      };
    return LogoutServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogoutServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogoutServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogoutServiceBlockingStub>() {
        @java.lang.Override
        public LogoutServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogoutServiceBlockingStub(channel, callOptions);
        }
      };
    return LogoutServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogoutServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogoutServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogoutServiceFutureStub>() {
        @java.lang.Override
        public LogoutServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogoutServiceFutureStub(channel, callOptions);
        }
      };
    return LogoutServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Logout Service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void postLogout(org.archi.common.auth.PostLogoutRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLogoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostLogoutMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LogoutService.
   * <pre>
   *Logout Service
   * </pre>
   */
  public static abstract class LogoutServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LogoutServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LogoutService.
   * <pre>
   *Logout Service
   * </pre>
   */
  public static final class LogoutServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LogoutServiceStub> {
    private LogoutServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogoutServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogoutServiceStub(channel, callOptions);
    }

    /**
     */
    public void postLogout(org.archi.common.auth.PostLogoutRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.auth.PostLogoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LogoutService.
   * <pre>
   *Logout Service
   * </pre>
   */
  public static final class LogoutServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LogoutServiceBlockingStub> {
    private LogoutServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogoutServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogoutServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.auth.PostLogoutResponse postLogout(org.archi.common.auth.PostLogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LogoutService.
   * <pre>
   *Logout Service
   * </pre>
   */
  public static final class LogoutServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LogoutServiceFutureStub> {
    private LogoutServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogoutServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogoutServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.auth.PostLogoutResponse> postLogout(
        org.archi.common.auth.PostLogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_LOGOUT = 0;

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
        case METHODID_POST_LOGOUT:
          serviceImpl.postLogout((org.archi.common.auth.PostLogoutRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.auth.PostLogoutResponse>) responseObserver);
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
          getPostLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.auth.PostLogoutRequest,
              org.archi.common.auth.PostLogoutResponse>(
                service, METHODID_POST_LOGOUT)))
        .build();
  }

  private static abstract class LogoutServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogoutServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogoutService");
    }
  }

  private static final class LogoutServiceFileDescriptorSupplier
      extends LogoutServiceBaseDescriptorSupplier {
    LogoutServiceFileDescriptorSupplier() {}
  }

  private static final class LogoutServiceMethodDescriptorSupplier
      extends LogoutServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LogoutServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LogoutServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogoutServiceFileDescriptorSupplier())
              .addMethod(getPostLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
