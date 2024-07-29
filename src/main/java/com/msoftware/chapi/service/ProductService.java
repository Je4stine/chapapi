package com.msoftware.chapi.service;

import com.msoftware.chapi.model.Products;
import com.msoftware.chapi.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Products> getAllProducts() {
        return productRepo.findAll();
    }
}
