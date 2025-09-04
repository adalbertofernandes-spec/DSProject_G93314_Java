package org.example.atv1;

public class Main {
    public static void main(String[] args) {

        // Cachorro
        Cachorro cachorro = new Cachorro();
        System.out.println("O Cachorro faz " + cachorro.emitirSom() + " ele come " + cachorro.comer());
        // Gato
        Gato gato = new Gato();
        System.out.println("O Gato faz " + gato.emitirSom() + " ele come " + gato.comer());
        // Galo
        Galo galo = new Galo();
        System.out.println("O Galo faz " + galo.emitirSom() + " ele come " + galo.comer());
        // Pato
        Pato pato = new Pato();
        System.out.println("O Pato faz " + pato.emitirSom() + " ele come " + pato.comer());
    }
}
