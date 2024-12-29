package org.archi.core.dtos;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CampaignRequest {
    @NotNull
    @Size(min = 3, message = "Campaign name must be at least 3 characters.")
    private String name;
    private String imageUrl;
    @NotNull(message = "Start date must not be null")
    private LocalDateTime startDate;
    @NotNull(message = "End date must not be null")
    private LocalDateTime endDate;
    private String status;
    @NotNull(message = "Brand ID must not be null")
    private Long brandId;
}
