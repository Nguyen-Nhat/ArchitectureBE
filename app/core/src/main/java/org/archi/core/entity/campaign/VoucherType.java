package org.archi.core.entity.campaign;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "voucher_type")
@Data
public class VoucherType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Double value;
    private String image;
    private String description;
    private Long brandId;
    @OneToMany(mappedBy = "voucherType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Voucher> generateVouchers;
}