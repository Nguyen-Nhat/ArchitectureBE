package org.archi.core.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.archi.core.dtos.CampaignRequest;
import org.archi.core.entities.Campaign;
import org.archi.core.errors.ErrorResponse;
import org.archi.core.services.CampaignService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
@RequiredArgsConstructor
public class CampaignController {

    private final CampaignService campaignService;
    /**
     * Fetch campaigns within a date range.
     *
     * @param startDate: yyyy-MM-dd` format
     * @param endDate: yyyy-MM-dd` format
     * @return A list of campaigns within the date range.
     */
    @GetMapping("/date-range")
    public ResponseEntity<List<Campaign>> getCampaignsByDateRange(
            @RequestParam("startDate") String startDate,
            @RequestParam("endDate") String endDate) {
        LocalDateTime start = LocalDate.parse(startDate).atStartOfDay();
        LocalDateTime end = LocalDate.parse(endDate).atTime(23, 59, 59);
        List<Campaign> campaigns = campaignService.getCampaignsByDateRange(start, end);
        return ResponseEntity.ok(campaigns);
    }

    /**
     * Search campaigns by name.
     *
     * @param searchTerm The search term for campaign name.
     * @return A list of campaigns that match the search term.
     */
    @GetMapping("/search")
    public ResponseEntity<List<Campaign>> searchCampaigns(@RequestParam("term") String searchTerm) {
        List<Campaign> campaigns = campaignService.searchCampaigns(searchTerm);
        return ResponseEntity.ok(campaigns);
    }

    /**
     * Create a new campaign.
     *
     * @param campaignRequest The details of the campaign to create.
     * @return The created campaign.
     */
    @PostMapping
    public ResponseEntity<?> createCampaign(@Valid @RequestBody CampaignRequest campaignRequest) {
        // Map DTO to entity
        Campaign campaign = new Campaign();
        campaign.setName(campaignRequest.getName());
        campaign.setImageUrl(campaignRequest.getImageUrl());
        campaign.setStartDate(campaignRequest.getStartDate());
        campaign.setEndDate(campaignRequest.getEndDate());
        campaign.setStatus(campaignRequest.getStatus());
        campaign.setBrandId(campaignRequest.getBrandId());

        try {
            Campaign createdCampaign = campaignService.createCampaign(campaign);
            return ResponseEntity.ok(createdCampaign);
        } catch (IllegalArgumentException e) {
            // Return 400 Bad Request for validation failures
            return ResponseEntity.badRequest().body(new ErrorResponse("Validation data error",e.getMessage()));
        } catch (Exception e) {
            // Return 500 Internal Server Error for unexpected errors
            return ResponseEntity.internalServerError().body(null);
        }
    }

    /**
     * Get campaigns for a specific brand.
     *
     * @param brandId The ID of the brand whose campaigns we want to fetch.
     * @return A list of Campaign entities representing the brand's campaigns.
     */
    @GetMapping("/brands/{brandId}")
    public ResponseEntity<List<Campaign>> getCampaignsByBrand(@PathVariable("brandId") Long brandId) {
        // Fetch campaigns directly as entities
        List<Campaign> campaigns = campaignService.getCampaignsByBrandId(brandId);

        // Check if any campaigns exist for the brand
        if (campaigns.isEmpty()) {
            return ResponseEntity.notFound().build(); // Return 404 if no campaigns found
        }

        return ResponseEntity.ok(campaigns); // Return campaigns
    }

    /**
     * Update an existing campaign.
     *
     * @param campaignId The ID of the campaign to update.
     * @param updatedCampaign The updated campaign details.
     * @return The updated Campaign.
     */
    @PutMapping("/{campaignId}")
    public ResponseEntity<?> updateCampaign(
            @PathVariable("campaignId") Long campaignId,
            @RequestBody Campaign updatedCampaign) {
        try {
            // Call the service to update the campaign
            Campaign updated = campaignService.updateCampaign(campaignId, updatedCampaign);
            return ResponseEntity.ok(updated); // Return the updated campaign
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(new ErrorResponse("Updating error", e.getMessage()));
        }
    }



}
