package org.example;

public class Metodos_OOP {
    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";

        // Exibindo a quantidade de caracteres
        System.out.println("Tamanaho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome completo usando métodos Strings - Maiscúlas
        System.out.println("Concatenação Maisculas: " + nomeCompleto.toUpperCase());

        // Exibindo nome completo usando métodos Strings - Minusculas
        System.out.println("Concatenação Minuscula: " + nomeCompleto.toLowerCase());

    }
}
