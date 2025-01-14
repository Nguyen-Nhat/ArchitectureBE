package org.archi.bff.request;

import lombok.Data;

@Data
public class CreateVoucherType {
    private String name;
    private Double value;
    private String imageUrl;
    private String description;
    private Long brandId;

}
