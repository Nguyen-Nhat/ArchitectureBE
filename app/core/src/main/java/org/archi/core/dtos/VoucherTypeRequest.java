package org.archi.core.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class VoucherTypeRequest {
    @NotBlank(message = "Voucher type name cannot be blank")
    private String name;

    @NotNull(message = "Voucher value cannot be null")
    @Positive(message = "Voucher value must be greater than zero")
    private Double value;

    private String description;

    private String image; // Optional: URL to the voucher's image

    @NotNull(message = "Brand ID cannot be null")
    private Long brandId;
}
