package org.archi.core.repo;

import org.archi.core.entity.Piece;
import org.archi.core.entity.PiecePlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PiecePlayersRepo extends JpaRepository<PiecePlayer, Long> {
  List<PiecePlayer> findAllByPlayerId(long playerId);

  List<PiecePlayer> findAllByPieceAndPlayerId(Piece piece, long playerId);

  @Transactional
  @Query(value = "select * from piece_players where piece_id = :pieceId AND player_id = :senderId ", nativeQuery = true)
  PiecePlayer findAllByPieceIdAndPlayerId(long pieceId, long senderId);
}
