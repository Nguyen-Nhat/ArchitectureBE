package org.archi.core.repositories;

import org.archi.core.entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
    List<Campaign> findByStartDateBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<Campaign> findByNameContainingIgnoreCase(String name);
    List<Campaign> findByBrandId(Long brandId);
}
