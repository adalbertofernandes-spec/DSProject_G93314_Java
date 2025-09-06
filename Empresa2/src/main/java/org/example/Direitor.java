package org.example;

public class Direitor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 1.1;

    public Direitor(String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return (super.salarioBase * super.bonificacao.getValor()) * this.PREMIO;
    }

    @Override
    public void admitir() {
        System.out.println("Admitir" + super.nome);
    }

    @Override
    public void demitir() {
        System.out.println("Demitir" + super.nome);

    }
}
