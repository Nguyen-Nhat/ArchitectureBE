package org.archi.core.repo.campaign;

import org.archi.core.entity.campaign.Piece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieceRepo extends JpaRepository<Piece, Long> {
}
