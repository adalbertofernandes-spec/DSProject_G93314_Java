package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;
        Double notaInformada;

        do {
            do {

                System.out.println("Digite uma nota: ");
                notaInformada = ler.nextDouble();
            } while (notaInformada < 0 || notaInformada >10);
            notas.add(notaInformada);

                System.out.println("Digite uma nota:");
                notas.add(ler.nextDouble());

                System.out.println("Deseja inserir mais uma nota?");
                System.out.println("\nPressione a tecla N para sair.");
                resposta = ler.next();

            } while (!resposta.equalsIgnoreCase("n"));

            System.out.println("\n Exibindo as notas: ");
            for (double nota : notas) {
                System.out.println("Nota: " + nota);
            }
        }
    }

