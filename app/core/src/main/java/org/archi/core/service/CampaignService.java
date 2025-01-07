package org.archi.core.service;

import lombok.RequiredArgsConstructor;
import org.archi.common.core.CreateCampaignRequest;
import org.archi.core.entity.Campaign;
import org.archi.core.exception.InvalidArgumentException;
import org.archi.core.repo.CampaignRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CampaignService {

    private final CampaignRepo campaignRepo;

    // OK
    public List<Campaign> getCampaignsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return campaignRepo.findByStartDateBetween(startDate, endDate);
    }

    // OK
    public List<org.archi.common.core.Campaign> searchCampaigns(String searchTerm) {
        List<Campaign> campaignEntities = campaignRepo.findByNameContainingIgnoreCase(searchTerm);
        return campaignEntities.stream().map(c -> org.archi.common.core.Campaign.newBuilder()
                .setId(c.getId())
                .setName(c.getName())
                .setImageUrl(c.getImageUrl())
                .setDescription(c.getDescription() == null ? "" : c.getDescription())
                .setStartDate(c.getStartDate().toString())
                .setEndDate(c.getEndDate().toString())
                .setStatus(c.getStatus())
                .build()
        ).collect(Collectors.toList());
    }

    // OK
    public Campaign createCampaign(CreateCampaignRequest campaignRequest) {

        // Validate campaign request fields
        if (campaignRequest.getName() == null || campaignRequest.getName().isEmpty()) {
            throw new InvalidArgumentException("Campaign name must not be null or empty.");
        }
        if (campaignRequest.getImageUrl() == null || campaignRequest.getImageUrl().isEmpty()) {
            throw new InvalidArgumentException("Campaign image URL must not be null or empty.");
        }
        if (campaignRequest.getStartDate() == null || campaignRequest.getEndDate() == null) {
            throw new InvalidArgumentException("Start date and end date must not be null.");
        }

        LocalDateTime startDate;
        LocalDateTime endDate;
        try {
            startDate = LocalDateTime.parse(campaignRequest.getStartDate());
            endDate = LocalDateTime.parse(campaignRequest.getEndDate());
        } catch (DateTimeParseException e) {
            throw new InvalidArgumentException("Invalid date format for start or end date. Use ISO format.", e);
        }

        if (startDate.isAfter(endDate)) {
            throw new InvalidArgumentException("Start date cannot be after end date.");
        }

        // Map the request to a Campaign entity
        Campaign campaign = new Campaign();
        campaign.setName(campaignRequest.getName());
        campaign.setImageUrl(campaignRequest.getImageUrl());
        campaign.setStartDate(startDate);
        campaign.setEndDate(endDate);
        campaign.setStatus(campaignRequest.getStatus());
        campaign.setBrandId(campaignRequest.getBrandId());
        campaign.setDescription(campaignRequest.getDescription());

        Campaign savedCampaign = campaignRepo.save(campaign);

        return savedCampaign;

    }

    // OK
    public List<Campaign> getCampaignsByBrandId(Long brandId) {
        return campaignRepo.findByBrandId(brandId);
    }


    //OK
    public Campaign updateCampaign(Long campaignId, Campaign updatedData) {
        // Find the existing campaign
        Campaign existingCampaign = campaignRepo.findById(campaignId)
                .orElseThrow(() -> new InvalidArgumentException("Campaign with ID " + campaignId + " not found"));

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
        if (updatedData.getDescription() != null) {
            existingCampaign.setDescription(updatedData.getDescription());
        }

        // Save the updated campaign
        return campaignRepo.save(existingCampaign);
    }
}
