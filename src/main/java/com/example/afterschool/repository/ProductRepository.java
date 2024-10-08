package com.example.afterschool.repository;

import com.example.afterschool.tables.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

