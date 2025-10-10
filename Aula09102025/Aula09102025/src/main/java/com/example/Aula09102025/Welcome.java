package com.example.Aula09102025;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public String message(){
        return "Seja bem vindo";
    }

    @GetMapping ("/dev")
        public String developer(){
        return "Bem vindo Adalberto";
        }

}
