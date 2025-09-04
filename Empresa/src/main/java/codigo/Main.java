package codigo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Diretor direito = new Diretor("Lucas", "01/01/2025", Sexo.MASCULINO,Setor.OPERACOES,1.500);
        Motoboy motoboy = new Motoboy("Adalberto","01/02/2000", Sexo.MASCULINO, Setor.OPERACOES, 1.800, "5153548");

        System.out.println("O motoboy " + motoboy);
        direito.admitir(motoboy);
        System.out.println("Foi contratado meu diretor " + direito);
    }
}