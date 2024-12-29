package org.archi.core.services;

import lombok.RequiredArgsConstructor;
import org.archi.core.entities.Campaign;
import org.archi.core.repositories.CampaignRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@RequiredArgsConstructor
@Service
public class CampaignService {

    private final CampaignRepository campaignRepository;

    public List<Campaign> getCampaignsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return campaignRepository.findByStartDateBetween(startDate, endDate);
    }

    public List<Campaign> searchCampaigns(String searchTerm) {
        return campaignRepository.findByNameContainingIgnoreCase(searchTerm);
    }

    public Campaign createCampaign(Campaign campaign) {
        boolean isBrandValid = validateBrand(campaign.getBrandId());
        if (!isBrandValid) {
            throw new IllegalArgumentException("Invalid brand ID: " + campaign.getBrandId());
        }
        if (campaign.getStartDate().isAfter(campaign.getEndDate())) {
            throw new IllegalArgumentException("Start date cannot be after end date.");
        }

        return campaignRepository.save(campaign);
    }

    public List<Campaign> getCampaignsByBrandId(Long brandId) {
        return campaignRepository.findByBrandId(brandId);
    }

    public Campaign updateCampaign(Long campaignId, Campaign updatedData) {
        // Find the existing campaign
        Campaign existingCampaign = campaignRepository.findById(campaignId)
                .orElseThrow(() -> new IllegalArgumentException("Campaign with ID " + campaignId + " not found"));

        // Update campaign fields (you can update only the required fields)
        if (updatedData.getName() != null) {
            existingCampaign.setName(updatedData.getName());
        }
        if (updatedData.getImageUrl() != null) {
            existingCampaign.setImageUrl(updatedData.getImageUrl());
        }
        if (updatedData.getStartDate() != null) {
            existingCampaign.setStartDate(updatedData.getStartDate());
        }
        if (updatedData.getEndDate() != null) {
            existingCampaign.setEndDate(updatedData.getEndDate());
        }
        if (updatedData.getStatus() != null) {
            existingCampaign.setStatus(updatedData.getStatus());
        }

        // Save the updated campaign
        return campaignRepository.save(existingCampaign);
    }

    // ultility functions
    public boolean validateBrand(Long brandId) {
        // logic using gRPC
        return true;
    }
}
