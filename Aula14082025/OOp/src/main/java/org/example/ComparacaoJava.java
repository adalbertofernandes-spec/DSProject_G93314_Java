package org.example;

public class ComparacaoJava {
    public static void main(String[] args) {
        // Declaração de variavéis
        String nomeUsuario = "Marta";
        int senha = 123;

        // Comparação de String e Inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        // Exibindo resultados
        System.out.println("O nome do usuario está correto? " + resultadoNome );
        System.out.println("A senha está correta? " + resultadoSenha );

    }
}
