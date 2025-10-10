package com.example.Aula09102025.model;

public enum UnidadeFederativa {
    BAHIA ("Bahia"),
    SAO_PAULO("São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro");
    private String Texto;

    UnidadeFederativa(String Texto){
        this.Texto = Texto;
    }

    public String getTexto(){
        return Texto;
    }
}


