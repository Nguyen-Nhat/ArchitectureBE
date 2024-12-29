package org.archi.core.repositories;

import org.archi.core.entities.Payment;
import org.archi.core.entities.PaymentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, PaymentKey> {
}
