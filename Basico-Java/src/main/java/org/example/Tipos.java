package org.example;

public class Tipos {
    public static void main(String[] args) {
        //Declarando de variaveis
        String nome = "Marta";
        int idade = 30;
        double peso = 65.2;

        //Declaração de constantes (final) falando que se trata de uma variavel
        final String CPF = "123.456.789-00";

        //Exibindo resultado
        // Concactrnando com o sinal de " + "
        System.out.println("O nome do usuario é: " + nome);
        System.out.println("O CPF do usuario é: " + CPF);
        System.out.println("A idade do usuario é: " + idade + " anos");
        System.out.println("O peso do usuario é: " + peso + " quilos");
    }
}
