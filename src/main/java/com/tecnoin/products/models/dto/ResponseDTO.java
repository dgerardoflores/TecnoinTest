package com.tecnoin.products.models.dto;

import com.tecnoin.products.models.enums.StatusCodes;
import lombok.Data;

@Data
public class ResponseDTO {
    private StatusCodes code;
    private Object data;
    private String message = "The request has been completed successfully";
    private String error;

    public void setError(String error) {
        this.error =  error + ". Please contact the website administrator";

        this.message = null;
    }
}
