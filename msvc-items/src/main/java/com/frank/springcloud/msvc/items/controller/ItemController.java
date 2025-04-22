package com.frank.springcloud.msvc.items.controller;


import com.frank.springcloud.msvc.items.models.Item;
import com.frank.springcloud.msvc.items.services.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {

    private final ItemService service;


    public ItemController(ItemService service) {
        this.service = service;
    }


    @GetMapping
    public List<Item> list() {
        return this.service.findAll();
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<?> details(@PathVariable Long id) {
        Optional<Item> itemOptional = this.service.findById(id);
        return itemOptional.isPresent() ? ResponseEntity.ok((Item)itemOptional.get()) : ResponseEntity.status(404).body(Collections.singletonMap("message", "No existe el producto en el microservicio msvc-products"));
    }
}
