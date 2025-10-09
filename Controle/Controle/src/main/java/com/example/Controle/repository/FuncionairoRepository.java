package com.example.Controle.repository;

import com.example.Controle.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.OptionalInt;

@Repository
public interface FuncionairoRepository extends JpaRepository<FuncionarioModel, Long> {
    Optional<FuncionarioModel>findByEmail(String email);
}
