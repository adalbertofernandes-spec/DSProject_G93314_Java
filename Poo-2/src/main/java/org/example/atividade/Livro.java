package org.example.atividade;

public class Livro {
    private String Titulo;
    private String Autor;
    private int  numeroPagina;
    private double preco;

    public Livro(String titulo, String autor, int numeroPagina, double preco) {
        Titulo = titulo;
        Autor = autor;
        this.numeroPagina = numeroPagina;
        this.preco = preco;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAuto() {
        return Autor;
    }

    public void setAuto(String autor) {
        Autor = autor;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
