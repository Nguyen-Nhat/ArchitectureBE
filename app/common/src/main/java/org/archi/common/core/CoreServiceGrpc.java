package org.archi.common.core;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: core.proto")
public final class CoreServiceGrpc {

  private CoreServiceGrpc() {}

  public static final String SERVICE_NAME = "CoreService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetVouchersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetVouchersRequest,
      org.archi.common.core.GetVouchersResponse> METHOD_GET_VOUCHERS = getGetVouchersMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetVouchersRequest,
      org.archi.common.core.GetVouchersResponse> getGetVouchersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetVouchersRequest,
      org.archi.common.core.GetVouchersResponse> getGetVouchersMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetVouchersRequest, org.archi.common.core.GetVouchersResponse> getGetVouchersMethod;
    if ((getGetVouchersMethod = CoreServiceGrpc.getGetVouchersMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetVouchersMethod = CoreServiceGrpc.getGetVouchersMethod) == null) {
          CoreServiceGrpc.getGetVouchersMethod = getGetVouchersMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetVouchersRequest, org.archi.common.core.GetVouchersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetVouchers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetVouchersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetVouchersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetVouchers"))
                  .build();
          }
        }
     }
     return getGetVouchersMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGenerateVoucherMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GenerateVoucherRequest,
      org.archi.common.core.GenerateVoucherResponse> METHOD_GENERATE_VOUCHER = getGenerateVoucherMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GenerateVoucherRequest,
      org.archi.common.core.GenerateVoucherResponse> getGenerateVoucherMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GenerateVoucherRequest,
      org.archi.common.core.GenerateVoucherResponse> getGenerateVoucherMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GenerateVoucherRequest, org.archi.common.core.GenerateVoucherResponse> getGenerateVoucherMethod;
    if ((getGenerateVoucherMethod = CoreServiceGrpc.getGenerateVoucherMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGenerateVoucherMethod = CoreServiceGrpc.getGenerateVoucherMethod) == null) {
          CoreServiceGrpc.getGenerateVoucherMethod = getGenerateVoucherMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GenerateVoucherRequest, org.archi.common.core.GenerateVoucherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GenerateVoucher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GenerateVoucherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GenerateVoucherResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GenerateVoucher"))
                  .build();
          }
        }
     }
     return getGenerateVoucherMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateVoucherTypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.CreateVoucherTypeRequest,
      org.archi.common.core.CreateVoucherTypeResponse> METHOD_CREATE_VOUCHER_TYPE = getCreateVoucherTypeMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.CreateVoucherTypeRequest,
      org.archi.common.core.CreateVoucherTypeResponse> getCreateVoucherTypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.CreateVoucherTypeRequest,
      org.archi.common.core.CreateVoucherTypeResponse> getCreateVoucherTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.CreateVoucherTypeRequest, org.archi.common.core.CreateVoucherTypeResponse> getCreateVoucherTypeMethod;
    if ((getCreateVoucherTypeMethod = CoreServiceGrpc.getCreateVoucherTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getCreateVoucherTypeMethod = CoreServiceGrpc.getCreateVoucherTypeMethod) == null) {
          CoreServiceGrpc.getCreateVoucherTypeMethod = getCreateVoucherTypeMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.CreateVoucherTypeRequest, org.archi.common.core.CreateVoucherTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "CreateVoucherType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreateVoucherTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreateVoucherTypeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("CreateVoucherType"))
                  .build();
          }
        }
     }
     return getCreateVoucherTypeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsRequest,
      org.archi.common.core.GetCampaignsResponse> METHOD_GET_CAMPAIGNS = getGetCampaignsMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsRequest,
      org.archi.common.core.GetCampaignsResponse> getGetCampaignsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsRequest,
      org.archi.common.core.GetCampaignsResponse> getGetCampaignsMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsRequest, org.archi.common.core.GetCampaignsResponse> getGetCampaignsMethod;
    if ((getGetCampaignsMethod = CoreServiceGrpc.getGetCampaignsMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetCampaignsMethod = CoreServiceGrpc.getGetCampaignsMethod) == null) {
          CoreServiceGrpc.getGetCampaignsMethod = getGetCampaignsMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetCampaignsRequest, org.archi.common.core.GetCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetCampaignsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetCampaigns"))
                  .build();
          }
        }
     }
     return getGetCampaignsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchCampaignMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.SearchCampaignRequest,
      org.archi.common.core.SearchCampaignResponse> METHOD_SEARCH_CAMPAIGN = getSearchCampaignMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.SearchCampaignRequest,
      org.archi.common.core.SearchCampaignResponse> getSearchCampaignMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.SearchCampaignRequest,
      org.archi.common.core.SearchCampaignResponse> getSearchCampaignMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.SearchCampaignRequest, org.archi.common.core.SearchCampaignResponse> getSearchCampaignMethod;
    if ((getSearchCampaignMethod = CoreServiceGrpc.getSearchCampaignMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getSearchCampaignMethod = CoreServiceGrpc.getSearchCampaignMethod) == null) {
          CoreServiceGrpc.getSearchCampaignMethod = getSearchCampaignMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.SearchCampaignRequest, org.archi.common.core.SearchCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "SearchCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.SearchCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.SearchCampaignResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("SearchCampaign"))
                  .build();
          }
        }
     }
     return getSearchCampaignMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateCampaignMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.CreateCampaignRequest,
      org.archi.common.core.CreateCampaignResponse> METHOD_CREATE_CAMPAIGN = getCreateCampaignMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.CreateCampaignRequest,
      org.archi.common.core.CreateCampaignResponse> getCreateCampaignMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.CreateCampaignRequest,
      org.archi.common.core.CreateCampaignResponse> getCreateCampaignMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.CreateCampaignRequest, org.archi.common.core.CreateCampaignResponse> getCreateCampaignMethod;
    if ((getCreateCampaignMethod = CoreServiceGrpc.getCreateCampaignMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getCreateCampaignMethod = CoreServiceGrpc.getCreateCampaignMethod) == null) {
          CoreServiceGrpc.getCreateCampaignMethod = getCreateCampaignMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.CreateCampaignRequest, org.archi.common.core.CreateCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "CreateCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreateCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreateCampaignResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("CreateCampaign"))
                  .build();
          }
        }
     }
     return getCreateCampaignMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignsByBrandIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsByBrandIdReq,
      org.archi.common.core.GetCampaignsByBrandIdRes> METHOD_GET_CAMPAIGNS_BY_BRAND_ID = getGetCampaignsByBrandIdMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsByBrandIdReq,
      org.archi.common.core.GetCampaignsByBrandIdRes> getGetCampaignsByBrandIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsByBrandIdReq,
      org.archi.common.core.GetCampaignsByBrandIdRes> getGetCampaignsByBrandIdMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsByBrandIdReq, org.archi.common.core.GetCampaignsByBrandIdRes> getGetCampaignsByBrandIdMethod;
    if ((getGetCampaignsByBrandIdMethod = CoreServiceGrpc.getGetCampaignsByBrandIdMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetCampaignsByBrandIdMethod = CoreServiceGrpc.getGetCampaignsByBrandIdMethod) == null) {
          CoreServiceGrpc.getGetCampaignsByBrandIdMethod = getGetCampaignsByBrandIdMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetCampaignsByBrandIdReq, org.archi.common.core.GetCampaignsByBrandIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetCampaignsByBrandId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetCampaignsByBrandIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetCampaignsByBrandIdRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetCampaignsByBrandId"))
                  .build();
          }
        }
     }
     return getGetCampaignsByBrandIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateCampaignMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.UpdateCampaignReq,
      org.archi.common.core.UpdateCampaignRes> METHOD_UPDATE_CAMPAIGN = getUpdateCampaignMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateCampaignReq,
      org.archi.common.core.UpdateCampaignRes> getUpdateCampaignMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateCampaignReq,
      org.archi.common.core.UpdateCampaignRes> getUpdateCampaignMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateCampaignReq, org.archi.common.core.UpdateCampaignRes> getUpdateCampaignMethod;
    if ((getUpdateCampaignMethod = CoreServiceGrpc.getUpdateCampaignMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateCampaignMethod = CoreServiceGrpc.getUpdateCampaignMethod) == null) {
          CoreServiceGrpc.getUpdateCampaignMethod = getUpdateCampaignMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateCampaignReq, org.archi.common.core.UpdateCampaignRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "UpdateCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateCampaignReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateCampaignRes.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("UpdateCampaign"))
                  .build();
          }
        }
     }
     return getUpdateCampaignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoreServiceStub newStub(io.grpc.Channel channel) {
    return new CoreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CoreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CoreServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVouchers(org.archi.common.core.GetVouchersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVouchersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVouchersMethod(), responseObserver);
    }

    /**
     */
    public void generateVoucher(org.archi.common.core.GenerateVoucherRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GenerateVoucherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateVoucherMethod(), responseObserver);
    }

    /**
     */
    public void createVoucherType(org.archi.common.core.CreateVoucherTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateVoucherTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVoucherTypeMethod(), responseObserver);
    }

    /**
     */
    public void getCampaigns(org.archi.common.core.GetCampaignsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignsMethod(), responseObserver);
    }

    /**
     */
    public void searchCampaign(org.archi.common.core.SearchCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchCampaignResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchCampaignMethod(), responseObserver);
    }

    /**
     */
    public void createCampaign(org.archi.common.core.CreateCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateCampaignResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCampaignMethod(), responseObserver);
    }

    /**
     */
    public void getCampaignsByBrandId(org.archi.common.core.GetCampaignsByBrandIdReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsByBrandIdRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignsByBrandIdMethod(), responseObserver);
    }

    /**
     */
    public void updateCampaign(org.archi.common.core.UpdateCampaignReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateCampaignRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCampaignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVouchersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetVouchersRequest,
                org.archi.common.core.GetVouchersResponse>(
                  this, METHODID_GET_VOUCHERS)))
          .addMethod(
            getGenerateVoucherMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GenerateVoucherRequest,
                org.archi.common.core.GenerateVoucherResponse>(
                  this, METHODID_GENERATE_VOUCHER)))
          .addMethod(
            getCreateVoucherTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.CreateVoucherTypeRequest,
                org.archi.common.core.CreateVoucherTypeResponse>(
                  this, METHODID_CREATE_VOUCHER_TYPE)))
          .addMethod(
            getGetCampaignsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetCampaignsRequest,
                org.archi.common.core.GetCampaignsResponse>(
                  this, METHODID_GET_CAMPAIGNS)))
          .addMethod(
            getSearchCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.SearchCampaignRequest,
                org.archi.common.core.SearchCampaignResponse>(
                  this, METHODID_SEARCH_CAMPAIGN)))
          .addMethod(
            getCreateCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.CreateCampaignRequest,
                org.archi.common.core.CreateCampaignResponse>(
                  this, METHODID_CREATE_CAMPAIGN)))
          .addMethod(
            getGetCampaignsByBrandIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetCampaignsByBrandIdReq,
                org.archi.common.core.GetCampaignsByBrandIdRes>(
                  this, METHODID_GET_CAMPAIGNS_BY_BRAND_ID)))
          .addMethod(
            getUpdateCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.UpdateCampaignReq,
                org.archi.common.core.UpdateCampaignRes>(
                  this, METHODID_UPDATE_CAMPAIGN)))
          .build();
    }
  }

  /**
   */
  public static final class CoreServiceStub extends io.grpc.stub.AbstractStub<CoreServiceStub> {
    private CoreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVouchers(org.archi.common.core.GetVouchersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVouchersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVouchersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateVoucher(org.archi.common.core.GenerateVoucherRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GenerateVoucherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateVoucherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createVoucherType(org.archi.common.core.CreateVoucherTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateVoucherTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVoucherTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCampaigns(org.archi.common.core.GetCampaignsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchCampaign(org.archi.common.core.SearchCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchCampaignResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCampaign(org.archi.common.core.CreateCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateCampaignResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCampaignsByBrandId(org.archi.common.core.GetCampaignsByBrandIdReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsByBrandIdRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignsByBrandIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCampaign(org.archi.common.core.UpdateCampaignReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateCampaignRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CoreServiceBlockingStub extends io.grpc.stub.AbstractStub<CoreServiceBlockingStub> {
    private CoreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.core.GetVouchersResponse getVouchers(org.archi.common.core.GetVouchersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVouchersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GenerateVoucherResponse generateVoucher(org.archi.common.core.GenerateVoucherRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateVoucherMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.CreateVoucherTypeResponse createVoucherType(org.archi.common.core.CreateVoucherTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVoucherTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetCampaignsResponse getCampaigns(org.archi.common.core.GetCampaignsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.SearchCampaignResponse searchCampaign(org.archi.common.core.SearchCampaignRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.CreateCampaignResponse createCampaign(org.archi.common.core.CreateCampaignRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetCampaignsByBrandIdRes getCampaignsByBrandId(org.archi.common.core.GetCampaignsByBrandIdReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignsByBrandIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateCampaignRes updateCampaign(org.archi.common.core.UpdateCampaignReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCampaignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CoreServiceFutureStub extends io.grpc.stub.AbstractStub<CoreServiceFutureStub> {
    private CoreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetVouchersResponse> getVouchers(
        org.archi.common.core.GetVouchersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVouchersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GenerateVoucherResponse> generateVoucher(
        org.archi.common.core.GenerateVoucherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateVoucherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.CreateVoucherTypeResponse> createVoucherType(
        org.archi.common.core.CreateVoucherTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVoucherTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetCampaignsResponse> getCampaigns(
        org.archi.common.core.GetCampaignsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.SearchCampaignResponse> searchCampaign(
        org.archi.common.core.SearchCampaignRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.CreateCampaignResponse> createCampaign(
        org.archi.common.core.CreateCampaignRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetCampaignsByBrandIdRes> getCampaignsByBrandId(
        org.archi.common.core.GetCampaignsByBrandIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignsByBrandIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateCampaignRes> updateCampaign(
        org.archi.common.core.UpdateCampaignReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VOUCHERS = 0;
  private static final int METHODID_GENERATE_VOUCHER = 1;
  private static final int METHODID_CREATE_VOUCHER_TYPE = 2;
  private static final int METHODID_GET_CAMPAIGNS = 3;
  private static final int METHODID_SEARCH_CAMPAIGN = 4;
  private static final int METHODID_CREATE_CAMPAIGN = 5;
  private static final int METHODID_GET_CAMPAIGNS_BY_BRAND_ID = 6;
  private static final int METHODID_UPDATE_CAMPAIGN = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VOUCHERS:
          serviceImpl.getVouchers((org.archi.common.core.GetVouchersRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetVouchersResponse>) responseObserver);
          break;
        case METHODID_GENERATE_VOUCHER:
          serviceImpl.generateVoucher((org.archi.common.core.GenerateVoucherRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GenerateVoucherResponse>) responseObserver);
          break;
        case METHODID_CREATE_VOUCHER_TYPE:
          serviceImpl.createVoucherType((org.archi.common.core.CreateVoucherTypeRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.CreateVoucherTypeResponse>) responseObserver);
          break;
        case METHODID_GET_CAMPAIGNS:
          serviceImpl.getCampaigns((org.archi.common.core.GetCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_CAMPAIGN:
          serviceImpl.searchCampaign((org.archi.common.core.SearchCampaignRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.SearchCampaignResponse>) responseObserver);
          break;
        case METHODID_CREATE_CAMPAIGN:
          serviceImpl.createCampaign((org.archi.common.core.CreateCampaignRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.CreateCampaignResponse>) responseObserver);
          break;
        case METHODID_GET_CAMPAIGNS_BY_BRAND_ID:
          serviceImpl.getCampaignsByBrandId((org.archi.common.core.GetCampaignsByBrandIdReq) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsByBrandIdRes>) responseObserver);
          break;
        case METHODID_UPDATE_CAMPAIGN:
          serviceImpl.updateCampaign((org.archi.common.core.UpdateCampaignReq) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.UpdateCampaignRes>) responseObserver);
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

  private static abstract class CoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.archi.common.core.CoreProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CoreService");
    }
  }

  private static final class CoreServiceFileDescriptorSupplier
      extends CoreServiceBaseDescriptorSupplier {
    CoreServiceFileDescriptorSupplier() {}
  }

  private static final class CoreServiceMethodDescriptorSupplier
      extends CoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoreServiceFileDescriptorSupplier())
              .addMethod(getGetVouchersMethod())
              .addMethod(getGenerateVoucherMethod())
              .addMethod(getCreateVoucherTypeMethod())
              .addMethod(getGetCampaignsMethod())
              .addMethod(getSearchCampaignMethod())
              .addMethod(getCreateCampaignMethod())
              .addMethod(getGetCampaignsByBrandIdMethod())
              .addMethod(getUpdateCampaignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
