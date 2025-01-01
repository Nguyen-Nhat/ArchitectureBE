package org.archi.auth.server;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.auth.model.Player;
import org.archi.auth.service.PlayerService;
import org.archi.common.auth.GetPlayerInfoRequest;
import org.archi.common.auth.GetPlayerInfoResponse;
import org.archi.common.auth.PlayerInfoServiceGrpc;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@GrpcService
@Service
public class PlayerInfoServiceServer extends PlayerInfoServiceGrpc.PlayerInfoServiceImplBase {
  private final PlayerService playerService;

  public PlayerInfoServiceServer(PlayerService playerService) {
    super();
    this.playerService = playerService;
  }

  @Override
  public void getPlayerInfo(GetPlayerInfoRequest request, StreamObserver<GetPlayerInfoResponse> responseObserver) {
    long id = request.getId();
    Player player = playerService.findById(id);
    if (player == null || player.getId() <= 0) {
      responseObserver.onNext(GetPlayerInfoResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Player not found")
              .build());
    } else {
      responseObserver.onNext(GetPlayerInfoResponse.newBuilder()
              .setStatus(HttpStatus.OK.value())
              .setMessage("Success")
              .setId(player.getId())
              .setName(player.getName())
              .setAvatar(player.getAvatar())
              .setBirthDate(player.getBirthDate().getTime())
              .setGender(player.getGender().name())
              .setFacebook(player.getFacebook())
              .build());
    }
    responseObserver.onCompleted();
  }
}
