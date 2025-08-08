package org.example;

public class LjM {
    public static void main(String[] args) {
        int parc = 5;
        String  loja = "Mamão com acuçar";
        String  produto = "Mamao";
        double preco = 25.35;

        // Valor final do produto
        System.out.println("O produto comprado foi " + produto + " no mercado "
                + loja + " foi de " + preco + " parcelado " +  preco / parc + " em "
                + parc + "x sem juros!");

    }
}
