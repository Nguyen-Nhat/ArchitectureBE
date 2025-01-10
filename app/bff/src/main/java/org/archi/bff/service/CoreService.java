package org.archi.bff.service;

import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import lombok.RequiredArgsConstructor;
import org.archi.bff.adapter.AuthAdapter;
import org.archi.bff.adapter.CoreAdapter;
import org.archi.bff.request.*;
import org.archi.bff.response.PieceResponse;
import org.archi.bff.response.PuzzleResponse;
import org.archi.bff.response.ResponseData;
import org.archi.common.auth.*;
import org.archi.common.core.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CoreService {
  private final CoreAdapter coreAdapter;
  private final AuthAdapter authAdapter;

  public ResponseEntity<ResponseData> getVouchers(Long playerId) {
    try {
      GetVouchersRequest request = GetVouchersRequest.newBuilder().setPlayerId(playerId).build();

      GetVouchersResponse response = coreAdapter.getVouchers(request);

      ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response);
      return ResponseEntity.ok(responseData);

    } catch (Exception e) {
      ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
      return ResponseEntity.internalServerError().body(errorResponse);
    }
  }

  public ResponseEntity<ResponseData> getVoucherTypes(Long playerId) {
    try {
      // Create gRPC request for voucher types
      GetVoucherTypesReq request = GetVoucherTypesReq.newBuilder().setBrandId(playerId).build();

      GetVoucherTypesRes response = coreAdapter.getVoucherTypes(request);
      ResponseData responseData = new ResponseData(HttpStatus.OK.value(), "success", response.getVoucherTypesList());
      return ResponseEntity.ok(responseData);

    } catch (Exception e) {
      ResponseData errorResponse = new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", e.getMessage());
      return ResponseEntity.internalServerError().body(errorResponse);
    }
  }

  public ResponseEntity<ResponseData> createVoucherType(CreateVoucherTypeRequest request) {
    try {
      CreateVoucherTypeResponse response = coreAdapter.createVoucherType(request);
      return ResponseEntity.ok(new ResponseData(HttpStatus.OK.value(), "succes", response.getVoucherType()));
    } catch (Exception e) {
      return ResponseEntity.internalServerError().body(new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Failed to create voucher type", e.getMessage()));
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

  public ResponseData createPuzzle(CreatePuzzleRequest request) {
    PostCreatePuzzleResponse response = coreAdapter.createPuzzle(PostCreatePuzzleRequest.newBuilder().setTitle(request.getTitle()).setImage(request.getImage()).setStartDate(request.getStartDate().toString()).setEndDate(request.getEndDate().toString()).setNumberOfPieces(request.getNumberOfPieces()).build());
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData getPuzzles(Integer page, Integer size, String sort, String title) {
    GetPuzzlesRequest.Builder builder = GetPuzzlesRequest.newBuilder();
    builder.setPage(page);
    builder.setSize(size);

    if (StringUtils.hasText(sort)) {
      builder.setSort(StringValue.of(sort));
    }
    if (StringUtils.hasText(title)) {
      builder.setTitle(StringValue.of(title));
    }
    GetPuzzlesRequest request = builder.build();
    GetPuzzlesResponse response = coreAdapter.getPuzzles(request);
    List<PuzzleResponse> puzzles = response.getPuzzleList().stream().map(puzzle -> PuzzleResponse.builder().id(puzzle.getId()).title(puzzle.getTitle()).image(puzzle.getImage()).startDate(Date.valueOf(puzzle.getStartDate())).endDate(Date.valueOf(puzzle.getEndDate())).numberOfPieces(puzzle.getNumberOfPieces()).status(puzzle.getStatus()).build()).toList();
    return new ResponseData(response.getStatus(), response.getMessage(), Map.of("puzzles", puzzles, "totalPage", response.getTotalPage(), "totalElement", response.getTotalElement(), "page", response.getPage() + 1, "size", response.getSize()));
  }

  public ResponseData updatePuzzle(Long id, UpdatedPuzzle update) {
    UpdatePuzzleRequest.Builder builder = UpdatePuzzleRequest.newBuilder();
    builder.setId(id);
    if (StringUtils.hasText(update.getTitle())) {
      builder.setTitle(StringValue.of(update.getTitle()));
    }
    if (StringUtils.hasText(update.getImage())) {
      builder.setImage(StringValue.of(update.getImage()));
    }
    if (update.getStartDate() != null) {
      builder.setStartDate(StringValue.of(update.getStartDate().toString()));
    }
    if (update.getEndDate() != null) {
      builder.setEndDate(StringValue.of(update.getEndDate().toString()));
    }
    if (update.getNumberOfPieces() != null) {
      builder.setNumberOfPieces(Int32Value.of(update.getNumberOfPieces()));
    }
    if (StringUtils.hasText(update.getStatus())) {
      builder.setStatus(StringValue.of(update.getStatus()));
    }
    UpdatePuzzleRequest request = builder.build();
    UpdatePuzzleResponse response = coreAdapter.updatePuzzle(request);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData getPuzzle(Long id) {
    GetPuzzleRequest request = GetPuzzleRequest.newBuilder().setId(id).build();
    GetPuzzleResponse response = coreAdapter.getPuzzle(request);
    PuzzleResponse puzzle = null;
    if (response.hasPuzzle()) {
      puzzle = PuzzleResponse.builder().id(response.getPuzzle().getId()).title(response.getPuzzle().getTitle()).image(response.getPuzzle().getImage()).startDate(Date.valueOf(response.getPuzzle().getStartDate())).endDate(Date.valueOf(response.getPuzzle().getEndDate())).numberOfPieces(response.getPuzzle().getNumberOfPieces()).status(response.getPuzzle().getStatus()).build();
    }
    return new ResponseData(response.getStatus(), response.getMessage(), puzzle);
  }

  public ResponseData createPiece(Long id, PieceRequest pieceRequest) {
    CreatePieceRequest request = CreatePieceRequest.newBuilder().setImage(pieceRequest.getImage()).setOrdinal(pieceRequest.getOrdinal()).setQuantity(pieceRequest.getQuantity()).setPuzzleId(id).build();

    CreatePieceResponse response = coreAdapter.createPiece(request);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData getPiece(Long puzzleId, Long pieceId) {
    GetPieceRequest request = GetPieceRequest.newBuilder().setPuzzleId(puzzleId).setPieceId(pieceId).build();

    GetPieceResponse response = coreAdapter.getPiece(request);
    PieceResponse piece = null;
    if (response.hasPiece()) {
      piece = PieceResponse.builder().id(response.getPiece().getId()).puzzleId(response.getPiece().getPuzzleId()).image(response.getPiece().getImage()).ordinal(response.getPiece().getOrdinal()).quantity(response.getPiece().getQuantity()).build();
    }
    return new ResponseData(response.getStatus(), response.getMessage(), piece);
  }

  public ResponseData getAllPieces(Long puzzleId) {
    GetAllPiecesRequest request = GetAllPiecesRequest.newBuilder().setPuzzleId(puzzleId).build();
    GetAllPiecesResponse response = coreAdapter.getAllPieces(request);
    List<PieceResponse> pieces = response.getPiecesList().stream().map(piece -> PieceResponse.builder().id(piece.getId()).puzzleId(piece.getPuzzleId()).image(piece.getImage()).ordinal(piece.getOrdinal()).quantity(piece.getQuantity()).build()).toList();
    return new ResponseData(response.getStatus(), response.getMessage(), pieces);
  }

  public ResponseData updatePiece(Long puzzleId, Long pieceId, UpdatedPiece updatedPiece) {
    UpdatePieceRequest.Builder builder = UpdatePieceRequest.newBuilder();
    builder.setPuzzleId(puzzleId);
    builder.setPieceId(pieceId);

    if (StringUtils.hasText(updatedPiece.getImage())) {
      builder.setImage(StringValue.of(updatedPiece.getImage()));
    }
    if (updatedPiece.getOrdinal() != null) {
      builder.setOrdinal(Int32Value.of(updatedPiece.getOrdinal()));
    }
    if (updatedPiece.getQuantity() != null) {
      builder.setQuantity(Int32Value.of(updatedPiece.getQuantity()));
    }
    UpdatePieceRequest request = builder.build();
    UpdatePieceResponse response = coreAdapter.updatePiece(request);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData deletePiece(Long puzzleId, Long pieceId) {
    DeletePieceRequest request = DeletePieceRequest.newBuilder().setPuzzleId(puzzleId).setPieceId(pieceId).build();
    DeletePieceResponse response = coreAdapter.deletePiece(request);
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData getRandomPiece(Long accountId) {
    RetrievePlayerProfileResponse res = authAdapter.retrievePlayerProfile(RetrievePlayerProfileRequest.newBuilder().setId(accountId).build());

    if (!res.hasPlayer()) {
      return new ResponseData(res.getStatus(), res.getMessage(), null);
    }

    long playerId = res.getPlayer().getId();
    GetRandomPieceRequest request = GetRandomPieceRequest.newBuilder().setPlayerId(playerId).build();
    GetRandomPieceResponse response = coreAdapter.getRandomPiece(request);
    if (response.hasPiece()) {
      PieceResponse piece = PieceResponse.builder().id(response.getPiece().getId()).puzzleId(response.getPiece().getPuzzleId()).image(response.getPiece().getImage()).ordinal(response.getPiece().getOrdinal()).quantity(response.getPiece().getQuantity()).build();
      return new ResponseData(response.getStatus(), response.getMessage(), piece);
    }
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData getAllPiecePlayers(Long accountId) {
    RetrievePlayerProfileResponse response = authAdapter.retrievePlayerProfile(RetrievePlayerProfileRequest.newBuilder().setId(accountId).build());

    if (response.hasPlayer()) {
      long playerId = response.getPlayer().getId();
      GetAllPiecePlayersRequest request = GetAllPiecePlayersRequest.newBuilder().setPlayerId(playerId).build();
      GetAllPiecePlayersResponse piecePlayersResponse = coreAdapter.getAllPiecePlayers(request);
      List<PieceResponse> pieces = piecePlayersResponse.getPieceList().stream().map(piece -> PieceResponse.builder().id(piece.getId()).puzzleId(piece.getPuzzleId()).image(piece.getImage()).ordinal(piece.getOrdinal()).quantity(piece.getQuantity()).build()).toList();
      return new ResponseData(piecePlayersResponse.getStatus(), piecePlayersResponse.getMessage(), pieces);
    }
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData createPiecePlayers(Long accountId, PiecePlayerRequest request) {
    RetrievePlayerProfileResponse response = authAdapter.retrievePlayerProfile(RetrievePlayerProfileRequest.newBuilder().setId(accountId).build());

    if (response.hasPlayer()) {
      CreatePiecePlayerResponse piecePlayerResponse = coreAdapter.createPiecePlayer(CreatePiecePlayerRequest.newBuilder().setPlayerId(response.getPlayer().getId()).setPieceId(request.getPieceId()).build());
      return new ResponseData(piecePlayerResponse.getStatus(), piecePlayerResponse.getMessage(), null);
    }
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData transferPiecePlayer(Long accountId, String transferType, TransferRequest request) {
    Player sender = authAdapter.retrievePlayerProfile(RetrievePlayerProfileRequest.newBuilder().setId(accountId).build()).getPlayer();

    Player recipient = null;
    if (transferType.equals("email")) {
      String email = request.getInfo();
      GetPlayerByEmailRequest emailRequest = GetPlayerByEmailRequest.newBuilder().setEmail(email).build();
      GetPlayerByEmailResponse response = authAdapter.getPlayerByEmail(emailRequest);
      if (response.hasPlayer()) {
        recipient = response.getPlayer();
      }
    } else if (transferType.equals("phoneNumber")) {
      String phoneNumber = request.getInfo();
      GetPlayerByPhoneNumberRequest phoneNumberRequest = GetPlayerByPhoneNumberRequest.newBuilder().setPhoneNumber(phoneNumber).build();
      GetPlayerByPhoneNumberResponse response = authAdapter.getPlayerByPhoneNumber(phoneNumberRequest);
      if (response.hasPlayer()) {
        recipient = response.getPlayer();
      }
    }
    if (recipient == null) {
      return new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Recipient not found", null);
    }

    long senderId = sender.getId();
    long recipientId = recipient.getId();

    TransferPieceResponse response = coreAdapter.transferPiecePlayer(TransferPieceRequest.newBuilder().setSenderId(senderId).setRecipientId(recipientId).setPieceId(request.getPieceId()).build());
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }

  public ResponseData getGameTurns(Long accountId) {
    RetrievePlayerProfileResponse response = authAdapter.retrievePlayerProfile(RetrievePlayerProfileRequest.newBuilder().setId(accountId).build());

    if (!response.hasPlayer()) {
      return new ResponseData(response.getStatus(), response.getMessage(), null);
    }
    long playerId = response.getPlayer().getId();
    GetGameTurnsRequest request = GetGameTurnsRequest.newBuilder().setPlayerId(playerId).build();
    GetGameTurnsResponse gameTurnsResponse = coreAdapter.getGameTurns(request);
    return new ResponseData(gameTurnsResponse.getStatus(), gameTurnsResponse.getMessage(), Map.of("turns", String.valueOf(gameTurnsResponse.getTimes())));
  }

  public ResponseData transferGameTurn(Long accountId, String transferType, TurnTransferRequest request) {
    Player sender = authAdapter.retrievePlayerProfile(RetrievePlayerProfileRequest.newBuilder().setId(accountId).build()).getPlayer();
    Player recipient = null;
    if (transferType.equals("email")) {
      String email = request.getInfo();
      GetPlayerByEmailRequest emailRequest = GetPlayerByEmailRequest.newBuilder().setEmail(email).build();
      GetPlayerByEmailResponse response = authAdapter.getPlayerByEmail(emailRequest);
      if (response.hasPlayer()) {
        recipient = response.getPlayer();
      }
    } else if (transferType.equals("phoneNumber")) {
      String phoneNumber = request.getInfo();
      GetPlayerByPhoneNumberRequest phoneNumberRequest = GetPlayerByPhoneNumberRequest.newBuilder().setPhoneNumber(phoneNumber).build();
      GetPlayerByPhoneNumberResponse response = authAdapter.getPlayerByPhoneNumber(phoneNumberRequest);
      if (response.hasPlayer()) {
        recipient = response.getPlayer();
      }
    }
    if (recipient == null) {
      return new ResponseData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Recipient not found", null);
    }

    long senderId = sender.getId();
    long recipientId = recipient.getId();


    TransferGameTurnResponse response = coreAdapter.transferGameTurn(TransferGameTurnRequest.newBuilder().setSenderId(senderId).setRecipientId(recipientId).setTimes(request.getTimes()).build());
    return new ResponseData(response.getStatus(), response.getMessage(), null);
  }
}
