package com.example.Aula_Spring_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {

    // End points
    @GetMapping("/")
    public String welcome(){
        return "Seja bem vindo!";
    }

    // End points
    @GetMapping("/dev")
    public String dev(){
        return "Desenvolvedor(a): Adalberto";
    }
}
