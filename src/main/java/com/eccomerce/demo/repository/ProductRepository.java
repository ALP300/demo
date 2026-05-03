package com.eccomerce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eccomerce.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
