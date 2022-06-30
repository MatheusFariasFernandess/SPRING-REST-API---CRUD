package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.controller.UsuarioController;
import com.example.demo.model.UsuarioModel;

public interface RepositorioUsuario extends JpaRepository<UsuarioModel,Integer> {
    
}
