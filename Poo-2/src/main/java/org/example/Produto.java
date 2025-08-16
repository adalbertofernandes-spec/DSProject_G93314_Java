package org.example;

public class Produto {

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    private String nome;
    private double precoUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return precoUnitario;
    }

    public void setPreco(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
