package com.example.Aula09102025.controller;

import com.example.Aula09102025.model.FuncionarioModel;
import com.example.Aula09102025.service.FuncionaroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/funcionarios")
public class FuncionaController {
    @Autowired

    private FuncionaroService funcionaroService;

    @GetMapping
    public List<FuncionarioModel>listar(){
        return  funcionaroService.listarTodos();
    }


}
