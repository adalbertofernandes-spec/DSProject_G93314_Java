package com.example.Aula1610.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Aula1610.dto.UsuarioRequestDTO;
import com.example.Aula1610.dto.UsuarioResponseDTO;
import com.example.Aula1610.service.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // CREATE
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO dto){
        usuarioService.salvarUsuario(dto);
        return ResponseEntity
        .created(null)
        .body(Map.of("Message", "Cadastramento com sucesso", "Sucesso", true));

        
    }

    // READ

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar(){
        return ResponseEntity
        .ok()
        .body(usuarioService.ListarTodos());
    }

    // UPDATE
    public ResponseEntity<Map<String, Object>> atualizar(
        @PathVariable Long id,
        @Valid @RequestBody  UsuarioResponseDTO dto){
            usuarioService.atualizarUsuario(id, null);

            return ResponseEntity
            .ok()
            .body(Map.of("menssage", "Atualizado com sucesso", "Sucesso", "true"));
        }

       
    // Delete
    public ResponseEntity<Map<String, Object>> deletarUsuario (@PathVariable Long id){
        usuarioService.deletarUsuario(id);
        return ResponseEntity
        .ok()
        .body(Map.of("menssage","Excluido com sucesso", "Sucesso", true));
    }

}
