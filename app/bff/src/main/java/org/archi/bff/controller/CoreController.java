package org.archi.bff.controller;

import lombok.RequiredArgsConstructor;
import org.archi.bff.request.ShakePhoneRequest;
import org.archi.bff.response.PlayerInfo;
import org.archi.bff.request.*;
import org.archi.bff.request.CreateCampaignRequest;
import org.archi.bff.response.ResponseData;
import org.archi.bff.service.AuthService;
import org.archi.bff.service.CoreService;
import org.archi.common.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/core")
@RequiredArgsConstructor
public class CoreController {
  private static final Logger LOGGER = LoggerFactory.getLogger(CoreController.class);
  private final CoreService coreService;
  private final AuthService authService;

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
  public ResponseEntity<ResponseData> createVoucherType(@RequestBody CreateVoucherType request) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    long accountId = Long.parseLong(auth.getName());
    return coreService.createVoucherType(accountId, request);
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

  @PatchMapping("/voucher-types/{id}")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> updateVoucherType(
          @PathVariable Long id,
          @RequestBody UpdateVoucherType request) {
    return coreService.updateVoucherType(id, request);
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

  @GetMapping("/campaigns")
  public ResponseEntity<ResponseData> getCampaigns(@RequestParam String startDate, @RequestParam String endDate) {
    return coreService.getCampaigns(startDate, endDate);
  }

  /*
      {
          url path: "localhost:8080/api/auth/core/campaigns/search?term=example"
      }
  * */
  @GetMapping("/campaigns/search")
  public ResponseEntity<ResponseData> searchCampaign(@RequestParam String term) {
    return coreService.searchCampaign(term);
  }

  /*
      API to create a new campaign
      Request body:
      {
          "name": "Campaign 1"
          "imageUrl": "campaign.url"
          "description": "c des"
          "startDate": "2025-01-01T12:30:00"
          "endDate": "2025-01-30T12:30:00"
          "status": "On going"
      }
  * */
  @PreAuthorize("hasRole('BRAND')")
  @PostMapping("/campaigns/create")
  public ResponseEntity<ResponseData> createCampaign(@RequestBody CreateCampaignRequest request) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    long accountId = Long.parseLong(auth.getName());
    return coreService.createCampaign(accountId, request);
  }

  /*
   * path: /api/core/campaigns/by-brand-id?id=3
   * */
  @GetMapping("/campaigns/by-brand-id")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> getCampaignsByBrandId(@RequestParam Long id) {
    return coreService.getCampaignsByBrandId(id);
  }

  /*
   * path: /api/core/campaigns/3
   * body:
   *       {
   *         "name": "New name",
   *         "description": "New description"
   *       }
   * */
  @PatchMapping("/campaigns/{id}")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> updateCampaign(
          @RequestBody UpdateCampaign request,
          @PathVariable String id
  ) {
    return coreService.updateCampaign(id, request);
  }


  @GetMapping("/game-types")
  @PreAuthorize("hasRole('ADMIN')")
  public ResponseEntity<ResponseData> getAllGameTypes() {
    return coreService.getAllGameTypes();
  }

  @GetMapping("/game-types/{id}")
  @PreAuthorize("hasRole('ADMIN')")
  public ResponseEntity<ResponseData> getGameTypeById(@PathVariable("id") int id) {
    return coreService.getGameTypeById(id);
  }

  @PostMapping("/game-types/create")
  @PreAuthorize("hasRole('ADMIN')")
  public ResponseEntity<ResponseData> addGameType(@RequestBody AddGameTypeRequest request) {
        /*
          {
            "name": "hi",
            "isRealtime": true,
            "imageUrl": "hi",
            "instruction": "hi"
          }
        */
    return coreService.addGameType(request);
  }

  @PutMapping("/game-types")
  @PreAuthorize("hasRole('ADMIN')")
  public ResponseEntity<ResponseData> updateGameType(@RequestBody UpdateGameTypeRequest request) {
        /*
          {
            "id": 3,
            "name": "he",
            "isRealtime": false,
            "imageUrl": "",
            "instruction": "hi"
           }
        */
    return coreService.updateGameType(request);
  }

  @DeleteMapping("/game-types/{id}")
  @PreAuthorize("hasRole('ADMIN')")
  public ResponseEntity<ResponseData> deleteGameType(@PathVariable("id") int id) {
    return coreService.deleteGameType(id);
  }

  @GetMapping("/games")
  @PreAuthorize("hasRole('ADMIN')")
  public ResponseEntity<ResponseData> getAllGames() {
    return coreService.getAllGames();
  }

  @GetMapping("/games/{id}")
  @PreAuthorize("hasRole('ADMIN')")
  public ResponseEntity<ResponseData> getGameById(@PathVariable("id") long id) {
    return coreService.getGameById(id);
  }

  @GetMapping("/campaigns/{campaignId}/games")
  @PreAuthorize("hasAnyRole('ADMIN', 'PLAYER')")
  public ResponseEntity<ResponseData> getGamesByCampaign(@PathVariable("campaignId") long campaignId) {
    return coreService.getGamesByCampaign(campaignId);
  }

  @PostMapping("/games/create")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> addGame(@RequestBody AddGameRequest request) {
        /*
          {
            "allowPiecesExchange": true,
            "startAt": "2025-01-30 14:03:24",
            "gameTypeId": 1,
            "campaignId": 10
          }
        */
    return coreService.addGame(request);
  }

