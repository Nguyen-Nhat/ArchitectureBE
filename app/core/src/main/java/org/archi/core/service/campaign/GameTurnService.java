package org.archi.core.service.campaign;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.archi.common.core.*;
import org.archi.core.entity.campaign.GameTurn;
import org.archi.core.repo.campaign.GameTurnRepo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class GameTurnService {
  private final GameTurnRepo gameTurnRepo;

  public CreateGameTurnResponse createGameTurn(CreateGameTurnRequest request) {
    GameTurn gameTurn = gameTurnRepo.findByPlayerId(request.getPlayerId());
    if (gameTurn != null) {
      return CreateGameTurnResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Game Turn của người chơi đã tồn tại")
              .build();
    }

    gameTurn = GameTurn.builder()
            .playerId(request.getPlayerId())
            .turns(10)
            .build();

    try {
      gameTurnRepo.save(gameTurn);
    } catch (Exception e) {
      return CreateGameTurnResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Lỗi khi tạo mới Game Turn")
              .build();
    }

    return CreateGameTurnResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Tạo mới Game Turn thành công")
            .build();
  }

  public TransferGameTurnResponse transferGameTurn(TransferGameTurnRequest request) {
    long senderId = request.getSenderId();
    long recipientId = request.getRecipientId();
    int turns = request.getTurns();

    GameTurn senderTurn = gameTurnRepo.findByPlayerId(senderId);
    if (senderTurn == null || senderTurn.getId() <= 0) {
      return TransferGameTurnResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Không tồn tại lượt chơi của người gửi!").build();
    }

    GameTurn recipientTurn = gameTurnRepo.findByPlayerId(recipientId);
    if (recipientTurn == null || recipientTurn.getId() <= 0) {
      return TransferGameTurnResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Không tồn tại lượt chơi của người nhận!").build();
    }

    if (senderTurn.getTurns() < turns) {
      return TransferGameTurnResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Số lượng lượt chơi tặng vượt quá số lượng hiện tại").build();
    }


    senderTurn.setTurns(senderTurn.getTurns() - turns);
    try {
      gameTurnRepo.save(senderTurn);
    } catch (Exception e) {
      return TransferGameTurnResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Lỗi khi trừ lượt chơi của người gửi").build();
    }

    recipientTurn.setTurns(recipientTurn.getTurns() + turns);
    try {
      gameTurnRepo.save(recipientTurn);
    } catch (Exception e) {
      senderTurn.setTurns(senderTurn.getTurns() + turns);
      gameTurnRepo.save(senderTurn);
      return TransferGameTurnResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Lỗi khi cộng lượt chơi của người nhận").build();
    }
    return TransferGameTurnResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").build();
  }

  public GetGameTurnsResponse getGameTurns(GetGameTurnsRequest request) {
    long playerId = request.getPlayerId();
    System.out.println("playerId: " + playerId);
    GameTurn turn = gameTurnRepo.findByPlayerId(playerId);
    if (turn == null || turn.getId() <= 0) {
      return GetGameTurnsResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Game turn không tồn tại!").setTurns(0).build();
    }
    return GetGameTurnsResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Success").setTurns(turn.getTurns()).build();
  }

  public void decreaseGameTurn(long playerId) {
    GameTurn turn = gameTurnRepo.findByPlayerId(playerId);
    if (turn != null && turn.getId() > 0) {
      turn.setTurns(turn.getTurns() - 1);
      gameTurnRepo.save(turn);
    } else log.error("Game turn not found");
  }
}
