package com.example.bopeselva.service;

import com.example.bopeselva.dto.UsuarioRequestDTO;
import com.example.bopeselva.dto.UsuarioResponseDTO;
import com.example.bopeselva.model.UsuarioModel;
import com.example.bopeselva.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //Salvar
    public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        if( usuarioRepository.findBYEmail(usuarioRequestDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException(("Usuario já cadastrado"));
        }

        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome(usuarioRequestDTO.getNome());
        usuario.setEmail(usuarioRequestDTO.getEmail());

        //Criptgrafando a senha antes de salvar no banco de dados
        usuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));

        usuarioRepository.save(usuario);
        return usuario;

    }

    // Consulta tabela no banco de dados
    public List<UsuarioResponseDTO> ListaTodos(){
        return usuarioRepository
                // Retornar com os dados de todos os usuarios da tabela.
                .findAll()
                // Envia todos os dados obtidos para as proximas funcões abaixo.
                .stream()
                // Envia somente os dados necessarios para resposta.
                .map(u -> new UsuarioResponseDTO(u.getNome(), u.getEmail()))
                // Transforma todos os dados em uma lista
                .toList();
    }

}
