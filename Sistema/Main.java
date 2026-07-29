package Sistema;

import java.net.IDN;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();

        // Objetos teste.
        Aluno a1 = new Aluno("Matheus", 01);
        Aluno a2 = new Aluno("Bruno", 92);
        Aluno a3 = new Aluno("Guilherme", 03);

        Livro liv1 = new Livro("Teste", 92);

        b1.adicionarAluno(a1);
        b1.adicionarAluno(a2);
        b1.adicionarAluno(a3);
        b1.adicionarLivro(liv1);

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

                int IDlivro = sc.nextInt();

                if (IDlivro <= 0) {
                    do {
                        // Condicional apenas se ID não estiver de acordo.
                        System.out.println("ID inválido.");
                        System.out.print("Tente novamente: ");
                        IDlivro = sc.nextInt();

                    } while (IDlivro <= 0);
                }

                // Criação do objeto Livro a partir das
                // Informações fornecidas pelo usuário.

                Livro livronovo = new Livro(nome, IDlivro);
                b1.adicionarLivro(livronovo);

                System.out.println("Livro adicionado!");
                System.out.println();

            } else if (opcao == 2) {
                // Lógica da remoção dos livros.
                System.out.println("Qual livro quer remover ?");
                b1.listarLivros();
                System.out.print("Digite o ID: ");

                int IDremover = sc.nextInt();

                if (IDremover <= 0) {
                    do {
                        System.out.println("ID inválido.");
                        System.out.print("Tente novamente: ");
                        IDremover = sc.nextInt();

                    } while (IDremover <= 0);
                }

                b1.removerLivro(IDremover);
                System.out.println("Livro removido!");

            } else if (opcao == 3) {
                b1.listarLivros();
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
                        System.out.print("Tente novamente: ");
                        IDaluno = sc.nextInt();

                    } while (IDaluno <= 0 || IDaluno >= 20);
                }

                // Criação do objeto Aluno a partir das
                // Informações fornecidas pelo usuário.

                Aluno alunonovo = new Aluno(nomealuno, IDaluno);
                b1.adicionarAluno(alunonovo);

                System.out.println("Aluno adicionado!");

            } else if (opcao == 5) {

                System.out.println("Qual aluno quer remover ?");
                b1.listarAlunos();
                System.out.print("Digite o ID: ");

                int idRemover = sc.nextInt();

                if (idRemover <= 0) {
                    do {
                        System.out.println("ID inválido.");
                        System.out.print("Tente novamente: ");
                        idRemover = sc.nextInt();

                    } while (idRemover <= 0);
                }

                b1.removerAluno(idRemover);
                System.out.println("Aluno removido!");

            } else if (opcao == 6) {
                b1.listarAlunos();
                System.out.println();
            }

        } while (opcao != 7);
        System.out.println("Saindo...");

        sc.close();
    }
}
