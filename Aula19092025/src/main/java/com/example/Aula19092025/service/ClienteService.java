package com.example.Aula19092025.service;

import com.example.Aula19092025.model.Cliente;
import com.example.Aula19092025.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);

    }

    public Cliente atualizar(UUID id, Cliente cliente){
        if (clienteRepository.existsById(id)) {
            return clienteRepository.save(cliente);
        } else {
            throw new RuntimeException("Usuario não encontrado");
        }
    }

    public void excluir(UUID id) {
        clienteRepository.deleteById(id);
    }
}
