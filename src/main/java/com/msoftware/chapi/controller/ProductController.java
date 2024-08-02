package com.msoftware.chapi.controller;

import com.msoftware.chapi.model.Products;
import com.msoftware.chapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet ()
    {
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Products> getAllProducts()
    {
        return service.getAllProducts();
    }

    @GetMapping("/products/{Id}")
    public ResponseEntity<Products> getProductByI(@PathVariable Integer Id)
    {
        Products savedproducts = service.getProductById(Id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(savedproducts);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products products)
    {
        service.addItem(products);
    }
}
