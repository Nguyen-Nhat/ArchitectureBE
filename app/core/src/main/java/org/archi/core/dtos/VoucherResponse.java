package org.archi.core.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VoucherResponse {
    private String code; // The unique voucher code
    private LocalDateTime generationDate;
    private LocalDateTime expirationDate;
    private String voucherTypeName;
    private Long voucherId;
}
