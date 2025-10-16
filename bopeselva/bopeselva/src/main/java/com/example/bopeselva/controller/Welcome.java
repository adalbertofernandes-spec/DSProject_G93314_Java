package com.example.bopeselva.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public String message(){
        return "Seja bem vindo";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Adalberto Fernandes";
    }
}
