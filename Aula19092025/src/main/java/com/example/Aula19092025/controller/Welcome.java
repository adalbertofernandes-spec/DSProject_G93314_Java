package com.example.Aula19092025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Todos os arquivos vao conversar dentro de cada um deles
public class Welcome {
    @GetMapping("/") // Para raiz do projeto
    public String mensagem(){
        return "Seja bem vindo";
    }
}
