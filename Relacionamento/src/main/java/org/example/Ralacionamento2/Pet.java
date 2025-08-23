package org.example.Ralacionamento2;


public class Pet {
    private String Nome;
    private int Idade;
    private String Raca;

    public Pet(String nome, int idade, String raca) {
        Nome = nome;
        Idade = idade;
        Raca = raca;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", Raca='" + Raca + '\'' +
                '}';
    }
}
