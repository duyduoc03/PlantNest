package com.example.leduyduoc_examp.repository;

import com.example.leduyduoc_examp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
