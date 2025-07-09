package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service layer for Product operations.
 * */
@Service
public class ProductService {

    private final ProductRepository productRepository;

    /**
     * Constructor injection of repository.
     * @param productRepository repository bean.
     * */
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Creating new product.
     * @param product to insert.
     * @return created product.
     */
    public Product addProduct(Product product){
        return productRepository.insert(product);
    }

    /**
     * Retrieve all products.
     * @return list of products
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Find product by ID.
     * @param id the product ID
     * @return optional product
     */
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }
}
