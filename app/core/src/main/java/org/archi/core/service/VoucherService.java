package org.archi.core.service;

import lombok.AllArgsConstructor;
import org.archi.common.core.CreateVoucherTypeRequest;
import org.archi.common.core.CreateVoucherTypeResponse;
import org.archi.common.core.GenerateVoucherRequest;
import org.archi.common.core.GenerateVoucherResponse;
import org.archi.core.entity.Voucher;
import org.archi.core.entity.VoucherType;
import org.archi.core.repo.VoucherRepo;
import org.archi.core.repo.VoucherTypeRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

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
        voucher.setBrandId(request.getBrandId());

        // Save into the database
        Voucher generatedVoucher = voucherRepo.save(voucher);
        return GenerateVoucherResponse.newBuilder()
                .setId(generatedVoucher.getId())
                .setIssuedAt(generatedVoucher.getIssuedAt().toString())
                .setExpiredDate(generatedVoucher.getExpiredDate().toString())
                .setStatus(generatedVoucher.getStatus())
                .setQRCode(generatedVoucher.getQRCode())
                .setBrandId(generatedVoucher.getBrandId())
                .setVoucherType(generatedVoucher.getVoucherType().getId())
                .build();
    }

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
}
