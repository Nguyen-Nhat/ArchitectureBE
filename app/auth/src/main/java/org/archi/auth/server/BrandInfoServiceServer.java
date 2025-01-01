package org.archi.auth.server;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.archi.auth.model.Brand;
import org.archi.auth.service.BrandService;
import org.archi.common.auth.BrandInfoServiceGrpc;
import org.archi.common.auth.GetBrandInfoRequest;
import org.archi.common.auth.GetBrandInfoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@GrpcService
@Service
public class BrandInfoServiceServer extends BrandInfoServiceGrpc.BrandInfoServiceImplBase {
  private final BrandService brandService;

  public BrandInfoServiceServer(BrandService brandService) {
    super();
    this.brandService = brandService;
  }

  @Override
  public void getBrandInfo(GetBrandInfoRequest request, StreamObserver<GetBrandInfoResponse> responseObserver) {
    long id = request.getId();
    Brand brand = brandService.findById(id);
    if (brand == null || brand.getId() <= 0) {
      responseObserver.onNext(GetBrandInfoResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Brand not found")
              .build());
    } else {
      responseObserver.onNext(GetBrandInfoResponse.newBuilder()
              .setStatus(HttpStatus.OK.value())
              .setMessage("Success")
              .setId(brand.getId())
              .setName(brand.getName())
              .setField(brand.getField())
              .setAddress(brand.getAddress())
              .setGps(brand.getGps())
              .setIsEnable(brand.getIsEnable())
              .build());
    }
    responseObserver.onCompleted();
  }
}
