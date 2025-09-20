package com.example.Aula19092025.controller;

import com.example.Aula19092025.model.Cliente;
import com.example.Aula19092025.repository.ClienteRepository;
import com.example.Aula19092025.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente>listarTodos(){
        return clienteService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
        clienteService.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable UUID id, @RequestBody Cliente cliente){
        Cliente  clienteAtualizar = clienteService.atualizar(id, cliente);
        return ResponseEntity.ok().body(clienteAtualizar);
    }

   @DeleteMapping("/{id}")
    public ResponseEntity<Void>excluir(@PathVariable UUID id){
       clienteService.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
   }
}
