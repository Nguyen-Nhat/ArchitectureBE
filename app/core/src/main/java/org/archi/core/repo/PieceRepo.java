package org.archi.core.repo;

import org.archi.core.entity.Piece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieceRepo extends JpaRepository<Piece, Long> {
}
