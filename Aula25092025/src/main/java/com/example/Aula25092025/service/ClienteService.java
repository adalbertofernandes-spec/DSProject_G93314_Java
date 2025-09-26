package com.example.Aula25092025.service;

// model // repository / service // controller


import com.example.Aula25092025.model.Cliente;
import com.example.Aula25092025.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    //GET - Read
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    // POST - Create
    public Cliente salvar(Cliente cliente){
        //verificar se o cliente já está cadastrado
        if(clienteRepository.findByemail(cliente.getEmail()).isPresent()){
            //Se encontrado o email do cliente no banco de dados mostra mensagem
            throw new RuntimeException("Funcionario já cadastrado");
        }

        return clienteRepository.save(cliente);
    }

    // PUT - Update
    public Cliente atualizar(UUID id, Cliente cliente){
        if(!clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado");
        }
        cliente.setId(id);
        Cliente clienteAtualizado = clienteRepository.save(cliente);
        return clienteAtualizado;
    }

    // Delete
    public void excluir(UUID id){
        if (clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado");
        }
        clienteRepository.deleteById(id);
    }

}
