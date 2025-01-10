package org.archi.core.service;

import lombok.AllArgsConstructor;
import org.archi.core.entity.Piece;
import org.archi.core.repo.PieceRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class PieceService {
  private final PieceRepo pieceRepo;

  public Piece save(Piece piece) {
    return pieceRepo.save(piece);
  }

  public void delete(Piece piece) {
    try {
      pieceRepo.delete(piece);
    } catch (Exception e) {
      throw new RuntimeException("Error deleting piece");
    }
  }

  public Piece findById(long pieceId) {
    return pieceRepo.findById(pieceId).orElse(null);
  }
}
