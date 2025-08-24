package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pets pet1 = new Pets("tutitui",3,"Medio","Racao");
        Pets pet2 = new Pets("Caramelo",5,"pequeno","Racao");
        Cliente cliente1 = new Cliente("Adalberto","02394785944","7198888-9948","Casa B","41280-080");
        Cliente cliente2 = new Cliente("Lidiane", "03047875874","719999-8577","Casa A","41200-060");

        System.out.println(pet1.toString());
        System.out.println(pet2.toString());
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}