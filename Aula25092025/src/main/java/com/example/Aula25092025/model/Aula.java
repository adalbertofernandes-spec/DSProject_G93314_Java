package com.example.Aula25092025.model;


import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name = "Tab_Aluno")
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String endereco;



}
