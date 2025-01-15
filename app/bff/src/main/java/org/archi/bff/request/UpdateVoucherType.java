package org.archi.bff.request;

import com.google.type.Decimal;
import lombok.Builder;
import lombok.Data;

@Data
public class UpdateVoucherType {
    private String name;
    private double value;
    private String description;
}
