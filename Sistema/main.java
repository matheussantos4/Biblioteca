package Sistema;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();
        Livro liv1 = new Livro("Crime e castigo", 01);
        Aluno a1 = new Aluno("Matheus", 01);

        int opcao = 0;

        do {
            System.out.println("Selecione uma opção");
            System.out.println("(1) Adicionar livro.");
            System.out.println("(2) Listar livros.");
            System.out.println("(3) Adicionar alunos.");
            System.out.println("(4) Listar alunos.");
            System.out.println("(5) Sair.");
            opcao = sc.nextInt();

            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {
                System.out.println("Opção inválida.");

            } else if (opcao == 1) {
                System.out.println("Digite o nome do livro.");
                String nome = sc.nextLine();
                sc.nextLine();

                System.out.println("Digite o ID do livro.");
                int ID = sc.nextInt();

                Livro livronovo = new Livro(nome, ID);
                b1.adicionarLivro(livronovo);
                System.out.println("Livro adicionado!");

            } else if (opcao == 2) {

            }
        } while (opcao != 5);
    }
}
