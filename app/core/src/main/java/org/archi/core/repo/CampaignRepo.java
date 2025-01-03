package org.archi.core.repo;

import org.archi.core.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CampaignRepo extends JpaRepository<Campaign, Long> {
    List<Campaign> findByStartDateBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<Campaign> findByNameContainingIgnoreCase(String name);
    List<Campaign> findByBrandId(Long brandId);
}
