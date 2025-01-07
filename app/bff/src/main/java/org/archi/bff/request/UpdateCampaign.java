package org.archi.bff.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateCampaign {
    private String name;
    private String description;
    private String imageUrl;
    private String startDate;
    private String endDate;
    private String status;
}
