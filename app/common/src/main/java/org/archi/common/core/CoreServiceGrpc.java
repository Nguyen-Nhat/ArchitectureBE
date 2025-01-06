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
  @java.lang.Deprecated // Use {@link #getSearchVoucherMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherResponse> METHOD_SEARCH_VOUCHER = getSearchVoucherMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherResponse> getSearchVoucherMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherResponse> getSearchVoucherMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest, org.archi.common.core.SearchVoucherResponse> getSearchVoucherMethod;
    if ((getSearchVoucherMethod = CoreServiceGrpc.getSearchVoucherMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getSearchVoucherMethod = CoreServiceGrpc.getSearchVoucherMethod) == null) {
          CoreServiceGrpc.getSearchVoucherMethod = getSearchVoucherMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.SearchRequest, org.archi.common.core.SearchVoucherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "SearchVoucher"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchVoucherTypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherTypeResponse> METHOD_SEARCH_VOUCHER_TYPE = getSearchVoucherTypeMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherTypeResponse> getSearchVoucherTypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest,
      org.archi.common.core.SearchVoucherTypeResponse> getSearchVoucherTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.SearchRequest, org.archi.common.core.SearchVoucherTypeResponse> getSearchVoucherTypeMethod;
    if ((getSearchVoucherTypeMethod = CoreServiceGrpc.getSearchVoucherTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getSearchVoucherTypeMethod = CoreServiceGrpc.getSearchVoucherTypeMethod) == null) {
          CoreServiceGrpc.getSearchVoucherTypeMethod = getSearchVoucherTypeMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.SearchRequest, org.archi.common.core.SearchVoucherTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "SearchVoucherType"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateVoucherTypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.UpdateVoucherTypeReq,
      org.archi.common.core.UpdateVoucherTypeRes> METHOD_UPDATE_VOUCHER_TYPE = getUpdateVoucherTypeMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateVoucherTypeReq,
      org.archi.common.core.UpdateVoucherTypeRes> getUpdateVoucherTypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateVoucherTypeReq,
      org.archi.common.core.UpdateVoucherTypeRes> getUpdateVoucherTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateVoucherTypeReq, org.archi.common.core.UpdateVoucherTypeRes> getUpdateVoucherTypeMethod;
    if ((getUpdateVoucherTypeMethod = CoreServiceGrpc.getUpdateVoucherTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateVoucherTypeMethod = CoreServiceGrpc.getUpdateVoucherTypeMethod) == null) {
          CoreServiceGrpc.getUpdateVoucherTypeMethod = getUpdateVoucherTypeMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateVoucherTypeReq, org.archi.common.core.UpdateVoucherTypeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "UpdateVoucherType"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetVouchersTypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetVoucherTypesReq,
      org.archi.common.core.GetVoucherTypesRes> METHOD_GET_VOUCHERS_TYPE = getGetVouchersTypeMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetVoucherTypesReq,
      org.archi.common.core.GetVoucherTypesRes> getGetVouchersTypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetVoucherTypesReq,
      org.archi.common.core.GetVoucherTypesRes> getGetVouchersTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetVoucherTypesReq, org.archi.common.core.GetVoucherTypesRes> getGetVouchersTypeMethod;
    if ((getGetVouchersTypeMethod = CoreServiceGrpc.getGetVouchersTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetVouchersTypeMethod = CoreServiceGrpc.getGetVouchersTypeMethod) == null) {
          CoreServiceGrpc.getGetVouchersTypeMethod = getGetVouchersTypeMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetVoucherTypesReq, org.archi.common.core.GetVoucherTypesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetVouchersType"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllGameTypesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetAllGameTypesRequest,
      org.archi.common.core.GetAllGameTypesResponse> METHOD_GET_ALL_GAME_TYPES = getGetAllGameTypesMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetAllGameTypesRequest,
      org.archi.common.core.GetAllGameTypesResponse> getGetAllGameTypesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetAllGameTypesRequest,
      org.archi.common.core.GetAllGameTypesResponse> getGetAllGameTypesMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetAllGameTypesRequest, org.archi.common.core.GetAllGameTypesResponse> getGetAllGameTypesMethod;
    if ((getGetAllGameTypesMethod = CoreServiceGrpc.getGetAllGameTypesMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetAllGameTypesMethod = CoreServiceGrpc.getGetAllGameTypesMethod) == null) {
          CoreServiceGrpc.getGetAllGameTypesMethod = getGetAllGameTypesMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetAllGameTypesRequest, org.archi.common.core.GetAllGameTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetAllGameTypes"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGameTypeByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetGameTypeByIdRequest,
      org.archi.common.core.GetGameTypeByIdResponse> METHOD_GET_GAME_TYPE_BY_ID = getGetGameTypeByIdMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetGameTypeByIdRequest,
      org.archi.common.core.GetGameTypeByIdResponse> getGetGameTypeByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetGameTypeByIdRequest,
      org.archi.common.core.GetGameTypeByIdResponse> getGetGameTypeByIdMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetGameTypeByIdRequest, org.archi.common.core.GetGameTypeByIdResponse> getGetGameTypeByIdMethod;
    if ((getGetGameTypeByIdMethod = CoreServiceGrpc.getGetGameTypeByIdMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetGameTypeByIdMethod = CoreServiceGrpc.getGetGameTypeByIdMethod) == null) {
          CoreServiceGrpc.getGetGameTypeByIdMethod = getGetGameTypeByIdMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetGameTypeByIdRequest, org.archi.common.core.GetGameTypeByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetGameTypeById"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddGameTypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.AddGameTypeRequest,
      org.archi.common.core.AddGameTypeResponse> METHOD_ADD_GAME_TYPE = getAddGameTypeMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.AddGameTypeRequest,
      org.archi.common.core.AddGameTypeResponse> getAddGameTypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.AddGameTypeRequest,
      org.archi.common.core.AddGameTypeResponse> getAddGameTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.AddGameTypeRequest, org.archi.common.core.AddGameTypeResponse> getAddGameTypeMethod;
    if ((getAddGameTypeMethod = CoreServiceGrpc.getAddGameTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAddGameTypeMethod = CoreServiceGrpc.getAddGameTypeMethod) == null) {
          CoreServiceGrpc.getAddGameTypeMethod = getAddGameTypeMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.AddGameTypeRequest, org.archi.common.core.AddGameTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "AddGameType"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateGameTypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameTypeRequest,
      org.archi.common.core.UpdateGameTypeResponse> METHOD_UPDATE_GAME_TYPE = getUpdateGameTypeMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameTypeRequest,
      org.archi.common.core.UpdateGameTypeResponse> getUpdateGameTypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameTypeRequest,
      org.archi.common.core.UpdateGameTypeResponse> getUpdateGameTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameTypeRequest, org.archi.common.core.UpdateGameTypeResponse> getUpdateGameTypeMethod;
    if ((getUpdateGameTypeMethod = CoreServiceGrpc.getUpdateGameTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateGameTypeMethod = CoreServiceGrpc.getUpdateGameTypeMethod) == null) {
          CoreServiceGrpc.getUpdateGameTypeMethod = getUpdateGameTypeMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateGameTypeRequest, org.archi.common.core.UpdateGameTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "UpdateGameType"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteGameTypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameTypeRequest,
      org.archi.common.core.DeleteGameTypeResponse> METHOD_DELETE_GAME_TYPE = getDeleteGameTypeMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameTypeRequest,
      org.archi.common.core.DeleteGameTypeResponse> getDeleteGameTypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameTypeRequest,
      org.archi.common.core.DeleteGameTypeResponse> getDeleteGameTypeMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameTypeRequest, org.archi.common.core.DeleteGameTypeResponse> getDeleteGameTypeMethod;
    if ((getDeleteGameTypeMethod = CoreServiceGrpc.getDeleteGameTypeMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getDeleteGameTypeMethod = CoreServiceGrpc.getDeleteGameTypeMethod) == null) {
          CoreServiceGrpc.getDeleteGameTypeMethod = getDeleteGameTypeMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.DeleteGameTypeRequest, org.archi.common.core.DeleteGameTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "DeleteGameType"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllGamesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetAllGamesRequest,
      org.archi.common.core.GetAllGamesResponse> METHOD_GET_ALL_GAMES = getGetAllGamesMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetAllGamesRequest,
      org.archi.common.core.GetAllGamesResponse> getGetAllGamesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetAllGamesRequest,
      org.archi.common.core.GetAllGamesResponse> getGetAllGamesMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetAllGamesRequest, org.archi.common.core.GetAllGamesResponse> getGetAllGamesMethod;
    if ((getGetAllGamesMethod = CoreServiceGrpc.getGetAllGamesMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetAllGamesMethod = CoreServiceGrpc.getGetAllGamesMethod) == null) {
          CoreServiceGrpc.getGetAllGamesMethod = getGetAllGamesMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetAllGamesRequest, org.archi.common.core.GetAllGamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetAllGames"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGameByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetGameByIdRequest,
      org.archi.common.core.GetGameByIdResponse> METHOD_GET_GAME_BY_ID = getGetGameByIdMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetGameByIdRequest,
      org.archi.common.core.GetGameByIdResponse> getGetGameByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetGameByIdRequest,
      org.archi.common.core.GetGameByIdResponse> getGetGameByIdMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetGameByIdRequest, org.archi.common.core.GetGameByIdResponse> getGetGameByIdMethod;
    if ((getGetGameByIdMethod = CoreServiceGrpc.getGetGameByIdMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetGameByIdMethod = CoreServiceGrpc.getGetGameByIdMethod) == null) {
          CoreServiceGrpc.getGetGameByIdMethod = getGetGameByIdMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetGameByIdRequest, org.archi.common.core.GetGameByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetGameById"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGamesByCampaignMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetGamesByCampaignRequest,
      org.archi.common.core.GetGamesByCampaignResponse> METHOD_GET_GAMES_BY_CAMPAIGN = getGetGamesByCampaignMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetGamesByCampaignRequest,
      org.archi.common.core.GetGamesByCampaignResponse> getGetGamesByCampaignMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetGamesByCampaignRequest,
      org.archi.common.core.GetGamesByCampaignResponse> getGetGamesByCampaignMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetGamesByCampaignRequest, org.archi.common.core.GetGamesByCampaignResponse> getGetGamesByCampaignMethod;
    if ((getGetGamesByCampaignMethod = CoreServiceGrpc.getGetGamesByCampaignMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetGamesByCampaignMethod = CoreServiceGrpc.getGetGamesByCampaignMethod) == null) {
          CoreServiceGrpc.getGetGamesByCampaignMethod = getGetGamesByCampaignMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetGamesByCampaignRequest, org.archi.common.core.GetGamesByCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetGamesByCampaign"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddGameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.AddGameRequest,
      org.archi.common.core.AddGameResponse> METHOD_ADD_GAME = getAddGameMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.AddGameRequest,
      org.archi.common.core.AddGameResponse> getAddGameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.AddGameRequest,
      org.archi.common.core.AddGameResponse> getAddGameMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.AddGameRequest, org.archi.common.core.AddGameResponse> getAddGameMethod;
    if ((getAddGameMethod = CoreServiceGrpc.getAddGameMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAddGameMethod = CoreServiceGrpc.getAddGameMethod) == null) {
          CoreServiceGrpc.getAddGameMethod = getAddGameMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.AddGameRequest, org.archi.common.core.AddGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "AddGame"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateGameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameRequest,
      org.archi.common.core.UpdateGameResponse> METHOD_UPDATE_GAME = getUpdateGameMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameRequest,
      org.archi.common.core.UpdateGameResponse> getUpdateGameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameRequest,
      org.archi.common.core.UpdateGameResponse> getUpdateGameMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateGameRequest, org.archi.common.core.UpdateGameResponse> getUpdateGameMethod;
    if ((getUpdateGameMethod = CoreServiceGrpc.getUpdateGameMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateGameMethod = CoreServiceGrpc.getUpdateGameMethod) == null) {
          CoreServiceGrpc.getUpdateGameMethod = getUpdateGameMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateGameRequest, org.archi.common.core.UpdateGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "UpdateGame"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteGameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameRequest,
      org.archi.common.core.DeleteGameResponse> METHOD_DELETE_GAME = getDeleteGameMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameRequest,
      org.archi.common.core.DeleteGameResponse> getDeleteGameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameRequest,
      org.archi.common.core.DeleteGameResponse> getDeleteGameMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.DeleteGameRequest, org.archi.common.core.DeleteGameResponse> getDeleteGameMethod;
    if ((getDeleteGameMethod = CoreServiceGrpc.getDeleteGameMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getDeleteGameMethod = CoreServiceGrpc.getDeleteGameMethod) == null) {
          CoreServiceGrpc.getDeleteGameMethod = getDeleteGameMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.DeleteGameRequest, org.archi.common.core.DeleteGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "DeleteGame"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddGamePlayerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.AddGamePlayerRequest,
      org.archi.common.core.AddGamePlayerResponse> METHOD_ADD_GAME_PLAYER = getAddGamePlayerMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.AddGamePlayerRequest,
      org.archi.common.core.AddGamePlayerResponse> getAddGamePlayerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.AddGamePlayerRequest,
      org.archi.common.core.AddGamePlayerResponse> getAddGamePlayerMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.AddGamePlayerRequest, org.archi.common.core.AddGamePlayerResponse> getAddGamePlayerMethod;
    if ((getAddGamePlayerMethod = CoreServiceGrpc.getAddGamePlayerMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAddGamePlayerMethod = CoreServiceGrpc.getAddGamePlayerMethod) == null) {
          CoreServiceGrpc.getAddGamePlayerMethod = getAddGamePlayerMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.AddGamePlayerRequest, org.archi.common.core.AddGamePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "AddGamePlayer"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getHasWinMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.HasWinRequest,
      org.archi.common.core.HasWinResponse> METHOD_HAS_WIN = getHasWinMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.HasWinRequest,
      org.archi.common.core.HasWinResponse> getHasWinMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.HasWinRequest,
      org.archi.common.core.HasWinResponse> getHasWinMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.HasWinRequest, org.archi.common.core.HasWinResponse> getHasWinMethod;
    if ((getHasWinMethod = CoreServiceGrpc.getHasWinMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getHasWinMethod = CoreServiceGrpc.getHasWinMethod) == null) {
          CoreServiceGrpc.getHasWinMethod = getHasWinMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.HasWinRequest, org.archi.common.core.HasWinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "HasWin"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetWinItemMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetWinItemRequest,
      org.archi.common.core.GetWinItemResponse> METHOD_GET_WIN_ITEM = getGetWinItemMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetWinItemRequest,
      org.archi.common.core.GetWinItemResponse> getGetWinItemMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetWinItemRequest,
      org.archi.common.core.GetWinItemResponse> getGetWinItemMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetWinItemRequest, org.archi.common.core.GetWinItemResponse> getGetWinItemMethod;
    if ((getGetWinItemMethod = CoreServiceGrpc.getGetWinItemMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetWinItemMethod = CoreServiceGrpc.getGetWinItemMethod) == null) {
          CoreServiceGrpc.getGetWinItemMethod = getGetWinItemMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetWinItemRequest, org.archi.common.core.GetWinItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetWinItem"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetQuizQuestionByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionByIdRequest,
      org.archi.common.core.GetQuizQuestionByIdResponse> METHOD_GET_QUIZ_QUESTION_BY_ID = getGetQuizQuestionByIdMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionByIdRequest,
      org.archi.common.core.GetQuizQuestionByIdResponse> getGetQuizQuestionByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionByIdRequest,
      org.archi.common.core.GetQuizQuestionByIdResponse> getGetQuizQuestionByIdMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionByIdRequest, org.archi.common.core.GetQuizQuestionByIdResponse> getGetQuizQuestionByIdMethod;
    if ((getGetQuizQuestionByIdMethod = CoreServiceGrpc.getGetQuizQuestionByIdMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetQuizQuestionByIdMethod = CoreServiceGrpc.getGetQuizQuestionByIdMethod) == null) {
          CoreServiceGrpc.getGetQuizQuestionByIdMethod = getGetQuizQuestionByIdMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetQuizQuestionByIdRequest, org.archi.common.core.GetQuizQuestionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetQuizQuestionById"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetQuizQuestionsByGameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionsByGameRequest,
      org.archi.common.core.GetQuizQuestionsByGameResponse> METHOD_GET_QUIZ_QUESTIONS_BY_GAME = getGetQuizQuestionsByGameMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionsByGameRequest,
      org.archi.common.core.GetQuizQuestionsByGameResponse> getGetQuizQuestionsByGameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionsByGameRequest,
      org.archi.common.core.GetQuizQuestionsByGameResponse> getGetQuizQuestionsByGameMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.GetQuizQuestionsByGameRequest, org.archi.common.core.GetQuizQuestionsByGameResponse> getGetQuizQuestionsByGameMethod;
    if ((getGetQuizQuestionsByGameMethod = CoreServiceGrpc.getGetQuizQuestionsByGameMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetQuizQuestionsByGameMethod = CoreServiceGrpc.getGetQuizQuestionsByGameMethod) == null) {
          CoreServiceGrpc.getGetQuizQuestionsByGameMethod = getGetQuizQuestionsByGameMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.GetQuizQuestionsByGameRequest, org.archi.common.core.GetQuizQuestionsByGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "GetQuizQuestionsByGame"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddQuizQuestionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.AddQuizQuestionRequest,
      org.archi.common.core.AddQuizQuestionResponse> METHOD_ADD_QUIZ_QUESTION = getAddQuizQuestionMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.AddQuizQuestionRequest,
      org.archi.common.core.AddQuizQuestionResponse> getAddQuizQuestionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.AddQuizQuestionRequest,
      org.archi.common.core.AddQuizQuestionResponse> getAddQuizQuestionMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.AddQuizQuestionRequest, org.archi.common.core.AddQuizQuestionResponse> getAddQuizQuestionMethod;
    if ((getAddQuizQuestionMethod = CoreServiceGrpc.getAddQuizQuestionMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAddQuizQuestionMethod = CoreServiceGrpc.getAddQuizQuestionMethod) == null) {
          CoreServiceGrpc.getAddQuizQuestionMethod = getAddQuizQuestionMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.AddQuizQuestionRequest, org.archi.common.core.AddQuizQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "AddQuizQuestion"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateQuizQuestionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.UpdateQuizQuestionRequest,
      org.archi.common.core.UpdateQuizQuestionResponse> METHOD_UPDATE_QUIZ_QUESTION = getUpdateQuizQuestionMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.UpdateQuizQuestionRequest,
      org.archi.common.core.UpdateQuizQuestionResponse> getUpdateQuizQuestionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.UpdateQuizQuestionRequest,
      org.archi.common.core.UpdateQuizQuestionResponse> getUpdateQuizQuestionMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.UpdateQuizQuestionRequest, org.archi.common.core.UpdateQuizQuestionResponse> getUpdateQuizQuestionMethod;
    if ((getUpdateQuizQuestionMethod = CoreServiceGrpc.getUpdateQuizQuestionMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateQuizQuestionMethod = CoreServiceGrpc.getUpdateQuizQuestionMethod) == null) {
          CoreServiceGrpc.getUpdateQuizQuestionMethod = getUpdateQuizQuestionMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.UpdateQuizQuestionRequest, org.archi.common.core.UpdateQuizQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "UpdateQuizQuestion"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteQuizQuestionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.archi.common.core.DeleteQuizQuestionRequest,
      org.archi.common.core.DeleteQuizQuestionResponse> METHOD_DELETE_QUIZ_QUESTION = getDeleteQuizQuestionMethod();

  private static volatile io.grpc.MethodDescriptor<org.archi.common.core.DeleteQuizQuestionRequest,
      org.archi.common.core.DeleteQuizQuestionResponse> getDeleteQuizQuestionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.archi.common.core.DeleteQuizQuestionRequest,
      org.archi.common.core.DeleteQuizQuestionResponse> getDeleteQuizQuestionMethod() {
    io.grpc.MethodDescriptor<org.archi.common.core.DeleteQuizQuestionRequest, org.archi.common.core.DeleteQuizQuestionResponse> getDeleteQuizQuestionMethod;
    if ((getDeleteQuizQuestionMethod = CoreServiceGrpc.getDeleteQuizQuestionMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getDeleteQuizQuestionMethod = CoreServiceGrpc.getDeleteQuizQuestionMethod) == null) {
          CoreServiceGrpc.getDeleteQuizQuestionMethod = getDeleteQuizQuestionMethod = 
              io.grpc.MethodDescriptor.<org.archi.common.core.DeleteQuizQuestionRequest, org.archi.common.core.DeleteQuizQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CoreService", "DeleteQuizQuestion"))
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
    public void searchVoucher(org.archi.common.core.SearchRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchVoucherMethod(), responseObserver);
    }

    /**
     */
    public void searchVoucherType(org.archi.common.core.SearchRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchVoucherTypeMethod(), responseObserver);
    }

    /**
     */
    public void updateVoucherType(org.archi.common.core.UpdateVoucherTypeReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateVoucherTypeRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVoucherTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * brand's method
     * </pre>
     */
    public void getVouchersType(org.archi.common.core.GetVoucherTypesReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVoucherTypesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVouchersTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * player's method
     * </pre>
     */
    public void getVouchers(org.archi.common.core.GetVouchersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVouchersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVouchersMethod(), responseObserver);
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

    /**
     */
    public void getAllGameTypes(org.archi.common.core.GetAllGameTypesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGameTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllGameTypesMethod(), responseObserver);
    }

    /**
     */
    public void getGameTypeById(org.archi.common.core.GetGameTypeByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameTypeByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGameTypeByIdMethod(), responseObserver);
    }

    /**
     */
    public void addGameType(org.archi.common.core.AddGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGameTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddGameTypeMethod(), responseObserver);
    }

    /**
     */
    public void updateGameType(org.archi.common.core.UpdateGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGameTypeMethod(), responseObserver);
    }

    /**
     */
    public void deleteGameType(org.archi.common.core.DeleteGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGameTypeMethod(), responseObserver);
    }

    /**
     */
    public void getAllGames(org.archi.common.core.GetAllGamesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGamesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllGamesMethod(), responseObserver);
    }

    /**
     */
    public void getGameById(org.archi.common.core.GetGameByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGameByIdMethod(), responseObserver);
    }

    /**
     */
    public void getGamesByCampaign(org.archi.common.core.GetGamesByCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGamesByCampaignResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGamesByCampaignMethod(), responseObserver);
    }

    /**
     */
    public void addGame(org.archi.common.core.AddGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddGameMethod(), responseObserver);
    }

    /**
     */
    public void updateGame(org.archi.common.core.UpdateGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGameMethod(), responseObserver);
    }

    /**
     */
    public void deleteGame(org.archi.common.core.DeleteGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGameMethod(), responseObserver);
    }

    /**
     */
    public void addGamePlayer(org.archi.common.core.AddGamePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGamePlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddGamePlayerMethod(), responseObserver);
    }

    /**
     */
    public void hasWin(org.archi.common.core.HasWinRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.HasWinResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHasWinMethod(), responseObserver);
    }

    /**
     */
    public void getWinItem(org.archi.common.core.GetWinItemRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetWinItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWinItemMethod(), responseObserver);
    }

    /**
     */
    public void getQuizQuestionById(org.archi.common.core.GetQuizQuestionByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuizQuestionByIdMethod(), responseObserver);
    }

    /**
     */
    public void getQuizQuestionsByGame(org.archi.common.core.GetQuizQuestionsByGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionsByGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuizQuestionsByGameMethod(), responseObserver);
    }

    /**
     */
    public void addQuizQuestion(org.archi.common.core.AddQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddQuizQuestionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddQuizQuestionMethod(), responseObserver);
    }

    /**
     */
    public void updateQuizQuestion(org.archi.common.core.UpdateQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateQuizQuestionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateQuizQuestionMethod(), responseObserver);
    }

    /**
     */
    public void deleteQuizQuestion(org.archi.common.core.DeleteQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteQuizQuestionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteQuizQuestionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
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
            getSearchVoucherMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.SearchRequest,
                org.archi.common.core.SearchVoucherResponse>(
                  this, METHODID_SEARCH_VOUCHER)))
          .addMethod(
            getSearchVoucherTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.SearchRequest,
                org.archi.common.core.SearchVoucherTypeResponse>(
                  this, METHODID_SEARCH_VOUCHER_TYPE)))
          .addMethod(
            getUpdateVoucherTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.UpdateVoucherTypeReq,
                org.archi.common.core.UpdateVoucherTypeRes>(
                  this, METHODID_UPDATE_VOUCHER_TYPE)))
          .addMethod(
            getGetVouchersTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetVoucherTypesReq,
                org.archi.common.core.GetVoucherTypesRes>(
                  this, METHODID_GET_VOUCHERS_TYPE)))
          .addMethod(
            getGetVouchersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetVouchersRequest,
                org.archi.common.core.GetVouchersResponse>(
                  this, METHODID_GET_VOUCHERS)))
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
          .addMethod(
            getGetAllGameTypesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetAllGameTypesRequest,
                org.archi.common.core.GetAllGameTypesResponse>(
                  this, METHODID_GET_ALL_GAME_TYPES)))
          .addMethod(
            getGetGameTypeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetGameTypeByIdRequest,
                org.archi.common.core.GetGameTypeByIdResponse>(
                  this, METHODID_GET_GAME_TYPE_BY_ID)))
          .addMethod(
            getAddGameTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.AddGameTypeRequest,
                org.archi.common.core.AddGameTypeResponse>(
                  this, METHODID_ADD_GAME_TYPE)))
          .addMethod(
            getUpdateGameTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.UpdateGameTypeRequest,
                org.archi.common.core.UpdateGameTypeResponse>(
                  this, METHODID_UPDATE_GAME_TYPE)))
          .addMethod(
            getDeleteGameTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.DeleteGameTypeRequest,
                org.archi.common.core.DeleteGameTypeResponse>(
                  this, METHODID_DELETE_GAME_TYPE)))
          .addMethod(
            getGetAllGamesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetAllGamesRequest,
                org.archi.common.core.GetAllGamesResponse>(
                  this, METHODID_GET_ALL_GAMES)))
          .addMethod(
            getGetGameByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetGameByIdRequest,
                org.archi.common.core.GetGameByIdResponse>(
                  this, METHODID_GET_GAME_BY_ID)))
          .addMethod(
            getGetGamesByCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetGamesByCampaignRequest,
                org.archi.common.core.GetGamesByCampaignResponse>(
                  this, METHODID_GET_GAMES_BY_CAMPAIGN)))
          .addMethod(
            getAddGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.AddGameRequest,
                org.archi.common.core.AddGameResponse>(
                  this, METHODID_ADD_GAME)))
          .addMethod(
            getUpdateGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.UpdateGameRequest,
                org.archi.common.core.UpdateGameResponse>(
                  this, METHODID_UPDATE_GAME)))
          .addMethod(
            getDeleteGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.DeleteGameRequest,
                org.archi.common.core.DeleteGameResponse>(
                  this, METHODID_DELETE_GAME)))
          .addMethod(
            getAddGamePlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.AddGamePlayerRequest,
                org.archi.common.core.AddGamePlayerResponse>(
                  this, METHODID_ADD_GAME_PLAYER)))
          .addMethod(
            getHasWinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.HasWinRequest,
                org.archi.common.core.HasWinResponse>(
                  this, METHODID_HAS_WIN)))
          .addMethod(
            getGetWinItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetWinItemRequest,
                org.archi.common.core.GetWinItemResponse>(
                  this, METHODID_GET_WIN_ITEM)))
          .addMethod(
            getGetQuizQuestionByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetQuizQuestionByIdRequest,
                org.archi.common.core.GetQuizQuestionByIdResponse>(
                  this, METHODID_GET_QUIZ_QUESTION_BY_ID)))
          .addMethod(
            getGetQuizQuestionsByGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.GetQuizQuestionsByGameRequest,
                org.archi.common.core.GetQuizQuestionsByGameResponse>(
                  this, METHODID_GET_QUIZ_QUESTIONS_BY_GAME)))
          .addMethod(
            getAddQuizQuestionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.AddQuizQuestionRequest,
                org.archi.common.core.AddQuizQuestionResponse>(
                  this, METHODID_ADD_QUIZ_QUESTION)))
          .addMethod(
            getUpdateQuizQuestionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.UpdateQuizQuestionRequest,
                org.archi.common.core.UpdateQuizQuestionResponse>(
                  this, METHODID_UPDATE_QUIZ_QUESTION)))
          .addMethod(
            getDeleteQuizQuestionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.archi.common.core.DeleteQuizQuestionRequest,
                org.archi.common.core.DeleteQuizQuestionResponse>(
                  this, METHODID_DELETE_QUIZ_QUESTION)))
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
    public void searchVoucher(org.archi.common.core.SearchRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchVoucherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchVoucherType(org.archi.common.core.SearchRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.SearchVoucherTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchVoucherTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVoucherType(org.archi.common.core.UpdateVoucherTypeReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateVoucherTypeRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVoucherTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * brand's method
     * </pre>
     */
    public void getVouchersType(org.archi.common.core.GetVoucherTypesReq request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVoucherTypesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVouchersTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * player's method
     * </pre>
     */
    public void getVouchers(org.archi.common.core.GetVouchersRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetVouchersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVouchersMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void getAllGameTypes(org.archi.common.core.GetAllGameTypesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGameTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllGameTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGameTypeById(org.archi.common.core.GetGameTypeByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameTypeByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGameTypeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGameType(org.archi.common.core.AddGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGameTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddGameTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGameType(org.archi.common.core.UpdateGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGameTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGameType(org.archi.common.core.DeleteGameTypeRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGameTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllGames(org.archi.common.core.GetAllGamesRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetAllGamesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllGamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGameById(org.archi.common.core.GetGameByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGameByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGameByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGamesByCampaign(org.archi.common.core.GetGamesByCampaignRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetGamesByCampaignResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGamesByCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGame(org.archi.common.core.AddGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGame(org.archi.common.core.UpdateGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGame(org.archi.common.core.DeleteGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGamePlayer(org.archi.common.core.AddGamePlayerRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddGamePlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddGamePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasWin(org.archi.common.core.HasWinRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.HasWinResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHasWinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWinItem(org.archi.common.core.GetWinItemRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetWinItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWinItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuizQuestionById(org.archi.common.core.GetQuizQuestionByIdRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuizQuestionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuizQuestionsByGame(org.archi.common.core.GetQuizQuestionsByGameRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.GetQuizQuestionsByGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuizQuestionsByGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addQuizQuestion(org.archi.common.core.AddQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.AddQuizQuestionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddQuizQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateQuizQuestion(org.archi.common.core.UpdateQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.UpdateQuizQuestionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateQuizQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteQuizQuestion(org.archi.common.core.DeleteQuizQuestionRequest request,
        io.grpc.stub.StreamObserver<org.archi.common.core.DeleteQuizQuestionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteQuizQuestionMethod(), getCallOptions()), request, responseObserver);
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
    public org.archi.common.core.SearchVoucherResponse searchVoucher(org.archi.common.core.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchVoucherMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.SearchVoucherTypeResponse searchVoucherType(org.archi.common.core.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchVoucherTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateVoucherTypeRes updateVoucherType(org.archi.common.core.UpdateVoucherTypeReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVoucherTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * brand's method
     * </pre>
     */
    public org.archi.common.core.GetVoucherTypesRes getVouchersType(org.archi.common.core.GetVoucherTypesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetVouchersTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * player's method
     * </pre>
     */
    public org.archi.common.core.GetVouchersResponse getVouchers(org.archi.common.core.GetVouchersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVouchersMethod(), getCallOptions(), request);
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

    /**
     */
    public org.archi.common.core.GetAllGameTypesResponse getAllGameTypes(org.archi.common.core.GetAllGameTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllGameTypesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetGameTypeByIdResponse getGameTypeById(org.archi.common.core.GetGameTypeByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGameTypeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.AddGameTypeResponse addGameType(org.archi.common.core.AddGameTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddGameTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateGameTypeResponse updateGameType(org.archi.common.core.UpdateGameTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGameTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.DeleteGameTypeResponse deleteGameType(org.archi.common.core.DeleteGameTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGameTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetAllGamesResponse getAllGames(org.archi.common.core.GetAllGamesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllGamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetGameByIdResponse getGameById(org.archi.common.core.GetGameByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGameByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetGamesByCampaignResponse getGamesByCampaign(org.archi.common.core.GetGamesByCampaignRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGamesByCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.AddGameResponse addGame(org.archi.common.core.AddGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateGameResponse updateGame(org.archi.common.core.UpdateGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.DeleteGameResponse deleteGame(org.archi.common.core.DeleteGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.AddGamePlayerResponse addGamePlayer(org.archi.common.core.AddGamePlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddGamePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.HasWinResponse hasWin(org.archi.common.core.HasWinRequest request) {
      return blockingUnaryCall(
          getChannel(), getHasWinMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetWinItemResponse getWinItem(org.archi.common.core.GetWinItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWinItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetQuizQuestionByIdResponse getQuizQuestionById(org.archi.common.core.GetQuizQuestionByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQuizQuestionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.GetQuizQuestionsByGameResponse getQuizQuestionsByGame(org.archi.common.core.GetQuizQuestionsByGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQuizQuestionsByGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.AddQuizQuestionResponse addQuizQuestion(org.archi.common.core.AddQuizQuestionRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddQuizQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.UpdateQuizQuestionResponse updateQuizQuestion(org.archi.common.core.UpdateQuizQuestionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateQuizQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.archi.common.core.DeleteQuizQuestionResponse deleteQuizQuestion(org.archi.common.core.DeleteQuizQuestionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteQuizQuestionMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.SearchVoucherResponse> searchVoucher(
        org.archi.common.core.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchVoucherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.SearchVoucherTypeResponse> searchVoucherType(
        org.archi.common.core.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchVoucherTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateVoucherTypeRes> updateVoucherType(
        org.archi.common.core.UpdateVoucherTypeReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVoucherTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * brand's method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetVoucherTypesRes> getVouchersType(
        org.archi.common.core.GetVoucherTypesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVouchersTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * player's method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetVouchersResponse> getVouchers(
        org.archi.common.core.GetVouchersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVouchersMethod(), getCallOptions()), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetAllGameTypesResponse> getAllGameTypes(
        org.archi.common.core.GetAllGameTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllGameTypesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetGameTypeByIdResponse> getGameTypeById(
        org.archi.common.core.GetGameTypeByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGameTypeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.AddGameTypeResponse> addGameType(
        org.archi.common.core.AddGameTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddGameTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateGameTypeResponse> updateGameType(
        org.archi.common.core.UpdateGameTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGameTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.DeleteGameTypeResponse> deleteGameType(
        org.archi.common.core.DeleteGameTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGameTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetAllGamesResponse> getAllGames(
        org.archi.common.core.GetAllGamesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllGamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetGameByIdResponse> getGameById(
        org.archi.common.core.GetGameByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGameByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetGamesByCampaignResponse> getGamesByCampaign(
        org.archi.common.core.GetGamesByCampaignRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGamesByCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.AddGameResponse> addGame(
        org.archi.common.core.AddGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateGameResponse> updateGame(
        org.archi.common.core.UpdateGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.DeleteGameResponse> deleteGame(
        org.archi.common.core.DeleteGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.AddGamePlayerResponse> addGamePlayer(
        org.archi.common.core.AddGamePlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddGamePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.HasWinResponse> hasWin(
        org.archi.common.core.HasWinRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHasWinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetWinItemResponse> getWinItem(
        org.archi.common.core.GetWinItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWinItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetQuizQuestionByIdResponse> getQuizQuestionById(
        org.archi.common.core.GetQuizQuestionByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuizQuestionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.GetQuizQuestionsByGameResponse> getQuizQuestionsByGame(
        org.archi.common.core.GetQuizQuestionsByGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuizQuestionsByGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.AddQuizQuestionResponse> addQuizQuestion(
        org.archi.common.core.AddQuizQuestionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddQuizQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.UpdateQuizQuestionResponse> updateQuizQuestion(
        org.archi.common.core.UpdateQuizQuestionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateQuizQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.archi.common.core.DeleteQuizQuestionResponse> deleteQuizQuestion(
        org.archi.common.core.DeleteQuizQuestionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteQuizQuestionMethod(), getCallOptions()), request);
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
              .build();
        }
      }
    }
    return result;
  }
}
