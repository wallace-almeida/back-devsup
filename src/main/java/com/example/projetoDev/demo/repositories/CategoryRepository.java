package com.example.projetoDev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetoDev.demo.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
