package org.archi.bff.controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.archi.bff.adapter.AuthAdapter;
import org.archi.bff.request.*;
import org.archi.bff.response.PlayerInfo;
import org.archi.bff.response.ResponseData;
import org.archi.bff.service.CoreService;
import org.archi.common.auth.GetPlayerInfoRequest;
import org.archi.common.auth.PlayerProfileRequest;
import org.archi.common.auth.PlayerProfileResponse;
import org.archi.common.core.CreateVoucherTypeRequest;
import org.archi.common.core.GenerateVoucherRequest;
import org.archi.common.core.UpdateVoucherTypeReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core")
@RequiredArgsConstructor
public class CoreController {
  private static final Logger LOGGER = LoggerFactory.getLogger(CoreController.class);
  private final CoreService coreService;

  @GetMapping("/vouchers")
  @PreAuthorize("hasRole('PLAYER')")
  public ResponseEntity<ResponseData> getVouchers() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Long playerId = Long.parseLong(auth.getName());
    return coreService.getVouchers(playerId);
  }

  @GetMapping("/voucher-types")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> getVoucherTypes() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    Long playerId = Long.valueOf(authentication.getName());
    return coreService.getVoucherTypes(playerId);
  }

  @PostMapping("/voucher-types/create")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> createVoucherType(@RequestBody CreateVoucherTypeRequest request) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    return coreService.createVoucherType(request);
  }

  @PostMapping("/generate-voucher")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> generateVoucher(@RequestBody GenerateVoucherRequest request) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    long brandId = Long.parseLong(auth.getName());
    if (brandId != request.getBrandId()) {
      return coreService.generateVoucher(request);
    } else {
      throw new Error("The brand id does not match the brand id in the request");
    }
  }

  @PutMapping("/voucher-types")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> updateVoucherType(@RequestBody UpdateVoucherTypeReq request) {
    return coreService.updateVoucherType(request);
  }

  @GetMapping("/vouchers/search")
  public ResponseEntity<ResponseData> searchVouchers(@RequestParam String term) {
    return coreService.searchVoucher(term);
  }

  @GetMapping("/voucher-types/search")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> searchVoucherType(@RequestParam String term) {
    return coreService.searchVoucherType(term);
  }

  /*=========== PUZZLE =============*/

  /// Hàm lấy thông tin puzzle cụ thể.
  /// done
  @GetMapping(value = "/puzzles/{id}")
  public ResponseEntity<ResponseData> getPuzzle(@PathVariable Long id) {
    ResponseData responseData = coreService.getPuzzle(id);
    return ResponseEntity.ok(responseData);
  }

  ///  Hàm lấy danh sách puzzle trong hệ thống.
  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @GetMapping(value = "/puzzles")
  public ResponseEntity<ResponseData> getPuzzles(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                                 @RequestParam(name = "size", defaultValue = "10") Integer size,
                                                 @RequestParam(value = "sort", required = false) String sort,
                                                 @RequestParam(name = "title", required = false) String title) {

    /// GET /api/auth/puzzles?page=1&size=10&sort=id:desc&title="Săn lùng"
    page = page - 1;
    ResponseData responseData = coreService.getPuzzles(page, size, sort, title);
    return ResponseEntity.ok(responseData);
  }

  /// Hàm tạo puzzle.
  /// done.
  @PreAuthorize("hasRole('ADMIN')")
  @PostMapping(value = "/puzzles")
  public ResponseEntity<ResponseData> createPuzzle(@RequestBody CreatePuzzleRequest request) {
    /*
     {
      "title": "Puzzle 1",
      "image": "https://picsum.photos/200/300",
      "startDate": "2021-09-01",
      "endDate": "2021-09-30",
      "numberOfPieces": 9
     }
    */
    ResponseData responseData = coreService.createPuzzle(request);
    return ResponseEntity.ok(responseData);
  }


  /// Hàm update puzzle.
  /// done.
  @PreAuthorize("hasRole('ADMIN')")
  @PatchMapping(value = "/puzzles/{puzzleId}")
  public ResponseEntity<ResponseData> updatePuzzle(@PathVariable Long puzzleId, @RequestBody UpdatedPuzzle request) {
    /*
     {
      "title": "Puzzle 1",
      "image": "https://picsum.photos/200/300",
      "startDate": "2021-09-01",
      "endDate": "2021-09-30",
      "numberOfPieces": 9,
      "status": "COMPLETED"
     }
    */
    ResponseData responseData = coreService.updatePuzzle(puzzleId, request);
    return ResponseEntity.ok(responseData);
  }


  /*=========== PIECE =============*/

  /// Hàm lấy thông tin mảnh ghép cụ thể.
  /// done.
  @GetMapping(value = "/puzzles/{puzzleId}/pieces/{pieceId}")
  public ResponseEntity<ResponseData> getPiece(@PathVariable Long puzzleId, @PathVariable Long pieceId) {
    ResponseData responseData = coreService.getPiece(puzzleId, pieceId);
    return ResponseEntity.ok(responseData);
  }

  /// Hàm tạo mảnh ghép cho puzzle.
  /// done
  @PreAuthorize("hasRole('ADMIN')")
  @PostMapping(value = "/puzzles/{puzzleId}/pieces")
  public ResponseEntity<ResponseData> createPiece(@PathVariable Long puzzleId, @RequestBody PieceRequest pieceRequest) {
    /*
      {
        "ordinal": 1
        "quantity": 30,
        "image": "https://picsum.photos/100/100"
      }
    */

    ResponseData responseData = coreService.createPiece(puzzleId, pieceRequest);
    return ResponseEntity.ok(responseData);
  }

  /// Hàm lấy danh sách toàn bộ các mảnh ghép của puzzle.
  /// done.
  @GetMapping(value = "/puzzles/{puzzleId}/pieces")
  public ResponseEntity<ResponseData> getPiecesOfPuzzle(@PathVariable Long puzzleId) {
    ResponseData responseData = coreService.getAllPieces(puzzleId);
    return ResponseEntity.ok(responseData);
  }

  /// Hàm cập nhật mảnh ghép.
  /// done.
  @PreAuthorize("hasRole('ADMIN')")
  @PatchMapping(value = "/puzzles/{puzzleId}/pieces/{pieceId}")
  public ResponseEntity<ResponseData> updatePiece(@PathVariable Long puzzleId, @PathVariable Long pieceId, @RequestBody UpdatedPiece updatedPiece) {
    /*
      {
        "quantity": 30
        "image": "https://picsum.photos/100/100"
      }
    */
    ResponseData responseData = coreService.updatePiece(puzzleId, pieceId, updatedPiece);
    return ResponseEntity.ok(responseData);
  }

  /// Hàm xoá mảnh ghép.
  /// done.
  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping(value = "/puzzles/{puzzleId}/pieces/{pieceId}")
  public ResponseEntity<ResponseData> deletePiece(@PathVariable Long puzzleId, @PathVariable Long pieceId) {
    ResponseData responseData = coreService.deletePiece(puzzleId, pieceId);
    return ResponseEntity.ok(responseData);
  }

  /*=========== RANDOM PIECE =============*/
  /// Hàm lấy mảnh ghép ngẫy nhiên gửi về cho Client.
  /// done.
  @GetMapping(value = "/puzzles/pieces/random")
  public ResponseEntity<ResponseData> getRandomPiece() {
    /// Thực hiện lấy về một mảnh và gán cho một player cụ thể.
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Long accountId = Long.parseLong(auth.getName());
    ResponseData responseData = coreService.getRandomPiece(accountId);
    return ResponseEntity.ok(responseData);
  }

  /*=========== PIECE - PLAYER =============*/

  /// Hàm gán mảnh ghép cho player. Tạo dữ liệu cho table piece_players.
  /// done.
  @PostMapping(value = "/piece-players")
  public ResponseEntity<ResponseData> createPiecePlayers(@RequestBody PiecePlayerRequest request) {
    /*
      {
        "pieceId": 1,
      }
    */
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    Long accountId = Long.parseLong(authentication.getName());
    ResponseData responseData = coreService.createPiecePlayers(accountId, request);
    return ResponseEntity.ok(responseData);
  }


  /// Hàm lấy tất cả mảnh ghép mà người chơi đang có.
  /// done
  @GetMapping(value = "/piece-players")
  public ResponseEntity<ResponseData> getAllPiecePlayers() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Long accountId = Long.parseLong(auth.getName());
    ResponseData responseData = coreService.getAllPiecePlayers(accountId);
    return ResponseEntity.ok(responseData);
  }

  /// Tặng mảnh ghép cho người chơi khác.
  /// done.
  @PostMapping(value = "/piece-players/transfer")
  public ResponseEntity<ResponseData> transferPiecePlayer(@RequestParam(value = "transferType") String transferType, @RequestBody TransferRequest request) {
    /// /api/core/piece-players/transfer?transferType=email | phoneNumber
    /*
      {
        "pieceId": 1,
        "playerId": 2
      }
    */
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Long accountId = Long.parseLong(auth.getName());
    ResponseData responseData = coreService.transferPiecePlayer(accountId, transferType, request);
    return ResponseEntity.ok(responseData);
  }


  /*=========== GAME TURNS =============*/
  /// Hàm lấy thông tin lượt chơi của người chơi.
  /// done
  @GetMapping(value = "/game-turns")
  public ResponseEntity<ResponseData> getGameTurns() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Long accountId = Long.parseLong(auth.getName());
    ResponseData responseData = coreService.getGameTurns(accountId);
    return ResponseEntity.ok(responseData);
  }


  /// Tặng lượt chơi cho bạn bè.
  /// done.
  @PostMapping(value = "/game-turns/transfer")
  public ResponseEntity<ResponseData> transferGameTurn(@RequestBody TurnTransferRequest request, @RequestParam(value = "transferType") String transferType) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Long accountId = Long.parseLong(auth.getName());
    ResponseData responseData = coreService.transferGameTurn(accountId, transferType, request);
    return ResponseEntity.ok(responseData);
  }
}
