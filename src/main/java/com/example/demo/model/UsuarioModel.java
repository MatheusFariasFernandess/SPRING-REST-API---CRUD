package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "usuario")
public class UsuarioModel {

    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(nullable = false , length = 10)
    
    @Id
    public Integer id;

    @Column(length = 40)
    public String nome;

    @Column(nullable = false ,length = 10)
    public String senha;
    
    @Column(nullable = false,length = 10)
    public String login;

    
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }

    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login){
        this.login=login;
    }
}
