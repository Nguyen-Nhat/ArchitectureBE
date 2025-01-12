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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetAllGameTypesRequest,
      org.archi.common.core.GetAllGameTypesResponse> getGetAllGameTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllGameTypes",
      requestType = org.archi.common.core.GetAllGameTypesRequest.class,
      responseType = org.archi.common.core.GetAllGameTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetAllGameTypesRequest,
      org.archi.common.core.GetAllGameTypesResponse> getGetAllGameTypesMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetAllGameTypesRequest, org.archi.common.core.GetAllGameTypesResponse> getGetAllGameTypesMethod;
    if ((getGetAllGameTypesMethod = CoreServiceGrpc.getGetAllGameTypesMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetAllGameTypesMethod = CoreServiceGrpc.getGetAllGameTypesMethod) == null) {
          CoreServiceGrpc.getGetAllGameTypesMethod = getGetAllGameTypesMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetAllGameTypesRequest, org.archi.common.core.GetAllGameTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllGameTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetAllGameTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetAllGameTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetAllGameTypes"))
              .build();
        }
      }
    }
    return getGetAllGameTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetGameTypeByIdRequest,
      org.archi.common.core.GetGameTypeByIdResponse> getGetGameTypeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGameTypeById",
      requestType = org.archi.common.core.GetGameTypeByIdRequest.class,
      responseType = org.archi.common.core.GetGameTypeByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetGameTypeByIdRequest,
      org.archi.common.core.GetGameTypeByIdResponse> getGetGameTypeByIdMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetGameTypeByIdRequest, org.archi.common.core.GetGameTypeByIdResponse> getGetGameTypeByIdMethod;
    if ((getGetGameTypeByIdMethod = CoreServiceGrpc.getGetGameTypeByIdMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetGameTypeByIdMethod = CoreServiceGrpc.getGetGameTypeByIdMethod) == null) {
          CoreServiceGrpc.getGetGameTypeByIdMethod = getGetGameTypeByIdMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetGameTypeByIdRequest, org.archi.common.core.GetGameTypeByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGameTypeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetGameTypeByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetGameTypeByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetGameTypeById"))
              .build();
        }
      }
    }
    return getGetGameTypeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.AddGameTypeRequest,
      org.archi.common.core.AddGameTypeResponse> getAddGameTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddGameType",
      requestType = org.archi.common.core.AddGameTypeRequest.class,
      responseType = org.archi.common.core.AddGameTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.AddGameTypeRequest,
      org.archi.common.core.AddGameTypeResponse> getAddGameTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.AddGameTypeRequest, org.archi.common.core.AddGameTypeResponse> getAddGameTypeMethod;
    if ((getAddGameTypeMethod = CoreServiceGrpc.getAddGameTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAddGameTypeMethod = CoreServiceGrpc.getAddGameTypeMethod) == null) {
          CoreServiceGrpc.getAddGameTypeMethod = getAddGameTypeMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.AddGameTypeRequest, org.archi.common.core.AddGameTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddGameType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.AddGameTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.AddGameTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("AddGameType"))
              .build();
        }
      }
    }
    return getAddGameTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameTypeRequest,
      org.archi.common.core.UpdateGameTypeResponse> getUpdateGameTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGameType",
      requestType = org.archi.common.core.UpdateGameTypeRequest.class,
      responseType = org.archi.common.core.UpdateGameTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameTypeRequest,
      org.archi.common.core.UpdateGameTypeResponse> getUpdateGameTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameTypeRequest, org.archi.common.core.UpdateGameTypeResponse> getUpdateGameTypeMethod;
    if ((getUpdateGameTypeMethod = CoreServiceGrpc.getUpdateGameTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateGameTypeMethod = CoreServiceGrpc.getUpdateGameTypeMethod) == null) {
          CoreServiceGrpc.getUpdateGameTypeMethod = getUpdateGameTypeMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateGameTypeRequest, org.archi.common.core.UpdateGameTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGameType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateGameTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateGameTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("UpdateGameType"))
              .build();
        }
      }
    }
    return getUpdateGameTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameTypeRequest,
      org.archi.common.core.DeleteGameTypeResponse> getDeleteGameTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGameType",
      requestType = org.archi.common.core.DeleteGameTypeRequest.class,
      responseType = org.archi.common.core.DeleteGameTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameTypeRequest,
      org.archi.common.core.DeleteGameTypeResponse> getDeleteGameTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameTypeRequest, org.archi.common.core.DeleteGameTypeResponse> getDeleteGameTypeMethod;
    if ((getDeleteGameTypeMethod = CoreServiceGrpc.getDeleteGameTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getDeleteGameTypeMethod = CoreServiceGrpc.getDeleteGameTypeMethod) == null) {
          CoreServiceGrpc.getDeleteGameTypeMethod = getDeleteGameTypeMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.DeleteGameTypeRequest, org.archi.common.core.DeleteGameTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGameType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.DeleteGameTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.DeleteGameTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("DeleteGameType"))
              .build();
        }
      }
    }
    return getDeleteGameTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetAllGamesRequest,
      org.archi.common.core.GetAllGamesResponse> getGetAllGamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllGames",
      requestType = org.archi.common.core.GetAllGamesRequest.class,
      responseType = org.archi.common.core.GetAllGamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetAllGamesRequest,
      org.archi.common.core.GetAllGamesResponse> getGetAllGamesMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetAllGamesRequest, org.archi.common.core.GetAllGamesResponse> getGetAllGamesMethod;
    if ((getGetAllGamesMethod = CoreServiceGrpc.getGetAllGamesMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetAllGamesMethod = CoreServiceGrpc.getGetAllGamesMethod) == null) {
          CoreServiceGrpc.getGetAllGamesMethod = getGetAllGamesMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetAllGamesRequest, org.archi.common.core.GetAllGamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllGames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetAllGamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetAllGamesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetAllGames"))
              .build();
        }
      }
    }
    return getGetAllGamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetGameByIdRequest,
      org.archi.common.core.GetGameByIdResponse> getGetGameByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGameById",
      requestType = org.archi.common.core.GetGameByIdRequest.class,
      responseType = org.archi.common.core.GetGameByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetGameByIdRequest,
      org.archi.common.core.GetGameByIdResponse> getGetGameByIdMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetGameByIdRequest, org.archi.common.core.GetGameByIdResponse> getGetGameByIdMethod;
    if ((getGetGameByIdMethod = CoreServiceGrpc.getGetGameByIdMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetGameByIdMethod = CoreServiceGrpc.getGetGameByIdMethod) == null) {
          CoreServiceGrpc.getGetGameByIdMethod = getGetGameByIdMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetGameByIdRequest, org.archi.common.core.GetGameByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGameById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetGameByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetGameByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetGameById"))
              .build();
        }
      }
    }
    return getGetGameByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetGamesByCampaignRequest,
      org.archi.common.core.GetGamesByCampaignResponse> getGetGamesByCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGamesByCampaign",
      requestType = org.archi.common.core.GetGamesByCampaignRequest.class,
      responseType = org.archi.common.core.GetGamesByCampaignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetGamesByCampaignRequest,
      org.archi.common.core.GetGamesByCampaignResponse> getGetGamesByCampaignMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetGamesByCampaignRequest, org.archi.common.core.GetGamesByCampaignResponse> getGetGamesByCampaignMethod;
    if ((getGetGamesByCampaignMethod = CoreServiceGrpc.getGetGamesByCampaignMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetGamesByCampaignMethod = CoreServiceGrpc.getGetGamesByCampaignMethod) == null) {
          CoreServiceGrpc.getGetGamesByCampaignMethod = getGetGamesByCampaignMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetGamesByCampaignRequest, org.archi.common.core.GetGamesByCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGamesByCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetGamesByCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetGamesByCampaignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetGamesByCampaign"))
              .build();
        }
      }
    }
    return getGetGamesByCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.AddGameRequest,
      org.archi.common.core.AddGameResponse> getAddGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddGame",
      requestType = org.archi.common.core.AddGameRequest.class,
      responseType = org.archi.common.core.AddGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.AddGameRequest,
      org.archi.common.core.AddGameResponse> getAddGameMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.AddGameRequest, org.archi.common.core.AddGameResponse> getAddGameMethod;
    if ((getAddGameMethod = CoreServiceGrpc.getAddGameMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAddGameMethod = CoreServiceGrpc.getAddGameMethod) == null) {
          CoreServiceGrpc.getAddGameMethod = getAddGameMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.AddGameRequest, org.archi.common.core.AddGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.AddGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.AddGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("AddGame"))
              .build();
        }
      }
    }
    return getAddGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameRequest,
      org.archi.common.core.UpdateGameResponse> getUpdateGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGame",
      requestType = org.archi.common.core.UpdateGameRequest.class,
      responseType = org.archi.common.core.UpdateGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameRequest,
      org.archi.common.core.UpdateGameResponse> getUpdateGameMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameRequest, org.archi.common.core.UpdateGameResponse> getUpdateGameMethod;
    if ((getUpdateGameMethod = CoreServiceGrpc.getUpdateGameMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateGameMethod = CoreServiceGrpc.getUpdateGameMethod) == null) {
          CoreServiceGrpc.getUpdateGameMethod = getUpdateGameMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateGameRequest, org.archi.common.core.UpdateGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("UpdateGame"))
              .build();
        }
      }
    }
    return getUpdateGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameRequest,
      org.archi.common.core.DeleteGameResponse> getDeleteGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGame",
      requestType = org.archi.common.core.DeleteGameRequest.class,
      responseType = org.archi.common.core.DeleteGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameRequest,
      org.archi.common.core.DeleteGameResponse> getDeleteGameMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameRequest, org.archi.common.core.DeleteGameResponse> getDeleteGameMethod;
    if ((getDeleteGameMethod = CoreServiceGrpc.getDeleteGameMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getDeleteGameMethod = CoreServiceGrpc.getDeleteGameMethod) == null) {
          CoreServiceGrpc.getDeleteGameMethod = getDeleteGameMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.DeleteGameRequest, org.archi.common.core.DeleteGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.DeleteGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.DeleteGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("DeleteGame"))
              .build();
        }
      }
    }
    return getDeleteGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.AddGamePlayerRequest,
      org.archi.common.core.AddGamePlayerResponse> getAddGamePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddGamePlayer",
      requestType = org.archi.common.core.AddGamePlayerRequest.class,
      responseType = org.archi.common.core.AddGamePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.AddGamePlayerRequest,
      org.archi.common.core.AddGamePlayerResponse> getAddGamePlayerMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.AddGamePlayerRequest, org.archi.common.core.AddGamePlayerResponse> getAddGamePlayerMethod;
    if ((getAddGamePlayerMethod = CoreServiceGrpc.getAddGamePlayerMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAddGamePlayerMethod = CoreServiceGrpc.getAddGamePlayerMethod) == null) {
          CoreServiceGrpc.getAddGamePlayerMethod = getAddGamePlayerMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.AddGamePlayerRequest, org.archi.common.core.AddGamePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddGamePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.AddGamePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.AddGamePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("AddGamePlayer"))
              .build();
        }
      }
    }
    return getAddGamePlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.HasWinRequest,
      org.archi.common.core.HasWinResponse> getHasWinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HasWin",
      requestType = org.archi.common.core.HasWinRequest.class,
      responseType = org.archi.common.core.HasWinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.HasWinRequest,
      org.archi.common.core.HasWinResponse> getHasWinMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.HasWinRequest, org.archi.common.core.HasWinResponse> getHasWinMethod;
    if ((getHasWinMethod = CoreServiceGrpc.getHasWinMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getHasWinMethod = CoreServiceGrpc.getHasWinMethod) == null) {
          CoreServiceGrpc.getHasWinMethod = getHasWinMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.HasWinRequest, org.archi.common.core.HasWinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasWin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.HasWinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.HasWinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("HasWin"))
              .build();
        }
      }
    }
    return getHasWinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetWinItemRequest,
      org.archi.common.core.GetWinItemResponse> getGetWinItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWinItem",
      requestType = org.archi.common.core.GetWinItemRequest.class,
      responseType = org.archi.common.core.GetWinItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetWinItemRequest,
      org.archi.common.core.GetWinItemResponse> getGetWinItemMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetWinItemRequest, org.archi.common.core.GetWinItemResponse> getGetWinItemMethod;
    if ((getGetWinItemMethod = CoreServiceGrpc.getGetWinItemMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetWinItemMethod = CoreServiceGrpc.getGetWinItemMethod) == null) {
          CoreServiceGrpc.getGetWinItemMethod = getGetWinItemMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetWinItemRequest, org.archi.common.core.GetWinItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWinItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetWinItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetWinItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetWinItem"))
              .build();
        }
      }
    }
    return getGetWinItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionByIdRequest,
      org.archi.common.core.GetQuizQuestionByIdResponse> getGetQuizQuestionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuizQuestionById",
      requestType = org.archi.common.core.GetQuizQuestionByIdRequest.class,
      responseType = org.archi.common.core.GetQuizQuestionByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionByIdRequest,
      org.archi.common.core.GetQuizQuestionByIdResponse> getGetQuizQuestionByIdMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionByIdRequest, org.archi.common.core.GetQuizQuestionByIdResponse> getGetQuizQuestionByIdMethod;
    if ((getGetQuizQuestionByIdMethod = CoreServiceGrpc.getGetQuizQuestionByIdMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetQuizQuestionByIdMethod = CoreServiceGrpc.getGetQuizQuestionByIdMethod) == null) {
          CoreServiceGrpc.getGetQuizQuestionByIdMethod = getGetQuizQuestionByIdMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetQuizQuestionByIdRequest, org.archi.common.core.GetQuizQuestionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuizQuestionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetQuizQuestionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetQuizQuestionByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetQuizQuestionById"))
              .build();
        }
      }
    }
    return getGetQuizQuestionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionsByGameRequest,
      org.archi.common.core.GetQuizQuestionsByGameResponse> getGetQuizQuestionsByGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuizQuestionsByGame",
      requestType = org.archi.common.core.GetQuizQuestionsByGameRequest.class,
      responseType = org.archi.common.core.GetQuizQuestionsByGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionsByGameRequest,
      org.archi.common.core.GetQuizQuestionsByGameResponse> getGetQuizQuestionsByGameMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionsByGameRequest, org.archi.common.core.GetQuizQuestionsByGameResponse> getGetQuizQuestionsByGameMethod;
    if ((getGetQuizQuestionsByGameMethod = CoreServiceGrpc.getGetQuizQuestionsByGameMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetQuizQuestionsByGameMethod = CoreServiceGrpc.getGetQuizQuestionsByGameMethod) == null) {
          CoreServiceGrpc.getGetQuizQuestionsByGameMethod = getGetQuizQuestionsByGameMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetQuizQuestionsByGameRequest, org.archi.common.core.GetQuizQuestionsByGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuizQuestionsByGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetQuizQuestionsByGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetQuizQuestionsByGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetQuizQuestionsByGame"))
              .build();
        }
      }
    }
    return getGetQuizQuestionsByGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.AddQuizQuestionRequest,
      org.archi.common.core.AddQuizQuestionResponse> getAddQuizQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddQuizQuestion",
      requestType = org.archi.common.core.AddQuizQuestionRequest.class,
      responseType = org.archi.common.core.AddQuizQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.AddQuizQuestionRequest,
      org.archi.common.core.AddQuizQuestionResponse> getAddQuizQuestionMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.AddQuizQuestionRequest, org.archi.common.core.AddQuizQuestionResponse> getAddQuizQuestionMethod;
    if ((getAddQuizQuestionMethod = CoreServiceGrpc.getAddQuizQuestionMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAddQuizQuestionMethod = CoreServiceGrpc.getAddQuizQuestionMethod) == null) {
          CoreServiceGrpc.getAddQuizQuestionMethod = getAddQuizQuestionMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.AddQuizQuestionRequest, org.archi.common.core.AddQuizQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddQuizQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.AddQuizQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.AddQuizQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("AddQuizQuestion"))
              .build();
        }
      }
    }
    return getAddQuizQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateQuizQuestionRequest,
      org.archi.common.core.UpdateQuizQuestionResponse> getUpdateQuizQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateQuizQuestion",
      requestType = org.archi.common.core.UpdateQuizQuestionRequest.class,
      responseType = org.archi.common.core.UpdateQuizQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateQuizQuestionRequest,
      org.archi.common.core.UpdateQuizQuestionResponse> getUpdateQuizQuestionMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateQuizQuestionRequest, org.archi.common.core.UpdateQuizQuestionResponse> getUpdateQuizQuestionMethod;
    if ((getUpdateQuizQuestionMethod = CoreServiceGrpc.getUpdateQuizQuestionMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateQuizQuestionMethod = CoreServiceGrpc.getUpdateQuizQuestionMethod) == null) {
          CoreServiceGrpc.getUpdateQuizQuestionMethod = getUpdateQuizQuestionMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateQuizQuestionRequest, org.archi.common.core.UpdateQuizQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQuizQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateQuizQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdateQuizQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("UpdateQuizQuestion"))
              .build();
        }
      }
    }
    return getUpdateQuizQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.DeleteQuizQuestionRequest,
      org.archi.common.core.DeleteQuizQuestionResponse> getDeleteQuizQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteQuizQuestion",
      requestType = org.archi.common.core.DeleteQuizQuestionRequest.class,
      responseType = org.archi.common.core.DeleteQuizQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.DeleteQuizQuestionRequest,
      org.archi.common.core.DeleteQuizQuestionResponse> getDeleteQuizQuestionMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.DeleteQuizQuestionRequest, org.archi.common.core.DeleteQuizQuestionResponse> getDeleteQuizQuestionMethod;
    if ((getDeleteQuizQuestionMethod = CoreServiceGrpc.getDeleteQuizQuestionMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getDeleteQuizQuestionMethod = CoreServiceGrpc.getDeleteQuizQuestionMethod) == null) {
          CoreServiceGrpc.getDeleteQuizQuestionMethod = getDeleteQuizQuestionMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.DeleteQuizQuestionRequest, org.archi.common.core.DeleteQuizQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteQuizQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.DeleteQuizQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.DeleteQuizQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("DeleteQuizQuestion"))
              .build();
        }
      }
    }
    return getDeleteQuizQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.PostCreatePuzzleRequest,
      org.archi.common.core.PostCreatePuzzleResponse> getPostCreatePuzzleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostCreatePuzzle",
      requestType = org.archi.common.core.PostCreatePuzzleRequest.class,
      responseType = org.archi.common.core.PostCreatePuzzleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.PostCreatePuzzleRequest,
      org.archi.common.core.PostCreatePuzzleResponse> getPostCreatePuzzleMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.PostCreatePuzzleRequest, org.archi.common.core.PostCreatePuzzleResponse> getPostCreatePuzzleMethod;
    if ((getPostCreatePuzzleMethod = CoreServiceGrpc.getPostCreatePuzzleMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getPostCreatePuzzleMethod = CoreServiceGrpc.getPostCreatePuzzleMethod) == null) {
          CoreServiceGrpc.getPostCreatePuzzleMethod = getPostCreatePuzzleMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.PostCreatePuzzleRequest, org.archi.common.core.PostCreatePuzzleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostCreatePuzzle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.PostCreatePuzzleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.PostCreatePuzzleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("PostCreatePuzzle"))
              .build();
        }
      }
    }
    return getPostCreatePuzzleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetPuzzleRequest,
      org.archi.common.core.GetPuzzleResponse> getGetPuzzleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPuzzle",
      requestType = org.archi.common.core.GetPuzzleRequest.class,
      responseType = org.archi.common.core.GetPuzzleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetPuzzleRequest,
      org.archi.common.core.GetPuzzleResponse> getGetPuzzleMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetPuzzleRequest, org.archi.common.core.GetPuzzleResponse> getGetPuzzleMethod;
    if ((getGetPuzzleMethod = CoreServiceGrpc.getGetPuzzleMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetPuzzleMethod = CoreServiceGrpc.getGetPuzzleMethod) == null) {
          CoreServiceGrpc.getGetPuzzleMethod = getGetPuzzleMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetPuzzleRequest, org.archi.common.core.GetPuzzleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPuzzle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetPuzzleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetPuzzleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetPuzzle"))
              .build();
        }
      }
    }
    return getGetPuzzleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetPuzzlesRequest,
      org.archi.common.core.GetPuzzlesResponse> getGetPuzzlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPuzzles",
      requestType = org.archi.common.core.GetPuzzlesRequest.class,
      responseType = org.archi.common.core.GetPuzzlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetPuzzlesRequest,
      org.archi.common.core.GetPuzzlesResponse> getGetPuzzlesMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetPuzzlesRequest, org.archi.common.core.GetPuzzlesResponse> getGetPuzzlesMethod;
    if ((getGetPuzzlesMethod = CoreServiceGrpc.getGetPuzzlesMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetPuzzlesMethod = CoreServiceGrpc.getGetPuzzlesMethod) == null) {
          CoreServiceGrpc.getGetPuzzlesMethod = getGetPuzzlesMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetPuzzlesRequest, org.archi.common.core.GetPuzzlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPuzzles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetPuzzlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetPuzzlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetPuzzles"))
              .build();
        }
      }
    }
    return getGetPuzzlesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdatePuzzleRequest,
      org.archi.common.core.UpdatePuzzleResponse> getUpdatePuzzleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePuzzle",
      requestType = org.archi.common.core.UpdatePuzzleRequest.class,
      responseType = org.archi.common.core.UpdatePuzzleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdatePuzzleRequest,
      org.archi.common.core.UpdatePuzzleResponse> getUpdatePuzzleMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdatePuzzleRequest, org.archi.common.core.UpdatePuzzleResponse> getUpdatePuzzleMethod;
    if ((getUpdatePuzzleMethod = CoreServiceGrpc.getUpdatePuzzleMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdatePuzzleMethod = CoreServiceGrpc.getUpdatePuzzleMethod) == null) {
          CoreServiceGrpc.getUpdatePuzzleMethod = getUpdatePuzzleMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdatePuzzleRequest, org.archi.common.core.UpdatePuzzleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePuzzle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdatePuzzleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdatePuzzleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("UpdatePuzzle"))
              .build();
        }
      }
    }
    return getUpdatePuzzleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.CreatePieceRequest,
      org.archi.common.core.CreatePieceResponse> getCreatePieceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePiece",
      requestType = org.archi.common.core.CreatePieceRequest.class,
      responseType = org.archi.common.core.CreatePieceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.CreatePieceRequest,
      org.archi.common.core.CreatePieceResponse> getCreatePieceMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.CreatePieceRequest, org.archi.common.core.CreatePieceResponse> getCreatePieceMethod;
    if ((getCreatePieceMethod = CoreServiceGrpc.getCreatePieceMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getCreatePieceMethod = CoreServiceGrpc.getCreatePieceMethod) == null) {
          CoreServiceGrpc.getCreatePieceMethod = getCreatePieceMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.CreatePieceRequest, org.archi.common.core.CreatePieceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePiece"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreatePieceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreatePieceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("CreatePiece"))
              .build();
        }
      }
    }
    return getCreatePieceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetPieceRequest,
      org.archi.common.core.GetPieceResponse> getGetPieceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPiece",
      requestType = org.archi.common.core.GetPieceRequest.class,
      responseType = org.archi.common.core.GetPieceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetPieceRequest,
      org.archi.common.core.GetPieceResponse> getGetPieceMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetPieceRequest, org.archi.common.core.GetPieceResponse> getGetPieceMethod;
    if ((getGetPieceMethod = CoreServiceGrpc.getGetPieceMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetPieceMethod = CoreServiceGrpc.getGetPieceMethod) == null) {
          CoreServiceGrpc.getGetPieceMethod = getGetPieceMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetPieceRequest, org.archi.common.core.GetPieceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPiece"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetPieceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetPieceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetPiece"))
              .build();
        }
      }
    }
    return getGetPieceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdatePieceRequest,
      org.archi.common.core.UpdatePieceResponse> getUpdatePieceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePiece",
      requestType = org.archi.common.core.UpdatePieceRequest.class,
      responseType = org.archi.common.core.UpdatePieceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdatePieceRequest,
      org.archi.common.core.UpdatePieceResponse> getUpdatePieceMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdatePieceRequest, org.archi.common.core.UpdatePieceResponse> getUpdatePieceMethod;
    if ((getUpdatePieceMethod = CoreServiceGrpc.getUpdatePieceMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdatePieceMethod = CoreServiceGrpc.getUpdatePieceMethod) == null) {
          CoreServiceGrpc.getUpdatePieceMethod = getUpdatePieceMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdatePieceRequest, org.archi.common.core.UpdatePieceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePiece"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdatePieceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.UpdatePieceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("UpdatePiece"))
              .build();
        }
      }
    }
    return getUpdatePieceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.DeletePieceRequest,
      org.archi.common.core.DeletePieceResponse> getDeletePieceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePiece",
      requestType = org.archi.common.core.DeletePieceRequest.class,
      responseType = org.archi.common.core.DeletePieceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.DeletePieceRequest,
      org.archi.common.core.DeletePieceResponse> getDeletePieceMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.DeletePieceRequest, org.archi.common.core.DeletePieceResponse> getDeletePieceMethod;
    if ((getDeletePieceMethod = CoreServiceGrpc.getDeletePieceMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getDeletePieceMethod = CoreServiceGrpc.getDeletePieceMethod) == null) {
          CoreServiceGrpc.getDeletePieceMethod = getDeletePieceMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.DeletePieceRequest, org.archi.common.core.DeletePieceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePiece"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.DeletePieceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.DeletePieceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("DeletePiece"))
              .build();
        }
      }
    }
    return getDeletePieceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetAllPiecesRequest,
      org.archi.common.core.GetAllPiecesResponse> getGetAllPiecesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPieces",
      requestType = org.archi.common.core.GetAllPiecesRequest.class,
      responseType = org.archi.common.core.GetAllPiecesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetAllPiecesRequest,
      org.archi.common.core.GetAllPiecesResponse> getGetAllPiecesMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetAllPiecesRequest, org.archi.common.core.GetAllPiecesResponse> getGetAllPiecesMethod;
    if ((getGetAllPiecesMethod = CoreServiceGrpc.getGetAllPiecesMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetAllPiecesMethod = CoreServiceGrpc.getGetAllPiecesMethod) == null) {
          CoreServiceGrpc.getGetAllPiecesMethod = getGetAllPiecesMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetAllPiecesRequest, org.archi.common.core.GetAllPiecesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllPieces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetAllPiecesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetAllPiecesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetAllPieces"))
              .build();
        }
      }
    }
    return getGetAllPiecesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetAllPiecePlayersRequest,
      org.archi.common.core.GetAllPiecePlayersResponse> getGetAllPiecePlayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPiecePlayers",
      requestType = org.archi.common.core.GetAllPiecePlayersRequest.class,
      responseType = org.archi.common.core.GetAllPiecePlayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetAllPiecePlayersRequest,
      org.archi.common.core.GetAllPiecePlayersResponse> getGetAllPiecePlayersMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetAllPiecePlayersRequest, org.archi.common.core.GetAllPiecePlayersResponse> getGetAllPiecePlayersMethod;
    if ((getGetAllPiecePlayersMethod = CoreServiceGrpc.getGetAllPiecePlayersMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetAllPiecePlayersMethod = CoreServiceGrpc.getGetAllPiecePlayersMethod) == null) {
          CoreServiceGrpc.getGetAllPiecePlayersMethod = getGetAllPiecePlayersMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetAllPiecePlayersRequest, org.archi.common.core.GetAllPiecePlayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllPiecePlayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetAllPiecePlayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetAllPiecePlayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetAllPiecePlayers"))
              .build();
        }
      }
    }
    return getGetAllPiecePlayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.TransferPieceRequest,
      org.archi.common.core.TransferPieceResponse> getTransferPieceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferPiece",
      requestType = org.archi.common.core.TransferPieceRequest.class,
      responseType = org.archi.common.core.TransferPieceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.TransferPieceRequest,
      org.archi.common.core.TransferPieceResponse> getTransferPieceMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.TransferPieceRequest, org.archi.common.core.TransferPieceResponse> getTransferPieceMethod;
    if ((getTransferPieceMethod = CoreServiceGrpc.getTransferPieceMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getTransferPieceMethod = CoreServiceGrpc.getTransferPieceMethod) == null) {
          CoreServiceGrpc.getTransferPieceMethod = getTransferPieceMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.TransferPieceRequest, org.archi.common.core.TransferPieceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferPiece"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.TransferPieceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.TransferPieceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("TransferPiece"))
              .build();
        }
      }
    }
    return getTransferPieceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetGameTurnsRequest,
      org.archi.common.core.GetGameTurnsResponse> getGetGameTurnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGameTurns",
      requestType = org.archi.common.core.GetGameTurnsRequest.class,
      responseType = org.archi.common.core.GetGameTurnsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetGameTurnsRequest,
      org.archi.common.core.GetGameTurnsResponse> getGetGameTurnsMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetGameTurnsRequest, org.archi.common.core.GetGameTurnsResponse> getGetGameTurnsMethod;
    if ((getGetGameTurnsMethod = CoreServiceGrpc.getGetGameTurnsMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetGameTurnsMethod = CoreServiceGrpc.getGetGameTurnsMethod) == null) {
          CoreServiceGrpc.getGetGameTurnsMethod = getGetGameTurnsMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetGameTurnsRequest, org.archi.common.core.GetGameTurnsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGameTurns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetGameTurnsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetGameTurnsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetGameTurns"))
              .build();
        }
      }
    }
    return getGetGameTurnsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.TransferGameTurnRequest,
      org.archi.common.core.TransferGameTurnResponse> getTransferGameTurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferGameTurn",
      requestType = org.archi.common.core.TransferGameTurnRequest.class,
      responseType = org.archi.common.core.TransferGameTurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.TransferGameTurnRequest,
      org.archi.common.core.TransferGameTurnResponse> getTransferGameTurnMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.TransferGameTurnRequest, org.archi.common.core.TransferGameTurnResponse> getTransferGameTurnMethod;
    if ((getTransferGameTurnMethod = CoreServiceGrpc.getTransferGameTurnMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getTransferGameTurnMethod = CoreServiceGrpc.getTransferGameTurnMethod) == null) {
          CoreServiceGrpc.getTransferGameTurnMethod = getTransferGameTurnMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.TransferGameTurnRequest, org.archi.common.core.TransferGameTurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferGameTurn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.TransferGameTurnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.TransferGameTurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("TransferGameTurn"))
              .build();
        }
      }
    }
    return getTransferGameTurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.CreateGameTurnRequest,
      org.archi.common.core.CreateGameTurnResponse> getCreateGameTurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGameTurn",
      requestType = org.archi.common.core.CreateGameTurnRequest.class,
      responseType = org.archi.common.core.CreateGameTurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.CreateGameTurnRequest,
      org.archi.common.core.CreateGameTurnResponse> getCreateGameTurnMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.CreateGameTurnRequest, org.archi.common.core.CreateGameTurnResponse> getCreateGameTurnMethod;
    if ((getCreateGameTurnMethod = CoreServiceGrpc.getCreateGameTurnMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getCreateGameTurnMethod = CoreServiceGrpc.getCreateGameTurnMethod) == null) {
          CoreServiceGrpc.getCreateGameTurnMethod = getCreateGameTurnMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.CreateGameTurnRequest, org.archi.common.core.CreateGameTurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGameTurn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreateGameTurnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreateGameTurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("CreateGameTurn"))
              .build();
        }
      }
    }
    return getCreateGameTurnMethod;
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

    /**
     */
    default void getAllGameTypes(org.archi.common.core.GetAllGameTypesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGameTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllGameTypesMethod(), responseObserver);
    }

    /**
     */
    default void getGameTypeById(org.archi.common.core.GetGameTypeByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameTypeByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGameTypeByIdMethod(), responseObserver);
    }

    /**
     */
    default void addGameType(org.archi.common.core.AddGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGameTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddGameTypeMethod(), responseObserver);
    }

    /**
     */
    default void updateGameType(org.archi.common.core.UpdateGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGameTypeMethod(), responseObserver);
    }

    /**
     */
    default void deleteGameType(org.archi.common.core.DeleteGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteGameTypeMethod(), responseObserver);
    }

    /**
     */
    default void getAllGames(org.archi.common.core.GetAllGamesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGamesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllGamesMethod(), responseObserver);
    }

    /**
     */
    default void getGameById(org.archi.common.core.GetGameByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGameByIdMethod(), responseObserver);
    }

    /**
     */
    default void getGamesByCampaign(org.archi.common.core.GetGamesByCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGamesByCampaignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGamesByCampaignMethod(), responseObserver);
    }

    /**
     */
    default void addGame(org.archi.common.core.AddGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddGameMethod(), responseObserver);
    }

    /**
     */
    default void updateGame(org.archi.common.core.UpdateGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGameMethod(), responseObserver);
    }

    /**
     */
    default void deleteGame(org.archi.common.core.DeleteGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteGameMethod(), responseObserver);
    }

    /**
     */
    default void addGamePlayer(org.archi.common.core.AddGamePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGamePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddGamePlayerMethod(), responseObserver);
    }

    /**
     */
    default void hasWin(org.archi.common.core.HasWinRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.HasWinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHasWinMethod(), responseObserver);
    }

    /**
     */
    default void getWinItem(org.archi.common.core.GetWinItemRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetWinItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWinItemMethod(), responseObserver);
    }

    /**
     */
    default void getQuizQuestionById(org.archi.common.core.GetQuizQuestionByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuizQuestionByIdMethod(), responseObserver);
    }

    /**
     */
    default void getQuizQuestionsByGame(org.archi.common.core.GetQuizQuestionsByGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionsByGameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuizQuestionsByGameMethod(), responseObserver);
    }

    /**
     */
    default void addQuizQuestion(org.archi.common.core.AddQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddQuizQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddQuizQuestionMethod(), responseObserver);
    }

    /**
     */
    default void updateQuizQuestion(org.archi.common.core.UpdateQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateQuizQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateQuizQuestionMethod(), responseObserver);
    }

    /**
     */
    default void deleteQuizQuestion(org.archi.common.core.DeleteQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteQuizQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteQuizQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Puzzle 
     * </pre>
     */
    default void postCreatePuzzle(org.archi.common.core.PostCreatePuzzleRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.PostCreatePuzzleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostCreatePuzzleMethod(), responseObserver);
    }

    /**
     */
    default void getPuzzle(org.archi.common.core.GetPuzzleRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetPuzzleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPuzzleMethod(), responseObserver);
    }

    /**
     */
    default void getPuzzles(org.archi.common.core.GetPuzzlesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetPuzzlesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPuzzlesMethod(), responseObserver);
    }

    /**
     * <pre>
     * /Puzzle 
     * </pre>
     */
    default void updatePuzzle(org.archi.common.core.UpdatePuzzleRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdatePuzzleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePuzzleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Piece 
     * </pre>
     */
    default void createPiece(org.archi.common.core.CreatePieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreatePieceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePieceMethod(), responseObserver);
    }

    /**
     */
    default void getPiece(org.archi.common.core.GetPieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetPieceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPieceMethod(), responseObserver);
    }

    /**
     */
    default void updatePiece(org.archi.common.core.UpdatePieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdatePieceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePieceMethod(), responseObserver);
    }

    /**
     */
    default void deletePiece(org.archi.common.core.DeletePieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeletePieceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePieceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lấy toàn bộ mảnh của một puzzle.
     * </pre>
     */
    default void getAllPieces(org.archi.common.core.GetAllPiecesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllPiecesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPiecesMethod(), responseObserver);
    }

    /**
     * <pre>
     *Piece - Player
     * </pre>
     */
    default void getAllPiecePlayers(org.archi.common.core.GetAllPiecePlayersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllPiecePlayersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPiecePlayersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfer Piece
     * </pre>
     */
    default void transferPiece(org.archi.common.core.TransferPieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.TransferPieceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferPieceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Game turns
     * </pre>
     */
    default void getGameTurns(org.archi.common.core.GetGameTurnsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameTurnsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGameTurnsMethod(), responseObserver);
    }

    /**
     */
    default void transferGameTurn(org.archi.common.core.TransferGameTurnRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.TransferGameTurnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferGameTurnMethod(), responseObserver);
    }

    /**
     */
    default void createGameTurn(org.archi.common.core.CreateGameTurnRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateGameTurnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGameTurnMethod(), responseObserver);
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

    /**
     */
    public void getAllGameTypes(org.archi.common.core.GetAllGameTypesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGameTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllGameTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGameTypeById(org.archi.common.core.GetGameTypeByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameTypeByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGameTypeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGameType(org.archi.common.core.AddGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGameTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddGameTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGameType(org.archi.common.core.UpdateGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGameTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGameType(org.archi.common.core.DeleteGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteGameTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllGames(org.archi.common.core.GetAllGamesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGamesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllGamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGameById(org.archi.common.core.GetGameByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGameByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGamesByCampaign(org.archi.common.core.GetGamesByCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGamesByCampaignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGamesByCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGame(org.archi.common.core.AddGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGame(org.archi.common.core.UpdateGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGame(org.archi.common.core.DeleteGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGamePlayer(org.archi.common.core.AddGamePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGamePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddGamePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasWin(org.archi.common.core.HasWinRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.HasWinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHasWinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWinItem(org.archi.common.core.GetWinItemRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetWinItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWinItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuizQuestionById(org.archi.common.core.GetQuizQuestionByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQuizQuestionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuizQuestionsByGame(org.archi.common.core.GetQuizQuestionsByGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionsByGameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQuizQuestionsByGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addQuizQuestion(org.archi.common.core.AddQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddQuizQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddQuizQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateQuizQuestion(org.archi.common.core.UpdateQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateQuizQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateQuizQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteQuizQuestion(org.archi.common.core.DeleteQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteQuizQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteQuizQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Puzzle 
     * </pre>
     */
    public void postCreatePuzzle(org.archi.common.core.PostCreatePuzzleRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.PostCreatePuzzleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostCreatePuzzleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPuzzle(org.archi.common.core.GetPuzzleRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetPuzzleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPuzzleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPuzzles(org.archi.common.core.GetPuzzlesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetPuzzlesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPuzzlesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * /Puzzle 
     * </pre>
     */
    public void updatePuzzle(org.archi.common.core.UpdatePuzzleRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdatePuzzleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePuzzleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Piece 
     * </pre>
     */
    public void createPiece(org.archi.common.core.CreatePieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreatePieceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePieceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPiece(org.archi.common.core.GetPieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetPieceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPieceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePiece(org.archi.common.core.UpdatePieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdatePieceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePieceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePiece(org.archi.common.core.DeletePieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeletePieceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePieceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lấy toàn bộ mảnh của một puzzle.
     * </pre>
     */
    public void getAllPieces(org.archi.common.core.GetAllPiecesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllPiecesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllPiecesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Piece - Player
     * </pre>
     */
    public void getAllPiecePlayers(org.archi.common.core.GetAllPiecePlayersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllPiecePlayersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllPiecePlayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfer Piece
     * </pre>
     */
    public void transferPiece(org.archi.common.core.TransferPieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.TransferPieceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferPieceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Game turns
     * </pre>
     */
    public void getGameTurns(org.archi.common.core.GetGameTurnsRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameTurnsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGameTurnsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferGameTurn(org.archi.common.core.TransferGameTurnRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.TransferGameTurnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferGameTurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGameTurn(org.archi.common.core.CreateGameTurnRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreateGameTurnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGameTurnMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public org.archi.common.core.GetAllGameTypesResponse getAllGameTypes(org.archi.common.core.GetAllGameTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllGameTypesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetGameTypeByIdResponse getGameTypeById(org.archi.common.core.GetGameTypeByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGameTypeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.AddGameTypeResponse addGameType(org.archi.common.core.AddGameTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddGameTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateGameTypeResponse updateGameType(org.archi.common.core.UpdateGameTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGameTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.DeleteGameTypeResponse deleteGameType(org.archi.common.core.DeleteGameTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGameTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetAllGamesResponse getAllGames(org.archi.common.core.GetAllGamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllGamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetGameByIdResponse getGameById(org.archi.common.core.GetGameByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGameByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetGamesByCampaignResponse getGamesByCampaign(org.archi.common.core.GetGamesByCampaignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGamesByCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.AddGameResponse addGame(org.archi.common.core.AddGameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateGameResponse updateGame(org.archi.common.core.UpdateGameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.DeleteGameResponse deleteGame(org.archi.common.core.DeleteGameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.AddGamePlayerResponse addGamePlayer(org.archi.common.core.AddGamePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddGamePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.HasWinResponse hasWin(org.archi.common.core.HasWinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHasWinMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetWinItemResponse getWinItem(org.archi.common.core.GetWinItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWinItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetQuizQuestionByIdResponse getQuizQuestionById(org.archi.common.core.GetQuizQuestionByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQuizQuestionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetQuizQuestionsByGameResponse getQuizQuestionsByGame(org.archi.common.core.GetQuizQuestionsByGameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQuizQuestionsByGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.AddQuizQuestionResponse addQuizQuestion(org.archi.common.core.AddQuizQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddQuizQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateQuizQuestionResponse updateQuizQuestion(org.archi.common.core.UpdateQuizQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateQuizQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.DeleteQuizQuestionResponse deleteQuizQuestion(org.archi.common.core.DeleteQuizQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteQuizQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Puzzle 
     * </pre>
     */
    public org.archi.common.core.PostCreatePuzzleResponse postCreatePuzzle(org.archi.common.core.PostCreatePuzzleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostCreatePuzzleMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetPuzzleResponse getPuzzle(org.archi.common.core.GetPuzzleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPuzzleMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetPuzzlesResponse getPuzzles(org.archi.common.core.GetPuzzlesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPuzzlesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * /Puzzle 
     * </pre>
     */
    public org.archi.common.core.UpdatePuzzleResponse updatePuzzle(org.archi.common.core.UpdatePuzzleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePuzzleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Piece 
     * </pre>
     */
    public org.archi.common.core.CreatePieceResponse createPiece(org.archi.common.core.CreatePieceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePieceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetPieceResponse getPiece(org.archi.common.core.GetPieceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPieceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdatePieceResponse updatePiece(org.archi.common.core.UpdatePieceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePieceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.DeletePieceResponse deletePiece(org.archi.common.core.DeletePieceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePieceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lấy toàn bộ mảnh của một puzzle.
     * </pre>
     */
    public org.archi.common.core.GetAllPiecesResponse getAllPieces(org.archi.common.core.GetAllPiecesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllPiecesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Piece - Player
     * </pre>
     */
    public org.archi.common.core.GetAllPiecePlayersResponse getAllPiecePlayers(org.archi.common.core.GetAllPiecePlayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllPiecePlayersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfer Piece
     * </pre>
     */
    public org.archi.common.core.TransferPieceResponse transferPiece(org.archi.common.core.TransferPieceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferPieceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Game turns
     * </pre>
     */
    public org.archi.common.core.GetGameTurnsResponse getGameTurns(org.archi.common.core.GetGameTurnsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGameTurnsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.TransferGameTurnResponse transferGameTurn(org.archi.common.core.TransferGameTurnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferGameTurnMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.CreateGameTurnResponse createGameTurn(org.archi.common.core.CreateGameTurnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGameTurnMethod(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetAllGameTypesResponse> getAllGameTypes(
        org.archi.common.core.GetAllGameTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllGameTypesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetGameTypeByIdResponse> getGameTypeById(
        org.archi.common.core.GetGameTypeByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGameTypeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.AddGameTypeResponse> addGameType(
        org.archi.common.core.AddGameTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddGameTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateGameTypeResponse> updateGameType(
        org.archi.common.core.UpdateGameTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGameTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.DeleteGameTypeResponse> deleteGameType(
        org.archi.common.core.DeleteGameTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteGameTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetAllGamesResponse> getAllGames(
        org.archi.common.core.GetAllGamesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllGamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetGameByIdResponse> getGameById(
        org.archi.common.core.GetGameByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGameByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetGamesByCampaignResponse> getGamesByCampaign(
        org.archi.common.core.GetGamesByCampaignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGamesByCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.AddGameResponse> addGame(
        org.archi.common.core.AddGameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateGameResponse> updateGame(
        org.archi.common.core.UpdateGameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.DeleteGameResponse> deleteGame(
        org.archi.common.core.DeleteGameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.AddGamePlayerResponse> addGamePlayer(
        org.archi.common.core.AddGamePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddGamePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.HasWinResponse> hasWin(
        org.archi.common.core.HasWinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHasWinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetWinItemResponse> getWinItem(
        org.archi.common.core.GetWinItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWinItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetQuizQuestionByIdResponse> getQuizQuestionById(
        org.archi.common.core.GetQuizQuestionByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQuizQuestionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetQuizQuestionsByGameResponse> getQuizQuestionsByGame(
        org.archi.common.core.GetQuizQuestionsByGameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQuizQuestionsByGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.AddQuizQuestionResponse> addQuizQuestion(
        org.archi.common.core.AddQuizQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddQuizQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateQuizQuestionResponse> updateQuizQuestion(
        org.archi.common.core.UpdateQuizQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateQuizQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.DeleteQuizQuestionResponse> deleteQuizQuestion(
        org.archi.common.core.DeleteQuizQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteQuizQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Puzzle 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.PostCreatePuzzleResponse> postCreatePuzzle(
        org.archi.common.core.PostCreatePuzzleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostCreatePuzzleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetPuzzleResponse> getPuzzle(
        org.archi.common.core.GetPuzzleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPuzzleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetPuzzlesResponse> getPuzzles(
        org.archi.common.core.GetPuzzlesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPuzzlesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * /Puzzle 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdatePuzzleResponse> updatePuzzle(
        org.archi.common.core.UpdatePuzzleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePuzzleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Piece 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.CreatePieceResponse> createPiece(
        org.archi.common.core.CreatePieceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePieceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetPieceResponse> getPiece(
        org.archi.common.core.GetPieceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPieceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdatePieceResponse> updatePiece(
        org.archi.common.core.UpdatePieceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePieceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.DeletePieceResponse> deletePiece(
        org.archi.common.core.DeletePieceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePieceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lấy toàn bộ mảnh của một puzzle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetAllPiecesResponse> getAllPieces(
        org.archi.common.core.GetAllPiecesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllPiecesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Piece - Player
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetAllPiecePlayersResponse> getAllPiecePlayers(
        org.archi.common.core.GetAllPiecePlayersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllPiecePlayersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfer Piece
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.TransferPieceResponse> transferPiece(
        org.archi.common.core.TransferPieceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferPieceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Game turns
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetGameTurnsResponse> getGameTurns(
        org.archi.common.core.GetGameTurnsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGameTurnsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.TransferGameTurnResponse> transferGameTurn(
        org.archi.common.core.TransferGameTurnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferGameTurnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.CreateGameTurnResponse> createGameTurn(
        org.archi.common.core.CreateGameTurnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGameTurnMethod(), getCallOptions()), request);
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
  private static final int METHODID_GET_ALL_GAME_TYPES = 12;
  private static final int METHODID_GET_GAME_TYPE_BY_ID = 13;
  private static final int METHODID_ADD_GAME_TYPE = 14;
  private static final int METHODID_UPDATE_GAME_TYPE = 15;
  private static final int METHODID_DELETE_GAME_TYPE = 16;
  private static final int METHODID_GET_ALL_GAMES = 17;
  private static final int METHODID_GET_GAME_BY_ID = 18;
  private static final int METHODID_GET_GAMES_BY_CAMPAIGN = 19;
  private static final int METHODID_ADD_GAME = 20;
  private static final int METHODID_UPDATE_GAME = 21;
  private static final int METHODID_DELETE_GAME = 22;
  private static final int METHODID_ADD_GAME_PLAYER = 23;
  private static final int METHODID_HAS_WIN = 24;
  private static final int METHODID_GET_WIN_ITEM = 25;
  private static final int METHODID_GET_QUIZ_QUESTION_BY_ID = 26;
  private static final int METHODID_GET_QUIZ_QUESTIONS_BY_GAME = 27;
  private static final int METHODID_ADD_QUIZ_QUESTION = 28;
  private static final int METHODID_UPDATE_QUIZ_QUESTION = 29;
  private static final int METHODID_DELETE_QUIZ_QUESTION = 30;
  private static final int METHODID_POST_CREATE_PUZZLE = 31;
  private static final int METHODID_GET_PUZZLE = 32;
  private static final int METHODID_GET_PUZZLES = 33;
  private static final int METHODID_UPDATE_PUZZLE = 34;
  private static final int METHODID_CREATE_PIECE = 35;
  private static final int METHODID_GET_PIECE = 36;
  private static final int METHODID_UPDATE_PIECE = 37;
  private static final int METHODID_DELETE_PIECE = 38;
  private static final int METHODID_GET_ALL_PIECES = 39;
  private static final int METHODID_GET_ALL_PIECE_PLAYERS = 40;
  private static final int METHODID_TRANSFER_PIECE = 41;
  private static final int METHODID_GET_GAME_TURNS = 42;
  private static final int METHODID_TRANSFER_GAME_TURN = 43;
  private static final int METHODID_CREATE_GAME_TURN = 44;

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
        case METHODID_GET_ALL_GAME_TYPES:
          serviceImpl.getAllGameTypes((org.archi.common.core.GetAllGameTypesRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGameTypesResponse>) responseObserver);
          break;
        case METHODID_GET_GAME_TYPE_BY_ID:
          serviceImpl.getGameTypeById((org.archi.common.core.GetGameTypeByIdRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetGameTypeByIdResponse>) responseObserver);
          break;
        case METHODID_ADD_GAME_TYPE:
          serviceImpl.addGameType((org.archi.common.core.AddGameTypeRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.AddGameTypeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GAME_TYPE:
          serviceImpl.updateGameType((org.archi.common.core.UpdateGameTypeRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameTypeResponse>) responseObserver);
          break;
        case METHODID_DELETE_GAME_TYPE:
          serviceImpl.deleteGameType((org.archi.common.core.DeleteGameTypeRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameTypeResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_GAMES:
          serviceImpl.getAllGames((org.archi.common.core.GetAllGamesRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGamesResponse>) responseObserver);
          break;
        case METHODID_GET_GAME_BY_ID:
          serviceImpl.getGameById((org.archi.common.core.GetGameByIdRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetGameByIdResponse>) responseObserver);
          break;
        case METHODID_GET_GAMES_BY_CAMPAIGN:
          serviceImpl.getGamesByCampaign((org.archi.common.core.GetGamesByCampaignRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetGamesByCampaignResponse>) responseObserver);
          break;
        case METHODID_ADD_GAME:
          serviceImpl.addGame((org.archi.common.core.AddGameRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.AddGameResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GAME:
          serviceImpl.updateGame((org.archi.common.core.UpdateGameRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameResponse>) responseObserver);
          break;
        case METHODID_DELETE_GAME:
          serviceImpl.deleteGame((org.archi.common.core.DeleteGameRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameResponse>) responseObserver);
          break;
        case METHODID_ADD_GAME_PLAYER:
          serviceImpl.addGamePlayer((org.archi.common.core.AddGamePlayerRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.AddGamePlayerResponse>) responseObserver);
          break;
        case METHODID_HAS_WIN:
          serviceImpl.hasWin((org.archi.common.core.HasWinRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.HasWinResponse>) responseObserver);
          break;
        case METHODID_GET_WIN_ITEM:
          serviceImpl.getWinItem((org.archi.common.core.GetWinItemRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetWinItemResponse>) responseObserver);
          break;
        case METHODID_GET_QUIZ_QUESTION_BY_ID:
          serviceImpl.getQuizQuestionById((org.archi.common.core.GetQuizQuestionByIdRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionByIdResponse>) responseObserver);
          break;
        case METHODID_GET_QUIZ_QUESTIONS_BY_GAME:
          serviceImpl.getQuizQuestionsByGame((org.archi.common.core.GetQuizQuestionsByGameRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionsByGameResponse>) responseObserver);
          break;
        case METHODID_ADD_QUIZ_QUESTION:
          serviceImpl.addQuizQuestion((org.archi.common.core.AddQuizQuestionRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.AddQuizQuestionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_QUIZ_QUESTION:
          serviceImpl.updateQuizQuestion((org.archi.common.core.UpdateQuizQuestionRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.UpdateQuizQuestionResponse>) responseObserver);
          break;
        case METHODID_DELETE_QUIZ_QUESTION:
          serviceImpl.deleteQuizQuestion((org.archi.common.core.DeleteQuizQuestionRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.DeleteQuizQuestionResponse>) responseObserver);
          break;
        case METHODID_POST_CREATE_PUZZLE:
          serviceImpl.postCreatePuzzle((org.archi.common.core.PostCreatePuzzleRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.PostCreatePuzzleResponse>) responseObserver);
          break;
        case METHODID_GET_PUZZLE:
          serviceImpl.getPuzzle((org.archi.common.core.GetPuzzleRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetPuzzleResponse>) responseObserver);
          break;
        case METHODID_GET_PUZZLES:
          serviceImpl.getPuzzles((org.archi.common.core.GetPuzzlesRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetPuzzlesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PUZZLE:
          serviceImpl.updatePuzzle((org.archi.common.core.UpdatePuzzleRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.UpdatePuzzleResponse>) responseObserver);
          break;
        case METHODID_CREATE_PIECE:
          serviceImpl.createPiece((org.archi.common.core.CreatePieceRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.CreatePieceResponse>) responseObserver);
          break;
        case METHODID_GET_PIECE:
          serviceImpl.getPiece((org.archi.common.core.GetPieceRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetPieceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PIECE:
          serviceImpl.updatePiece((org.archi.common.core.UpdatePieceRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.UpdatePieceResponse>) responseObserver);
          break;
        case METHODID_DELETE_PIECE:
          serviceImpl.deletePiece((org.archi.common.core.DeletePieceRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.DeletePieceResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PIECES:
          serviceImpl.getAllPieces((org.archi.common.core.GetAllPiecesRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetAllPiecesResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PIECE_PLAYERS:
          serviceImpl.getAllPiecePlayers((org.archi.common.core.GetAllPiecePlayersRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetAllPiecePlayersResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_PIECE:
          serviceImpl.transferPiece((org.archi.common.core.TransferPieceRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.TransferPieceResponse>) responseObserver);
          break;
        case METHODID_GET_GAME_TURNS:
          serviceImpl.getGameTurns((org.archi.common.core.GetGameTurnsRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetGameTurnsResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_GAME_TURN:
          serviceImpl.transferGameTurn((org.archi.common.core.TransferGameTurnRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.TransferGameTurnResponse>) responseObserver);
          break;
        case METHODID_CREATE_GAME_TURN:
          serviceImpl.createGameTurn((org.archi.common.core.CreateGameTurnRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.CreateGameTurnResponse>) responseObserver);
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
        .addMethod(
          getGetAllGameTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetAllGameTypesRequest,
              org.archi.common.core.GetAllGameTypesResponse>(
                service, METHODID_GET_ALL_GAME_TYPES)))
        .addMethod(
          getGetGameTypeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetGameTypeByIdRequest,
              org.archi.common.core.GetGameTypeByIdResponse>(
                service, METHODID_GET_GAME_TYPE_BY_ID)))
        .addMethod(
          getAddGameTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.AddGameTypeRequest,
              org.archi.common.core.AddGameTypeResponse>(
                service, METHODID_ADD_GAME_TYPE)))
        .addMethod(
          getUpdateGameTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.UpdateGameTypeRequest,
              org.archi.common.core.UpdateGameTypeResponse>(
                service, METHODID_UPDATE_GAME_TYPE)))
        .addMethod(
          getDeleteGameTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.DeleteGameTypeRequest,
              org.archi.common.core.DeleteGameTypeResponse>(
                service, METHODID_DELETE_GAME_TYPE)))
        .addMethod(
          getGetAllGamesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetAllGamesRequest,
              org.archi.common.core.GetAllGamesResponse>(
                service, METHODID_GET_ALL_GAMES)))
        .addMethod(
          getGetGameByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetGameByIdRequest,
              org.archi.common.core.GetGameByIdResponse>(
                service, METHODID_GET_GAME_BY_ID)))
        .addMethod(
          getGetGamesByCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetGamesByCampaignRequest,
              org.archi.common.core.GetGamesByCampaignResponse>(
                service, METHODID_GET_GAMES_BY_CAMPAIGN)))
        .addMethod(
          getAddGameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.AddGameRequest,
              org.archi.common.core.AddGameResponse>(
                service, METHODID_ADD_GAME)))
        .addMethod(
          getUpdateGameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.UpdateGameRequest,
              org.archi.common.core.UpdateGameResponse>(
                service, METHODID_UPDATE_GAME)))
        .addMethod(
          getDeleteGameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.DeleteGameRequest,
              org.archi.common.core.DeleteGameResponse>(
                service, METHODID_DELETE_GAME)))
        .addMethod(
          getAddGamePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.AddGamePlayerRequest,
              org.archi.common.core.AddGamePlayerResponse>(
                service, METHODID_ADD_GAME_PLAYER)))
        .addMethod(
          getHasWinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.HasWinRequest,
              org.archi.common.core.HasWinResponse>(
                service, METHODID_HAS_WIN)))
        .addMethod(
          getGetWinItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetWinItemRequest,
              org.archi.common.core.GetWinItemResponse>(
                service, METHODID_GET_WIN_ITEM)))
        .addMethod(
          getGetQuizQuestionByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetQuizQuestionByIdRequest,
              org.archi.common.core.GetQuizQuestionByIdResponse>(
                service, METHODID_GET_QUIZ_QUESTION_BY_ID)))
        .addMethod(
          getGetQuizQuestionsByGameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetQuizQuestionsByGameRequest,
              org.archi.common.core.GetQuizQuestionsByGameResponse>(
                service, METHODID_GET_QUIZ_QUESTIONS_BY_GAME)))
        .addMethod(
          getAddQuizQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.AddQuizQuestionRequest,
              org.archi.common.core.AddQuizQuestionResponse>(
                service, METHODID_ADD_QUIZ_QUESTION)))
        .addMethod(
          getUpdateQuizQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.UpdateQuizQuestionRequest,
              org.archi.common.core.UpdateQuizQuestionResponse>(
                service, METHODID_UPDATE_QUIZ_QUESTION)))
        .addMethod(
          getDeleteQuizQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.DeleteQuizQuestionRequest,
              org.archi.common.core.DeleteQuizQuestionResponse>(
                service, METHODID_DELETE_QUIZ_QUESTION)))
        .addMethod(
          getPostCreatePuzzleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.PostCreatePuzzleRequest,
              org.archi.common.core.PostCreatePuzzleResponse>(
                service, METHODID_POST_CREATE_PUZZLE)))
        .addMethod(
          getGetPuzzleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetPuzzleRequest,
              org.archi.common.core.GetPuzzleResponse>(
                service, METHODID_GET_PUZZLE)))
        .addMethod(
          getGetPuzzlesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetPuzzlesRequest,
              org.archi.common.core.GetPuzzlesResponse>(
                service, METHODID_GET_PUZZLES)))
        .addMethod(
          getUpdatePuzzleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.UpdatePuzzleRequest,
              org.archi.common.core.UpdatePuzzleResponse>(
                service, METHODID_UPDATE_PUZZLE)))
        .addMethod(
          getCreatePieceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.CreatePieceRequest,
              org.archi.common.core.CreatePieceResponse>(
                service, METHODID_CREATE_PIECE)))
        .addMethod(
          getGetPieceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetPieceRequest,
              org.archi.common.core.GetPieceResponse>(
                service, METHODID_GET_PIECE)))
        .addMethod(
          getUpdatePieceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.UpdatePieceRequest,
              org.archi.common.core.UpdatePieceResponse>(
                service, METHODID_UPDATE_PIECE)))
        .addMethod(
          getDeletePieceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.DeletePieceRequest,
              org.archi.common.core.DeletePieceResponse>(
                service, METHODID_DELETE_PIECE)))
        .addMethod(
          getGetAllPiecesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetAllPiecesRequest,
              org.archi.common.core.GetAllPiecesResponse>(
                service, METHODID_GET_ALL_PIECES)))
        .addMethod(
          getGetAllPiecePlayersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetAllPiecePlayersRequest,
              org.archi.common.core.GetAllPiecePlayersResponse>(
                service, METHODID_GET_ALL_PIECE_PLAYERS)))
        .addMethod(
          getTransferPieceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.TransferPieceRequest,
              org.archi.common.core.TransferPieceResponse>(
                service, METHODID_TRANSFER_PIECE)))
        .addMethod(
          getGetGameTurnsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetGameTurnsRequest,
              org.archi.common.core.GetGameTurnsResponse>(
                service, METHODID_GET_GAME_TURNS)))
        .addMethod(
          getTransferGameTurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.TransferGameTurnRequest,
              org.archi.common.core.TransferGameTurnResponse>(
                service, METHODID_TRANSFER_GAME_TURN)))
        .addMethod(
          getCreateGameTurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.CreateGameTurnRequest,
              org.archi.common.core.CreateGameTurnResponse>(
                service, METHODID_CREATE_GAME_TURN)))
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
              .addMethod(getGetAllGameTypesMethod())
              .addMethod(getGetGameTypeByIdMethod())
              .addMethod(getAddGameTypeMethod())
              .addMethod(getUpdateGameTypeMethod())
              .addMethod(getDeleteGameTypeMethod())
              .addMethod(getGetAllGamesMethod())
              .addMethod(getGetGameByIdMethod())
              .addMethod(getGetGamesByCampaignMethod())
              .addMethod(getAddGameMethod())
              .addMethod(getUpdateGameMethod())
              .addMethod(getDeleteGameMethod())
              .addMethod(getAddGamePlayerMethod())
              .addMethod(getHasWinMethod())
              .addMethod(getGetWinItemMethod())
              .addMethod(getGetQuizQuestionByIdMethod())
              .addMethod(getGetQuizQuestionsByGameMethod())
              .addMethod(getAddQuizQuestionMethod())
              .addMethod(getUpdateQuizQuestionMethod())
              .addMethod(getDeleteQuizQuestionMethod())
              .addMethod(getPostCreatePuzzleMethod())
              .addMethod(getGetPuzzleMethod())
              .addMethod(getGetPuzzlesMethod())
              .addMethod(getUpdatePuzzleMethod())
              .addMethod(getCreatePieceMethod())
              .addMethod(getGetPieceMethod())
              .addMethod(getUpdatePieceMethod())
              .addMethod(getDeletePieceMethod())
              .addMethod(getGetAllPiecesMethod())
              .addMethod(getGetAllPiecePlayersMethod())
              .addMethod(getTransferPieceMethod())
              .addMethod(getGetGameTurnsMethod())
              .addMethod(getTransferGameTurnMethod())
              .addMethod(getCreateGameTurnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
