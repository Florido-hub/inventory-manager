package com.github.leopc17.inventorymanager.application;

import com.github.leopc17.inventorymanager.domain.entity.Product;
import com.github.leopc17.inventorymanager.domain.input.ProductServicePort;
import com.github.leopc17.inventorymanager.domain.output.ProductRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductServicePort {

    private final ProductRepositoryPort productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepositoryPort productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.createProduct(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    @Override
    public Product getById(UUID id) {
        return productRepository.getById(id);
    }

    @Override
    public void updateProduct(Product product, UUID id) {
        productRepository.updateProduct(product,id);
    }

    @Override
    public void deleteById(UUID id) {
        productRepository.deleteById(id);
    }
}
