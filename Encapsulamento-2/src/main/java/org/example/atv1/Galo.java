package org.example.atv1;

public class Galo implements Animal{
    @Override
    public String emitirSom() {
        return "Cocoroco";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
