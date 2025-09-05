package com.github.leopc17.inventorymanager.domain.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void setId() {
    }

    @Test
    @DisplayName("Deve lançar exceção ao tentar atribuir nome nulo")
    void setNameCase1() {
        Product product = new Product();

        RuntimeException exception = assertThrows(RuntimeException.class, () ->{
            product.setName(null);
        });
    }

    @Test
    @DisplayName("Deve lançar exceção ao tentar atribuir nome vazio")
    void setNameCase2() {
        Product product = new Product();

        RuntimeException exception = assertThrows(RuntimeException.class, () ->{
            product.setName("");
        });
    }

    @Test
    @DisplayName("Deve lançar exceção ao tentar atribuir nome em branco")
    void setNameCase3() {
        Product product = new Product();

        RuntimeException exception = assertThrows(RuntimeException.class, () ->{
            product.setName(" ");
        });
    }

    @Test
    void setPrice() {
    }

    @Test
    void setLongDescription() {
    }

    @Test
    void setShortDescription() {
    }

    @Test
    void setCategory() {
    }
}