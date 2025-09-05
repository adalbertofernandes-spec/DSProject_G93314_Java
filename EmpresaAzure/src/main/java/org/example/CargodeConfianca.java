package org.example;

public abstract class CargodeConfianca {
    private Bonificacao bonificacao;

    public CargodeConfianca(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }


}
