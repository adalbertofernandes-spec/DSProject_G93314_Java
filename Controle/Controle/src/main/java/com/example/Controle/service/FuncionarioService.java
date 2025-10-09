package com.example.Controle.service;


import com.example.Controle.model.FuncionarioModel;
import com.example.Controle.repository.FuncionairoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionairoRepository funcionairoRepository;


    public List<FuncionarioModel> listarTodos(){
        return  funcionairoRepository.findAll();

    }

    public FuncionarioModel salvar(FuncionarioModel funcionarioModel){
        if (funcionairoRepository.findByEmail(funcionarioModel.getEmail()).isPresent()){
            throw new IllegalArgumentException("Funcionario já cadastrado");
        }

        return funcionairoRepository.save(funcionarioModel);
    }

    public FuncionarioModel atualizar(Long id, FuncionarioModel funcionario){
        if (!funcionairoRepository.existsById(id)) {
            throw new IllegalArgumentException("Funcionario não cadastrado");
        }
        funcionario.setId(id);
        return funcionairoRepository.save(funcionario);
    }

    public void excluir(Long id){
        if(!funcionairoRepository.existsById(id)){
            throw new RuntimeException("Funcionario não encontrado");
        }

        funcionairoRepository.deleteById(id);
    }

    public void deletefuncionario(Long id) {
    }
}
