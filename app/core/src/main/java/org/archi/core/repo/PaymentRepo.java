package org.archi.core.repo;

import org.archi.core.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
    boolean existsByNameAndBrandId(String name, Long brandId);

    // Fetch all voucher types by brand ID
    List<VoucherTypeRepo> findAllByBrandId(Long brandId);

    // Optional voucher type fetch for deletion validation
    Optional<VoucherTypeRepo> findByIdAndBrandId(Long id, Long brandId);

    // Delete voucher type by ID and brand ID
    void deleteByIdAndBrandId(Long id, Long brandId);
}
