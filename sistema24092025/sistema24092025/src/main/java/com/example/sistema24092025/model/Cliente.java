package com.example.sistema24092025.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String dataNascimento;

    @Column(nullable = false)
    private String protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String dataNascimento, String protocoloAtendimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", protocoloAtendimento='" + protocoloAtendimento + '\'' +
                '}';
    }
}
