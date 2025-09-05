package com.github.leopc17.inventorymanager.application;

import com.github.leopc17.inventorymanager.domain.entity.Product;
import com.github.leopc17.inventorymanager.domain.input.ProductServicePort;

import java.util.List;
import java.util.UUID;

public class ProductServiceImpl implements ProductServicePort {
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
