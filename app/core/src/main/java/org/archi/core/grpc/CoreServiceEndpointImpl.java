package org.archi.core.grpc;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.common.core.*;
import org.archi.core.service.campaign.CampaignService;
import org.archi.core.service.campaign.VoucherService;
import org.archi.core.service.game.GameService;
import org.archi.core.service.game.GameTypeService;
import org.archi.core.service.quiz.QuizService;
import org.archi.core.util.DateTimeUtil;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@RequiredArgsConstructor
public class CoreServiceEndpointImpl extends CoreServiceGrpc.CoreServiceImplBase{
	private final CampaignService campaignService;
	private final VoucherService voucherService;
	private final GameTypeService gameTypeService;
	private final GameService gameService;
	private final QuizService quizService;

	@Override
	public void generateVoucher(GenerateVoucherRequest request, StreamObserver<GenerateVoucherResponse> responseObserver) {
		GenerateVoucherResponse response = voucherService.generateVoucher(request);
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void createVoucherType(CreateVoucherTypeRequest request, StreamObserver<CreateVoucherTypeResponse> responseObserver) {
		CreateVoucherTypeResponse response = voucherService.createVoucherType(request);
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void getVouchers(GetVouchersRequest request, StreamObserver<GetVouchersResponse> responseObserver) {
		try {
			// Call the service method
			GetVouchersResponse response = voucherService.getVouchers(request);

			// Return the response to the client
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception ex) {
			responseObserver.onError(ex);
		}
	}

	@Override
	public void getVouchersType(GetVoucherTypesReq request, StreamObserver<GetVoucherTypesRes> responseObserver) {
		try {
			GetVoucherTypesRes response = voucherService.getVoucherTypes(request);
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception ex) {
			responseObserver.onError(ex);
		}
	}

	@Override
	public void updateVoucherType(UpdateVoucherTypeReq request, StreamObserver<UpdateVoucherTypeRes> responseObserver) {
		try {
			UpdateVoucherTypeRes response = voucherService.updateVoucherType(request);
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception ex) {
			responseObserver.onError(ex);
		}
	}

	@Override
	public void searchVoucher(SearchRequest request, StreamObserver<SearchVoucherResponse> responseObserver) {
		try {
			SearchVoucherResponse response = voucherService.searchVoucher(request);
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void searchVoucherType(SearchRequest request, StreamObserver<SearchVoucherTypeResponse> responseObserver) {
		try {
			// Invoke service logic
			SearchVoucherTypeResponse response = voucherService.searchVoucherType(request);
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void getCampaigns(GetCampaignsRequest request, StreamObserver<GetCampaignsResponse> responseObserver) {
		try {
			// Parse startDate and endDate from the request
			LocalDateTime startDate = LocalDateTime.parse(request.getStartDate());
			LocalDateTime endDate = LocalDateTime.parse(request.getEndDate());

			// Fetch campaigns from the service
			List<org.archi.core.entity.campaign.Campaign> campaigns = campaignService.getCampaignsByDateRange(startDate, endDate);

			// Map Campaign entities to gRPC Campaign messages
			List<Campaign> grpcCampaigns = campaigns.stream().map(campaign ->
					Campaign.newBuilder()
							.setId(campaign.getId())
							.setName(campaign.getName())
							.setImageUrl(campaign.getImageUrl() != null ? campaign.getImageUrl() : "")
							.setStartDate(campaign.getStartDate().toString())
							.setEndDate(campaign.getEndDate() != null ? campaign.getEndDate().toString() : "")
							.setStatus(campaign.getStatus() != null ? campaign.getStatus() : "")
							.build()
			).collect(Collectors.toList());

			GetCampaignsResponse response = GetCampaignsResponse.newBuilder()
					.addAllCampaigns(grpcCampaigns)
					.build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void searchCampaign(SearchCampaignRequest request, StreamObserver<SearchCampaignResponse> responseObserver) {
		List<Campaign> campaigns = campaignService.searchCampaigns(request.getTerm());
		responseObserver.onNext(campaigns.isEmpty() ? SearchCampaignResponse.getDefaultInstance() : SearchCampaignResponse.newBuilder().addAllCampaigns(campaigns).build());
		responseObserver.onCompleted();
	}

	@Override
	public void createCampaign(CreateCampaignRequest request, StreamObserver<CreateCampaignResponse> responseObserver) {
		try {
			Campaign c = campaignService.createCampaign(request);

            c.getImageUrl();
            CreateCampaignResponse response = CreateCampaignResponse.newBuilder()
					.setCampaign(Campaign.newBuilder()
							.setId(c.getId())
							.setName(c.getName())
							.setImageUrl(c.getImageUrl())
							.setStartDate(c.getStartDate())
							.setEndDate( c.getEndDate())
							.setStatus(c.getStatus())
							.build())
					.build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void getCampaignsByBrandId(GetCampaignsByBrandIdReq request, StreamObserver<GetCampaignsByBrandIdRes> responseObserver) {
		try {
			long brandId = request.getBrandId();

			List<org.archi.core.entity.campaign.Campaign> campaigns = campaignService.getCampaignsByBrandId(brandId);

			List<org.archi.common.core.Campaign> grpcCampaigns = campaigns.stream()
					.map(campaign -> org.archi.common.core.Campaign.newBuilder()
							.setId(campaign.getId())
							.setName(campaign.getName())
							.setImageUrl(campaign.getImageUrl() != null ? campaign.getImageUrl() : "")
							.setStartDate(campaign.getStartDate().toString())
							.setEndDate(campaign.getEndDate() != null ? campaign.getEndDate().toString() : "")
							.setStatus(campaign.getStatus() != null ? campaign.getStatus() : "")
							.build())
					.collect(Collectors.toList());

			// Build the response
			GetCampaignsByBrandIdRes response = GetCampaignsByBrandIdRes.newBuilder()
					.addAllCampaigns(grpcCampaigns)
					.build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception e) {
			// Handle exception
			responseObserver.onError(e);
		}
	}

	@Override
	public void updateCampaign(UpdateCampaignReq request, StreamObserver<UpdateCampaignRes> responseObserver) {
		try {
			// Extract campaign details from the request
			long campaignId = request.getCampaignId();
			String name = request.getNewName();
			String imageUrl = request.getNewImageUrl();
			LocalDateTime startDate = LocalDateTime.parse(request.getNewStartDate());
			LocalDateTime endDate = request.getNewEndDate().isEmpty() ? null : LocalDateTime.parse(request.getNewEndDate());
			String status = request.getNewStatus();

			// Create a new Campaign with given information
			org.archi.core.entity.campaign.Campaign campaignToUpdate = new org.archi.core.entity.campaign.Campaign();
			campaignToUpdate.setName(name);
			campaignToUpdate.setImageUrl(imageUrl);
			campaignToUpdate.setStartDate(startDate);
			campaignToUpdate.setEndDate(endDate);
			campaignToUpdate.setStatus(status);
			if (endDate != null && startDate.isAfter(endDate)) {
				responseObserver.onError(new IllegalArgumentException("Start date cannot be after end date."));
			}

			// Call the service to update the campaign
			org.archi.core.entity.campaign.Campaign updatedCampaign = campaignService.updateCampaign(campaignId, campaignToUpdate);

			// Build and send the response
			UpdateCampaignRes response = UpdateCampaignRes.newBuilder()
					.setCampaign(Campaign.newBuilder()
							.setId(updatedCampaign.getId())
							.setName(updatedCampaign.getName())
							.setImageUrl(updatedCampaign.getImageUrl() != null ? updatedCampaign.getImageUrl() : "")
							.setStartDate(updatedCampaign.getStartDate().toString())
							.setEndDate(updatedCampaign.getEndDate() != null ? updatedCampaign.getEndDate().toString() : "")
							.setStatus(updatedCampaign.getStatus() != null ? updatedCampaign.getStatus() : "")
							.build())
					.build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}

	private org.archi.common.core.GameType convertToGrpcGameType(org.archi.core.entity.game.GameType gameType) {
		return org.archi.common.core.GameType.newBuilder()
				.setId(gameType.getId())
				.setName(gameType.getName())
				.setIsRealtime(gameType.getIsRealtime())
				.setImageUrl(gameType.getImageUrl())
				.setInstruction(gameType.getInstruction())
				.build();
	}

	private org.archi.core.entity.game.GameType convertToEntityGameType(String name, boolean isRealtime, String imageUrl, String instruction) {
		org.archi.core.entity.game.GameType gameType = new org.archi.core.entity.game.GameType();

		gameType.setName(name);
		gameType.setIsRealtime(isRealtime);
		gameType.setImageUrl(imageUrl);
		gameType.setInstruction(instruction);

		return gameType;
	}

	private org.archi.common.core.Game convertToGrpcGame(org.archi.core.entity.game.Game game) {
		return org.archi.common.core.Game.newBuilder()
				.setId(game.getId())
				.setAllowPiecesExchange(game.getAllowPiecesExchange())
				.setStartAt(DateTimeUtil.toString(game.getStartAt()))
				.setType(convertToGrpcGameType(game.getType()))
				.setCampaignId(game.getCampaign().getId())
				.build();
	}

	private org.archi.core.entity.game.Game convertToEntityGame(boolean allowPiecesExchange, String startAt, int gameTypeId, long campaignId) {
		org.archi.core.entity.game.Game game = new org.archi.core.entity.game.Game();

		game.setAllowPiecesExchange(allowPiecesExchange);
		game.setStartAt(DateTimeUtil.fromString(startAt));
		game.setType(gameTypeService.getGameTypeById(gameTypeId));
		game.setCampaign(campaignService.getCampaignById(campaignId));

		return game;
	}

	private org.archi.common.core.GamePlayer convertToGrpcGamePlayer(org.archi.core.entity.game.GamePlayer gamePlayer) {
		return org.archi.common.core.GamePlayer.newBuilder()
				.setId(gamePlayer.getId())
				.setGameId(gamePlayer.getGame().getId())
				.setPlayerId(gamePlayer.getPlayerId())
				.setPlayedAt(DateTimeUtil.toString(gamePlayer.getPlayedAt()))
				.build();
	}

	private org.archi.core.entity.game.GamePlayer convertToEntityGamePlayer(long gameId, long playerId) {
		org.archi.core.entity.game.GamePlayer gamePlayer = new org.archi.core.entity.game.GamePlayer();
		gamePlayer.setGame(gameService.getGameById(gameId));
		gamePlayer.setPlayerId(playerId);

		return gamePlayer;
	}

	private org.archi.common.core.QuizQuestion convertToGrpcQuizQuestion(org.archi.core.entity.quiz.QuizQuestion quizQuestion) {
		return org.archi.common.core.QuizQuestion.newBuilder()
				.setId(quizQuestion.getQuestionId())
				.setGameId(quizQuestion.getGame().getId())
				.setQuestionNumber(quizQuestion.getQuestionNumber())
				.setQuestionTitle(quizQuestion.getQuestionTitle())
				.setQuestionContent(quizQuestion.getQuestionContent())
				.setAnswerA(quizQuestion.getAnswerA())
				.setAnswerB(quizQuestion.getAnswerB())
				.setAnswerC(quizQuestion.getAnswerC())
				.setAnswerD(quizQuestion.getAnswerD())
				.setCorrectAnswer(String.valueOf(quizQuestion.getCorrectAnswer()))
				.setAnswerExplanation(quizQuestion.getAnswerExplanation())
				.build();
	}

	private org.archi.core.entity.quiz.QuizQuestion convertToEntityQuizQuestion (
			long gameId,
			int questionNumber,
			String questionTitle,
			String questionContent,
			String answerA,
			String answerB,
			String answerC,
			String answerD,
			String correctAnswer,
			String answerExplanation) {

		org.archi.core.entity.quiz.QuizQuestion quizQuestion = new org.archi.core.entity.quiz.QuizQuestion();
		quizQuestion.setGame(gameService.getGameById(gameId));
		quizQuestion.setQuestionNumber(questionNumber);
		quizQuestion.setQuestionTitle(questionTitle);
		quizQuestion.setQuestionContent(questionContent);
		quizQuestion.setAnswerA(answerA);
		quizQuestion.setAnswerB(answerB);
		quizQuestion.setAnswerC(answerC);
		quizQuestion.setAnswerD(answerD);
		quizQuestion.setCorrectAnswer(correctAnswer.charAt(0));
		quizQuestion.setAnswerExplanation(answerExplanation);

		return quizQuestion;
	}


	@Override
	public void getAllGameTypes(GetAllGameTypesRequest request, StreamObserver<GetAllGameTypesResponse> responseObserver) {
		try {
			List<org.archi.core.entity.game.GameType> gameTypes = gameTypeService.getAllGameTypes();
			List<org.archi.common.core.GameType> grpcGameTypes = gameTypes.stream()
					.map(this::convertToGrpcGameType)
					.toList();

			GetAllGameTypesResponse response = GetAllGameTypesResponse.newBuilder()
					.addAllGameTypes(grpcGameTypes)
					.build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		catch (Exception e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void getGameTypeById(GetGameTypeByIdRequest request, StreamObserver<GetGameTypeByIdResponse> responseObserver) {
		int id = request.getId();
		org.archi.core.entity.game.GameType gameType = gameTypeService.getGameTypeById(id);
		org.archi.common.core.GameType grpcGameType = convertToGrpcGameType(gameType);

		GetGameTypeByIdResponse response = GetGameTypeByIdResponse.newBuilder()
				.setGameType(grpcGameType)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void addGameType(AddGameTypeRequest request, StreamObserver<AddGameTypeResponse> responseObserver) {
		org.archi.core.entity.game.GameType gameType = convertToEntityGameType(
				request.getName(),
				request.getIsRealtime(),
				request.getImageUrl(),
				request.getInstruction()
		);

		org.archi.core.entity.game.GameType savedGameType = gameTypeService.addGameType(gameType);
		org.archi.common.core.GameType grpcSavedGameType = convertToGrpcGameType(savedGameType);

		AddGameTypeResponse response = AddGameTypeResponse.newBuilder()
				.setGameType(grpcSavedGameType)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void updateGameType(UpdateGameTypeRequest request, StreamObserver<UpdateGameTypeResponse> responseObserver) {
		org.archi.core.entity.game.GameType gameType = convertToEntityGameType(
				request.getName(),
				request.getIsRealtime(),
				request.getImageUrl(),
				request.getInstruction()
		);
		org.archi.core.entity.game.GameType savedGameType = gameTypeService.updateGameType(request.getId(), gameType);
		org.archi.common.core.GameType grpcSavedGameType = convertToGrpcGameType(savedGameType);

		UpdateGameTypeResponse response = UpdateGameTypeResponse.newBuilder()
				.setGameType(grpcSavedGameType)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void deleteGameType(DeleteGameTypeRequest request, StreamObserver<DeleteGameTypeResponse> responseObserver) {
		int id = request.getId();
		gameTypeService.deleteGameType(id);

		DeleteGameTypeResponse response = DeleteGameTypeResponse.newBuilder()
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}


	@Override
	public void getAllGames(GetAllGamesRequest request, StreamObserver<GetAllGamesResponse> responseObserver) {
		List<org.archi.core.entity.game.Game> games = gameService.getAllGames();

		List<org.archi.common.core.Game> grpcGames = games.stream()
				.map(this::convertToGrpcGame)
				.toList();

		GetAllGamesResponse response = GetAllGamesResponse.newBuilder()
				.addAllGames(grpcGames)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void getGameById(GetGameByIdRequest request, StreamObserver<GetGameByIdResponse> responseObserver) {
		long id = request.getId();
		org.archi.core.entity.game.Game game = gameService.getGameById(id);
		org.archi.common.core.Game grpcGame = convertToGrpcGame(game);

		GetGameByIdResponse response = GetGameByIdResponse.newBuilder()
				.setGame(grpcGame)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void getGamesByCampaign(GetGamesByCampaignRequest request, StreamObserver<GetGamesByCampaignResponse> responseObserver) {
		long campaignId = request.getCampaignId();
		List<org.archi.core.entity.game.Game> games = gameService.getGamesByCampaign(campaignId);

		List<org.archi.common.core.Game> grpcGames = games.stream()
				.map(this::convertToGrpcGame)
				.toList();

		GetGamesByCampaignResponse response = GetGamesByCampaignResponse.newBuilder()
				.addAllGames(grpcGames)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void addGame(AddGameRequest request, StreamObserver<AddGameResponse> responseObserver) {
		org.archi.core.entity.game.Game game = convertToEntityGame(
		request.getAllowPiecesExchange(),
				request.getStartAt(),
				request.getGameTypeId(),
				request.getCampaignId()
		);

		org.archi.core.entity.game.Game savedGame = gameService.addGame(game);
		org.archi.common.core.Game grpcSavedGame = convertToGrpcGame(savedGame);

		AddGameResponse response = AddGameResponse.newBuilder()
				.setGame(grpcSavedGame)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void updateGame(UpdateGameRequest request, StreamObserver<UpdateGameResponse> responseObserver) {
		org.archi.core.entity.game.Game game = convertToEntityGame(
			request.getAllowPiecesExchange(),
				request.getStartAt(),
				request.getGameTypeId(),
				request.getCampaignId()
		);

		org.archi.core.entity.game.Game savedGame = gameService.updateGame(request.getId(), game);
		org.archi.common.core.Game grpcSavedGame = convertToGrpcGame(savedGame);

		UpdateGameResponse response = UpdateGameResponse.newBuilder()
				.setGame(grpcSavedGame)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void deleteGame(DeleteGameRequest request, StreamObserver<DeleteGameResponse> responseObserver) {
		long id = request.getId();
		gameService.deleteGame(id);

		DeleteGameResponse response = DeleteGameResponse.newBuilder()
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void addGamePlayer(AddGamePlayerRequest request, StreamObserver<AddGamePlayerResponse> responseObserver) {
		org.archi.core.entity.game.GamePlayer gamePlayer = convertToEntityGamePlayer(
				request.getGameId(),
				request.getPlayerId()
		);

		org.archi.core.entity.game.GamePlayer savedGamePlayer = gameService.addGamePlayer(gamePlayer);
		org.archi.common.core.GamePlayer grpcSavedGamePlayer = convertToGrpcGamePlayer(savedGamePlayer);

		AddGamePlayerResponse response = AddGamePlayerResponse.newBuilder()
				.setGamePlayer(grpcSavedGamePlayer)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void hasWin(HasWinRequest request, StreamObserver<HasWinResponse> responseObserver) {
		boolean win = gameService.hasWin();

		HasWinResponse response = HasWinResponse.newBuilder()
				.setHasWin(win)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void getWinItem(GetWinItemRequest request, StreamObserver<GetWinItemResponse> responseObserver) {
		long playerId = request.getPlayerId();
		long gameId = request.getGameId();

		org.archi.core.entity.campaign.Item item = gameService.getWinItem(playerId, gameId);
		org.archi.common.core.Item grpcItem = null;

		if (item instanceof org.archi.core.entity.campaign.Voucher) {

			org.archi.core.entity.campaign.Voucher voucher = (org.archi.core.entity.campaign.Voucher) item;
			grpcItem = org.archi.common.core.Item.newBuilder()
							.setVoucher(org.archi.common.core.Voucher.newBuilder()
								.setId(voucher.getId())
								.setIssuedAt(DateTimeUtil.toString(voucher.getIssuedAt()))
								.setExpiredDate(DateTimeUtil.toString(voucher.getExpiredDate()))
								.setStatus(voucher.getStatus())
								.setQRCode(voucher.getQRCode())
								.setVoucherType(
										org.archi.common.core.VoucherType.newBuilder()
											.setId(voucher.getVoucherType().getId())
											.setName(voucher.getVoucherType().getName())
											.setValue(voucher.getVoucherType().getValue())
											.setImageUrl(voucher.getVoucherType().getImage())
											.setDescription(voucher.getVoucherType().getDescription())
											.setBrandId(voucher.getVoucherType().getBrandId())
										.build())
							.build())
					.build();

		} else if (item instanceof org.archi.core.entity.campaign.Piece) {

			org.archi.core.entity.campaign.Piece piece = (org.archi.core.entity.campaign.Piece) item;
			grpcItem = org.archi.common.core.Item.newBuilder()
							.setPiece(org.archi.common.core.Piece.newBuilder()
								.setId(piece.getId())
								.setImageUrl(piece.getImageUrl())
							.build())
					.build();
		}

		GetWinItemResponse response = GetWinItemResponse.newBuilder()
				.setItem(grpcItem)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}


	@Override
	public void getQuizQuestionById(GetQuizQuestionByIdRequest request, StreamObserver<GetQuizQuestionByIdResponse> responseObserver) {
		long id = request.getId();
		org.archi.core.entity.quiz.QuizQuestion quizQuestion = quizService.getQuizQuestionById(id);
		org.archi.common.core.QuizQuestion grpcQuizQuestion = convertToGrpcQuizQuestion(quizQuestion);

		GetQuizQuestionByIdResponse response = GetQuizQuestionByIdResponse.newBuilder()
				.setQuizQuestion(grpcQuizQuestion)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void getQuizQuestionsByGame(GetQuizQuestionsByGameRequest request, StreamObserver<GetQuizQuestionsByGameResponse> responseObserver) {
		long gameId = request.getGameId();
		List<org.archi.core.entity.quiz.QuizQuestion> quizQuestions = quizService.getQuizQuestionsByGame(gameService.getGameById(gameId));

		List<org.archi.common.core.QuizQuestion> grpcQuizQuestions = quizQuestions.stream()
				.map(this::convertToGrpcQuizQuestion)
				.toList();

		GetQuizQuestionsByGameResponse response = GetQuizQuestionsByGameResponse.newBuilder()
				.addAllQuizQuestion(grpcQuizQuestions)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void addQuizQuestion(AddQuizQuestionRequest request, StreamObserver<AddQuizQuestionResponse> responseObserver) {
		org.archi.core.entity.quiz.QuizQuestion quizQuestion = convertToEntityQuizQuestion(
				request.getGameId(),
				request.getQuestionNumber(),
				request.getQuestionTitle(),
				request.getQuestionContent(),
				request.getAnswerA(),
				request.getAnswerB(),
				request.getAnswerC(),
				request.getAnswerD(),
				request.getCorrectAnswer(),
				request.getAnswerExplanation()
		);

		org.archi.core.entity.quiz.QuizQuestion savedQuizQuestion = quizService.addQuizQuestion(quizQuestion);
		org.archi.common.core.QuizQuestion grpcSavedQuizQuestion = convertToGrpcQuizQuestion(savedQuizQuestion);

		AddQuizQuestionResponse response = AddQuizQuestionResponse.newBuilder()
				.setQuizQuestion(grpcSavedQuizQuestion)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void updateQuizQuestion(UpdateQuizQuestionRequest request, StreamObserver<UpdateQuizQuestionResponse> responseObserver) {

		org.archi.core.entity.quiz.QuizQuestion quizQuestion = convertToEntityQuizQuestion(
				request.getGameId(),
				request.getQuestionNumber(),
				request.getQuestionTitle(),
				request.getQuestionContent(),
				request.getAnswerA(),
				request.getAnswerB(),
				request.getAnswerC(),
				request.getAnswerD(),
				request.getCorrectAnswer(),
				request.getAnswerExplanation()
		);

		org.archi.core.entity.quiz.QuizQuestion savedQuizQuestion = quizService.updateQuizQuestion(request.getId(), quizQuestion);
		org.archi.common.core.QuizQuestion grpcSavedQuizQuestion = convertToGrpcQuizQuestion(savedQuizQuestion);

		UpdateQuizQuestionResponse response = UpdateQuizQuestionResponse.newBuilder()
				.setQuizQuestion(grpcSavedQuizQuestion)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void deleteQuizQuestion(DeleteQuizQuestionRequest request, StreamObserver<DeleteQuizQuestionResponse> responseObserver) {
		long id = request.getId();
		quizService.deleteQuizQuestion(id);

		DeleteQuizQuestionResponse response = DeleteQuizQuestionResponse.newBuilder()
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}
