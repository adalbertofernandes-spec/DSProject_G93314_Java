package com.example.sistema24092025.repository;

import com.example.sistema24092025.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Optional<Funcionario> findByTelefone(String telefone);// Pegandotodoasinformacoeseanalisandoaexistencia
}


