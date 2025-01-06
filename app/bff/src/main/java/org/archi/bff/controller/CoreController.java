package org.archi.bff.controller;

import lombok.RequiredArgsConstructor;
import org.archi.bff.request.CreateCampaignRequest;
import org.archi.bff.response.ResponseData;
import org.archi.bff.service.CoreService;
import org.archi.common.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/core")
@RequiredArgsConstructor
public class CoreController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CoreController.class);
    private final CoreService coreService;

    @GetMapping("/vouchers")
    @PreAuthorize("hasRole('PLAYER')")
    public ResponseEntity<ResponseData> getVouchers() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Long playerId = Long.parseLong(auth.getName());
        return coreService.getVouchers(playerId);
    }

    @GetMapping("/voucher-types")
    @PreAuthorize("hasRole('BRAND')")
    public ResponseEntity<ResponseData> getVoucherTypes() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Long playerId = Long.valueOf(authentication.getName());
        return coreService.getVoucherTypes(playerId);
    }

    @PostMapping("/voucher-types/create")
    @PreAuthorize("hasRole('BRAND')")
    public ResponseEntity<ResponseData> createVoucherType(@RequestBody CreateVoucherTypeRequest request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return coreService.createVoucherType(request);
    }

    @PostMapping("/generate-voucher")
    @PreAuthorize("hasRole('BRAND')")
    public ResponseEntity<ResponseData> generateVoucher(@RequestBody GenerateVoucherRequest request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        long brandId = Long.parseLong(auth.getName());
        if (brandId != request.getBrandId()) {
            return coreService.generateVoucher(request);
        } else {
            throw new Error("The brand id does not match the brand id in the request");
        }
    }

    @PutMapping("/voucher-types")
    @PreAuthorize("hasRole('BRAND')")
    public ResponseEntity<ResponseData> updateVoucherType(@RequestBody UpdateVoucherTypeReq request) {
        return coreService.updateVoucherType(request);
    }

    @GetMapping("/vouchers/search")
    public ResponseEntity<ResponseData> searchVouchers(@RequestParam String term) {
        return coreService.searchVoucher(term);
    }

    @GetMapping("/voucher-types/search")
    @PreAuthorize("hasRole('BRAND')")
    public ResponseEntity<ResponseData> searchVoucherType(@RequestParam String term) {
        return coreService.searchVoucherType(term);
    }

    @GetMapping("/campaigns")
    public ResponseEntity<ResponseData> getCampaigns(@RequestParam String startDate, @RequestParam String endDate) {
        return coreService.getCampaigns(startDate, endDate);
    }

    @GetMapping("/campaigns/search")
    public ResponseEntity<ResponseData> searchCampaign(@RequestParam String term) {
        return coreService.searchCampaign(term);
    }

    /*
        API to create a new campaign
        Request body:
        {
            "name": "Campaign 1"
            "imageUrl": "campaign.url"
            "description": "c des"
            "startDate": "2025-01-01T12:30:00"
            "endDate": "2025-01-30T12:30:00"
            "status": "On going"
        }
    * */
    @PreAuthorize("hasRole('BRAND')")
    @PostMapping("/campaigns/create")
    public ResponseEntity<ResponseData> createCampaign(@RequestBody CreateCampaignRequest request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        long accountId = Long.parseLong(auth.getName());
        return coreService.createCampaign(accountId, request);
    }

    @PreAuthorize("hasRole('BRAND')")
    @PostMapping("/test")
    public ResponseEntity<ResponseData> testController() {
        return ResponseEntity.ok(new ResponseData(200, "ok", "none"));
    }

    @PreAuthorize("hasRole('BRAND')")
    @GetMapping("/test")
    public ResponseEntity<ResponseData> testController2() {
        return ResponseEntity.ok(new ResponseData(200, "ok", "none"));
    }

    @GetMapping("/campaigns/by-brand-id")
    @PreAuthorize("hasRole('BRAND')")
    public ResponseEntity<ResponseData> getCampaignsByBrandId(@RequestParam Long id) {
        GetCampaignsByBrandIdReq request = GetCampaignsByBrandIdReq.newBuilder()
                .setBrandId(id)
                .build();
        return coreService.getCampaignsByBrandId(request);
    }

    @PutMapping("/campaigns")
    @PreAuthorize("hasRole('BRAND')")
    public UpdateCampaignRes updateCampaign(@RequestBody UpdateCampaignReq request) {
        return coreService.updateCampaign(request);
    }
}
