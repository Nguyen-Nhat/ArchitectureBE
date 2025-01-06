package org.archi.bff.request;

import lombok.Data;

@Data
public class CreateCampaignRequest {
    private String name;
    private String imageUrl;
    private String description;
    private String startDate;
    private String endDate;
    private String status;
}
