package com.example.Aula1610.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping
    public String menssage(){
        return "Seja bem vindo";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Olá me chamo Adalberto";
}

}