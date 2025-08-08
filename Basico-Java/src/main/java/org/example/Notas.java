package org.example;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);

                System.out.print("Digite o seu nome: ");
                String nome = ler.nextLine(); // nextLine para permitir nomes com espaços

                System.out.print("Digite sua nota 1: ");
                double nota1 = ler.nextDouble();

                System.out.print("Digite sua nota 2: ");
                double nota2 = ler.nextDouble();

                double media = (nota1 + nota2) / 2;

                System.out.println("Aluno: " + nome);
                System.out.println("Nota 1: " + nota1);
                System.out.println("Nota 2: " + nota2);
                System.out.println("Média: " + media);

                if (media >= 7) {
                    System.out.println("Situação: Aprovado");
                } else if (media >= 5) {
                    System.out.println("Situação: Recuperação");
                } else {
                    System.out.println("Situação: Reprovado");
                }

                ler.close(); // Fechando o Scanner
            }
        }
