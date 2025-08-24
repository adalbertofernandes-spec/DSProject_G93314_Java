package org.example;

public class Cliente {
    private String nome;
    private String Cpf;
    private String telefone;
    private String Endereco;
    private String cep;

    public Cliente(String nome, String cpf, String telefone, String endereco, String cep) {
        this.nome = nome;
        Cpf = cpf;
        this.telefone = telefone;
        Endereco = endereco;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", Cpf='" + Cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
