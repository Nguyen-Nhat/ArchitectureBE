package org.archi.bff.adapter;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.archi.common.core.*;
import org.springframework.stereotype.Service;

@Service
public class CoreAdapter {
    @GrpcClient("coreService")
    private CoreServiceGrpc.CoreServiceBlockingStub client;

    public GetVouchersResponse getVouchers(GetVouchersRequest request) {
        return client.getVouchers(request);
    }
    public GetVoucherTypesRes getVoucherTypes(GetVoucherTypesReq request) {
        return client.getVouchersType(request);
    }

    public CreateVoucherTypeResponse createVoucherType(CreateVoucherTypeRequest request) {
        return client.createVoucherType(request);
    }

    public GenerateVoucherResponse generateVoucher(GenerateVoucherRequest request) {
        return client.generateVoucher(request);
    }

    public UpdateVoucherTypeRes updateVoucherType(UpdateVoucherTypeReq request) {
        return client.updateVoucherType(request);
    }

    public SearchVoucherResponse searchVoucher(SearchRequest request) {
        return client.searchVoucher(request);
    }
    public SearchVoucherTypeResponse searchVoucherType(SearchRequest request) {
        return client.searchVoucherType(request);
    }

    public GetCampaignsResponse getCampaigns(GetCampaignsRequest request) {
        return client.getCampaigns(request);
    }

    public SearchCampaignResponse searchCampaign(SearchCampaignRequest request) {
        return client.searchCampaign(request);
    }

    public CreateCampaignResponse createCampaign(CreateCampaignRequest request) {
        return client.createCampaign(request);
    }
    public GetCampaignsByBrandIdRes getCampaignsByBrandIdRes(GetCampaignsByBrandIdReq request) {
        return client.getCampaignsByBrandId(request);
    }

    public UpdateCampaignRes updateCampaign(UpdateCampaignReq request) {
        return client.updateCampaign(request);
    }

}
