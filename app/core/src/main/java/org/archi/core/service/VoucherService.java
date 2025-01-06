package org.archi.core.service;

import lombok.AllArgsConstructor;
import org.archi.common.core.*;
import org.archi.core.entity.Voucher;
import org.archi.core.entity.VoucherType;
import org.archi.core.exception.InvalidArgumentException;
import org.archi.core.repo.VoucherRepo;
import org.archi.core.repo.VoucherTypeRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VoucherService {
    private final VoucherRepo voucherRepo;
    private final VoucherTypeRepo voucherTypeRepo;

    public GenerateVoucherResponse generateVoucher(GenerateVoucherRequest request) {

        VoucherType voucherType = voucherTypeRepo.findById(request.getVoucherTypeId())
                .orElseThrow(() -> new IllegalArgumentException("Voucher type not found for ID: " + request.getVoucherTypeId()));

        // Check if the brand owns the voucher type
        if (!voucherType.getBrandId().equals(request.getBrandId())) {
            throw new IllegalArgumentException("This voucher type does not belong to the brand.");
        }

        // Generate unique voucher code
        String uniqueCode = "BR" + request.getBrandId() + UUID.randomUUID().toString();
        // Create voucher object
        Voucher voucher = new Voucher();
        voucher.setQRCode(uniqueCode);
        LocalDateTime now = LocalDateTime.now();
        voucher.setIssuedAt(now);
        voucher.setExpiredDate(now.plusMinutes(Long.parseLong(request.getDuration())));
        voucher.setVoucherType(voucherType);
        voucher.setPlayerId(request.getPlayerId());

        // Save into the database
        Voucher generatedVoucher = voucherRepo.save(voucher);
        return GenerateVoucherResponse.newBuilder()
                .setId(generatedVoucher.getId())
                .setIssuedAt(generatedVoucher.getIssuedAt().toString())
                .setExpiredDate(generatedVoucher.getExpiredDate().toString())
                .setStatus(generatedVoucher.getStatus())
                .setQRCode(generatedVoucher.getQRCode())
                .setVoucherType(org.archi.common.core.VoucherType.newBuilder()
                        .setId(voucherType.getId())
                        .setName(voucherType.getName())
                        .setValue(voucherType.getValue())
                        .setDescription(voucherType.getDescription())
                        .setImageUrl(voucherType.getImage())
                        .setBrandId(voucherType.getBrandId()))
                .build();
    }

    // OK
    public CreateVoucherTypeResponse createVoucherType(CreateVoucherTypeRequest requestDTO) {
        // Check if a voucher type with the same name already exists for the brand
        if (voucherTypeRepo.existsByNameAndBrandId(requestDTO.getName(), requestDTO.getBrandId())) {
            throw new IllegalArgumentException(
                    "Voucher type with the name '" + requestDTO.getName() + "' already exists for this brand.");
        }

        // Map the DTO to the VoucherTypeRepo entity
        VoucherType voucherType = new VoucherType();
        voucherType.setName(requestDTO.getName());
        voucherType.setValue(requestDTO.getValue());
        voucherType.setDescription(requestDTO.getDescription());
        voucherType.setImage(requestDTO.getImageUrl());
        voucherType.setBrandId(requestDTO.getBrandId());

        // Save the entity
        VoucherType savedVoucherType = voucherTypeRepo.save(voucherType);

        return CreateVoucherTypeResponse.newBuilder()
                .setVoucherType(org.archi.common.core.VoucherType.newBuilder()
                        .setId(savedVoucherType.getId())
                        .setName(savedVoucherType.getName())
                        .setValue(savedVoucherType.getValue())
                        .setDescription(savedVoucherType.getDescription())
                        .setImageUrl(savedVoucherType.getImage())
                        .setBrandId(savedVoucherType.getBrandId()).build())
                .build();
    }

    public SearchVoucherResponse searchVoucher(SearchRequest request) {
        String term = request.getTerm();

        List<Voucher> matchingVouchers = voucherRepo.findByStatusContainingIgnoreCaseOrQRCodeContainingIgnoreCase(term, term);

        // Map database entities to gRPC response
        List<org.archi.common.core.Voucher> grpcVouchers = matchingVouchers.stream()
                .map(voucher -> org.archi.common.core.Voucher.newBuilder()
                        .setId(voucher.getId())
                        .setIssuedAt(voucher.getIssuedAt().toString())
                        .setExpiredDate(voucher.getExpiredDate().toString())
                        .setStatus(voucher.getStatus() != null ? voucher.getStatus() : "")
                        .setQRCode(voucher.getQRCode() != null ? voucher.getQRCode() : "")
                        .setVoucherType(org.archi.common.core.VoucherType.newBuilder()
                                .setId(voucher.getVoucherType().getId())
                                .setName(voucher.getVoucherType().getName())
                                .setValue(voucher.getVoucherType().getValue())
                                .setImageUrl(voucher.getVoucherType().getImage() != null ? voucher.getVoucherType().getImage() : "")
                                .setDescription(voucher.getVoucherType().getDescription() != null ? voucher.getVoucherType().getDescription() : "")
                                .setBrandId(voucher.getVoucherType().getBrandId())
                                .build())
                        .build())
                .collect(Collectors.toList());

        // Build and return the response
        return SearchVoucherResponse.newBuilder()
                .addAllVouchers(grpcVouchers)
                .build();
    }

    // OK
    public SearchVoucherTypeResponse searchVoucherType(SearchRequest request) {
        String term = request.getTerm();

        List<VoucherType> matchingTypes = voucherTypeRepo.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(term, term);

        List<org.archi.common.core.VoucherType> grpcVoucherTypes = matchingTypes.stream()
                .map(type -> org.archi.common.core.VoucherType.newBuilder()
                        .setId(type.getId())
                        .setName(type.getName())
                        .setValue(type.getValue())
                        .setImageUrl(type.getImage() != null ? type.getImage() : "")
                        .setDescription(type.getDescription() != null ? type.getDescription() : "")
                        .setBrandId(type.getBrandId())
                        .build())
                .collect(Collectors.toList());

        // Build and return the response
        return SearchVoucherTypeResponse.newBuilder()
                .addAllVoucherTypes(grpcVoucherTypes)
                .build();
    }

    // OK
    public UpdateVoucherTypeRes updateVoucherType(UpdateVoucherTypeReq request) {
        VoucherType voucherType = voucherTypeRepo.findById(request.getVoucherId())
                .orElseThrow(() -> new InvalidArgumentException("Voucher type not found for ID: " + request.getVoucherId()));

        // Verify that the brand ID matches
        if (!voucherType.getBrandId().equals(request.getBrandId())) {
            throw new InvalidArgumentException("Brand does not own this voucher type.");
        }

        if (request.getName() != null && !request.getName().isBlank()) {
            voucherType.setName(request.getName());
        }
        request.getDescription();
        if (!request.getDescription().isEmpty()) {
            voucherType.setDescription(request.getDescription());
        }
        if (request.getValue() > 0) {
            voucherType.setValue(request.getValue());
        }

        VoucherType updatedVoucherType = voucherTypeRepo.save(voucherType);

        // Map the updated entity to the gRPC response
        return UpdateVoucherTypeRes.newBuilder()
                .setUpdatedVoucherType(org.archi.common.core.VoucherType.newBuilder()
                        .setId(updatedVoucherType.getId())
                        .setName(updatedVoucherType.getName())
                        .setValue(updatedVoucherType.getValue())
                        .setDescription(updatedVoucherType.getDescription() != null ? updatedVoucherType.getDescription() : "")
                        .setImageUrl(updatedVoucherType.getImage() != null ? updatedVoucherType.getImage() : "")
                        .setBrandId(updatedVoucherType.getBrandId())
                        .build())
                .build();
    }

    public GetVouchersResponse getVouchers(GetVouchersRequest request) {
        Long playerId = request.getPlayerId();

        List<Voucher> vouchers  = voucherRepo.findByPlayerId(playerId);

        // Map the vouchers to the gRPC response format
        List<org.archi.common.core.Voucher> grpcVouchers = vouchers.stream()
                .map(voucher -> org.archi.common.core.Voucher.newBuilder()
                        .setId(voucher.getId())
                        .setIssuedAt(voucher.getIssuedAt().toString())
                        .setExpiredDate(voucher.getExpiredDate().toString())
                        .setStatus(voucher.getStatus() != null ? voucher.getStatus() : "")
                        .setQRCode(voucher.getQRCode() != null ? voucher.getQRCode() : "")
                        .setVoucherType(org.archi.common.core.VoucherType.newBuilder()
                                .setId(voucher.getVoucherType().getId())
                                .setName(voucher.getVoucherType().getName())
                                .setValue(voucher.getVoucherType().getValue())
                                .setImageUrl(voucher.getVoucherType().getImage() != null ? voucher.getVoucherType().getImage() : "")
                                .setDescription(voucher.getVoucherType().getDescription() != null ? voucher.getVoucherType().getDescription() : "")
                                .setBrandId(voucher.getVoucherType().getBrandId())
                                .build())
                        .build())
                .collect(Collectors.toList());

        return GetVouchersResponse.newBuilder()
                .addAllVouchers(grpcVouchers)
                .build();
    }

    public GetVoucherTypesRes getVoucherTypes(GetVoucherTypesReq request) {
        // Extract filter criteria
        Long brandId = request.getBrandId();

        // Fetch data based on filter
        List<VoucherType> voucherTypes;
        if (brandId != null) {
            voucherTypes = voucherTypeRepo.findAllByBrandId(brandId);
        } else {
            voucherTypes = voucherTypeRepo.findAll();
        }

        // Map database entities to gRPC response objects
        List<org.archi.common.core.VoucherType> grpcVoucherTypes = voucherTypes.stream()
                .map(voucherType -> org.archi.common.core.VoucherType.newBuilder()
                        .setId(voucherType.getId())
                        .setName(voucherType.getName())
                        .setValue(voucherType.getValue())
                        .setDescription(voucherType.getDescription() != null ? voucherType.getDescription() : "")
                        .setImageUrl(voucherType.getImage() != null ? voucherType.getImage() : "")
                        .setBrandId(voucherType.getBrandId())
                        .build())
                .collect(Collectors.toList());

        // Build and return the response
        return GetVoucherTypesRes.newBuilder()
                .addAllVoucherTypes(grpcVoucherTypes)
                .build();
    }
}
