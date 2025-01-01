package org.archi.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @EmbeddedId
    private PaymentKey id; // Composite primary key (brand_id + campaign_id)
    @Column(name = "amount", nullable = false)
    private Double amount;
    @Column(name = "payment_date", nullable = false)
    private LocalDateTime paymentDate;
    private String status;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "campaign_id", nullable = false, updatable = false)
    @MapsId("campaignId")
    private Campaign campaign;
}
