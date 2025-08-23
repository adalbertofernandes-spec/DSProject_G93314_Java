package Infofuncionarios;


import org.example.Infofuncionarios.Funcionarios;
import org.example.Infofuncionarios.Setor;
import org.example.Infofuncionarios.Sexo;

public class Main {
    public static void main(String[] args) {

        Funcionarios funcionario1 = new Funcionarios(10, "Adalberto",15.350, Setor.MARKETING, Sexo.MASCULINO, 45);
        Funcionarios funcionarios2 = new Funcionarios(30 ,"Lucas Santos", 35000, Setor.FINANEIRO, Sexo.MASCULINO, 21);

        System.out.println(funcionario1.toString());
        System.out.println("almoxerife: " + funcionarios2.toString());

    }
}
