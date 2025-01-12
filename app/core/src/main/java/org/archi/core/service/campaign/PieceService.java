package org.archi.core.service.campaign;

import lombok.RequiredArgsConstructor;
import org.archi.common.core.*;
import org.archi.core.entity.PuzzleStatus;
import org.archi.core.entity.campaign.Piece;
import org.archi.core.entity.campaign.PieceGame;
import org.archi.core.entity.campaign.PiecePlayer;
import org.archi.core.entity.campaign.Puzzle;
import org.archi.core.entity.game.Game;
import org.archi.core.repo.campaign.*;
import org.archi.core.repo.game.GameRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PieceService {
  private static final Logger logger = LoggerFactory.getLogger(PieceService.class);
  private final PieceRepo pieceRepo;
  private final PuzzleRepo puzzleRepo;
  private final GameTurnRepo gameTurnRepo;
  private final PiecePlayerRepo piecePlayerRepo;
  private final PieceGameRepo pieceGameRepo;
  private final GameRepo gameRepo;

  public List<Piece> getAllPieces() {
    return pieceRepo.findAll();
  }

  public GetAllPiecesResponse getAllPieces(GetAllPiecesRequest request) {
    long puzzleId = request.getPuzzleId();
    Puzzle puzzle = puzzleRepo.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return GetAllPiecesResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    return GetAllPiecesResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .addAllPieces(puzzle.getPieces().stream().map(p -> org.archi.common.core.Piece.newBuilder()
                            .setId(p.getId())
                            .setPuzzleId(p.getPuzzle().getId())
                            .setImage(p.getImage())
                            .setOrdinal(p.getOrdinal())
                            .setQuantity(p.getQuantity())
                            .build())
                    .collect(Collectors.toList()))
            .build();
  }

  public Piece getPieceById(Long id) {
    return pieceRepo.findById(id)
            .orElseGet(() -> {
              logger.warn("Piece not found with id: {}", id);
              return null;
            });
  }

  public void addPiece(Piece piece) throws Exception {
    try {
      pieceRepo.save(piece);
    } catch (Exception e) {
      throw new Exception("Failed to add piece");
    }
  }

  public Piece updatePiece(Long id, Piece updatedPiece) {
    Piece piece = getPieceById(id);
    piece.setImage(updatedPiece.getImage());
    return pieceRepo.save(piece);
  }

  public UpdatePieceResponse updatePiece(UpdatePieceRequest request) {
    long puzzleId = request.getPuzzleId();
    long pieceId = request.getPieceId();
    Puzzle puzzle = puzzleRepo.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return UpdatePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    Piece piece = null;
    for (Piece p : puzzle.getPieces()) {
      if (p.getId() == pieceId) {
        piece = p;
        break;
      }
    }
    if (piece == null || piece.getId() <= 0) {
      return UpdatePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Piece not found").build();
    }

    if (request.hasImage()) {
      piece.setImage(request.getImage().getValue());
    }
    if (request.hasOrdinal()) {
      piece.setOrdinal(request.getOrdinal().getValue());
    }
    if (request.hasQuantity()) {
      piece.setQuantity(request.getQuantity().getValue());
    }

    try {
      pieceRepo.save(piece);
    } catch (Exception e) {
      return UpdatePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to update piece").build();
    }
    return UpdatePieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public DeletePieceResponse deletePiece(DeletePieceRequest request) {
    long puzzleId = request.getPuzzleId();
    long pieceId = request.getPieceId();
    Puzzle puzzle = puzzleRepo.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return DeletePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    for (Piece p : puzzle.getPieces()) {
      if (p.getId() == pieceId) {
        try {
          /// Lưu ý phải xoá piece trong puzzle trước rồi mới xoá piece, sau đó cập nhật puzzle lại rồi mới xoá piece.
          puzzle.getPieces().remove(p);
          puzzleRepo.save(puzzle);
          pieceRepo.delete(p);
        } catch (RuntimeException e) {
          logger.info(e.getMessage());
          return DeletePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to delete piece").build();
        }
        return DeletePieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
      }
    }
    return DeletePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Piece not found").build();
  }

  public void deletePiece(Long id) {
    getPieceById(id);
    pieceRepo.deleteById(id);
  }

  private Piece returnRandomPiece(Puzzle puzzle, int times) {
    if (times == 0) return null;
    int numberOfPieces = puzzle.getNumberOfPieces();
    int random = (int) (Math.random() * numberOfPieces) + 1;
    ///  Lấy ra mảnh ghép tương ứng.
    Piece piece = puzzle.getPieces().get(random - 1);
    if (piece.getQuantity() <= 0)
      return returnRandomPiece(puzzle, times - 1); /// Hàm này sẽ lặp tối đa 5 lần. Nếu ết 5 lần mà không có piece.quantity > 0 thì return null.
    piece.setQuantity(piece.getQuantity() - 1);
    try {
      pieceRepo.save(piece);
    } catch (Exception e) {
      logger.error("Can't save piece - returnRandomPiece()", e);
      return null;
    }
    return piece;
  }


  public Piece getRandomPiece(Long playerId, Long gameId) {
    /// Lưu thông tin piece - player.
    List<Puzzle> puzzles = puzzleRepo.findAllByStatus(PuzzleStatus.HAPPENING);
    if (puzzles.isEmpty()) return null;
    Puzzle current = puzzles.getFirst();
    Piece piece = returnRandomPiece(current, 5);  /// Cho phép vòng lặp đệ quy tối đa 5 lần.

    /// Kiểm tra xem tồn tại cặp piece-player này chưa.
    List<PiecePlayer> piecePlayers = piecePlayerRepo.findAllByPieceAndPlayerId(piece, playerId);
    PiecePlayer data = null;
    if (piecePlayers.isEmpty()) {
      /// Tạo mới.
      data = PiecePlayer.builder()
              .piece(piece)
              .playerId(playerId)
              .quantity(0)
              .build();
    } else data = piecePlayers.getFirst();

    /// Cập nhật quantity.
    data.setQuantity(data.getQuantity() + 1);
    try {
      piecePlayerRepo.save(data);
    } catch (Exception e) {
      return null;
    }
    /// Lưu piece - player thành công.

    /// Lưu thông tin piece - gameId.
    Game game = gameRepo.findById(gameId).orElse(null);
    if (game != null) {
      PieceGame pieceGame = pieceGameRepo.findByPieceAndGame(piece, game).orElse(null);
      if (pieceGame == null) {
        pieceGame = PieceGame.builder()
                .piece(piece)
                .game(game)
                .quantity(0)
                .build();
      }
      pieceGame.setQuantity(pieceGame.getQuantity() + 1);
      pieceGameRepo.save(pieceGame);
    }
    return piece;
  }

  public GetPieceResponse getPiece(GetPieceRequest request) {
    long puzzleId = request.getPuzzleId();
    long pieceId = request.getPieceId();
    Puzzle puzzle = puzzleRepo.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return GetPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    for (Piece p : puzzle.getPieces()) {
      if (p.getId() == pieceId) {
        return GetPieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").setPiece(org.archi.common.core.Piece.newBuilder()
                        .setId(p.getId())
                        .setImage(p.getImage())
                        .setOrdinal(p.getOrdinal())
                        .setPuzzleId(p.getPuzzle().getId())
                        .setQuantity(p.getQuantity()).build())
                .build();
      }
    }
    return GetPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Piece not found").build();
  }

  public CreateGameTurnResponse createGameTurn(CreateGameTurnRequest request) {
    return null;
  }
}

