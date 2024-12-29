package org.archi.core.repositories;

import org.archi.core.entities.VoucherType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VoucherTypeRepository extends JpaRepository<VoucherType, Long> {
    boolean existsByNameAndBrandId(String name, Long brandId);

    // Fetch all voucher types by brand ID
    List<VoucherType> findAllByBrandId(Long brandId);

    // Optional voucher type fetch for deletion validation
    Optional<VoucherType> findByIdAndBrandId(Long id, Long brandId);

    // Delete voucher type by ID and brand ID
    void deleteByIdAndBrandId(Long id, Long brandId);
}
