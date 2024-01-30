package com.example.projetoDev.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoDev.demo.dto.categoryDTO;
import com.example.projetoDev.demo.services.CateroryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CateroryService service;
    @GetMapping
    public ResponseEntity <List<categoryDTO>> findAll(){
       List<categoryDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value= "/{id}")
    public ResponseEntity <categoryDTO> findById(@PathVariable Long id){
       categoryDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }
}
