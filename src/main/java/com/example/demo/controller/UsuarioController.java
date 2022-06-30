package com.example.demo.controller;

import com.example.demo.database.*;
import com.example.demo.model.UsuarioModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.*;
import java.io.*;
import java.util.List;;

@RestController
@RequestMapping("/contatos")
public class UsuarioController{
    @Autowired
    private RepositorioUsuario repositorioUsuario;

     @GetMapping
     public List<UsuarioModel> ExibirValores(){
        return repositorioUsuario.findAll();
     }

     @PostMapping
     public void inserirUsuario(@RequestBody UsuarioModel usuario){
        repositorioUsuario.save(usuario);
     }

     @PutMapping
     public void alterarUsuario(@RequestBody UsuarioModel usuario){
        if(usuario.getId()>0){
            repositorioUsuario.save(usuario);
        }
     }

     @DeleteMapping
     public void deletarUsuario(@RequestBody UsuarioModel usuario){
        repositorioUsuario.delete(usuario);
     }

}