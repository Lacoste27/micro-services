package com.app.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.productservice.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}
