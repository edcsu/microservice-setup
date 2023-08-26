package com.ske.skeecommerce.repository;

import com.ske.skeecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
