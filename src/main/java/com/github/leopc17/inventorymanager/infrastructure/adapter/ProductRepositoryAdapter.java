package com.github.leopc17.inventorymanager.infrastructure.adapter;

import com.github.leopc17.inventorymanager.domain.entity.Product;
import com.github.leopc17.inventorymanager.domain.output.ProductRepositoryPort;
import com.github.leopc17.inventorymanager.infrastructure.entity.ProductEntity;
import com.github.leopc17.inventorymanager.infrastructure.mapper.ProductMapper;
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
        ProductEntity entity = ProductMapper.productEntity(product);
        ProductEntity saved = productJpaRepository.save(entity);
        return ProductMapper.product(saved);
    }

    @Override
    public List<Product> getAllProduct() {
        var produtos = productJpaRepository.findAll();
        return produtos.stream().map(x-> ProductMapper.product(x)).toList();
    }

    @Override
    public Product getById(UUID id) {
        var produto = productJpaRepository.findById(id);
        var product = ProductMapper.product(produto.get());
        return product;
    }

    @Override
    public void updateProduct(Product product, UUID id) {
        product.setId(id);
        productJpaRepository.save(ProductMapper.productEntity(product));
    }

    @Override
    public void deleteById(UUID id) {
        productJpaRepository.deleteById(id);
    }
}
