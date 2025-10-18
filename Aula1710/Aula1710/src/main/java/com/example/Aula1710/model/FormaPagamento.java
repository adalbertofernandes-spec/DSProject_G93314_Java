package com.example.Aula1710.model;



public enum FormaPagamento {
    CARTAO("Cartão"),
    DINHEIRO("Dinheiro");

    private String FormaPagamento;

    FormaPagamento(String FormaPagamento){
        this.FormaPagamento = FormaPagamento;
    }

    public String getFormaPagemento(){
        return FormaPagamento;
    }

}
