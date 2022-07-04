package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cozinha")
public class CozinhaController {
   
    @GetMapping
   public String cozinha(){
    return "Cozinha Teste Controller";
   }
}
