package org.archi.core.controllers;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.archi.core.dtos.VoucherRequest;
import org.archi.core.dtos.VoucherTypeRequest;
import org.archi.core.entities.Voucher;
import org.archi.core.entities.VoucherType;
import org.archi.core.errors.ErrorResponse;
import org.archi.core.services.VoucherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/vouchers")
@AllArgsConstructor
public class VoucherController {
    private final VoucherService voucherService;

    /**
     * API endpoint to create a new voucher for a specific voucher type.
     *
     * @return The created Voucher object.
     */
    @PostMapping("/gen-new")
    public ResponseEntity<Voucher> generateVoucher(
            @Valid @RequestBody VoucherRequest voucherRequest) {
        try {
            Voucher createdVoucher = voucherService.generateVoucher(voucherRequest);
            return ResponseEntity.ok(createdVoucher);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/new")
    public ResponseEntity<?> createVoucher(
            @Valid @RequestBody VoucherTypeRequest voucherRequest) {
        try {
            VoucherType createdVoucher = voucherService.createVoucherType(voucherRequest);
            return ResponseEntity.ok(createdVoucher);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(new ErrorResponse("Create new voucher type failed.", e.getMessage()));
        }
    }

    /**
     * API endpoint to fetch all voucher types for a brand.
     *
     * @param brandId The ID of the brand.
     * @return A list of voucher types as response DTOs.
     */
    @GetMapping
    public ResponseEntity<?> getVoucherTypesByBrand(@RequestParam Long brandId) {

        try{
            List<VoucherType> voucherTypes = voucherService.findVoucherTypesByBrand(brandId);
            return ResponseEntity.ok(voucherTypes);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(new ErrorResponse("Get voucher types failed.", e.getMessage()));
        }
    }

    /**
     * API endpoint to delete a specific voucher type by brand.
     *
     * @param voucherTypeId The ID of the voucher type to delete.
     * @param brandId       The ID of the brand requesting the deletion.
     * @return 204 (No Content) if successfully deleted, 404 (Not Found) if the voucher type does not belong to the brand.
     */
    @DeleteMapping("/{voucherTypeId}")
    public ResponseEntity<Void> deleteVoucherTypeByBrand(
            @PathVariable Long voucherTypeId,
            @RequestParam Long brandId) {
        boolean deleted = voucherService.deleteVoucherTypeByBrand(voucherTypeId, brandId);

        if (deleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        }

        return ResponseEntity.notFound().build(); // 404 Not Found
    }

    @PutMapping("/{id}")
    public ResponseEntity<VoucherType> updateVoucherType(@PathVariable Long id, @RequestBody VoucherType updatedVoucherType) {
        VoucherType result = voucherService.updateVoucherType(id, updatedVoucherType);
        return ResponseEntity.ok(result);
    }
}
