package com.example.projetoDev.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetoDev.demo.entities.Category;
import com.example.projetoDev.demo.repositories.CategoryRepository;

@Service
public class CateroryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
}
