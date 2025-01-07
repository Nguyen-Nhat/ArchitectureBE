package org.archi.bff.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CampaignResponse {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private String startDate;
    private String endDate;
    private String status;
    private Long brandId;
}
