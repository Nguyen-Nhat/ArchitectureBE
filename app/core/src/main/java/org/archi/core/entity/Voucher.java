package org.archi.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, updatable = false)
    private LocalDateTime issuedAt;
    @Column(nullable = false, updatable = false)
    private LocalDateTime expiredDate;
    private String status;
    @Column(unique = true, nullable = true)
    private String QRCode;
    private Long playerId;
    @ManyToOne
    @JoinColumn(name = "voucher_type_id", nullable = false)
    private VoucherType voucherType;
}
