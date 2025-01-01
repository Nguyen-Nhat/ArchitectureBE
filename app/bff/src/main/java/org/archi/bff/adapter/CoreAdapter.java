package org.archi.bff.adapter;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.archi.common.core.GetVouchersRequest;
import org.archi.common.core.GetVouchersResponse;
import org.springframework.stereotype.Service;

@Service
public class CoreAdapter {
    @GrpcClient("coreService")
    private CoreServiceGrpc.CoreServiceBlockingStub client;

    public GetVouchersResponse getVouchers(GetVouchersRequest request) {
        return client.getVouchers(request);
    }
}
