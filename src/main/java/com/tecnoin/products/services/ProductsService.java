package com.tecnoin.products.services;

import com.tecnoin.products.models.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;

public interface ProductsService {
    ResponseEntity<ResponseDTO> getProducts(int page, int size);
}
