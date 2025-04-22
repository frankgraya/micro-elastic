package com.frank.springcloud.msvc.products.repositories;

import com.frank.springcloud.msvc.products.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {}
