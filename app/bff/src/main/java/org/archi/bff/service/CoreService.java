package org.archi.bff.service;

import lombok.RequiredArgsConstructor;
import org.archi.bff.adapter.AuthAdapter;
import org.archi.bff.adapter.CoreAdapter;
import org.archi.bff.request.UpdateCampaign;
import org.archi.bff.response.CampaignResponse;
import org.archi.bff.response.ResponseData;
import org.archi.common.auth.GetBrandProfileRequest;
import org.archi.common.auth.GetBrandProfileResponse;
import org.archi.common.core.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

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
            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response.getCampaignsList().stream().map(
                            c ->
                                CampaignResponse.builder()
                                        .id(c.getId())
                                        .name(c.getName())
                                        .description(c.getDescription())
                                        .status(c.getStatus())
                                        .startDate(c.getStartDate())
                                        .endDate(c.getEndDate())
                                        .imageUrl(c.getImageUrl())
                                        .build()
                            ).collect(Collectors.toList())
            );
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
            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    CampaignResponse.builder()
                            .id(response.getId())
                            .name(response.getName())
                            .imageUrl(response.getImageUrl())
                            .description(response.getDescription())
                            .status(response.getStatus())
                            .startDate(response.getStartDate())
                            .endDate(response.getEndDate())
                            .brandId(response.getBrandId())
                            .build());
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }
    public ResponseEntity<ResponseData> getCampaignsByBrandId(Long brandId) {
        try {
            GetCampaignsByBrandIdReq request = GetCampaignsByBrandIdReq.newBuilder()
                    .setBrandId(brandId).build();
            GetCampaignsByBrandIdRes response = coreAdapter.getCampaignsByBrandIdRes(request);
            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response.getCampaignsList().stream().map(
                            c -> CampaignResponse.builder()
                                    .id(c.getId())
                                    .name(c.getName())
                                    .imageUrl(c.getImageUrl())
                                    .description(c.getDescription())
                                    .status(c.getStatus())
                                    .startDate(c.getStartDate())
                                    .endDate(c.getEndDate())
                                    .brandId(request.getBrandId())
                                    .build()
                    ).collect(Collectors.toList())
            );
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> updateCampaign(String id, UpdateCampaign request) {
        try {
            UpdateCampaignReq.Builder updateBuilder = UpdateCampaignReq.newBuilder();

            // Set fields to update
            long campaignId = Long.parseLong(id);
            updateBuilder.setCampaignId(campaignId);
            if(request.getName() != null && !request.getName().isEmpty()) updateBuilder.setNewName(request.getName());
            if(request.getDescription() != null && !request.getDescription().isEmpty()) updateBuilder.setNewDescription(request.getDescription());
            if(request.getImageUrl() != null && !request.getImageUrl().isEmpty()) updateBuilder.setNewImageUrl(request.getImageUrl());
            if(request.getEndDate() != null && !request.getEndDate().isEmpty()) updateBuilder.setNewEndDate(request.getEndDate());
            if(request.getStartDate() != null && !request.getStartDate().isEmpty()) updateBuilder.setNewStartDate(request.getStartDate());
            if(request.getStatus() != null && !request.getStatus().isEmpty()) updateBuilder.setNewStatus(request.getStatus());

            UpdateCampaignRes response = coreAdapter.updateCampaign(updateBuilder.build());
            Campaign campaign = response.getCampaign();
            ResponseData resData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    CampaignResponse.builder()
                            .id(campaign.getId())
                            .name(campaign.getName())
                            .imageUrl(campaign.getImageUrl())
                            .description(campaign.getDescription())
                            .status(campaign.getStatus())
                            .startDate(campaign.getStartDate())
                            .endDate(campaign.getEndDate())
                            .build());
            return ResponseEntity.ok(resData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }
}
