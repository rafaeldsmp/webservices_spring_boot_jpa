package com.github.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.example.entities.OrderItem;
import com.github.example.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{  

}
