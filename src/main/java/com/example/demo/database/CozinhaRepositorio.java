package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CozinhaModel;

public interface CozinhaRepositorio extends JpaRepository<CozinhaModel,Long> {
    
}
