package com.example.projetoDev.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoDev.demo.entities.Category;
import com.example.projetoDev.demo.services.CateroryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CateroryService service;
    @GetMapping
    public ResponseEntity <List<Category>> findAll(){
       List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
