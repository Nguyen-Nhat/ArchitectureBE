package org.archi.bff.service;

import lombok.RequiredArgsConstructor;
import org.archi.bff.adapter.CoreAdapter;
import org.archi.bff.response.ResponseData;
import org.archi.common.core.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoreService {
    private final CoreAdapter coreAdapter;

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
