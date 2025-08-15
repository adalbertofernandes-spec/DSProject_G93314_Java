package org.example;

import java.util.Scanner;

public class Exercico1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nomeUsuario = "Adalberto";
        String senha = "1234";

        System.out.println(" =========== Tela de acesso =============");
        System.out.println("Informe o nome de usuario: ");
        String nome = ler.nextLine();
        System.out.println("Informe sua senha: ");
        String senhaUsuario = ler.nextLine();

        if (nome.equals(nomeUsuario) &&  senha.equals(senhaUsuario)){
            System.out.println("Bem vindo, usuário logado! ");
        }else {
            System.out.println("Nome de usuario ou senha invalido");
        }
    }
}
