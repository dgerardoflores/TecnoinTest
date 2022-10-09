package com.tecnoin.products.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ProductDTO {
    @JsonInclude
    private String code;
    @JsonInclude
    private String name;
}
