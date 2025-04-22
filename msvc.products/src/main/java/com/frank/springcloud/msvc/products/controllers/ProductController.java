package com.frank.springcloud.msvc.products.controllers;


import com.frank.springcloud.msvc.products.entities.Product;
import com.frank.springcloud.msvc.products.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    final private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<?> list() {
            return ResponseEntity.ok(this.productService.findAll());
    }

    @GetMapping("/{id}")
     public ResponseEntity<?> details(@PathVariable Long id) {
        System.out.println("Buscando producto con id: " + id);
       Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) {
            return ResponseEntity.ok(productOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

}
