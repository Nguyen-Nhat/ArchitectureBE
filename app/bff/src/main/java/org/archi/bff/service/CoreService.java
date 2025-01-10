package org.archi.bff.service;

import lombok.RequiredArgsConstructor;
import org.archi.bff.adapter.AuthAdapter;
import org.archi.bff.adapter.CoreAdapter;
import org.archi.bff.request.CreateVoucherType;
import org.archi.bff.request.UpdateCampaign;
import org.archi.bff.request.UpdateVoucherType;
import org.archi.bff.response.CampaignResponse;
import org.archi.bff.response.ResponseData;
import org.archi.bff.response.VoucherTypeResponse;
import org.archi.common.auth.GetBrandProfileRequest;
import org.archi.common.auth.GetBrandProfileResponse;
import org.archi.common.core.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
                    response.getVouchersList());
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
            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response.getVoucherTypesList().stream().map(vcType ->
                            VoucherTypeResponse.builder()
                                    .id(vcType.getId())
                                    .brandId(vcType.getBrandId())
                                    .name(vcType.getName())
                                    .imageUrl(vcType.getImageUrl())
                                    .description(vcType.getDescription())
                                    .value((long)vcType.getValue())
                                    .build())
                    .collect(Collectors.toList())
            );
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(),"error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> createVoucherType(long accountId, CreateVoucherType request) {
        try {
            // Get the brand id from account id
            GetBrandProfileResponse brandProfile = authAdapter.getBrandProfile(
                    GetBrandProfileRequest.newBuilder()
                            .setId(accountId).build());

            long brandId = brandProfile.getId();
            CreateVoucherTypeRequest grpcReq = CreateVoucherTypeRequest.newBuilder()
                    .setBrandId(brandId)
                    .setDescription(request.getDescription())
                    .setName(request.getName())
                    .setValue(request.getValue())
                    .setImageUrl(request.getImageUrl())
                    .build();

            CreateVoucherTypeResponse response = coreAdapter.createVoucherType(grpcReq);
            VoucherType vcType = response.getVoucherType();
            return ResponseEntity.ok(
                    new ResponseData(
                            HttpStatus.OK.value(),
                            "success",
                            VoucherTypeResponse.builder()
                                    .id(vcType.getId())
                                    .brandId(brandId)
                                    .description(vcType.getDescription())
                                    .name(vcType.getName())
                                    .imageUrl(vcType.getImageUrl())
                            .build()
                    ));
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

    public ResponseEntity<ResponseData> updateVoucherType(Long voucherTypeId, UpdateVoucherType request) {
        try {
            UpdateVoucherTypeReq.Builder updateBuilder = UpdateVoucherTypeReq.newBuilder();
            updateBuilder.setVoucherId(voucherTypeId);
            if (request.getName() != null && !request.getName().isEmpty()) {
                updateBuilder.setName(request.getName());
            }
            if (request.getDescription() != null && !request.getDescription().isEmpty()) {
                updateBuilder.setDescription(request.getDescription());
            }
            if (request.getValue() > 0) {
                updateBuilder.setValue(request.getValue());
            }

            UpdateVoucherTypeRes grpcResponse = coreAdapter.updateVoucherType(updateBuilder.build());
            VoucherType vcType = grpcResponse.getUpdatedVoucherType();

            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    VoucherTypeResponse.builder()
                        .id(vcType.getId())
                        .brandId(vcType.getBrandId())
                        .name(vcType.getName())
                        .imageUrl(vcType.getImageUrl())
                        .description(vcType.getDescription())
                        .value(vcType.getValue())
                        .build()
                    );
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    //note
    public ResponseEntity<ResponseData> searchVoucher(String term) {
        try {
            SearchVoucherResponse response = coreAdapter.searchVoucher(SearchRequest.newBuilder().setTerm(term).build());

            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response.getVouchersList());
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> searchVoucherType(String term) {
        try {
            SearchVoucherTypeResponse response = coreAdapter.searchVoucherType(SearchRequest.newBuilder().setTerm(term).build());
            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response.getVoucherTypesList().stream().map(vcType ->
                            VoucherTypeResponse.builder()
                            .id(vcType.getId())
                            .brandId(vcType.getBrandId())
                            .name(vcType.getName())
                            .imageUrl(vcType.getImageUrl())
                            .description(vcType.getDescription())
                            .value((long)vcType.getValue())
                            .build())
                            .collect(Collectors.toList())
            );
            return ResponseEntity.ok(responseData);
        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> getCampaigns(String startDate, String endDate) {
        try {
            LocalDate stDate = LocalDate.parse(startDate);
            LocalDate edDate = LocalDate.parse(endDate);
            if (edDate.isBefore(stDate)) {
                ResponseData errorResponse = new ResponseData(HttpStatus.BAD_REQUEST.value(), "error", "End date can not be after start date");
                return ResponseEntity.badRequest().body(errorResponse);
            }
            GetCampaignsRequest request = GetCampaignsRequest.newBuilder()
                    .setStartDate(startDate)
                    .setEndDate(endDate)
                    .build();
            GetCampaignsResponse response = coreAdapter.getCampaigns(request);
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


    public ResponseEntity<ResponseData> getAllGameTypes() {
        try {
            GetAllGameTypesRequest request = GetAllGameTypesRequest.newBuilder()
                    .build();

            GetAllGameTypesResponse response = coreAdapter.getAllGameTypes(request);

            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response.getGameTypesList());
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> getGameTypeById(int id) {
        try {
            GetGameTypeByIdRequest request = GetGameTypeByIdRequest.newBuilder()
                    .setId(id)
                    .build();

            GetGameTypeByIdResponse response = coreAdapter.getGameTypeById(request);

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

    public ResponseEntity<ResponseData> addGameType(AddGameTypeRequest request) {
        try {
            AddGameTypeResponse response = coreAdapter.addGameType(request);

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

    public ResponseEntity<ResponseData> updateGameType(UpdateGameTypeRequest request) {
        try {
            UpdateGameTypeResponse response = coreAdapter.updateGameType(request);

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

    public ResponseEntity<ResponseData> deleteGameType(int id) {
        try {
            DeleteGameTypeRequest request = DeleteGameTypeRequest.newBuilder()
                    .setId(id)
                    .build();

            DeleteGameTypeResponse response = coreAdapter.deleteGameType(request);

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

    public ResponseEntity<ResponseData> getAllGames() {
        try {
            GetAllGamesRequest request = GetAllGamesRequest.newBuilder()
                    .build();

            GetAllGamesResponse response = coreAdapter.getAllGames(request);

            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response.getGamesList());
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> getGameById(long id) {
        try {
            GetGameByIdRequest request = GetGameByIdRequest.newBuilder()
                    .setId(id)
                    .build();

            GetGameByIdResponse response = coreAdapter.getGameById(request);

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

    public ResponseEntity<ResponseData> getGamesByCampaign(long campaignId) {
        try {
            GetGamesByCampaignRequest request = GetGamesByCampaignRequest.newBuilder()
                    .setCampaignId(campaignId)
                    .build();

            GetGamesByCampaignResponse response = coreAdapter.getGamesByCampaign(request);

            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response.getGamesList());
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> addGame(AddGameRequest request) {
        try {
            AddGameResponse response = coreAdapter.addGame(request);

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

    public ResponseEntity<ResponseData> updateGame(UpdateGameRequest request) {
        try {
            UpdateGameResponse response = coreAdapter.updateGame(request);

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

    public ResponseEntity<ResponseData> deleteGame(long id) {
        try {
            DeleteGameRequest request = DeleteGameRequest.newBuilder()
                    .setId(id)
                    .build();

            DeleteGameResponse response = coreAdapter.deleteGame(request);

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

    private void addGamePlayer(AddGamePlayerRequest request) {
        coreAdapter.addGamePlayer(request);
    }

    private boolean hasWin() {
        HasWinRequest request = HasWinRequest.newBuilder()
                .build();

        HasWinResponse response = coreAdapter.hasWin(request);
        return response.getHasWin();
    }

    public GetWinItemResponse getWinItem(long playerId, long gameId) {
        GetWinItemRequest request = GetWinItemRequest.newBuilder()
                .setPlayerId(playerId)
                .setGameId(gameId)
                .build();

        return coreAdapter.getWinItem(request);
    }

    public ResponseEntity<ResponseData> shakePhone(long playerId, long gameId) {
        try {
            AddGamePlayerRequest addGamePlayerRequest = AddGamePlayerRequest.newBuilder()
                    .setPlayerId(playerId)
                    .setGameId(gameId)
                    .build();

            addGamePlayer(addGamePlayerRequest);

            ResponseData responseData = null;
            if (hasWin()) {
                GetWinItemResponse response = getWinItem(playerId, gameId);

                responseData = new ResponseData(
                        HttpStatus.OK.value(),
                        "win",
                        response);
            }
            else {
                responseData = new ResponseData(
                        HttpStatus.OK.value(),
                        "lose",
                        null);
            }

            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> getQuizQuestionById(long id) {
        try {
            GetQuizQuestionByIdRequest request = GetQuizQuestionByIdRequest.newBuilder()
                    .setId(id)
                    .build();

            GetQuizQuestionByIdResponse response = coreAdapter.getQuizQuestionById(request);

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

    public ResponseEntity<ResponseData> getQuizQuestionsByGame(long gameId) {
        try {
            GetQuizQuestionsByGameRequest request = GetQuizQuestionsByGameRequest.newBuilder()
                    .setGameId(gameId)
                    .build();

            GetQuizQuestionsByGameResponse response = coreAdapter.getQuizQuestionsByGame(request);

            ResponseData responseData = new ResponseData(
                    HttpStatus.OK.value(),
                    "success",
                    response.getQuizQuestionList());
            return ResponseEntity.ok(responseData);

        } catch (Exception e) {
            ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    public ResponseEntity<ResponseData> addQuizQuestion(AddQuizQuestionRequest request) {
        try {
            AddQuizQuestionResponse response = coreAdapter.addQuizQuestion(request);

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

    public ResponseEntity<ResponseData> updateQuizQuestion(UpdateQuizQuestionRequest request) {
        try {
            UpdateQuizQuestionResponse response = coreAdapter.updateQuizQuestion(request);

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

    public ResponseEntity<ResponseData> deleteQuizQuestion(long id) {
        try {
            DeleteQuizQuestionRequest request = DeleteQuizQuestionRequest.newBuilder()
                    .setId(id)
                    .build();

            DeleteQuizQuestionResponse response = coreAdapter.deleteQuizQuestion(request);

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
}
