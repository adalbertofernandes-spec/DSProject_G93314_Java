package com.example.bopeselva.controller;

import com.example.bopeselva.dto.UsuarioRequestDTO;
import com.example.bopeselva.dto.UsuarioResponseDTO;
import com.example.bopeselva.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Map<String , Object>> salvar(@Valid @RequestBody UsuarioRequestDTO dto){
        usuarioService.salvarUsuario(dto);
        return ResponseEntity
                .created(null)
                .body(Map.of("mensagem", "Usuario Cadastrado com sucesso", "sucesso", true));
    }

    @GetMapping
    //retorna uma lista apenas com o nome e email
    public ResponseEntity<List<UsuarioResponseDTO>> listar(){
        return ResponseEntity
                .ok()
                .body(usuarioService.ListaTodos());
    }
}
