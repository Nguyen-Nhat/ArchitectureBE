package org.archi.core.service;

import lombok.RequiredArgsConstructor;
import org.archi.common.core.CreateCampaignRequest;
import org.archi.core.entity.Campaign;
import org.archi.core.repo.CampaignRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CampaignService {

    private final CampaignRepo campaignRepo;

    public List<Campaign> getCampaignsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return campaignRepo.findByStartDateBetween(startDate, endDate);
    }

    public List<org.archi.common.core.Campaign> searchCampaigns(String searchTerm) {
        List<Campaign> campaignEntities = campaignRepo.findByNameContainingIgnoreCase(searchTerm);
        return campaignEntities.stream().map(c -> org.archi.common.core.Campaign.newBuilder()
                .setId(c.getId())
                .setName(c.getName())
                .setImageUrl(c.getImageUrl())
                .setDescription(c.getDescription())
                .setStartDate(c.getStartDate().toString())
                .setEndDate(c.getEndDate().toString())
                .setStatus(c.getStatus())
                .build()
        ).collect(Collectors.toList());
    }

    public org.archi.common.core.Campaign createCampaign(CreateCampaignRequest campaignRequest) {
        
        Campaign campaign = new Campaign();
        campaign.setName(campaignRequest.getName());
        campaign.setImageUrl(campaignRequest.getImageUrl());
        campaign.setStartDate(LocalDateTime.parse(campaignRequest.getStartDate()));
        campaign.setEndDate(LocalDateTime.parse(campaignRequest.getEndDate()));
        campaign.setStatus(campaignRequest.getStatus());
        campaign.setBrandId(campaignRequest.getBrandId());

        if (campaign.getStartDate().isAfter(campaign.getEndDate())) {
            throw new IllegalArgumentException("Start date cannot be after end date.");
        }
        Campaign savedCampaign = campaignRepo.save(campaign);
        return org.archi.common.core.Campaign.newBuilder()
                .setId(savedCampaign.getId())
                .setName(savedCampaign.getName())
                .setImageUrl(savedCampaign.getImageUrl())
                .setDescription(savedCampaign.getDescription())
                .setStartDate(savedCampaign.getStartDate().toString())
                .setEndDate(savedCampaign.getEndDate().toString())
                .setStatus(savedCampaign.getStatus())
                .build();
    }

    public List<Campaign> getCampaignsByBrandId(Long brandId) {
        return campaignRepo.findByBrandId(brandId);
    }

    public Campaign updateCampaign(Long campaignId, Campaign updatedData) {
        // Find the existing campaign
        Campaign existingCampaign = campaignRepo.findById(campaignId)
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
        return campaignRepo.save(existingCampaign);
    }
}
