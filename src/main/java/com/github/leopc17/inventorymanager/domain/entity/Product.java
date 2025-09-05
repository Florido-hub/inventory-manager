package com.github.leopc17.inventorymanager.domain.entity;

import com.github.leopc17.inventorymanager.domain.enums.ProductCategory;
import com.github.leopc17.inventorymanager.infrastructure.entity.ProductEntity;

import java.math.BigDecimal;
import java.util.UUID;

public class Product{

    private UUID id;
    private String name;
    private BigDecimal price;
    private String longDescription;
    private String shortDescription;
    private ProductCategory category;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}