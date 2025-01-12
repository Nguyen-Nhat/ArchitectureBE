package org.archi.core.service.campaign;

import lombok.AllArgsConstructor;
import org.archi.common.core.*;
import org.archi.core.entity.PuzzleStatus;
import org.archi.core.entity.campaign.Piece;
import org.archi.core.entity.campaign.Puzzle;
import org.archi.core.repo.campaign.PuzzleRepo;
import org.archi.core.specifications.PuzzleSpecs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PuzzleService {
  private final PuzzleRepo puzzleRepo;
  private final PieceService pieceService;

  public PostCreatePuzzleResponse createPuzzle(PostCreatePuzzleRequest request) {
    List<Puzzle> puzzles = puzzleRepo.findAllByStatus(PuzzleStatus.HAPPENING);
    if (!puzzles.isEmpty()) {
      ///  Đã có sự kiện đang mở, không được phép tạo mới.
      return PostCreatePuzzleResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Event is happening, cannot create new event")
              .build();
    }
    /// Tạo mới puzzle.
    Puzzle puzzle = Puzzle.builder()
            .title(request.getTitle())
            .status(PuzzleStatus.HAPPENING)
            .image(request.getImage())
            .numberOfPieces(request.getNumberOfPieces())
            .startDate(Date.valueOf(request.getStartDate()))
            .endDate(Date.valueOf(request.getEndDate()))
            .build();
    try {
      puzzleRepo.save(puzzle);
    } catch (Exception e) {
      return PostCreatePuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to create puzzle").build();
    }
    return PostCreatePuzzleResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public GetPuzzleResponse getPuzzle(GetPuzzleRequest request) {
    long id = request.getId();
    Puzzle puzzle = puzzleRepo.findById(id);
    if (puzzle == null || puzzle.getId() <= 0) {
      return GetPuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    return GetPuzzleResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setPuzzle(org.archi.common.core.Puzzle.newBuilder()
                    .setId(puzzle.getId())
                    .setTitle(puzzle.getTitle())
                    .setImage(puzzle.getImage())
                    .setStartDate(puzzle.getStartDate().toString())
                    .setEndDate(puzzle.getEndDate().toString())
                    .setNumberOfPieces(puzzle.getNumberOfPieces())
                    .setStatus(puzzle.getStatus().name()).build())
            .build();
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
      puzzles = puzzleRepo.findAll(specs, pageable);
    } catch (RuntimeException e) {
      return GetPuzzlesResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to get accounts").build();
    }

    return GetPuzzlesResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .addAllPuzzle(puzzles.stream().map(puzzle -> org.archi.common.core.Puzzle.newBuilder()
                            .setId(puzzle.getId())
                            .setTitle(puzzle.getTitle())
                            .setImage(puzzle.getImage())
                            .setStartDate(puzzle.getStartDate().toString())
                            .setEndDate(puzzle.getEndDate().toString())
                            .setNumberOfPieces(puzzle.getNumberOfPieces())
                            .setStatus(puzzle.getStatus().name()).build())
                    .collect(Collectors.toList()))
            .setTotalElement(puzzles.getTotalElements())
            .setTotalPage(puzzles.getTotalPages())
            .setPage(puzzles.getNumber()).setSize(puzzles.getSize())
            .build();
  }

  public UpdatePuzzleResponse updatePuzzle(UpdatePuzzleRequest request) {
    long id = request.getId();
    Puzzle puzzle = puzzleRepo.findById(id);
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
        puzzle.setStatus(status);
      } catch (Exception e) {
        return UpdatePuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Invalid status").build();
      }
    }

    try {
      puzzleRepo.save(puzzle);
    } catch (Exception e) {
      return UpdatePuzzleResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to update puzzle").build();
    }
    return UpdatePuzzleResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public CreatePieceResponse createPiece(CreatePieceRequest request) {
    long puzzleId = request.getPuzzleId();
    Puzzle puzzle = puzzleRepo.findById(puzzleId);
    if (puzzle == null || puzzle.getId() <= 0) {
      return CreatePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Puzzle not found").build();
    }

    Piece piece = Piece.builder().image(request.getImage())
            .ordinal(request.getOrdinal())
            .quantity(request.getQuantity())
            .puzzle(puzzle)
            .build();

    try {
      pieceService.addPiece(piece);
    } catch (Exception e) {
      return CreatePieceResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Failed to create piece").build();
    }
    return CreatePieceResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public Puzzle findById(long puzzleId) {
    return puzzleRepo.findById(puzzleId);
  }
}
