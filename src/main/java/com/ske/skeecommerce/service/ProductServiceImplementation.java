package com.ske.skeecommerce.service;

import com.ske.skeecommerce.exception.ResourceNotFoundException;
import com.ske.skeecommerce.model.Product;
import com.ske.skeecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ProductServiceImplementation implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }


    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
