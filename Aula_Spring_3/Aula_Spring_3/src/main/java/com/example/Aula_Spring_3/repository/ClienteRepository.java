package com.example.Aula_Spring_3.repository;

import com.example.Aula_Spring_3.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Save // Delete // Update // FindById // FindAll

}
