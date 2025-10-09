package com.example.Controle.controller;

import com.example.Controle.model.FuncionarioModel;
import com.example.Controle.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired

    private FuncionarioService funcionarioService;

    @GetMapping
    public List<FuncionarioModel> listar() {
        return funcionarioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar (@RequestBody FuncionarioModel funcionarioModel){
        funcionarioService.salvar(funcionarioModel);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Message","Cadastrado com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizar(Long id, @RequestBody FuncionarioModel funcionarioModel){
        funcionarioService.atualizar(id, funcionarioModel);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Message", "Cadastro com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletefuncionario (@PathVariable Long id){
        funcionarioService.deletefuncionario(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Message", "Usuario"));
    }
}
