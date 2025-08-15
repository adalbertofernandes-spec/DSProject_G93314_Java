package org.example;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        // Atribuição de valores

        // Criando mais de uma entrada de dados
        //p1.nome = "Marta";
        p1.setNome("Marta");
        //p1.cpf = "000.111.222-33";
        p1.setCpf("000.1111.222-33");
        //p2.nome = "Carlos";
        p2.setNome("Jose");
        //p2.cpf = "000.222.444-44";
        p2.setCpf("000.222.444-44");
        p2.profissao = "Coordenador";

        // Mostrar os valores
        //System.out.println("Nome: " + p1.nome);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());

        System.out.println();

        // System.out.println("Nome: " + p2.nome());
        System.out.println("Nome: " + p2.getNome());
        //System.out.println("CPF: " + p2.cpf);
        System.out.println("CPF: " + p2.getCpf());
        System.out.println("Nome: " + p2.profissao);





    }
}
