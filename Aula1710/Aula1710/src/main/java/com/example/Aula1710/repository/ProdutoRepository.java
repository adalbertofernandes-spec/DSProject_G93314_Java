package com.example.Aula1710.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Aula1710.model.ClienteModel;

public interface ProdutoRepository extends JpaRepository<ClienteModel, Long> {

}
