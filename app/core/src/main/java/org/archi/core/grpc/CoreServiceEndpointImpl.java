package org.archi.core.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.common.core.CoreServiceGrpc;
import org.archi.common.core.GetVouchersRequest;
import org.archi.common.core.GetVouchersResponse;

@GrpcService
public class CoreServiceEndpointImpl extends CoreServiceGrpc.CoreServiceImplBase{
	@Override
	public void getVouchers(GetVouchersRequest request, StreamObserver<GetVouchersResponse> responseObserver) {
		long id = request.getId();

		GetVouchersResponse response = GetVouchersResponse.newBuilder()
				.setMessage(String.valueOf(id))
				.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}
