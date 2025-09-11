package com.example.cambio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Marcando o arquivo @ RC falando que arquivo é um arquivo de comunicação rest
// Comando usand para APIREST
@RestController
@RequestMapping("/senai")

public class Welcome {

    //@RequestMapping("/") // Endpoint - ponto de acesso navegacação
    @GetMapping("/")
    public String mensagem(){
        return "Bem vindo";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Adalberto Fernandes";
    }

    @GetMapping("/direitor")
        public String direitor(){
        return "Meu mestre";
    }


}
