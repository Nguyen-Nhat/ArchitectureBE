package org.archi.bff.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VoucherTypeResponse {
    Long id;
    private String name;
    private double value;
    private String imageUrl;
    private String description;
    private Long brandId;
}
