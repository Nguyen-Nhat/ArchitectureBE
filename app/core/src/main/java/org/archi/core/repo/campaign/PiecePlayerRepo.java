package org.archi.core.repo.campaign;

import org.archi.core.entity.campaign.Piece;
import org.archi.core.entity.campaign.PiecePlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PiecePlayerRepo extends JpaRepository<PiecePlayer, Long> {
  List<PiecePlayer> findAllByPieceAndPlayerId(Piece piece, Long playerId);

  List<PiecePlayer> findAllByPlayerId(long playerId);

  List<PiecePlayer> findAllByPieceAndPlayerId(Piece piece, long playerId);

  @Transactional
  @Query(value = "select * from piece_players where piece_id = :pieceId AND player_id = :senderId ", nativeQuery = true)
  PiecePlayer findAllByPieceIdAndPlayerId(long pieceId, long senderId);
}
