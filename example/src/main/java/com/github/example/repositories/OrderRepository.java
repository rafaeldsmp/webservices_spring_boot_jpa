package com.github.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.example.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{  

}
