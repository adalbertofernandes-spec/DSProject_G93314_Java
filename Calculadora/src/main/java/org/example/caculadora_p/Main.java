package org.example.caculadora_p;

public class Main {
    public static void main(String[] args) {
        // Soma
        Soma soma = new Soma();
        System.out.println("O valor da soma é " + soma.cacular(2 , 5));
        // subtração
        Subtracao subtracao = new Subtracao();
        System.out.println("O valor da substração é " + subtracao.cacular (5 , 2));
        // Divisao
        Divisao divisao = new Divisao();
        System.out.println("O valor da Divisão é " + divisao.cacular (5 , 2));
        // Multiplicação
        Multiplicacao multiplicacao= new Multiplicacao();
        System.out.println("O valor da multiplicação é " + multiplicacao.cacular(5, 2));

    }
}
