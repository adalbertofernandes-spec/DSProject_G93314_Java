package com.example.Aula09102025.controller;

import com.example.Aula09102025.model.FuncionarioModel;
import com.example.Aula09102025.service.FuncionaroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/funcionarios")
public class FuncionaController {
    @Autowired
    private FuncionaroService funcionaroService;

    @GetMapping
    public List<FuncionarioModel>ListaTodos(){
        return funcionaroService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> Salvar(@RequestBody  FuncionarioModel funcionarioModel){
        funcionaroService.salvar(funcionarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Message","Cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizar(Long id, @RequestBody FuncionarioModel funcionarioModel){
        funcionaroService.atualizar(id, funcionarioModel);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Message", "Atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>>deletefuncionario(@PathVariable Long id){
        funcionaroService.excluir(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Message", "Funcionario deletetado!"));
    }

}
