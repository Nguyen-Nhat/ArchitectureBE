package org.archi.core.entity.campaign;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentKey implements Serializable {

    private Long brandId; // Represents the "brand_id" column
    private Long campaignId; // Represents the "campaign_id" column

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentKey that = (PaymentKey) o;
        return Objects.equals(brandId, that.brandId) && Objects.equals(campaignId, that.campaignId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, campaignId);
    }
}
