package org.example;

public class Direitor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 0.1;

    public Direitor(String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase * Bonificacao.DIREITOR.getValor();
    }

    @Override
    public void admitir() {
        System.out.println("Admitir");
    }

    @Override
    public void demitir() {
        System.out.println("Demitir");

    }
}
