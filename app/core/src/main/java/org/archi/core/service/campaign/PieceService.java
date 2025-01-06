package org.archi.core.service.campaign;

import lombok.RequiredArgsConstructor;
import org.archi.core.entity.campaign.Piece;
import org.archi.core.repo.campaign.PieceRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class PieceService {
    private static final Logger logger = LoggerFactory.getLogger(PieceService.class);
    private final PieceRepo pieceRepo;

    public List<Piece> getAllPieces() {
        return pieceRepo.findAll();
    }

    public Piece getPieceById(Long id) {
        return pieceRepo.findById(id)
                .orElseGet(() -> {
                    logger.warn("Piece not found with id: {}", id);
                    return null;
                });
    }

    public Piece addPiece(Piece piece) {
        return pieceRepo.save(piece);
    }

    public Piece updatePiece(Long id, Piece updatedPiece) {
        Piece piece = getPieceById(id);
        piece.setImageUrl(updatedPiece.getImageUrl());
        return pieceRepo.save(piece);
    }

    public void deletePiece(Long id) {
        getPieceById(id);
        pieceRepo.deleteById(id);
    }

    public Piece getRandomPiece(Long playerId, Long gameId) {
        // just for testing
        List<Piece> pieceList = getAllPieces();
        Random random = new Random();
        int randomIndex = random.nextInt(pieceList.size());
        return pieceList.get(randomIndex);
    }
}

