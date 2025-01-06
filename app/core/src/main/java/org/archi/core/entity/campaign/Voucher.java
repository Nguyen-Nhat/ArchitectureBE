package org.archi.core.entity.campaign;

//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "voucher")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Voucher implements Item {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "voucher_id")
//    private Long id;
//
//    @Column(name = "image_url")
//    private String imageUrl;
//}

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voucher implements Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, updatable = false)
    private LocalDateTime issuedAt;
    @Column(nullable = false, updatable = false)
    private LocalDateTime expiredDate;
    private String status;
    @Column(name = "qr_code", unique = true, nullable = true)
    private String QRCode;
    private Long playerId;
    @ManyToOne
    @JoinColumn(name = "voucher_type_id", nullable = false)
    private VoucherType voucherType;
}