package org.example.atividade;

import org.example.Pessoa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do livro:");
        String Titulo = ler.next();

        System.out.println("Digite o autor:");
        String autor = ler.next();

        System.out.println("Digite a quantidade de pagina do livro");
        int numeroPagina = ler.nextInt();

        System.out.println("Qual o valor do livro");
        double preco = ler.nextDouble();

        Livro lv = new Livro (Titulo, autor, numeroPagina, preco);

    }
}
