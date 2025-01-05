package org.archi.common.core;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: core.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CoreServiceGrpc {

  private CoreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "CoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GenerateVoucherRequest,
      org.archi.common.core.GenerateVoucherResponse> getGenerateVoucherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateVoucher",
      requestType = org.archi.common.core.GenerateVoucherRequest.class,
      responseType = org.archi.common.core.GenerateVoucherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GenerateVoucherRequest,
      org.archi.common.core.GenerateVoucherResponse> getGenerateVoucherMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GenerateVoucherRequest, org.archi.common.core.GenerateVoucherResponse> getGenerateVoucherMethod;
    if ((getGenerateVoucherMethod = CoreServiceGrpc.getGenerateVoucherMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGenerateVoucherMethod = CoreServiceGrpc.getGenerateVoucherMethod) == null) {
          CoreServiceGrpc.getGenerateVoucherMethod = getGenerateVoucherMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GenerateVoucherRequest, org.archi.common.core.GenerateVoucherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateVoucher"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.CreateVoucherTypeRequest,
      org.archi.common.core.CreateVoucherTypeResponse> getCreateVoucherTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVoucherType",
      requestType = org.archi.common.core.CreateVoucherTypeRequest.class,
      responseType = org.archi.common.core.CreateVoucherTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.CreateVoucherTypeRequest,
      org.archi.common.core.CreateVoucherTypeResponse> getCreateVoucherTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.CreateVoucherTypeRequest, org.archi.common.core.CreateVoucherTypeResponse> getCreateVoucherTypeMethod;
    if ((getCreateVoucherTypeMethod = CoreServiceGrpc.getCreateVoucherTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getCreateVoucherTypeMethod = CoreServiceGrpc.getCreateVoucherTypeMethod) == null) {
          CoreServiceGrpc.getCreateVoucherTypeMethod = getCreateVoucherTypeMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.CreateVoucherTypeRequest, org.archi.common.core.CreateVoucherTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVoucherType"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherResponse> getSearchVoucherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchVoucher",
      requestType = org.archi.common.core.SearchRequest.class,
      responseType = org.archi.common.core.SearchVoucherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherResponse> getSearchVoucherMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest, org.archi.common.core.SearchVoucherResponse> getSearchVoucherMethod;
    if ((getSearchVoucherMethod = CoreServiceGrpc.getSearchVoucherMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getSearchVoucherMethod = CoreServiceGrpc.getSearchVoucherMethod) == null) {
          CoreServiceGrpc.getSearchVoucherMethod = getSearchVoucherMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.SearchRequest, org.archi.common.core.SearchVoucherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchVoucher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.SearchVoucherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("SearchVoucher"))
              .build();
        }
      }
    }
    return getSearchVoucherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherTypeResponse> getSearchVoucherTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchVoucherType",
      requestType = org.archi.common.core.SearchRequest.class,
      responseType = org.archi.common.core.SearchVoucherTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherTypeResponse> getSearchVoucherTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest, org.archi.common.core.SearchVoucherTypeResponse> getSearchVoucherTypeMethod;
    if ((getSearchVoucherTypeMethod = CoreServiceGrpc.getSearchVoucherTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getSearchVoucherTypeMethod = CoreServiceGrpc.getSearchVoucherTypeMethod) == null) {
          CoreServiceGrpc.getSearchVoucherTypeMethod = getSearchVoucherTypeMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.SearchRequest, org.archi.common.core.SearchVoucherTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchVoucherType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.SearchVoucherTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("SearchVoucherType"))
              .build();
        }
      }
    }
    return getSearchVoucherTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateVoucherTypeReq,
      org.archi.common.core.UpdateVoucherTypeRes> getUpdateVoucherTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVoucherType",
      requestType = org.archi.common.core.UpdateVoucherTypeReq.class,
      responseType = org.archi.common.core.UpdateVoucherTypeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateVoucherTypeReq,
      org.archi.common.core.UpdateVoucherTypeRes> getUpdateVoucherTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateVoucherTypeReq, org.archi.common.core.UpdateVoucherTypeRes> getUpdateVoucherTypeMethod;
    if ((getUpdateVoucherTypeMethod = CoreServiceGrpc.getUpdateVoucherTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateVoucherTypeMethod = CoreServiceGrpc.getUpdateVoucherTypeMethod) == null) {
          CoreServiceGrpc.getUpdateVoucherTypeMethod = getUpdateVoucherTypeMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateVoucherTypeReq, org.archi.common.core.UpdateVoucherTypeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVoucherType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateVoucherTypeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateVoucherTypeRes.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("UpdateVoucherType"))
              .build();
        }
      }
    }
    return getUpdateVoucherTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetVoucherTypesReq,
      org.archi.common.core.GetVoucherTypesRes> getGetVouchersTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVouchersType",
      requestType = org.archi.common.core.GetVoucherTypesReq.class,
      responseType = org.archi.common.core.GetVoucherTypesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetVoucherTypesReq,
      org.archi.common.core.GetVoucherTypesRes> getGetVouchersTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetVoucherTypesReq, org.archi.common.core.GetVoucherTypesRes> getGetVouchersTypeMethod;
    if ((getGetVouchersTypeMethod = CoreServiceGrpc.getGetVouchersTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetVouchersTypeMethod = CoreServiceGrpc.getGetVouchersTypeMethod) == null) {
          CoreServiceGrpc.getGetVouchersTypeMethod = getGetVouchersTypeMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetVoucherTypesReq, org.archi.common.core.GetVoucherTypesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVouchersType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetVoucherTypesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetVoucherTypesRes.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetVouchersType"))
              .build();
        }
      }
    }
    return getGetVouchersTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetVouchersRequest,
      org.archi.common.core.GetVouchersResponse> getGetVouchersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVouchers",
      requestType = org.archi.common.core.GetVouchersRequest.class,
      responseType = org.archi.common.core.GetVouchersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetVouchersRequest,
      org.archi.common.core.GetVouchersResponse> getGetVouchersMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetVouchersRequest, org.archi.common.core.GetVouchersResponse> getGetVouchersMethod;
    if ((getGetVouchersMethod = CoreServiceGrpc.getGetVouchersMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetVouchersMethod = CoreServiceGrpc.getGetVouchersMethod) == null) {
          CoreServiceGrpc.getGetVouchersMethod = getGetVouchersMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetVouchersRequest, org.archi.common.core.GetVouchersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVouchers"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsRequest,
      org.archi.common.core.GetCampaignsResponse> getGetCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaigns",
      requestType = org.archi.common.core.GetCampaignsRequest.class,
      responseType = org.archi.common.core.GetCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsRequest,
      org.archi.common.core.GetCampaignsResponse> getGetCampaignsMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsRequest, org.archi.common.core.GetCampaignsResponse> getGetCampaignsMethod;
    if ((getGetCampaignsMethod = CoreServiceGrpc.getGetCampaignsMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetCampaignsMethod = CoreServiceGrpc.getGetCampaignsMethod) == null) {
          CoreServiceGrpc.getGetCampaignsMethod = getGetCampaignsMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetCampaignsRequest, org.archi.common.core.GetCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaigns"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.SearchCampaignRequest,
      org.archi.common.core.SearchCampaignResponse> getSearchCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchCampaign",
      requestType = org.archi.common.core.SearchCampaignRequest.class,
      responseType = org.archi.common.core.SearchCampaignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.SearchCampaignRequest,
      org.archi.common.core.SearchCampaignResponse> getSearchCampaignMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.SearchCampaignRequest, org.archi.common.core.SearchCampaignResponse> getSearchCampaignMethod;
    if ((getSearchCampaignMethod = CoreServiceGrpc.getSearchCampaignMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getSearchCampaignMethod = CoreServiceGrpc.getSearchCampaignMethod) == null) {
          CoreServiceGrpc.getSearchCampaignMethod = getSearchCampaignMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.SearchCampaignRequest, org.archi.common.core.SearchCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchCampaign"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.CreateCampaignRequest,
      org.archi.common.core.CreateCampaignResponse> getCreateCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCampaign",
      requestType = org.archi.common.core.CreateCampaignRequest.class,
      responseType = org.archi.common.core.CreateCampaignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.CreateCampaignRequest,
      org.archi.common.core.CreateCampaignResponse> getCreateCampaignMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.CreateCampaignRequest, org.archi.common.core.CreateCampaignResponse> getCreateCampaignMethod;
    if ((getCreateCampaignMethod = CoreServiceGrpc.getCreateCampaignMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getCreateCampaignMethod = CoreServiceGrpc.getCreateCampaignMethod) == null) {
          CoreServiceGrpc.getCreateCampaignMethod = getCreateCampaignMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.CreateCampaignRequest, org.archi.common.core.CreateCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCampaign"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsByBrandIdReq,
      org.archi.common.core.GetCampaignsByBrandIdRes> getGetCampaignsByBrandIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignsByBrandId",
      requestType = org.archi.common.core.GetCampaignsByBrandIdReq.class,
      responseType = org.archi.common.core.GetCampaignsByBrandIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsByBrandIdReq,
      org.archi.common.core.GetCampaignsByBrandIdRes> getGetCampaignsByBrandIdMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetCampaignsByBrandIdReq, org.archi.common.core.GetCampaignsByBrandIdRes> getGetCampaignsByBrandIdMethod;
    if ((getGetCampaignsByBrandIdMethod = CoreServiceGrpc.getGetCampaignsByBrandIdMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetCampaignsByBrandIdMethod = CoreServiceGrpc.getGetCampaignsByBrandIdMethod) == null) {
          CoreServiceGrpc.getGetCampaignsByBrandIdMethod = getGetCampaignsByBrandIdMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetCampaignsByBrandIdReq, org.archi.common.core.GetCampaignsByBrandIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignsByBrandId"))
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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateCampaignReq,
      org.archi.common.core.UpdateCampaignRes> getUpdateCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCampaign",
      requestType = org.archi.common.core.UpdateCampaignReq.class,
      responseType = org.archi.common.core.UpdateCampaignRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateCampaignReq,
      org.archi.common.core.UpdateCampaignRes> getUpdateCampaignMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateCampaignReq, org.archi.common.core.UpdateCampaignRes> getUpdateCampaignMethod;
    if ((getUpdateCampaignMethod = CoreServiceGrpc.getUpdateCampaignMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateCampaignMethod = CoreServiceGrpc.getUpdateCampaignMethod) == null) {
          CoreServiceGrpc.getUpdateCampaignMethod = getUpdateCampaignMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateCampaignReq, org.archi.common.core.UpdateCampaignRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCampaign"))
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
    io.grpc.stub.AbstractStub.StubFactory<CoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServiceStub>() {
        @java.lang.Override
        public CoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServiceStub(channel, callOptions);
        }
      };
    return CoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServiceBlockingStub>() {
        @java.lang.Override
        public CoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServiceBlockingStub(channel, callOptions);
        }
      };
    return CoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServiceFutureStub>() {
        @java.lang.Override
        public CoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServiceFutureStub(channel, callOptions);
        }
      };
    return CoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void generateVoucher(org.archi.common.core.GenerateVoucherRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GenerateVoucherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateVoucherMethod(), responseObserver);
    }

    /**
     */
    default void createVoucherType(org.archi.common.core.CreateVoucherTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateVoucherTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVoucherTypeMethod(), responseObserver);
    }

    /**
     */
    default void searchVoucher(org.archi.common.core.SearchRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchVoucherMethod(), responseObserver);
    }

    /**
     */
    default void searchVoucherType(org.archi.common.core.SearchRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchVoucherTypeMethod(), responseObserver);
    }

    /**
     */
    default void updateVoucherType(org.archi.common.core.UpdateVoucherTypeReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateVoucherTypeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVoucherTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * brand's method
     * </pre>
     */
    default void getVouchersType(org.archi.common.core.GetVoucherTypesReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVoucherTypesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVouchersTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * player's method
     * </pre>
     */
    default void getVouchers(org.archi.common.core.GetVouchersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVouchersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVouchersMethod(), responseObserver);
    }

    /**
     */
    default void getCampaigns(org.archi.common.core.GetCampaignsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignsMethod(), responseObserver);
    }

    /**
     */
    default void searchCampaign(org.archi.common.core.SearchCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchCampaignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchCampaignMethod(), responseObserver);
    }

    /**
     */
    default void createCampaign(org.archi.common.core.CreateCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateCampaignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCampaignMethod(), responseObserver);
    }

    /**
     */
    default void getCampaignsByBrandId(org.archi.common.core.GetCampaignsByBrandIdReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsByBrandIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignsByBrandIdMethod(), responseObserver);
    }

    /**
     */
    default void updateCampaign(org.archi.common.core.UpdateCampaignReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateCampaignRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCampaignMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CoreService.
   */
  public static abstract class CoreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CoreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CoreService.
   */
  public static final class CoreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CoreServiceStub> {
    private CoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateVoucher(org.archi.common.core.GenerateVoucherRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GenerateVoucherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateVoucherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createVoucherType(org.archi.common.core.CreateVoucherTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateVoucherTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVoucherTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchVoucher(org.archi.common.core.SearchRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchVoucherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchVoucherType(org.archi.common.core.SearchRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchVoucherTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVoucherType(org.archi.common.core.UpdateVoucherTypeReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateVoucherTypeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVoucherTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * brand's method
     * </pre>
     */
    public void getVouchersType(org.archi.common.core.GetVoucherTypesReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVoucherTypesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVouchersTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * player's method
     * </pre>
     */
    public void getVouchers(org.archi.common.core.GetVouchersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVouchersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVouchersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCampaigns(org.archi.common.core.GetCampaignsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchCampaign(org.archi.common.core.SearchCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchCampaignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCampaign(org.archi.common.core.CreateCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateCampaignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCampaignsByBrandId(org.archi.common.core.GetCampaignsByBrandIdReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetCampaignsByBrandIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignsByBrandIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCampaign(org.archi.common.core.UpdateCampaignReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateCampaignRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CoreService.
   */
  public static final class CoreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CoreServiceBlockingStub> {
    private CoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.archi.common.core.GenerateVoucherResponse generateVoucher(org.archi.common.core.GenerateVoucherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateVoucherMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.CreateVoucherTypeResponse createVoucherType(org.archi.common.core.CreateVoucherTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVoucherTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.SearchVoucherResponse searchVoucher(org.archi.common.core.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchVoucherMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.SearchVoucherTypeResponse searchVoucherType(org.archi.common.core.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchVoucherTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateVoucherTypeRes updateVoucherType(org.archi.common.core.UpdateVoucherTypeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVoucherTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * brand's method
     * </pre>
     */
    public org.archi.common.core.GetVoucherTypesRes getVouchersType(org.archi.common.core.GetVoucherTypesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVouchersTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * player's method
     * </pre>
     */
    public org.archi.common.core.GetVouchersResponse getVouchers(org.archi.common.core.GetVouchersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVouchersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetCampaignsResponse getCampaigns(org.archi.common.core.GetCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.SearchCampaignResponse searchCampaign(org.archi.common.core.SearchCampaignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.CreateCampaignResponse createCampaign(org.archi.common.core.CreateCampaignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetCampaignsByBrandIdRes getCampaignsByBrandId(org.archi.common.core.GetCampaignsByBrandIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignsByBrandIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateCampaignRes updateCampaign(org.archi.common.core.UpdateCampaignReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCampaignMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CoreService.
   */
  public static final class CoreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CoreServiceFutureStub> {
    private CoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GenerateVoucherResponse> generateVoucher(
        org.archi.common.core.GenerateVoucherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateVoucherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.CreateVoucherTypeResponse> createVoucherType(
        org.archi.common.core.CreateVoucherTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVoucherTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.SearchVoucherResponse> searchVoucher(
        org.archi.common.core.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchVoucherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.SearchVoucherTypeResponse> searchVoucherType(
        org.archi.common.core.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchVoucherTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateVoucherTypeRes> updateVoucherType(
        org.archi.common.core.UpdateVoucherTypeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVoucherTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * brand's method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetVoucherTypesRes> getVouchersType(
        org.archi.common.core.GetVoucherTypesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVouchersTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * player's method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetVouchersResponse> getVouchers(
        org.archi.common.core.GetVouchersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVouchersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetCampaignsResponse> getCampaigns(
        org.archi.common.core.GetCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.SearchCampaignResponse> searchCampaign(
        org.archi.common.core.SearchCampaignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.CreateCampaignResponse> createCampaign(
        org.archi.common.core.CreateCampaignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetCampaignsByBrandIdRes> getCampaignsByBrandId(
        org.archi.common.core.GetCampaignsByBrandIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignsByBrandIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateCampaignRes> updateCampaign(
        org.archi.common.core.UpdateCampaignReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_VOUCHER = 0;
  private static final int METHODID_CREATE_VOUCHER_TYPE = 1;
  private static final int METHODID_SEARCH_VOUCHER = 2;
  private static final int METHODID_SEARCH_VOUCHER_TYPE = 3;
  private static final int METHODID_UPDATE_VOUCHER_TYPE = 4;
  private static final int METHODID_GET_VOUCHERS_TYPE = 5;
  private static final int METHODID_GET_VOUCHERS = 6;
  private static final int METHODID_GET_CAMPAIGNS = 7;
  private static final int METHODID_SEARCH_CAMPAIGN = 8;
  private static final int METHODID_CREATE_CAMPAIGN = 9;
  private static final int METHODID_GET_CAMPAIGNS_BY_BRAND_ID = 10;
  private static final int METHODID_UPDATE_CAMPAIGN = 11;

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
        case METHODID_GENERATE_VOUCHER:
          serviceImpl.generateVoucher((org.archi.common.core.GenerateVoucherRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GenerateVoucherResponse>) responseObserver);
          break;
        case METHODID_CREATE_VOUCHER_TYPE:
          serviceImpl.createVoucherType((org.archi.common.core.CreateVoucherTypeRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.CreateVoucherTypeResponse>) responseObserver);
          break;
        case METHODID_SEARCH_VOUCHER:
          serviceImpl.searchVoucher((org.archi.common.core.SearchRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherResponse>) responseObserver);
          break;
        case METHODID_SEARCH_VOUCHER_TYPE:
          serviceImpl.searchVoucherType((org.archi.common.core.SearchRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherTypeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VOUCHER_TYPE:
          serviceImpl.updateVoucherType((org.archi.common.core.UpdateVoucherTypeReq) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.UpdateVoucherTypeRes>) responseObserver);
          break;
        case METHODID_GET_VOUCHERS_TYPE:
          serviceImpl.getVouchersType((org.archi.common.core.GetVoucherTypesReq) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetVoucherTypesRes>) responseObserver);
          break;
        case METHODID_GET_VOUCHERS:
          serviceImpl.getVouchers((org.archi.common.core.GetVouchersRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetVouchersResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGenerateVoucherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GenerateVoucherRequest,
              org.archi.common.core.GenerateVoucherResponse>(
                service, METHODID_GENERATE_VOUCHER)))
        .addMethod(
          getCreateVoucherTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.CreateVoucherTypeRequest,
              org.archi.common.core.CreateVoucherTypeResponse>(
                service, METHODID_CREATE_VOUCHER_TYPE)))
        .addMethod(
          getSearchVoucherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.SearchRequest,
              org.archi.common.core.SearchVoucherResponse>(
                service, METHODID_SEARCH_VOUCHER)))
        .addMethod(
          getSearchVoucherTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.SearchRequest,
              org.archi.common.core.SearchVoucherTypeResponse>(
                service, METHODID_SEARCH_VOUCHER_TYPE)))
        .addMethod(
          getUpdateVoucherTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.UpdateVoucherTypeReq,
              org.archi.common.core.UpdateVoucherTypeRes>(
                service, METHODID_UPDATE_VOUCHER_TYPE)))
        .addMethod(
          getGetVouchersTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetVoucherTypesReq,
              org.archi.common.core.GetVoucherTypesRes>(
                service, METHODID_GET_VOUCHERS_TYPE)))
        .addMethod(
          getGetVouchersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetVouchersRequest,
              org.archi.common.core.GetVouchersResponse>(
                service, METHODID_GET_VOUCHERS)))
        .addMethod(
          getGetCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetCampaignsRequest,
              org.archi.common.core.GetCampaignsResponse>(
                service, METHODID_GET_CAMPAIGNS)))
        .addMethod(
          getSearchCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.SearchCampaignRequest,
              org.archi.common.core.SearchCampaignResponse>(
                service, METHODID_SEARCH_CAMPAIGN)))
        .addMethod(
          getCreateCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.CreateCampaignRequest,
              org.archi.common.core.CreateCampaignResponse>(
                service, METHODID_CREATE_CAMPAIGN)))
        .addMethod(
          getGetCampaignsByBrandIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetCampaignsByBrandIdReq,
              org.archi.common.core.GetCampaignsByBrandIdRes>(
                service, METHODID_GET_CAMPAIGNS_BY_BRAND_ID)))
        .addMethod(
          getUpdateCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.UpdateCampaignReq,
              org.archi.common.core.UpdateCampaignRes>(
                service, METHODID_UPDATE_CAMPAIGN)))
        .build();
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
    private final java.lang.String methodName;

    CoreServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getGenerateVoucherMethod())
              .addMethod(getCreateVoucherTypeMethod())
              .addMethod(getSearchVoucherMethod())
              .addMethod(getSearchVoucherTypeMethod())
              .addMethod(getUpdateVoucherTypeMethod())
              .addMethod(getGetVouchersTypeMethod())
              .addMethod(getGetVouchersMethod())
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
