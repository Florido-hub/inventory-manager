package com.github.leopc17.inventorymanager.infrastructure.adapter.input;

import com.github.leopc17.inventorymanager.application.ProductServiceImpl;
import com.github.leopc17.inventorymanager.domain.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.getAllProduct());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> create(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.getById(id));
    }

    @PutMapping("/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable UUID id){
        productService.updateProduct(product,id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id){
        productService.deleteById(id);
    }
}
