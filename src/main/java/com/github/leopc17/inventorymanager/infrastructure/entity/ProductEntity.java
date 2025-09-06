package com.github.leopc17.inventorymanager.infrastructure.entity;

import com.github.leopc17.inventorymanager.domain.entity.Product;
import com.github.leopc17.inventorymanager.domain.enums.ProductCategory;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tb_product")
public class ProductEntity extends Product {

    public ProductEntity() {
        super();
    }

    public ProductEntity(UUID id, String name, BigDecimal price, String longDescription, String shortDescription, ProductCategory category) {
        super(id, name, price, longDescription, shortDescription, category);
    }

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID getId() {
        return super.getId();
    }

    @Column(nullable = false)
    @Override
    public String getName() {
        return super.getName();
    }

    @Column(nullable = false)
    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Column(columnDefinition = "TEXT",nullable = false)
    @Override
    public String getLongDescription() {
        return super.getLongDescription();
    }

    @Column(columnDefinition = "TEXT",nullable = false)
    @Override
    public String getShortDescription() {
        return super.getShortDescription();
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Override
    public ProductCategory getCategory() {
        return super.getCategory();
    }
}
