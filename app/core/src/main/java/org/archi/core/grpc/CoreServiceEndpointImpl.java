package org.archi.core.grpc;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.common.core.*;
import org.archi.core.exception.InvalidArgumentException;
import org.archi.core.exception.ResourceNotFoundException;
import org.archi.core.service.CampaignService;
import org.archi.core.service.VoucherService;

import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@RequiredArgsConstructor
public class CoreServiceEndpointImpl extends CoreServiceGrpc.CoreServiceImplBase{
	private final CampaignService campaignService;
	private final VoucherService voucherService;

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
		} catch (InvalidArgumentException ex) {
			responseObserver.onError(Status.INVALID_ARGUMENT
					.withDescription(ex.getMessage())
					.withCause(ex)
					.asRuntimeException());
		} catch (Exception ex) {
			responseObserver.onError(ex);
		}
	}

	@Override
	public void searchVoucher(SearchRequest request, StreamObserver<SearchVoucherResponse> responseObserver) {
		try {
			List<Voucher> grpcVouchers = voucherService.searchVoucher(request);
			responseObserver.onNext(grpcVouchers.isEmpty()
					? SearchVoucherResponse.getDefaultInstance()
					: SearchVoucherResponse.newBuilder()
						.addAllVouchers(grpcVouchers).build());
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void searchVoucherType(SearchRequest request, StreamObserver<SearchVoucherTypeResponse> responseObserver) {
		try {
			List<VoucherType> vcTypes = voucherService.searchVoucherType(request);
			responseObserver.onNext(vcTypes.isEmpty()
					? SearchVoucherTypeResponse.getDefaultInstance()
					: SearchVoucherTypeResponse.newBuilder()
						.addAllVoucherTypes(vcTypes)
						.build());
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void getCampaigns(GetCampaignsRequest request, StreamObserver<GetCampaignsResponse> responseObserver) {
		try {
			// Parse startDate and endDate from the request
			LocalDateTime startDate = LocalDateTime.parse(request.getStartDate() + "T00:00:00");
			LocalDateTime endDate = LocalDateTime.parse(request.getEndDate() + "T00:00:00");

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
							.setDescription(campaign.getDescription() != null ? campaign.getDescription() : "")
							.build()
			).collect(Collectors.toList());

			responseObserver.onNext(grpcCampaigns.isEmpty()
					? GetCampaignsResponse.getDefaultInstance()
							: GetCampaignsResponse.newBuilder()
									.addAllCampaigns(grpcCampaigns)
									.build()
					);
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void searchCampaign(SearchCampaignRequest request, StreamObserver<SearchCampaignResponse> responseObserver) {
		try {
			List<org.archi.common.core.Campaign> campaigns = campaignService.searchCampaigns(request.getTerm());

			if (campaigns.isEmpty()) {
				System.out.println("No campaigns found for term: " + request.getTerm());
			}

			responseObserver.onNext(campaigns.isEmpty()
					? SearchCampaignResponse.getDefaultInstance()
					: SearchCampaignResponse.newBuilder()
						.addAllCampaigns(campaigns)
						.build());
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(Status.INTERNAL
					.withDescription("An error occurred while searching for campaigns.")
					.withCause(e)
					.asRuntimeException());
		}
	}

	@Override
	public void createCampaign(CreateCampaignRequest request, StreamObserver<CreateCampaignResponse> responseObserver) {
		try {
			org.archi.core.entity.Campaign c = campaignService.createCampaign(request);
            CreateCampaignResponse response = CreateCampaignResponse.newBuilder()
					.setId(c.getId())
					.setName(c.getName())
					.setStartDate(c.getStartDate().toString())
					.setDescription(c.getDescription())
					.setEndDate(c.getEndDate().toString())
					.setBrandId(c.getBrandId())
					.setImageUrl(c.getImageUrl()).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}  catch (InvalidArgumentException e) {
			// Example of specific error handling
			responseObserver.onError(Status.INVALID_ARGUMENT
					.withDescription("Invalid input provided: " + e.getMessage())
					.withCause(e)
					.asRuntimeException());
		} catch (ResourceNotFoundException e) {
			// Resource not found error
			responseObserver.onError(Status.NOT_FOUND
					.withDescription("Campaign resource not found: " + e.getMessage())
					.withCause(e)
					.asRuntimeException());
		} catch (Exception e) {
			// General error handling
			responseObserver.onError(Status.UNKNOWN
					.withDescription("An unexpected error occurred: " + e.getMessage())
					.withCause(e)
					.asRuntimeException());
		}
	}

	@Override
	public void getCampaignsByBrandId(GetCampaignsByBrandIdReq request, StreamObserver<GetCampaignsByBrandIdRes> responseObserver) {
		try {
			long brandId = request.getBrandId();
			List<org.archi.core.entity.Campaign> campaigns = campaignService.getCampaignsByBrandId(brandId);
			if (campaigns.isEmpty()) {
				throw new ResourceNotFoundException("No campaigns found for the brand ID: " + brandId);
			}

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
		}
		catch (ResourceNotFoundException e) {
			// Handle resource not found
			responseObserver.onError(Status.NOT_FOUND
					.withDescription(e.getMessage())
					.withCause(e)
					.asRuntimeException());
		}
		catch (Exception e) {
			// Handle exception
			responseObserver.onError(e);
		}
	}

	@Override
	public void updateCampaign(UpdateCampaignReq request, StreamObserver<UpdateCampaignRes> responseObserver) {
		try {
			long campaignId = request.getCampaignId();
			String name = request.getNewName().isEmpty()? null : request.getNewName();
			String imageUrl = request.getNewImageUrl().isEmpty()? null : request.getNewImageUrl();
			LocalDateTime startDate = request.getNewStartDate().isEmpty()? null: LocalDateTime.parse(request.getNewStartDate());
			LocalDateTime endDate = request.getNewEndDate().isEmpty() ? null : LocalDateTime.parse(request.getNewEndDate());
			String status = request.getNewStatus().isEmpty()? null : request.getNewStatus();
			String description = request.getNewDescription().isEmpty()? null : request.getNewDescription();

			// Validate that the start date is not after the end date
			if (endDate != null && startDate != null && startDate.isAfter(endDate)) {
				responseObserver.onError(Status.INVALID_ARGUMENT
						.withDescription("Start date cannot be after end date.")
						.asRuntimeException());
				return;
			}

			org.archi.core.entity.Campaign campaignToUpdate = new org.archi.core.entity.Campaign();
			campaignToUpdate.setName(name);
			campaignToUpdate.setImageUrl(imageUrl);
			campaignToUpdate.setStartDate(startDate);
			campaignToUpdate.setEndDate(endDate);
			campaignToUpdate.setStatus(status);
			campaignToUpdate.setDescription(description);

			org.archi.core.entity.Campaign updatedCampaign = campaignService.updateCampaign(campaignId, campaignToUpdate);

			UpdateCampaignRes response = UpdateCampaignRes.newBuilder()
					.setCampaign(Campaign.newBuilder()
							.setId(updatedCampaign.getId())
							.setName(updatedCampaign.getName())
							.setImageUrl(updatedCampaign.getImageUrl() != null ? updatedCampaign.getImageUrl() : "")
							.setStartDate(updatedCampaign.getStartDate() != null? updatedCampaign.getStartDate().toString(): "")
							.setEndDate(updatedCampaign.getEndDate() != null ? updatedCampaign.getEndDate().toString() : "")
							.setStatus(updatedCampaign.getStatus() != null ? updatedCampaign.getStatus() : "")
							.setDescription(updatedCampaign.getDescription() != null ? updatedCampaign.getDescription(): "")
							.build())
					.build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (InvalidArgumentException e) {
			responseObserver.onError(Status.INVALID_ARGUMENT
					.withDescription("Invalid input provided: " + e.getMessage())
					.withCause(e)
					.asRuntimeException());
		} catch (Exception e) {
			responseObserver.onError(Status.INTERNAL
					.withDescription("An unexpected error occurred: " + e.getMessage())
					.withCause(e)
					.asRuntimeException());
		}
	}

}
