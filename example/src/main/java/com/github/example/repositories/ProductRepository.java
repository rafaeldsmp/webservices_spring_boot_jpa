package com.github.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.example.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{  

}
