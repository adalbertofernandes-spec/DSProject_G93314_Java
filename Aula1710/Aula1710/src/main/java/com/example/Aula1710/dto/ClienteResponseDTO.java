package com.example.Aula1710.dto;

import com.example.Aula1710.model.EnderecoModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponseDTO {

    //Define campos que serao exibidos.
    // Após consulta no banco de dados, retornarão: id, nome, email, senha.
    //Omite o id e senha da tabel

    private String nome;
    private String email;
    private EnderecoModel enderecoModel;

}
