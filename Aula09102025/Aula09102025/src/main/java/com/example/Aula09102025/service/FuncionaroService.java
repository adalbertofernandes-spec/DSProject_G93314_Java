package com.example.Aula09102025.service;

import com.example.Aula09102025.model.FuncionarioModel;
import com.example.Aula09102025.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionaroService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel>listarTodos(){
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel salvar(FuncionarioModel funcionarioModel){
        if(funcionarioRepository.findByEmail(funcionarioModel.getEmail()).isPresent()){
            throw new IllegalArgumentException("Funcionario já cadastrado");
        }

        return funcionarioRepository.save(funcionarioModel);
    }

    public FuncionarioModel atualizar(Long id, FuncionarioModel funcionarioModel){
        if(!funcionarioRepository.existsById(id)){
            throw new IllegalArgumentException("Funcionario não cadastrado");
        }

        funcionarioModel.setId(id);
        return funcionarioRepository.save(funcionarioModel);
    }

    public void excluir(Long id){
        if(!funcionarioRepository.existsById(id)){
            throw new RuntimeException("Funcionario não encontrado");
        }

        funcionarioRepository.deleteById(id);

    }

    public void deletecliente(Long id){

    }
}
