package org.example;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, String placaDaMoto) {
        super(nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase;
    }
}
