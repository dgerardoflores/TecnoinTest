package com.tecnoin.products.controllers;

import com.tecnoin.products.models.dto.ResponseDTO;
import com.tecnoin.products.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.security.RolesAllowed;

@Controller
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @RolesAllowed({ "BO_ADMIN", "BO_USUARIO" })
    @GetMapping()
    public ResponseEntity<ResponseDTO> getProducts(
            @RequestParam int page,
            @RequestParam int size
    ) {
        ResponseEntity<ResponseDTO> response = productsService.getProducts(page, size);

        return response;
    }
}