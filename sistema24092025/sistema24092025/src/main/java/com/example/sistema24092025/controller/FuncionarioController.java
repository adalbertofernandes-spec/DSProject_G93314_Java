package com.example.sistema24092025.controller;

import com.example.sistema24092025.model.Funcionario;
import com.example.sistema24092025.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario>listarFuncionario(){
        return funcionarioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Funcionario> salvarFuncionarios(@RequestBody Funcionario funcionario) {
        funcionarioService.salvar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}
