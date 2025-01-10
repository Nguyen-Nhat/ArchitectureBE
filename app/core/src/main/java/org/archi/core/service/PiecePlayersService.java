package org.archi.core.service;

import lombok.AllArgsConstructor;
import org.archi.core.entity.Piece;
import org.archi.core.entity.PiecePlayer;
import org.archi.core.repo.PiecePlayersRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PiecePlayersService {
  private final PiecePlayersRepo piecePlayersRepo;

  public List<PiecePlayer> findAllByPlayerId(long playerId) {
    return piecePlayersRepo.findAllByPlayerId(playerId);
  }

  public List<PiecePlayer> findAllByPieceAndPlayerId(Piece piece, long playerId) {
    return piecePlayersRepo.findAllByPieceAndPlayerId(piece, playerId);
  }

  public PiecePlayer save(PiecePlayer data) {
    try {
      return piecePlayersRepo.save(data);
    } catch (Exception e) {
      return null;
    }
  }

  public PiecePlayer findAllByPieceIdAndPlayerId(long pieceId, long senderId) {
    return piecePlayersRepo.findAllByPieceIdAndPlayerId(pieceId, senderId);
  }
}
