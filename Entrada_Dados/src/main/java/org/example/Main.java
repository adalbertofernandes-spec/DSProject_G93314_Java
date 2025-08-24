package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

            // Criando objeto livro
            Bibiliotecalivros livro = new Bibiliotecalivros();

            // Coletando dados do usuário
            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine();
            livro.setTitulo(titulo);

            System.out.print("Digite o autor do livro: ");
            String autor = scanner.nextLine();
            livro.setAutor(autor);

            System.out.print("Digite o número de páginas: ");
            int paginas = scanner.nextInt();
            livro.setN_Paginas(paginas);

            System.out.print("Digite o preço do livro: ");
            double preco = scanner.nextDouble();
            livro.setPreco(preco);

            // Exibindo os dados coletados
            livro.exibirInformacoes();


            scanner.close(); // Boa prática
        }
    }