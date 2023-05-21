package com.app.productservice.services.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.app.productservice.models.Product;
import com.app.productservice.repository.ProductRepository;
import com.app.productservice.requests.ProductRequest;
import com.app.productservice.responses.Response;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Response add(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());

        this.productRepository.save(product);

        return new Response("Produit ajouté", HttpStatus.CREATED);
    }

    @Override
    public Response delete(String id) {
        this.productRepository.deleteById(id);
        return new Response("Produit supprimé", HttpStatus.OK);
    }
}
