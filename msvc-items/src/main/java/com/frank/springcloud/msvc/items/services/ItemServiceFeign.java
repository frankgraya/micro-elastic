package com.frank.springcloud.msvc.items.services;

import com.frank.springcloud.msvc.items.clients.ProductFeignClient;
import com.frank.springcloud.msvc.items.models.Item;
import com.frank.springcloud.msvc.items.models.Product;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;



@Service
public class ItemServiceFeign implements ItemService {

    @Autowired
    private ProductFeignClient client;

    public ItemServiceFeign() {
    }

    public List<Item> findAll() {
        return (List)this.client.findAll().stream().map((product) -> new Item(product, (new Random()).nextInt(10) + 1)).collect(Collectors.toList());
    }


    public Optional<Item> findById(Long id) {
        try {
            Product product = this.client.details(id);
            return Optional.of(new Item(product, (new Random()).nextInt(10) + 1));
        } catch (FeignException var3) {
            return Optional.empty();
        }
    }
}
