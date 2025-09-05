package com.github.leopc17.inventorymanager.domain.output;

import com.github.leopc17.inventorymanager.domain.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepositoryPort {

    Product createProduct(Product product);
    List<Product> getAllProduct();
    Product getById(UUID id);
    void updateProduct(Product product, UUID id);
    void deleteById(UUID id);
}
