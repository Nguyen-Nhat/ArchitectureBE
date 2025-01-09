package org.archi.bff.controller;

import lombok.RequiredArgsConstructor;
import org.archi.bff.request.*;
import org.archi.bff.request.CreateCampaignRequest;
import org.archi.bff.response.ResponseData;
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
        long accountId= Long.parseLong(auth.getName());
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
    @PreAuthorize("hasRole('ADMIN')")
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

    @PostMapping("/games/shake")
    @PreAuthorize("hasRole('PLAYER')")
    public ResponseEntity<ResponseData> shakePhone(@RequestBody ShakePhoneRequest request) {
        /*
          {
            "gameId": 4
          }
        */
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        long playerId = Long.parseLong(auth.getName());
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
}
