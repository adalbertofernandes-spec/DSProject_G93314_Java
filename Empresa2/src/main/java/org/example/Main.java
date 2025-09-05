package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Direitor direitor = new Direitor("Adalberto","02394341544","1337104478",15800,"03/02/1986","05/05/2020",Bonificacao.DIREITOR);
        Gerente gerente = new Gerente("Ricardo", "03045878474","1458748744",14877,"05/06/1990","06/08/2000",Bonificacao.GERENTE);
        Motoboy motoboy = new Motoboy("Robenilson","0547894625","1487597847",169854,"05/09/2000","05/10/2014","PLA-3B41");

        System.out.println(direitor.toString());
        System.out.println(gerente.toString());
        System.out.println(motoboy.toString());
    }
}