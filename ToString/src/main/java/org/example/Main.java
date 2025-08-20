package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcos", 30);
        Cliente cliente2 = new Cliente("Douglas" ,45);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}