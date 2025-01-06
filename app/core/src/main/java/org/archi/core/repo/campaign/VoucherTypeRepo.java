package org.archi.core.repo.campaign;

import org.archi.core.entity.campaign.VoucherType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VoucherTypeRepo extends JpaRepository<VoucherType, Long> {
    boolean existsByNameAndBrandId(String name, Long brandId);
    List<VoucherType> findAllByBrandId(Long brandId);
    Optional<VoucherType> findByIdAndBrandId(Long id, Long brandId);
    void deleteByIdAndBrandId(Long id, Long brandId);
    List<VoucherType> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String name, String description);
}
