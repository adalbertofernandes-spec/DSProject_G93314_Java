package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instaciando uma classe
        // Pessoa p1 = new Pessoa("Marta", 25);

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = ler.next();
        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();

        Pessoa p1 = new Pessoa(nome, idade);

        Produto pr = new Produto("Caneta", 30.50);

        //p1.nome = "Marta";
        //p1.setNome("Adalberto");
        // p1.idade = 25;
        //p1.setIdade(25);

        // Produto Classe

        //pr.setNome("Caneta");
        //pr.setPreco(30.50);

        //System.out.println("Nome: " + p1.nome);

        System.out.println("Seu nome é: " + p1.getNome());
        System.out.println("Sua idade é: " + p1.getIdade() + " anos");

        System.out.println();

        // Produto impressão
        System.out.println("Nome do produto é: " + pr.getNome());
        System.out.println("Sua idade é: " + pr.getPreco());
    }
}