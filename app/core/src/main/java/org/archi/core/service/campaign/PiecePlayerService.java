package org.archi.core.service.campaign;

import lombok.AllArgsConstructor;
import org.archi.common.core.*;
import org.archi.core.entity.campaign.PiecePlayer;
import org.archi.core.repo.campaign.PiecePlayerRepo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PiecePlayerService {
  private final PiecePlayerRepo piecePlayerRepo;

  public TransferPieceResponse transferPiece(TransferPieceRequest request) {
    long senderId = request.getSenderId();
    long recipientId = request.getRecipientId();
    long pieceId = request.getPieceId();

    PiecePlayer pieceSenders = piecePlayerRepo.findAllByPieceIdAndPlayerId(pieceId, senderId);
    if (pieceSenders == null || pieceSenders.getId() <= 0) {
      return TransferPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Player hasn't this piece").build();
    }

    if (pieceSenders.getQuantity() <= 0) {
      return TransferPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("The piece's quantity isn't enough to transfer").build();
    }


    PiecePlayer pieceRecipients = piecePlayerRepo.findAllByPieceIdAndPlayerId(pieceId, recipientId);
    if (pieceRecipients == null || pieceRecipients.getId() <= 0) {
      /// Tạo mới.
      pieceRecipients = PiecePlayer.builder()
              .piece(pieceSenders.getPiece())
              .playerId(recipientId)
              .quantity(0)
              .build();
    }

    ///  Cập nhật lại quantity cho cả Sender và Recipient.
    pieceSenders.setQuantity(pieceSenders.getQuantity() - 1);
    pieceRecipients.setQuantity(pieceRecipients.getQuantity() + 1);
    try {
      piecePlayerRepo.save(pieceSenders);
    } catch (Exception e) {
      return TransferPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to transfer piece").build();
    }

    try {
      piecePlayerRepo.save(pieceRecipients);
    } catch (Exception e) {
      pieceSenders.setQuantity(pieceSenders.getQuantity() + 1);
      piecePlayerRepo.save(pieceSenders);
      return TransferPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to transfer piece").build();
    }
    return TransferPieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public GetAllPiecePlayersResponse getAllPiecePlayers(GetAllPiecePlayersRequest request) {
    long playerId = request.getPlayerId();
    List<PiecePlayer> piecePlayers = piecePlayerRepo.findAllByPlayerId(playerId);
    return GetAllPiecePlayersResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .addAllPiece(piecePlayers.stream().map(piecePlayer -> Piece.newBuilder()
                    .setId(piecePlayer.getPiece().getId())
                    .setPuzzleId(piecePlayer.getPiece().getPuzzle().getId())
                    .setImage(piecePlayer.getPiece().getImage())
                    .setOrdinal(piecePlayer.getPiece().getOrdinal())
                    .setQuantity(piecePlayer.getQuantity())
                    .build()).collect(Collectors.toList()))
            .build();
  }
}
