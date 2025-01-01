package org.archi.core.grpc;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.common.core.*;
import org.archi.core.service.CampaignService;
import org.archi.core.service.VoucherService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@RequiredArgsConstructor
public class CoreServiceEndpointImpl extends CoreServiceGrpc.CoreServiceImplBase{
	private final CampaignService campaignService;
	private final VoucherService voucherService;

    @Override
	public void getVouchers(GetVouchersRequest request, StreamObserver<GetVouchersResponse> responseObserver) {
		long id = request.getId();

		GetVouchersResponse response = GetVouchersResponse.newBuilder()
				.setMessage(String.valueOf(id))
				.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

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
	public void getCampaigns(GetCampaignsRequest request, StreamObserver<GetCampaignsResponse> responseObserver) {
		try {
			// Parse startDate and endDate from the request
			LocalDateTime startDate = LocalDateTime.parse(request.getStartDate());
			LocalDateTime endDate = LocalDateTime.parse(request.getEndDate());

			// Fetch campaigns from the service
			List<org.archi.core.entity.Campaign> campaigns = campaignService.getCampaignsByDateRange(startDate, endDate);

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

			List<org.archi.core.entity.Campaign> campaigns = campaignService.getCampaignsByBrandId(brandId);

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

			// Create a new Campaign with given informations
			org.archi.core.entity.Campaign campaignToUpdate = new org.archi.core.entity.Campaign();
			campaignToUpdate.setName(name);
			campaignToUpdate.setImageUrl(imageUrl);
			campaignToUpdate.setStartDate(startDate);
			campaignToUpdate.setEndDate(endDate);
			campaignToUpdate.setStatus(status);
			if (endDate != null && startDate.isAfter(endDate)) {
				responseObserver.onError(new IllegalArgumentException("Start date cannot be after end date."));
			}

			// Call the service to update the campaign
			org.archi.core.entity.Campaign updatedCampaign = campaignService.updateCampaign(campaignId, campaignToUpdate);

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

}
