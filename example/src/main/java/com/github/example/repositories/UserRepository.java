package com.github.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.example.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ 

}
