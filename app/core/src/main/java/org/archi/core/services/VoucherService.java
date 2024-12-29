package org.archi.core.services;

import lombok.AllArgsConstructor;
import org.archi.core.dtos.VoucherRequest;
import org.archi.core.dtos.VoucherTypeRequest;
import org.archi.core.entities.Voucher;
import org.archi.core.entities.VoucherType;
import org.archi.core.repositories.VoucherRepository;
import org.archi.core.repositories.VoucherTypeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VoucherService {
    private final VoucherRepository voucherRepository;
    private final VoucherTypeRepository voucherTypeRepository;

    public Voucher generateVoucher(VoucherRequest requestDTO) {
        // Fetch voucher type
        VoucherType voucherType = voucherTypeRepository.findById(requestDTO.getVoucherTypeId())
                .orElseThrow(() -> new IllegalArgumentException("Voucher type not found"));

        // Check if the brand owns the voucher type
        if (!voucherType.getBrandId().equals(requestDTO.getBrandId())) {
            throw new IllegalArgumentException("This voucher type does not belong to the brand.");
        }

        // Generate unique voucher code
        String uniqueCode = "BR" + requestDTO.getBrandId() + UUID.randomUUID().toString();
        // Create voucher object
        Voucher voucher = new Voucher();
        voucher.setQRCode(uniqueCode);
        voucher.setIssuedAt(LocalDateTime.now());
        voucher.setExpiredDate(requestDTO.getExpirationDate());
        voucher.setVoucherType(voucherType);
        voucher.setBrandId(requestDTO.getBrandId());

        // Save into the database

        return voucherRepository.save(voucher);
    }

    public VoucherType createVoucherType(VoucherTypeRequest requestDTO) {
        // Check if a voucher type with the same name already exists for the brand
        if (voucherTypeRepository.existsByNameAndBrandId(requestDTO.getName(), requestDTO.getBrandId())) {
            throw new IllegalArgumentException(
                    "Voucher type with the name '" + requestDTO.getName() + "' already exists for this brand.");
        }

        // Map the DTO to the VoucherType entity
        VoucherType voucherType = new VoucherType();
        voucherType.setName(requestDTO.getName());
        voucherType.setValue(requestDTO.getValue());
        voucherType.setDescription(requestDTO.getDescription());
        voucherType.setImage(requestDTO.getImage());
        voucherType.setBrandId(requestDTO.getBrandId());

        // Save the entity
        VoucherType savedVoucherType = voucherTypeRepository.save(voucherType);

        return savedVoucherType;
    }

    /**
     * Fetch all voucher types belonging to a brand.
     *
     * @param brandId The ID of the brand.
     * @return A list of voucher types as response DTOs.
     */
    public List<VoucherType> findVoucherTypesByBrand(Long brandId) {
        // Check the valid of the brand using gRPC logic
        boolean isBrandActive = validateBrand(brandId);
        if (!isBrandActive) {
            throw new IllegalArgumentException("Brand with ID " + brandId + " is not active.");
        }

        List<VoucherType> voucherTypes = voucherTypeRepository.findAllByBrandId(brandId);
        return voucherTypes;
    }

    /**
     * Delete a voucher type for a specific brand if it exists and belongs to the brand.
     *
     * @param voucherTypeId The ID of the voucher type.
     * @param brandId The ID of the brand.
     * @return True if deleted, false if the voucher type does not exist or does not belong to the brand.
     */
    public boolean deleteVoucherTypeByBrand(Long voucherTypeId, Long brandId) {
        // Check if the voucher type exists for the brand
        if (!voucherTypeRepository.findByIdAndBrandId(voucherTypeId, brandId).isPresent()) {
            return false; // Type not found or does not belong to the brand
        }

        // Safely delete the voucher type
        voucherTypeRepository.deleteByIdAndBrandId(voucherTypeId, brandId);
        return true;
    }

    public VoucherType updateVoucherType(Long id, VoucherType updatedVoucherType) {
        Optional<VoucherType> existingVoucherType = voucherTypeRepository.findById(id);
        if (existingVoucherType.isPresent()) {
            VoucherType voucherType = existingVoucherType.get();
            if (updatedVoucherType.getName() != null){
                voucherType.setName(updatedVoucherType.getName());
            }
            if (updatedVoucherType.getValue() != null){
                voucherType.setDescription(updatedVoucherType.getDescription());
            }
            if (updatedVoucherType.getImage() != null){
                voucherType.setImage(updatedVoucherType.getImage());
            }
            if (updatedVoucherType.getDescription() != null){
                voucherType.setDescription(updatedVoucherType.getDescription());
            }
            return voucherTypeRepository.save(voucherType);
        } else {
            throw new RuntimeException("VoucherType with ID " + id + " not found");
        }
    }

    // ultility functions
    boolean validateBrand(Long brandId) {
        // gRPC logic
        return true;
    }
}
