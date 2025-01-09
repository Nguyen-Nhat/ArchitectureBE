package org.archi.core.service.game;

import lombok.RequiredArgsConstructor;
import org.archi.core.entity.game.GameType;
import org.archi.core.repo.game.GameTypeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameTypeService {
    private static final Logger logger = LoggerFactory.getLogger(GameTypeService.class);
    private final GameTypeRepo gameTypeRepo;

    public List<GameType> getAllGameTypes() {
        return gameTypeRepo.findAll();
    }

    public GameType getGameTypeById(int id) {
        return gameTypeRepo.findById(id)
                .orElseGet(() -> {
                    logger.warn("Game type not found with id: {}", id);
                    return null;
                });
    }

    public GameType addGameType(GameType gameType) {
        return gameTypeRepo.save(gameType);
    }

    public GameType updateGameType(int id, GameType updatedGameType) {
        GameType gameType = getGameTypeById(id);

        if (updatedGameType.getName() != null) {
            gameType.setName(updatedGameType.getName());
        }

        if (updatedGameType.getImageUrl() != null) {
            gameType.setImageUrl(updatedGameType.getImageUrl());
        }

        if (updatedGameType.getInstruction() != null) {
            gameType.setInstruction(updatedGameType.getInstruction());
        }

        return gameTypeRepo.save(gameType);
    }

    public void deleteGameType(int id) {
        getGameTypeById(id);
        gameTypeRepo.deleteById(id);
    }
}
