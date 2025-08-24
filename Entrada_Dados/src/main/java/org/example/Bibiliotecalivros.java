package org.example;

public class Bibiliotecalivros {
    private String Titulo;
    private String Autor;
    private int N_Paginas;
    private double Preco;

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setN_Paginas(int n_Paginas) {
        N_Paginas = n_Paginas;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

   public void exibirInformacoes(){
       System.out.println("\n📚 Informações do Livro:");
       System.out.println("Titulo: " + Titulo);
       System.out.println("Autor: " + Autor);
       System.out.println("Número de Páginas: " + N_Paginas);
       System.out.println("Preço R$: " + Preco);
   }
}
