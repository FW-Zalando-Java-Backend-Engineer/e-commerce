package com.example.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents a Product in our eCommerce catalog.
 * */
@Data // Generates all getters and setters, equals() , toString(), hashCode()
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor // exclude id from all-args constructor
@Document(collection = "products")
public class Product {
    /** Unique identifier for the product. */
    @Id
    private String id;

    /** Name of the product. */
    private String name;

    /** Description of the product. */
    private String description;

    /** Price of the product. */
    private double price;

    /** Category of the product. */
    private String category;
}
