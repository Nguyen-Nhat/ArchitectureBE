package org.archi.core.repo.campaign;

import org.archi.core.entity.campaign.Piece;
import org.archi.core.entity.campaign.PieceGame;
import org.archi.core.entity.game.Game;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PieceGameRepo extends JpaRepository<PieceGame, Long> {
  List<PieceGame> findAllByPieceAndGame(Piece piece, Game game);

  Optional<PieceGame> findByPieceAndGame(Piece piece, Game game);
}
