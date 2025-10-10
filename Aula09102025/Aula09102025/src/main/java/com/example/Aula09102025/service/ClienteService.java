package com.example.Aula09102025.service;

import com.example.Aula09102025.model.ClienteModel;
import com.example.Aula09102025.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> listarTodos(){
        return clienteRepository.findAll();
    }

    public ClienteModel salvar(ClienteModel clienteModel){
        if(clienteRepository.findByEmail(clienteModel.getEmail()).isPresent()){
            throw new IllegalArgumentException("Funcionario já Cadastrado");
        }

        return clienteRepository.save(clienteModel);
    }

    public ClienteModel atualizar(Long id, ClienteModel clienteModel){
        if(!clienteRepository.existsById(id)){
            throw new IllegalArgumentException("Funcionario não cadastrado");
        }

        return clienteRepository.save(clienteModel);
    }

    public void excluir(Long id){
        if(!clienteRepository.existsById(id)){
            throw new RuntimeException("Funcionario não encontrado");
        }

        clienteRepository.deleteById(id);
    }
        public void deletecliente(Long id){

        }
    }

