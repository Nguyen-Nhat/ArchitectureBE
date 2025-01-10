package org.archi.bff.adapter;

import com.google.protobuf.Empty;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.archi.common.auth.PostCreateAccountRequest;
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

  public PostCreatePuzzleResponse createPuzzle(PostCreatePuzzleRequest request) {
    return client.postCreatePuzzle(request);
  }

  public GetPuzzlesResponse getPuzzles(GetPuzzlesRequest request) {
    return client.getPuzzles(request);
  }

  public UpdatePuzzleResponse updatePuzzle(UpdatePuzzleRequest request) {
    return client.updatePuzzle(request);
  }

  public GetPuzzleResponse getPuzzle(GetPuzzleRequest request) {
    return client.getPuzzle(request);
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

  public GetRandomPieceResponse getRandomPiece(GetRandomPieceRequest request) {
    return client.getRandomPiece(request);
  }

  public GetAllPiecePlayersResponse getAllPiecePlayers(GetAllPiecePlayersRequest request) {
    return client.getAllPiecePlayers(request);
  }

  public CreatePiecePlayerResponse createPiecePlayer(CreatePiecePlayerRequest request) {
    return client.createPiecePlayer(request);
  }

  public TransferPieceResponse transferPiecePlayer(TransferPieceRequest request) {
    return client.transferPiece(request);
  }

  public GetGameTurnsResponse getGameTurns(GetGameTurnsRequest request) {
    return client.getGameTurns(request);
  }

  public TransferGameTurnResponse transferGameTurn(TransferGameTurnRequest request) {
    return client.transferGameTurn(request);
  }
}
