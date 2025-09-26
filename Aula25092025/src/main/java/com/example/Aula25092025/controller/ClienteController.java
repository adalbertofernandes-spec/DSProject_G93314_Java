package com.example.Aula25092025.controller;

import com.example.Aula25092025.model.Cliente;
import com.example.Aula25092025.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping
public class ClienteController {
    ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService =clienteService;
    }

    @GetMapping
    public List<Cliente> ListaCliente(){
        return clienteService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvarclientes(@RequestBody Cliente cliente){
        clienteService.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable UUID id, @RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(@PathVariable UUID id){
        clienteService.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
