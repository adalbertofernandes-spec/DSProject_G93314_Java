package org.example;

public class Livro {
    private String Titulo;
    private String Autor;
    private int N_Pafinas;
    private double Preco;

    public Livro(String titulo, String autor, int n_Pafinas, double preco) {
        Titulo = titulo;
        Autor = autor;
        N_Pafinas = n_Pafinas;
        Preco = preco;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getN_Pafinas() {
        return N_Pafinas;
    }

    public void setN_Pafinas(int n_Pafinas) {
        N_Pafinas = n_Pafinas;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", N_Pafinas=" + N_Pafinas +
                ", Preco=" + Preco +
                '}';
    }
}
