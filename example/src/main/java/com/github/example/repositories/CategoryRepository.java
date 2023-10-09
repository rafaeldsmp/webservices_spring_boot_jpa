package com.github.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.example.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{  

}
