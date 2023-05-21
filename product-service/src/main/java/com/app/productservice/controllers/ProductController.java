package com.app.productservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.productservice.models.Product;
import com.app.productservice.requests.ProductRequest;
import com.app.productservice.responses.Response;
import com.app.productservice.services.product.ProductServiceImpl;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/")
    public List<Product> all() {
        return productService.getAll();
    }

    @PostMapping("/add")
    public Response add(@RequestBody ProductRequest request) {
        return productService.add(request);
    }

    @PostMapping("/delete")
    public Response delete(String id) {
        return productService.delete(id);
    }
    
}
