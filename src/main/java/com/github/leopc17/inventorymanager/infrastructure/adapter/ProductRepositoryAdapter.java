package com.github.leopc17.inventorymanager.infrastructure.adapter;

import com.github.leopc17.inventorymanager.domain.entity.Product;
import com.github.leopc17.inventorymanager.domain.output.ProductRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    private final ProductJpaRepository productJpaRepository;

    @Autowired
    public ProductRepositoryAdapter(ProductJpaRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public Product getById(UUID id) {
        return null;
    }

    @Override
    public void updateProduct(Product product, UUID id) {

    }

    @Override
    public void deleteById(UUID id) {

    }
}
