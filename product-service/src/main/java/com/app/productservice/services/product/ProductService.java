package com.app.productservice.services.product;

import java.util.List;

import org.springframework.stereotype.Component;

import com.app.productservice.models.Product;
import com.app.productservice.requests.ProductRequest;
import com.app.productservice.responses.Response;

@Component
public interface ProductService {
    Response add(ProductRequest request);
    Response delete(String id);
    List<Product> getAll();
}
