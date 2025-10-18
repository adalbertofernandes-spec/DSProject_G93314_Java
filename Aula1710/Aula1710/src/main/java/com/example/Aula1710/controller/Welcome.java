package com.example.Aula1710.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Welcome {

    @GetMapping("/")
    public String mensagem(){
        return "Seja bem vindo";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Desenvolvedor Adalberto Fernandes";
    }


}
