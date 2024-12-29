package org.archi.core.dtos;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VoucherRequest {
    @NotNull(message = "Voucher type ID cannot be null")
    private Long voucherTypeId;

    @NotNull(message = "Expiration date cannot be null")
    @Future(message = "Expiration date must be in the future")
    private LocalDateTime expirationDate;

    @NotNull(message = "Brand ID cannot be null")
    private Long brandId;
}
