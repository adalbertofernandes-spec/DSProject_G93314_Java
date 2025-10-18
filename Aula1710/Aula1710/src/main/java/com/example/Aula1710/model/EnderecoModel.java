package com.example.Aula1710.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tab_endereco")
public class EnderecoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String rua;
    
    @Column(nullable = false)
    private String cep;
    
    @Column(nullable = false)
    private String logradouro;    

    @Column(nullable = false)
    private String numeroCasa;
    
    @Column(nullable = false)
    private String cidade;
    
}
