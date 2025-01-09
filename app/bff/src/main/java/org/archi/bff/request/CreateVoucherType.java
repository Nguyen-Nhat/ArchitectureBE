package org.archi.bff.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateVoucherType {
    private String name;
    private double value;
    private String imageUrl;
    private String description;
    private Long brandId;
}
