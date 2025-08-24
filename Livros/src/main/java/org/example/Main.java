package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro livros1 = new Livro("Biblia Sagrada", "Deus", 1700, 45.00);
        System.out.println(" ");
        // Mostrando todas as informações em uma unica linha
        System.out.println(livros1.toString());
        System.out.println(" ");
        //Pegando os valores de forma separadamente.
        System.out.println("O nome do livro é: " + livros1.getTitulo());
        System.out.println("O nome do Autor é: " + livros1.getAutor());
        System.out.println("A quantidade de peginas são de: " + livros1.getN_Pafinas());
        System.out.println("O valor em média é de R$: " + livros1.getPreco());
    }
}
