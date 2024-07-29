package com.msoftware.chapi.repository;

import com.msoftware.chapi.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {
}
