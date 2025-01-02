package org.archi.common.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogoutServiceGrpc {

  private LogoutServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "LogoutService";

  // Static method descriptors that strictly reflect the proto.
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
   */
  public interface AsyncService {
  }

  /**
   * Base class for the server implementation of the service LogoutService.
   */
  public static abstract class LogoutServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LogoutServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LogoutService.
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
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LogoutService.
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
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LogoutService.
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
  }


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
              .build();
        }
      }
    }
    return result;
  }
}
