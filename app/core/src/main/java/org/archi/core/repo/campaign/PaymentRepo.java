package org.archi.core.repo.campaign;

import org.archi.core.entity.campaign.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
}
