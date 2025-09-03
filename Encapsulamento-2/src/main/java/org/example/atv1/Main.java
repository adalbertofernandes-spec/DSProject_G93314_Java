package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println("O cachorro:");
        System.out.println(cachorro.emitirSom());
        System.out.println("O Gato:");
        System.out.println(gato.comer());
    }
}