  @PutMapping("/games")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> updateGame(@RequestBody UpdateGameRequest request) {
        /*
          {
            "id": 6,
            "allowPiecesExchange": false,
            "startAt": "2025-01-25 20:03:24",
            "gameTypeId": 2,
            "campaignId": 10
          }
        */
    return coreService.updateGame(request);
  }

  @DeleteMapping("/games/{id}")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> deleteGame(@PathVariable("id") long id) {
    return coreService.deleteGame(id);
  }

  /// done.
  @PostMapping("/games/shake")
  @PreAuthorize("hasRole('PLAYER')")
  public ResponseEntity<ResponseData> shakePhone(@RequestBody ShakePhoneRequest request) {
        /*
          {
            "gameId": 4
          }
        */

    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    String accountId = auth.getName();
    ResponseData responseData = authService.getPlayerProfile(Long.parseLong(accountId));
    long playerId = ((PlayerInfo) responseData.getData()).getId();

    return coreService.shakePhone(playerId, request.getGameId());
  }

  @GetMapping("/quiz-questions/{id}")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> getQuizQuestionById(@PathVariable("id") long id) {
    return coreService.getQuizQuestionById(id);
  }

  @GetMapping("/games/{gameId}/quiz-questions")
  public ResponseEntity<ResponseData> getQuizQuestionsByGame(@PathVariable("gameId") long gameId) {
    return coreService.getQuizQuestionsByGame(gameId);
  }

  @PostMapping("/quiz-questions/create")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> addQuizQuestion(@RequestBody AddQuizQuestionRequest request) {
        /*
         {
            "gameId": 4,
            "questionNumber": 9,
            "questionTitle": "hi",
            "questionContent": "hi",
            "answerA": "hi",
            "answerB": "hi",
            "answerC": "hi",
            "answerD": "hi",
            "correctAnswer": "C",
            "answerExplanation": "hi"
          }
        */
    return coreService.addQuizQuestion(request);
  }

  @PutMapping("/quiz-questions")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> updateQuizQuestion(@RequestBody UpdateQuizQuestionRequest request) {
        /*
          {
            "id": 11,
            "gameId": 4,
            "questionNumber": 10,
            "questionTitle": "he",
            "questionContent": "hi",
            "answerA": "hi",
            "answerB": "he",
            "answerC": "hi",
            "answerD": "hi",
            "correctAnswer": "D",
            "answerExplanation": "he"
          }
        */
    return coreService.updateQuizQuestion(request);
  }

  @DeleteMapping("/quiz-questions/{id}")
  @PreAuthorize("hasRole('BRAND')")
  public ResponseEntity<ResponseData> deleteQuizQuestion(@PathVariable("id") long id) {
    return coreService.deleteQuizQuestion(id);
  }


  /// =========================== PUZZLE ========================== ///

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

  /// Hàm lây thông tin của puzzle cụ thể.
  /// done
  @GetMapping(value = "/puzzles/{id}")
  public ResponseEntity<ResponseData> getPuzzle(@PathVariable Long id) {
    ResponseData responseData = coreService.getPuzzle(id);
    return ResponseEntity.ok(responseData);
  }

  ///  Hàm lấy danh sách puzzle trong hệ thống.
  /// done.
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




  /// ======================== PIECE ========================== ///
  /// Hàm tạo mảnh ghép cho puzzle.
  /// done.
  @PreAuthorize("hasRole('ADMIN')")
  @PostMapping(value = "/puzzles/{puzzleId}/pieces")
  public ResponseEntity<ResponseData> createPiece(@PathVariable Long puzzleId, @RequestBody PieceRequest pieceRequest) {
    /*
      {
        "ordinal": 1,
        "quantity": 30,
        "image": "https://picsum.photos/100/100"
      }
    */

    ResponseData responseData = coreService.createPiece(puzzleId, pieceRequest);
    return ResponseEntity.ok(responseData);
  }

  /// Hàm lấy thông tin mảnh ghép cụ thể.
  /// done
  @GetMapping(value = "/puzzles/{puzzleId}/pieces/{pieceId}")
  public ResponseEntity<ResponseData> getPiece(@PathVariable Long puzzleId, @PathVariable Long pieceId) {
    ResponseData responseData = coreService.getPiece(puzzleId, pieceId);
    return ResponseEntity.ok(responseData);
  }

  /// Hàm lấy danh sách toàn bộ các mảnh ghép của puzzle.
  /// done
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



  /// ====================== PIECE - PLAYER ======================== ///
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
  /// done
  @PostMapping(value = "/piece-players/transfer")
  public ResponseEntity<ResponseData> transferPiecePlayer(@RequestParam(value = "transferType") String transferType, @RequestBody TransferRequest request) {
    /// /api/core/piece-players/transfer?transferType=email | phoneNumber
    /*
      {
        "pieceId": 1,
        "info": "example@gmail.com"
      }
    */
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Long accountId = Long.parseLong(auth.getName());
    ResponseData responseData = coreService.transferPiecePlayer(accountId, transferType, request);
    return ResponseEntity.ok(responseData);
  }


  /// ====================== GAME TURNS ======================== ///
  /// done
  /// Hàm lấy thông tin lượt chơi của người chơi.
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
