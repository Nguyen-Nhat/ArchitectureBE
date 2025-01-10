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

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetRandomPieceRequest,
      org.archi.common.core.GetRandomPieceResponse> getGetRandomPieceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRandomPiece",
      requestType = org.archi.common.core.GetRandomPieceRequest.class,
      responseType = org.archi.common.core.GetRandomPieceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetRandomPieceRequest,
      org.archi.common.core.GetRandomPieceResponse> getGetRandomPieceMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetRandomPieceRequest, org.archi.common.core.GetRandomPieceResponse> getGetRandomPieceMethod;
    if ((getGetRandomPieceMethod = CoreServiceGrpc.getGetRandomPieceMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetRandomPieceMethod = CoreServiceGrpc.getGetRandomPieceMethod) == null) {
          CoreServiceGrpc.getGetRandomPieceMethod = getGetRandomPieceMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.GetRandomPieceRequest, org.archi.common.core.GetRandomPieceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRandomPiece"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetRandomPieceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.GetRandomPieceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetRandomPiece"))
              .build();
        }
      }
    }
    return getGetRandomPieceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.CreatePiecePlayerRequest,
      org.archi.common.core.CreatePiecePlayerResponse> getCreatePiecePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePiecePlayer",
      requestType = org.archi.common.core.CreatePiecePlayerRequest.class,
      responseType = org.archi.common.core.CreatePiecePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.archi.common.core.CreatePiecePlayerRequest,
      org.archi.common.core.CreatePiecePlayerResponse> getCreatePiecePlayerMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.CreatePiecePlayerRequest, org.archi.common.core.CreatePiecePlayerResponse> getCreatePiecePlayerMethod;
    if ((getCreatePiecePlayerMethod = CoreServiceGrpc.getCreatePiecePlayerMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getCreatePiecePlayerMethod = CoreServiceGrpc.getCreatePiecePlayerMethod) == null) {
          CoreServiceGrpc.getCreatePiecePlayerMethod = getCreatePiecePlayerMethod =
              io.grpc.MethodDescriptor.<org.archi.common.core.CreatePiecePlayerRequest, org.archi.common.core.CreatePiecePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePiecePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreatePiecePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.archi.common.core.CreatePiecePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("CreatePiecePlayer"))
              .build();
        }
      }
    }
    return getCreatePiecePlayerMethod;
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
     * Random Piece 
     * </pre>
     */
    default void getRandomPiece(org.archi.common.core.GetRandomPieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetRandomPieceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRandomPieceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Piece - Player
     * </pre>
     */
    default void createPiecePlayer(org.archi.common.core.CreatePiecePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreatePiecePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePiecePlayerMethod(), responseObserver);
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
     * Random Piece 
     * </pre>
     */
    public void getRandomPiece(org.archi.common.core.GetRandomPieceRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetRandomPieceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRandomPieceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Piece - Player
     * </pre>
     */
    public void createPiecePlayer(org.archi.common.core.CreatePiecePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.CreatePiecePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePiecePlayerMethod(), getCallOptions()), request, responseObserver);
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
     * Random Piece 
     * </pre>
     */
    public org.archi.common.core.GetRandomPieceResponse getRandomPiece(org.archi.common.core.GetRandomPieceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRandomPieceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Piece - Player
     * </pre>
     */
    public org.archi.common.core.CreatePiecePlayerResponse createPiecePlayer(org.archi.common.core.CreatePiecePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePiecePlayerMethod(), getCallOptions(), request);
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
     * Random Piece 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetRandomPieceResponse> getRandomPiece(
        org.archi.common.core.GetRandomPieceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRandomPieceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Piece - Player
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.CreatePiecePlayerResponse> createPiecePlayer(
        org.archi.common.core.CreatePiecePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePiecePlayerMethod(), getCallOptions()), request);
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
  private static final int METHODID_POST_CREATE_PUZZLE = 12;
  private static final int METHODID_GET_PUZZLE = 13;
  private static final int METHODID_GET_PUZZLES = 14;
  private static final int METHODID_UPDATE_PUZZLE = 15;
  private static final int METHODID_CREATE_PIECE = 16;
  private static final int METHODID_GET_PIECE = 17;
  private static final int METHODID_UPDATE_PIECE = 18;
  private static final int METHODID_DELETE_PIECE = 19;
  private static final int METHODID_GET_ALL_PIECES = 20;
  private static final int METHODID_GET_RANDOM_PIECE = 21;
  private static final int METHODID_CREATE_PIECE_PLAYER = 22;
  private static final int METHODID_GET_ALL_PIECE_PLAYERS = 23;
  private static final int METHODID_TRANSFER_PIECE = 24;
  private static final int METHODID_GET_GAME_TURNS = 25;
  private static final int METHODID_TRANSFER_GAME_TURN = 26;

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
        case METHODID_GET_RANDOM_PIECE:
          serviceImpl.getRandomPiece((org.archi.common.core.GetRandomPieceRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.GetRandomPieceResponse>) responseObserver);
          break;
        case METHODID_CREATE_PIECE_PLAYER:
          serviceImpl.createPiecePlayer((org.archi.common.core.CreatePiecePlayerRequest) request,
              (io.grpc.stub.StreamObserver<org.archi.common.core.CreatePiecePlayerResponse>) responseObserver);
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
          getGetRandomPieceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.GetRandomPieceRequest,
              org.archi.common.core.GetRandomPieceResponse>(
                service, METHODID_GET_RANDOM_PIECE)))
        .addMethod(
          getCreatePiecePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.archi.common.core.CreatePiecePlayerRequest,
              org.archi.common.core.CreatePiecePlayerResponse>(
                service, METHODID_CREATE_PIECE_PLAYER)))
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
              .addMethod(getPostCreatePuzzleMethod())
              .addMethod(getGetPuzzleMethod())
              .addMethod(getGetPuzzlesMethod())
              .addMethod(getUpdatePuzzleMethod())
              .addMethod(getCreatePieceMethod())
              .addMethod(getGetPieceMethod())
              .addMethod(getUpdatePieceMethod())
              .addMethod(getDeletePieceMethod())
              .addMethod(getGetAllPiecesMethod())
              .addMethod(getGetRandomPieceMethod())
              .addMethod(getCreatePiecePlayerMethod())
              .addMethod(getGetAllPiecePlayersMethod())
              .addMethod(getTransferPieceMethod())
              .addMethod(getGetGameTurnsMethod())
              .addMethod(getTransferGameTurnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
