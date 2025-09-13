package com.example.Aula_Spring_3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// identificação
@Entity
@Table(name = "Tab_Cliente")// Criando uma tabela no banco de dados cliente
@AllArgsConstructor // Todos os atributos
@NoArgsConstructor // Contrutor Vazio
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Não pode ser vazio
    private String nome;

    @Column(nullable = false, unique = true) // Não pode ser vazio / Unico sem copia
    private String telefone;


}
