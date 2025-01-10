package org.archi.core.service.game;

import lombok.RequiredArgsConstructor;
import org.archi.common.quiz.ScheduledQuizDTO;
import org.archi.core.entity.campaign.Campaign;
import org.archi.core.entity.campaign.Item;
import org.archi.core.entity.game.Game;
import org.archi.core.entity.game.GamePlayer;
import org.archi.core.entity.game.GameType;
import org.archi.core.repo.game.GamePlayerRepo;
import org.archi.core.repo.game.GameRepo;
import org.archi.core.service.campaign.CampaignService;
import org.archi.core.service.campaign.PieceService;
import org.archi.core.service.campaign.VoucherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class GameService {
    private static final Logger logger = LoggerFactory.getLogger(GameService.class);
    private final GameRepo gameRepo;
    private final GamePlayerRepo gamePlayerRepo;
    private final GameTypeService gameTypeService;
    private final CampaignService campaignService;
    private final VoucherService voucherService;
    private final PieceService pieceService;
    private final RabbitTemplate rabbitTemplate;
    private final ThreadPoolTaskScheduler taskScheduler;


    public List<Game> getAllGames() {
        return gameRepo.findAll();
    }

    public List<Game> getGamesByCampaign(Long campaignId) {
        return gameRepo.findByCampaign_Id(campaignId);
    }

    public List<Game> getUpcomingGames() {
        LocalDateTime now = LocalDateTime.now();
        return gameRepo.findUpcomingGames(now);
    }

    public Game getGameById(Long id) {
        return gameRepo.findById(id)
                .orElseGet(() -> {
                    logger.warn("Game not found with id: {}", id);
                    return null;
                });
    }

    public Game addGame(Game game) {
        GameType gameType = gameTypeService.getGameTypeById(game.getType().getId());
        Campaign campaign = campaignService.getCampaignById(game.getCampaign().getId());

        game.setType(gameType);
        game.setCampaign(campaign);

        Game savedGame = gameRepo.save(game);

        if (game.getStartAt() != null) {
            scheduleQuizStart(savedGame);
        }

        return savedGame;
    }

    public Game updateGame(Long gameId, Game updatedGame) {
        Game game = getGameById(gameId);

        if (updatedGame.getAllowPiecesExchange() != null) {
            game.setAllowPiecesExchange(updatedGame.getAllowPiecesExchange());
        }

        if (updatedGame.getStartAt() != null) {
            game.setStartAt(updatedGame.getStartAt());
        }

        if (updatedGame.getType() != null) {
            game.setType(updatedGame.getType());
        }

        if (updatedGame.getCampaign() != null) {
            game.setCampaign(updatedGame.getCampaign());
        }

        return gameRepo.save(game);
    }

    public void deleteGame(Long id) {
        getGameById(id);
        gameRepo.deleteById(id);
    }

    public GamePlayer addGamePlayer(GamePlayer gamePlayer) {
        return gamePlayerRepo.save(gamePlayer);
    }

    public boolean hasWin() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        return (randomNumber == 1);
    }

    public Item getWinItem(Long playerId, Long gameId) {
        Random random = new Random();
        int randomNumber = random.nextInt(2);

        if (randomNumber == 0) {
            Game game = getGameById(gameId);
            Campaign campaign = game.getCampaign();
            Long brandId = campaign.getBrandId();

            return voucherService.getRandomVoucher(playerId, gameId, brandId);
        }
        else {
            return pieceService.getRandomPiece(playerId, gameId);
        }
    }

    private void scheduleQuizStart(Game game) {
        LocalDateTime now = LocalDateTime.now();
        long delay = Duration.between(now, game.getStartAt().minusMinutes(5)).toMillis();

        if (delay > 0) {
            taskScheduler.schedule(() -> {
                rabbitTemplate.convertAndSend("quiz.schedule.exchange", "quiz.schedule", new ScheduledQuizDTO(game.getId(), game.getStartAt()));
            }, new Date(System.currentTimeMillis() + delay));
        }
    }
}
