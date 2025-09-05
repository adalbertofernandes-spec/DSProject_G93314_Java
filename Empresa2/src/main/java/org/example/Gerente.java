package org.example;

public class Gerente extends CargoDeConfianca {
    public Gerente(String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase * Bonificacao.GERENTE.getValor();
    }
}
