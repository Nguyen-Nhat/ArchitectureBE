package org.archi.core.service;

import lombok.AllArgsConstructor;
import org.archi.common.core.*;
import org.archi.core.entity.GameTurn;
import org.archi.core.entity.PiecePlayer;
import org.archi.core.entity.Puzzle;
import org.archi.core.entity.PuzzleStatus;
import org.archi.core.specifications.PuzzleSpecs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GrpcCoreService {
  private final PuzzleService puzzleService;
  private final PieceService pieceService;
  private final PiecePlayersService piecePlayersService;
  private final GameTurnService gameTurnService;

  public PostCreatePuzzleResponse createPuzzle(PostCreatePuzzleRequest request) {
    List<Puzzle> puzzles = puzzleService.findAllByStatus(PuzzleStatus.HAPPENING);
    if (!puzzles.isEmpty()) {
      ///  Đã có sự kiện đang mở, không được phép tạo mới.
      return PostCreatePuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Event is happening, cannot create new event").build();
    }

    /// Tạo mới puzzle.
    Puzzle puzzle = Puzzle.builder().title(request.getTitle()).status(PuzzleStatus.HAPPENING).image(request.getImage()).numberOfPieces(request.getNumberOfPieces()).startDate(Date.valueOf(request.getStartDate())).endDate(Date.valueOf(request.getEndDate())).build();
    puzzle = puzzleService.save(puzzle);
    if (puzzle == null || puzzle.getId() <= 0) {
      return PostCreatePuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to create puzzle").build();
    }
    return PostCreatePuzzleResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public GetPuzzlesResponse getPuzzles(GetPuzzlesRequest request) {
    int page = request.getPage();
    int size = request.getSize();

    Pageable pageable = null;
    if (request.hasSort()) {
      List<Sort.Order> orders = new ArrayList<>();
      String sort = request.getSort().getValue();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = PageRequest.of(page, size);

    Specification<Puzzle> specs = null;
    if (request.hasTitle()) {
      specs = PuzzleSpecs.containsTitle(request.getTitle().getValue());
    }


    Page<Puzzle> puzzles = null;
    try {
      puzzles = puzzleService.findAll(specs, pageable);
    } catch (RuntimeException e) {
      return GetPuzzlesResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to get accounts").build();
    }

    return GetPuzzlesResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").addAllPuzzle(puzzles.stream().map(puzzle -> org.archi.common.core.Puzzle.newBuilder().setId(puzzle.getId()).setTitle(puzzle.getTitle()).setImage(puzzle.getImage()).setStartDate(puzzle.getStartDate().toString()).setEndDate(puzzle.getEndDate().toString()).setNumberOfPieces(puzzle.getNumberOfPieces()).setStatus(puzzle.getStatus().name()).build()).collect(Collectors.toList())).setTotalElement(puzzles.getTotalElements()).setTotalPage(puzzles.getTotalPages()).setPage(puzzles.getNumber()).setSize(puzzles.getSize()).build();
  }

  public UpdatePuzzleResponse updatePuzzle(UpdatePuzzleRequest request) {
    long id = request.getId();
    Puzzle puzzle = puzzleService.findById(id);
    if (puzzle == null || puzzle.getId() <= 0) {
      return UpdatePuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    if (request.hasTitle()) {
      puzzle.setTitle(request.getTitle().getValue());
    }
    if (request.hasImage()) {
      puzzle.setImage(request.getImage().getValue());
    }
    if (request.hasStartDate()) {
      puzzle.setStartDate(Date.valueOf(request.getStartDate().getValue()));
    }
    if (request.hasEndDate()) {
      puzzle.setEndDate(Date.valueOf(request.getEndDate().getValue()));
    }
    if (request.hasNumberOfPieces()) {
      puzzle.setNumberOfPieces(request.getNumberOfPieces().getValue());
    }
    if (request.hasStatus()) {
      try {
        PuzzleStatus status = PuzzleStatus.valueOf(request.getStatus().getValue());
      } catch (Exception e) {
        return UpdatePuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Invalid status").build();
      }
      puzzle.setStatus(PuzzleStatus.valueOf(request.getStatus().getValue()));
    }

    puzzle = puzzleService.save(puzzle);
    if (puzzle == null || puzzle.getId() <= 0) {
      return UpdatePuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to update puzzle").build();
    }
    return UpdatePuzzleResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public GetPuzzleResponse getPuzzle(GetPuzzleRequest request) {
    long id = request.getId();
    Puzzle puzzle = puzzleService.findById(id);
    if (puzzle == null || puzzle.getId() <= 0) {
      return GetPuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    return GetPuzzleResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").setPuzzle(org.archi.common.core.Puzzle.newBuilder().setId(puzzle.getId()).setTitle(puzzle.getTitle()).setImage(puzzle.getImage()).setStartDate(puzzle.getStartDate().toString()).setEndDate(puzzle.getEndDate().toString()).setNumberOfPieces(puzzle.getNumberOfPieces()).setStatus(puzzle.getStatus().name()).build()).build();
  }


  public CreatePieceResponse createPiece(CreatePieceRequest request) {
    long puzzleId = request.getPuzzleId();
    Puzzle puzzle = puzzleService.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return CreatePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    org.archi.core.entity.Piece piece = org.archi.core.entity.Piece.builder().image(request.getImage()).ordinal(request.getOrdinal()).quantity(request.getQuantity()).puzzle(puzzle).build();
    piece = pieceService.save(piece);
    if (piece == null || piece.getId() <= 0) {
      return CreatePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to create piece").build();
    }
    return CreatePieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public GetPieceResponse getPiece(GetPieceRequest request) {
    long puzzleId = request.getPuzzleId();
    long pieceId = request.getPieceId();
    Puzzle puzzle = puzzleService.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return GetPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    for (org.archi.core.entity.Piece p : puzzle.getPieces()) {
      if (p.getId() == pieceId) {
        return GetPieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").setPiece(Piece.newBuilder().setId(p.getId()).setPuzzleId(p.getPuzzle().getId()).setImage(p.getImage()).setOrdinal(p.getOrdinal()).setQuantity(p.getQuantity()).build()).build();
      }
    }
    return GetPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Piece not found").build();
  }

  public GetAllPiecesResponse getAllPieces(GetAllPiecesRequest request) {
    long puzzleId = request.getPuzzleId();
    Puzzle puzzle = puzzleService.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return GetAllPiecesResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    return GetAllPiecesResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").addAllPieces(puzzle.getPieces().stream().map(p -> Piece.newBuilder().setId(p.getId()).setPuzzleId(p.getPuzzle().getId()).setImage(p.getImage()).setOrdinal(p.getOrdinal()).setQuantity(p.getQuantity()).build()).collect(Collectors.toList())).build();
  }

  public UpdatePieceResponse updatePiece(UpdatePieceRequest request) {
    long puzzleId = request.getPuzzleId();
    long pieceId = request.getPieceId();
    Puzzle puzzle = puzzleService.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return UpdatePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    org.archi.core.entity.Piece piece = null;
    for (org.archi.core.entity.Piece p : puzzle.getPieces()) {
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

    piece = pieceService.save(piece);
    if (piece == null || piece.getId() <= 0) {
      return UpdatePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to update piece").build();
    }
    return UpdatePieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public DeletePieceResponse deletePiece(DeletePieceRequest request) {
    long puzzleId = request.getPuzzleId();
    long pieceId = request.getPieceId();
    Puzzle puzzle = puzzleService.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return DeletePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    for (org.archi.core.entity.Piece p : puzzle.getPieces()) {
      if (p.getId() == pieceId) {
        try {
          /// Lưu ý phải xoá piece trong puzzle trước rồi mới xoá piece, sau đó cập nhật puzzle lại rồi mới xoá piece.
          puzzle.getPieces().remove(p);
          puzzleService.save(puzzle);
          pieceService.delete(p);
        } catch (RuntimeException e) {
          System.out.println(e.getMessage());
          return DeletePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to delete piece").build();
        }
        return DeletePieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
      }
    }
    return DeletePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Piece not found").build();
  }

  private org.archi.core.entity.Piece returnRandomPiece(Puzzle puzzle) {
    int numberOfPieces = puzzle.getNumberOfPieces();
    int random = (int) (Math.random() * numberOfPieces) + 1;
    ///  Lấy ra mảnh ghép tương ứng.
    org.archi.core.entity.Piece piece = puzzle.getPieces().get(random - 1);
    if (piece.getQuantity() <= 0) return returnRandomPiece(puzzle); /// Nếu toàn bộ tất cả đều hết thì sập server :))
    piece.setQuantity(piece.getQuantity() - 1);
    pieceService.save(piece);
    return piece;
  }

  public GetRandomPieceResponse getRandomPiece(GetRandomPieceRequest request) {
    /// Kiểm tra số lượt chơi hiện tại của Player.
    long playerId = request.getPlayerId();
    GameTurn turn = gameTurnService.findByPlayerId(playerId);
    if (turn == null || turn.getId() <= 0) {
      turn = GameTurn.builder().playerId(playerId).times(10).build();
    }

    if (turn.getTimes() <= 0) {
      /// Nguười chơi đã hết lượt trong ngày.
      return GetRandomPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("The player's turn has ended").build();
    }

    /// Cập nhật số lượt chơi.
    turn.setTimes(turn.getTimes() - 1);
    turn = gameTurnService.save(turn);
    if (turn == null || turn.getId() <= 0) {
      return GetRandomPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to update game turn").build();
    }

    /// Xác định puzzle đang diễn ra.
    List<Puzzle> puzzles = puzzleService.findAllByStatus(PuzzleStatus.HAPPENING);
    if (puzzles.isEmpty()) {
      return GetRandomPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("No event is happening").build();
    }
    Puzzle puzzle = puzzles.getFirst();
    org.archi.core.entity.Piece piece = returnRandomPiece(puzzle);
    return GetRandomPieceResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setPiece(Piece.newBuilder()
                    .setId(piece.getId())
                    .setPuzzleId(piece.getPuzzle().getId())
                    .setImage(piece.getImage())
                    .setOrdinal(piece.getOrdinal())
                    .setQuantity(piece.getQuantity())
                    .build())
            .build();
  }

  public GetAllPiecePlayersResponse getAllPiecePlayers(GetAllPiecePlayersRequest request) {
    long playerId = request.getPlayerId();
    List<PiecePlayer> piecePlayers = piecePlayersService.findAllByPlayerId(playerId);
    if (piecePlayers.isEmpty()) {
      return GetAllPiecePlayersResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Player has no pieces").build();
    }

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

  public CreatePiecePlayerResponse createPiecePlayer(CreatePiecePlayerRequest request) {
    long playerId = request.getPlayerId();
    long pieceId = request.getPieceId();

    org.archi.core.entity.Piece piece = pieceService.findById(pieceId);
    if (piece == null || piece.getId() <= 0) {
      return CreatePiecePlayerResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Piece not found").build();
    }

    /// Kiểm tra xem tồn tại cặp piece-player này chưa.
    List<PiecePlayer> piecePlayers = piecePlayersService.findAllByPieceAndPlayerId(piece, playerId);
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
    data = piecePlayersService.save(data);
    if (data == null || data.getId() <= 0) {
      return CreatePiecePlayerResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to create piece-player").build();
    }
    return CreatePiecePlayerResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public TransferPieceResponse transferPiece(TransferPieceRequest request) {
    long senderId = request.getSenderId();
    long recipientId = request.getRecipientId();
    long pieceId = request.getPieceId();

    PiecePlayer pieceSenders = piecePlayersService.findAllByPieceIdAndPlayerId(pieceId, senderId);
    if (pieceSenders == null || pieceSenders.getId() <= 0) {
      return TransferPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Player hasn't this piece").build();
    }

    if (pieceSenders.getQuantity() <= 0) {
      return TransferPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("The piece's quantity isn't enough to transfer").build();
    }


    PiecePlayer pieceRecipients = piecePlayersService.findAllByPieceIdAndPlayerId(pieceId, recipientId);
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
    pieceSenders = piecePlayersService.save(pieceSenders);
    if (pieceSenders == null || pieceSenders.getId() <= 0) {
      return TransferPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to transfer piece").build();
    }
    pieceRecipients = piecePlayersService.save(pieceRecipients);
    if (pieceRecipients == null || pieceRecipients.getId() <= 0) {
      pieceSenders.setQuantity(pieceSenders.getQuantity() + 1);
      piecePlayersService.save(pieceSenders);
      return TransferPieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to transfer piece").build();
    }
    return TransferPieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public GetGameTurnsResponse getGameTurns(GetGameTurnsRequest request) {
    long playerId = request.getPlayerId();
    GameTurn turn = gameTurnService.findByPlayerId(playerId);
    if (turn == null || turn.getId() <= 0) {
      turn = GameTurn.builder().playerId(playerId).times(10).build();
      turn = gameTurnService.save(turn);
    }
    return GetGameTurnsResponse.newBuilder().setTimes(turn.getTimes()).build();
  }

  public TransferGameTurnResponse transferGameTurn(TransferGameTurnRequest request) {
    System.out.println("TRANSFER GAME TURNS");
    long senderId = request.getSenderId();
    long recipientId = request.getRecipientId();
    int times = request.getTimes();
    System.out.println(senderId + " " + recipientId + " " + times);

    GameTurn senderTurn = gameTurnService.findByPlayerId(senderId);
    if (senderTurn == null || senderTurn.getId() <= 0) {
      /// Tạo mới game turn cho player.
      senderTurn = GameTurn.builder().playerId(senderId).times(10).build();
      gameTurnService.save(senderTurn);
    }

    if (senderTurn.getTimes() < times) {
      return TransferGameTurnResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("The player's turn isn't enough to transfer").build();
    }
    senderTurn.setTimes(senderTurn.getTimes() - times);
    gameTurnService.save(senderTurn);

    GameTurn recipientTurn = gameTurnService.findByPlayerId(recipientId);
    if (recipientTurn == null || recipientTurn.getId() <= 0) {
      /// Tạo mới game turn cho player.
      recipientTurn = GameTurn.builder().playerId(recipientId).times(10).build();
      gameTurnService.save(recipientTurn);
    }
    recipientTurn.setTimes(recipientTurn.getTimes() + times);
    gameTurnService.save(recipientTurn);
    return TransferGameTurnResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }
}