package com.hsbc.controller;


import com.hsbc.entity.Product;
import com.hsbc.exception.InvalidIdException;
import com.hsbc.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// All requests submitted with '/student' endpoint should be handled by this class

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public ResponseEntity<List<Product>> findAllProducts(){
        List<Product> products = productService.findAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable int id) throws InvalidIdException {
        Product product = productService.findProduct(id);
        return ResponseEntity.ok(product);
    }
    /*

   findById
   save
   update
   delete
    */
}
