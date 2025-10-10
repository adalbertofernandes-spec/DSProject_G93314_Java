package com.example.Aula09102025.repository;

import com.example.Aula09102025.model.ClienteModel;
import com.example.Aula09102025.model.FuncionarioModel;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    Optional<FuncionarioModel>findByEmail(String email);
}
