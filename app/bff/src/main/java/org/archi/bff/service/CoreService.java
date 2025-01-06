package org.archi.bff.service;

import lombok.RequiredArgsConstructor;
import org.archi.bff.adapter.AuthAdapter;
import org.archi.bff.adapter.CoreAdapter;
import org.archi.bff.response.ResponseData;
import org.archi.common.auth.GetBrandInfoRequest;
import org.archi.common.auth.GetBrandInfoResponse;
import org.archi.common.auth.GetBrandProfileRequest;
import org.archi.common.auth.GetBrandProfileResponse;
import org.archi.common.core.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoreService {
    private final CoreAdapter coreAdapter;
    private final AuthAdapter authAdapter;

    public ResponseEntity<ResponseData> getVouchers(Long playerId) {
        try {
            GetVouchersRequest request = GetVouchersRequest.newBuilder()
                    .setPlayerId(playerId)
                    .build();

            GetVouchersResponse response = coreAdapter.getVouchers(request);

            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response);
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> getVoucherTypes(Long playerId) {
        try {
            // Create gRPC request for voucher types
            GetVoucherTypesReq request = GetVoucherTypesReq.newBuilder()
                    .setBrandId(playerId)
                    .build();

            GetVoucherTypesRes response = coreAdapter.getVoucherTypes(request);
            ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response.getVoucherTypesList());
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(),"error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> createVoucherType(CreateVoucherTypeRequest request) {
        try {
            CreateVoucherTypeResponse response = coreAdapter.createVoucherType(request);
            return ResponseEntity.ok(new ResponseData(HttpStatus.OK.value(), "succes", response.getVoucherType()));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(
                    new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Failed to create voucher type", e.getMessage())
            );
        }
    }

    public ResponseEntity<ResponseData> generateVoucher(GenerateVoucherRequest request) {
        try {
            GenerateVoucherResponse response = coreAdapter.generateVoucher(request);
            ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response);
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> updateVoucherType(UpdateVoucherTypeReq request) {
        try {
            UpdateVoucherTypeRes grpcResponse = coreAdapter.updateVoucherType(request);
            ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", grpcResponse);
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> searchVoucher(String term) {
        try {
            SearchVoucherResponse response = coreAdapter.searchVoucher(SearchRequest.newBuilder().setTerm(term).build());
            ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response);
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> searchVoucherType(String term) {
        try {
            SearchVoucherTypeResponse response = coreAdapter.searchVoucherType(SearchRequest.newBuilder().setTerm(term).build());
            ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response);
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> getCampaigns(String startDate, String endDate) {
        try {
            GetCampaignsRequest request = GetCampaignsRequest.newBuilder()
                    .setStartDate(startDate)
                    .setEndDate(endDate)
                    .build();
            GetCampaignsResponse response = coreAdapter.getCampaigns(request);
            ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response);
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> searchCampaign(String term) {
        try {
            SearchCampaignRequest request = SearchCampaignRequest.newBuilder()
                    .setTerm(term).build();
            SearchCampaignResponse response = coreAdapter.searchCampaign(request);
            ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response);
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }
    public ResponseEntity<ResponseData> createCampaign(
            long accountId,
            org.archi.bff.request.CreateCampaignRequest requestDTO) {
        try {
            GetBrandProfileRequest getBrandInfoReq = GetBrandProfileRequest.newBuilder()
                    .setId(accountId)
                    .build();
            GetBrandProfileResponse getBrandInfoRes = authAdapter.getBrandProfile(getBrandInfoReq);
            long brandId = getBrandInfoRes.getId();

            CreateCampaignRequest request = CreateCampaignRequest.newBuilder()
                    .setBrandId(brandId)
                    .setEndDate(requestDTO.getEndDate())
                    .setStartDate(requestDTO.getStartDate())
                    .setName(requestDTO.getName())
                    .setImageUrl(requestDTO.getImageUrl())
                    .setDescription(requestDTO.getDescription())
                    .setStatus(requestDTO.getStatus())
                    .build();
            CreateCampaignResponse response = coreAdapter.createCampaign(request);
            ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response);
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }
    public ResponseEntity<ResponseData> getCampaignsByBrandId(GetCampaignsByBrandIdReq request) {
        try {
            GetCampaignsByBrandIdRes response = coreAdapter.getCampaignsByBrandIdRes(request);
            ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response);
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public UpdateCampaignRes updateCampaign(UpdateCampaignReq request) {
        try {
            UpdateCampaignRes response = coreAdapter.updateCampaign(request);
            return response;
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return null;
        }
    }
}
