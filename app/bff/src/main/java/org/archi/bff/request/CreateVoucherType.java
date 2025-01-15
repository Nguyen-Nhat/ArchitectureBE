package org.archi.bff.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CreateVoucherType {
    private String name;
    private Double value;
    private String imageUrl;
    private String description;
    private Long brandId;

}
