package org.archi.bff.adapter;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.archi.common.core.*;
import org.springframework.stereotype.Service;

@Service
public class CoreAdapter {
  @GrpcClient("coreService")
  private CoreServiceGrpc.CoreServiceBlockingStub client;

  public GetVouchersResponse getVouchers(GetVouchersRequest request) {
    return client.getVouchers(request);
  }

  public GetVoucherTypesRes getVoucherTypes(GetVoucherTypesReq request) {
    return client.getVouchersType(request);
  }

  public CreateVoucherTypeResponse createVoucherType(CreateVoucherTypeRequest request) {
    return client.createVoucherType(request);
  }

  public GenerateVoucherResponse generateVoucher(GenerateVoucherRequest request) {
    return client.generateVoucher(request);
  }

  public UpdateVoucherTypeRes updateVoucherType(UpdateVoucherTypeReq request) {
    return client.updateVoucherType(request);
  }

  public SearchVoucherResponse searchVoucher(SearchRequest request) {
    return client.searchVoucher(request);
  }

  public SearchVoucherTypeResponse searchVoucherType(SearchRequest request) {
    return client.searchVoucherType(request);
  }

  public GetCampaignsResponse getCampaigns(GetCampaignsRequest request) {
    return client.getCampaigns(request);
  }

  public SearchCampaignResponse searchCampaign(SearchCampaignRequest request) {
    return client.searchCampaign(request);
  }

  public CreateCampaignResponse createCampaign(CreateCampaignRequest request) {
    return client.createCampaign(request);
  }

  public GetCampaignsByBrandIdRes getCampaignsByBrandIdRes(GetCampaignsByBrandIdReq request) {
    return client.getCampaignsByBrandId(request);
  }

  public UpdateCampaignRes updateCampaign(UpdateCampaignReq request) {
    return client.updateCampaign(request);
  }

  public GetAllGameTypesResponse getAllGameTypes(GetAllGameTypesRequest request) {
    return client.getAllGameTypes(request);
  }

  public GetGameTypeByIdResponse getGameTypeById(GetGameTypeByIdRequest request) {
    return client.getGameTypeById(request);
  }

  public AddGameTypeResponse addGameType(AddGameTypeRequest request) {
    return client.addGameType(request);
  }

  public UpdateGameTypeResponse updateGameType(UpdateGameTypeRequest request) {
    return client.updateGameType(request);
  }

  public DeleteGameTypeResponse deleteGameType(DeleteGameTypeRequest request) {
    return client.deleteGameType(request);
  }


  public GetAllGamesResponse getAllGames(GetAllGamesRequest request) {
    return client.getAllGames(request);
  }

  public GetGameByIdResponse getGameById(GetGameByIdRequest request) {
    return client.getGameById(request);
  }

  public GetGamesByCampaignResponse getGamesByCampaign(GetGamesByCampaignRequest request) {
    return client.getGamesByCampaign(request);
  }

  public AddGameResponse addGame(AddGameRequest request) {
    return client.addGame(request);
  }

  public UpdateGameResponse updateGame(UpdateGameRequest request) {
    return client.updateGame(request);
  }

  public DeleteGameResponse deleteGame(DeleteGameRequest request) {
    return client.deleteGame(request);
  }

  public AddGamePlayerResponse addGamePlayer(AddGamePlayerRequest request) {
    return client.addGamePlayer(request);
  }

  public HasWinResponse hasWin(HasWinRequest request) {
    return client.hasWin(request);
  }

  public GetWinItemResponse getWinItem(GetWinItemRequest request) {
    return client.getWinItem(request);
  }


  public GetQuizQuestionByIdResponse getQuizQuestionById(GetQuizQuestionByIdRequest request) {
    return client.getQuizQuestionById(request);
  }

  public GetQuizQuestionsByGameResponse getQuizQuestionsByGame(GetQuizQuestionsByGameRequest request) {
    return client.getQuizQuestionsByGame(request);
  }

  public AddQuizQuestionResponse addQuizQuestion(AddQuizQuestionRequest request) {
    return client.addQuizQuestion(request);
  }

  public UpdateQuizQuestionResponse updateQuizQuestion(UpdateQuizQuestionRequest request) {
    return client.updateQuizQuestion(request);
  }

  public DeleteQuizQuestionResponse deleteQuizQuestion(DeleteQuizQuestionRequest request) {
    return client.deleteQuizQuestion(request);
  }

  public PostCreatePuzzleResponse createPuzzle(PostCreatePuzzleRequest request) {
    return client.postCreatePuzzle(request);
  }

  public GetPuzzleResponse getPuzzle(GetPuzzleRequest request) {
    return client.getPuzzle(request);
  }

  public GetPuzzlesResponse getPuzzles(GetPuzzlesRequest request) {
    return client.getPuzzles(request);
  }

  public UpdatePuzzleResponse updatePuzzle(UpdatePuzzleRequest request) {
    return client.updatePuzzle(request);
  }

  public CreatePieceResponse createPiece(CreatePieceRequest request) {
    return client.createPiece(request);
  }

  public GetPieceResponse getPiece(GetPieceRequest request) {
    return client.getPiece(request);
  }

  public GetAllPiecesResponse getAllPieces(GetAllPiecesRequest request) {
    return client.getAllPieces(request);
  }

  public UpdatePieceResponse updatePiece(UpdatePieceRequest request) {
    return client.updatePiece(request);
  }


  public DeletePieceResponse deletePiece(DeletePieceRequest request) {
    return client.deletePiece(request);
  }

  public GetAllPiecePlayersResponse getAllPiecePlayers(GetAllPiecePlayersRequest request) {
    return client.getAllPiecePlayers(request);
  }

  public CreateGameTurnResponse createGameTurn(CreateGameTurnRequest request) {
    return client.createGameTurn(request);
  }

  public TransferPieceResponse transferPiece(TransferPieceRequest build) {
    return client.transferPiece(build);
  }

  public GetGameTurnsResponse getGameTurns(GetGameTurnsRequest request) {
    return client.getGameTurns(request);
  }

  public TransferGameTurnResponse transferGameTurn(TransferGameTurnRequest build) {
    return client.transferGameTurn(build);
  }
}
