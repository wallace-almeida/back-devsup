package com.example.projetoDev.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.projetoDev.demo.dto.categoryDTO;
import com.example.projetoDev.demo.entities.Category;
import com.example.projetoDev.demo.repositories.CategoryRepository;
import com.example.projetoDev.demo.services.exceptions.EntityNotFoundException;

@Service
public class CateroryService {
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<categoryDTO> findAll(){
        List<Category> list = repository.findAll();
        return list.stream().map(x -> new categoryDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public categoryDTO findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity Not Found"));
        return new categoryDTO(entity);   
    }
}
