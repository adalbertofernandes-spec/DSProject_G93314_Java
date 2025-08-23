package org.example.Ralacionamento2;

public class Cliente {
    private String Nome;
    private int Idade;
    private Pet pet;

    public Cliente(String nome, int idade, Pet pet) {
        Nome = nome;
        Idade = idade;
        this.pet = pet;
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", pet=" + pet +
                '}';
    }
}
