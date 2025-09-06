package com.github.leopc17.inventorymanager.infrastructure.entity;

import com.github.leopc17.inventorymanager.domain.enums.ProductCategory;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tb_product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String shortDescription;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String longDescription;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductCategory category;

    public ProductEntity() {
    }

    public ProductEntity(UUID id, String name, BigDecimal price, String longDescription, String shortDescription, ProductCategory category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        this.category = category;
    }

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
