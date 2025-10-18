package com.example.Aula1710.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<ProdutoRepository, Long>{
    Optional<ClienteRepository>findBYEmail(String email);
}
