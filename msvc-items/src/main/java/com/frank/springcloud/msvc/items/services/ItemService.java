package com.frank.springcloud.msvc.items.services;

import com.frank.springcloud.msvc.items.models.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Item> findAll();
    Optional<Item> findById(Long id);
}
