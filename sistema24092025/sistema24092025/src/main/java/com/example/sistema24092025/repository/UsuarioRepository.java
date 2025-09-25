package com.example.sistema24092025.repository;

import com.example.sistema24092025.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
     Optional<Usuario> findBytelefone(String telefone);
}
