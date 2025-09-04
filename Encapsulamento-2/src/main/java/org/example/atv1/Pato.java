package org.example.atv1;

public class Pato implements Animal {
    @Override
    public String emitirSom() {
        return "Huuumm";
    }

    @Override
    public String comer() {
        return "Farelo";
    }
}
