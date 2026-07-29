package Sistema;

import java.net.IDN;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();
        Aluno a1 = new Aluno("Matheus", 01);

        int opcao = 0;

        do {
            System.out.println("Selecione uma opção");
            System.out.println("(1) Adicionar livro.");
            System.out.println("(2) Remover livro.");
            System.out.println("(3) Listar livros.");
            System.out.println("(4) Adicionar aluno.");
            System.out.println("(5) Remover aluno.");
            System.out.println("(6) Listar alunos.");
            System.out.println("(7) Sair.");
            opcao = sc.nextInt();

            // Definição das únicas opções existentes no programa.
            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7) {
                System.out.println("Opção inválida.");

            } else if (opcao == 1) {
                System.out.print("Digite o nome do livro: ");

                sc.nextLine();
                String nome = sc.nextLine();

                if (nome == null || nome.isBlank()) {
                    do {
                        // Condicional apenas se o nome não estiver de acordo.
                        System.out.println("Nome inválido.");
                        System.out.print("Digite outro nome: ");
                        nome = sc.nextLine();

                    } while (nome == null || nome.isBlank());
                }

                System.out.print("Digite o ID do livro: ");

                int ID = sc.nextInt();

                if (ID <= 0) {
                    do {
                        // Condicional apenas se ID não estiver de acordo.
                        System.out.println("ID inválido.");
                        System.out.print("Digite outro ID: ");
                        ID = sc.nextInt();

                    } while (ID <= 0);
                }

                // Criação do objeto Livro a partir das
                // Informações fornecidas pelo usuário.

                Livro livronovo = new Livro(nome, ID);
                b1.adicionarLivro(livronovo);

                System.out.println("Livro adicionado!");
                System.out.println();

            } else if (opcao == 2) {
                System.out.println("Qual livro quer remover ?");
                b1.listarLivros();

            } else if (opcao == 3) {
                b1.listarLivros();
                System.out.println();
                System.out.println();

            } else if (opcao == 4) {

                System.out.print("Digite o nome do aluno: ");

                sc.nextLine();
                String nomealuno = sc.nextLine();

                if (nomealuno == null || nomealuno.isBlank()) {
                    do {
                        // Condicional apenas se o nome não estiver de acordo.
                        System.out.println("Nome inválido.");
                        System.out.print("Digite outro nome: ");
                        nomealuno = sc.nextLine();
                    } while (nomealuno == null || nomealuno.isBlank());
                }

                System.out.print("ID aluno: ");
                int IDaluno = sc.nextInt();

                if (IDaluno <= 0 || IDaluno >= 20) {
                    do {
                        // Condicional apenas se ID não estiver de acordo.
                        System.out.println("ID inválido.");
                        System.out.print("Digite outro ID: ");
                        IDaluno = sc.nextInt();

                    } while (IDaluno <= 0 || IDaluno >= 20);
                }

                // Criação do objeto Aluno a partir das
                // Informações fornecidas pelo usuário.

                Aluno alunonovo = new Aluno(nomealuno, IDaluno);
                b1.adicionarAluno(alunonovo);

                System.out.println("Aluno adicionado!");

            } else if (opcao == 5) {
            } else if (opcao == 6) {
                b1.listarAlunos();
                System.out.println();
                System.out.println();
            }

        } while (opcao != 7);
        System.out.println("Saindo...");

        sc.close();
    }
}
