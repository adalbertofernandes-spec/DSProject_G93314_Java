package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Adalberto","054864897","25/02/2025",1480,Bonificacao.DIREITOR);
        Motoboy motoboy = new Motoboy("Roberto", "0548758755","15/08/2025", 1478, "PLA-3B47");

        System.out.println("Gerente "  + motoboy);
        gerente.admitir(motoboy);
        System.out.println("Motoboy " + gerente);
    }

}