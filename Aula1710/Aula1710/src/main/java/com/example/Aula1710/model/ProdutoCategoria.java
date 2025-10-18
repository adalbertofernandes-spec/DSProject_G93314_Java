package com.example.Aula1710.model;


public enum ProdutoCategoria {
    PERIFERICO("Perifico"),
    TELAS("Telas");

    private String ProdutoCategoria;

    ProdutoCategoria(String ProdutoCategoria){
        this.ProdutoCategoria = ProdutoCategoria;
    }

    public String getProdutoCategoria(){
        return ProdutoCategoria;
    }

}
