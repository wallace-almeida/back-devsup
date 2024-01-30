package com.example.projetoDev.demo.dto;

import java.io.Serializable;

import com.example.projetoDev.demo.entities.Category;

public class categoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    public categoryDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public categoryDTO (Category entity){
        this.id = entity.getId();
        this.nome = entity.getNome();
    }
    
    
}