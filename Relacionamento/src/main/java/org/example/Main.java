package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A","23","Salvador");
        Cliente cliente1 = new Cliente("Marta", 33, endereco1);

        Cliente cliente2 = new Cliente("Moises", 42, new Endereco("Rua B", "45", "Canada") );

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}