package Sistema;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Biblioteca b1 = new Biblioteca();
        Livro liv1 = new Livro("Crime e castigo.", "01");
        Aluno a1 = new Aluno("Matheus", 01);

        b1.adicionarLivro(liv1);

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
                System.out.print("Digite o nome do livro: ");

                sc.nextLine();
                String nome = sc.nextLine();

                if (nome == null || nome.isBlank()) {
                    do {
                        System.out.println("Nome inválido.");
                        nome = sc.nextLine();

                    } while (nome == null || nome.isBlank());
                }

                System.out.print("Digite o ID do livro: ");
                
                String ID = sc.nextLine();

                if (ID == null || ID.isBlank()) {
                    do {
                        System.out.println("ID inválido.");
                        ID = sc.nextLine();

                    } while (ID == null || ID.isBlank());
                }

                Livro livronovo = new Livro(nome, ID);
                b1.adicionarLivro(livronovo);

                System.out.println("Livro adicionado!");
                System.out.println();

            } else if (opcao == 2) {
                b1.listarLivros();
                System.out.println();
                System.out.println();

            } else if (opcao == 3) {
                sc.nextLine();
                System.out.print("Digite o nome do aluno: ");
                String nomealuno = sc.nextLine();

                System.out.print("ID aluno: ");
                int IDaluno = sc.nextInt();

                Aluno alunonovo = new Aluno(nomealuno, IDaluno);
                b1.adicionarAluno(alunonovo);

                System.out.println("Aluno adicionado!");

            } else if (opcao == 4) {
                b1.listarAlunos();
                System.out.println();
                System.out.println();

            }

        } while (opcao != 5);
        System.out.println("Saindo...");

        sc.close();
    }
}
