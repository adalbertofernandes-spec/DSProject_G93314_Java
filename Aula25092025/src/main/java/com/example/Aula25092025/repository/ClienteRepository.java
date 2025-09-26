package com.example.Aula25092025.repository;

import com.example.Aula25092025.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID>{
    Optional<Cliente> findByemail(String email);
}
