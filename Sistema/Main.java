package Sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();

        int opcao = 0;

        do {

            // Adicionar CPF atrelado aos alunos, com impedimento de duplicação.

            // Opções funcionais disponíveis.
            System.out.println("Selecione uma opção");
            System.out.println("(1) Adicionar livro.");
            System.out.println("(2) Remover livro.");
            System.out.println("(3) Listar livros.");
            System.out.println("(4) Adicionar aluno.");
            System.out.println("(5) Remover aluno.");
            System.out.println("(6) Listar alunos.");
            System.out.println("(7) Modificar Livro.");
            System.out.println("(8) Modificar Aluno.");
            System.out.println("(9) Sair.");
            System.out.print("Opcão: ");
            opcao = sc.nextInt();

            // Definição das únicas opções existentes no programa.
            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9) {
                System.out.println("Opção inválida.");

            } else if (opcao == 1) {

                // Lógica da adição dos livros.
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

                int IDlivro = b1.lerIDLivroValidado(sc);

                // Criação do objeto Livro a partir das
                // Informações fornecidas pelo usuário.

                Livro livronovo = new Livro(nome, IDlivro);
                b1.adicionarLivro(livronovo);

                System.out.println();
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

                // Lista de livros.
                b1.listarLivros();
                System.out.println();

            } else if (opcao == 4) {

                // Lógica da adição dos alunos.
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

                int IDaluno = b1.lerIDAlunoValidado(sc);

                // Criação do objeto Aluno a partir das
                // Informações fornecidas pelo usuário.

                Aluno alunonovo = new Aluno(nomealuno, IDaluno);
                b1.adicionarAluno(alunonovo);

                System.out.println();
                System.out.println("Aluno adicionado!");
                System.out.println();

            } else if (opcao == 5) {

                // Lógica de remoção Alunos.
                System.out.println("Qual aluno quer remover?");
                b1.listarAlunos();
                System.out.print("Digite o ID: ");

                int idRemover = sc.nextInt();

                // Condicional apenas se ID não estiver de acordo.
                if (idRemover <= 0) {
                    do {
                        System.out.println("ID inválido.");
                        System.out.print("Tente novamente: ");
                        idRemover = sc.nextInt();

                    } while (idRemover <= 0);
                }

                b1.removerAluno(idRemover);

                System.out.println();
                System.out.println("Aluno removido!");
                System.out.println();

            } else if (opcao == 6) {
                b1.listarAlunos();
                System.out.println();

            } else if (opcao == 7) {

                // Lógica para modificação nome livro.
                System.out.println("Qual livro quer modificar?");
                b1.listarLivros();
                System.out.print("Digite o ID: ");
                int IDmodificarNomeLivro = sc.nextInt();

                System.out.print("Qual novo nome do livro? ");
                sc.nextLine();
                String nomeNovo = sc.nextLine();
                b1.mudarNomeLivro(IDmodificarNomeLivro, nomeNovo);

                System.out.println();
                System.out.println("Cadastro atualizado!");
                System.out.println();

            } else if (opcao == 8) {

                // Lógica para modificação nome aluno.
                System.out.println("Qual aluno quer modificar? ");
                b1.listarAlunos();
                System.out.print("Digite o ID:");
                int IDmodificarNomeAluno = sc.nextInt();

                System.out.print("Qual novo nome do aluno? ");
                sc.nextLine();
                String nomeNovo = sc.nextLine();
                b1.mudarNomeAluno(IDmodificarNomeAluno, nomeNovo);

                System.out.println();
                System.out.println("Cadastro atualizado!");
                System.out.println();

            }
        }
        while (opcao != 9);

        // Encerramento do programa.
        System.out.println("Saindo...");

        sc.close();
    }
}
