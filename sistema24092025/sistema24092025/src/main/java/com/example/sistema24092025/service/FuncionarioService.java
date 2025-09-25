package com.example.sistema24092025.service;

import com.example.sistema24092025.model.Funcionario;
import com.example.sistema24092025.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    // GET
    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }

    // POST
    public Funcionario salvar(Funcionario funcionario){
        // verifica se o funcionario já está cadastrado
        if(funcionarioRepository.findByTelefone(funcionario.getTelefone()).isPresent()){
            // Se encontrado o telefone da funcionario no banco de dados mostra mensagem
            throw new RuntimeException("Funcionario já Cadastrado");
    }
      return funcionarioRepository.save(funcionario);
    }
}
