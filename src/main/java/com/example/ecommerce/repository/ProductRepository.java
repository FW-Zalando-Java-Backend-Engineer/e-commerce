package com.example.ecommerce.repository;

import com.example.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository interface for a Product document.
 * Spring Data MongoDB will auto-implement this.
 * */

// as far as we are extending MongoRepository, @Repository annotation is not required
public interface ProductRepository extends MongoRepository<Product, String> {
    // By extending MongoRepository. Spring Data will handle all CRUD methods for us automatically.
}
