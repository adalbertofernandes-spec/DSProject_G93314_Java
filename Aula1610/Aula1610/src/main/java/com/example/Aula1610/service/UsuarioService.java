package com.example.Aula1610.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.Aula1610.dto.UsuarioRequestDTO;
import com.example.Aula1610.dto.UsuarioResponseDTO;
import com.example.Aula1610.model.UsuarioModel;
import com.example.Aula1610.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    // Consulta no banco de dados
    public List<UsuarioResponseDTO> ListarTodos(){
        return usuarioRepository
        .findAll()
        .stream()
        .map(u -> new UsuarioResponseDTO(u.getNome(), u.getEmail()))
        .toList();
    }

    // Salvar um novo usuario. 
    public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        if(usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()){
            throw new RuntimeException("Usuário já cadastrado");
        }

        
        UsuarioModel novoUsuario = new UsuarioModel();
        novoUsuario.setNome(usuarioRequestDTO.getNome());
        novoUsuario.setEmail(usuarioRequestDTO.getEmail());
        // Criptografar a senha antes de salvar
        novoUsuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));
        
        usuarioRepository.save(novoUsuario);
        return novoUsuario;
    }

        //Update
        @PutMapping("/{id}")
        public UsuarioModel atualizarUsuario(Long id, UsuarioRequestDTO dto){
            if(!usuarioRepository.existsById(id)){
                throw new RuntimeException("Usuario não encontrado");
            }   
            
            UsuarioModel atualizarUsuario = new UsuarioModel();
            atualizarUsuario.setId(id);
            atualizarUsuario.setNome(dto.getNome());
            atualizarUsuario.setEmail(dto.getEmail());
            atualizarUsuario.setSenha(bCryptPasswordEncoder.encode(dto.getSenha()));

            usuarioRepository.save(atualizarUsuario);
            return atualizarUsuario;
            
        }
    
        // Delete
        @DeleteMapping("/{id}")
        public void deletarUsuario(Long id){
            if(!usuarioRepository.existsById(id)){
                throw new RuntimeException("Uusario não encontrado");
            }   
            usuarioRepository.deleteById(id);
        }   
}
