package com.example.sistema24092025.repository;

import com.example.sistema24092025.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepostirory extends JpaRepository<Cliente, Long>{
    Optional<Cliente> findByprotocoloAtendimento(String protocoloAtendimento);
}
