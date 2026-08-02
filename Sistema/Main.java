package Sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();

        int opcao = 0;

        do {
            try {

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

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println();
                System.out.println("Opção inválida.");
                System.out.println();
                continue;
            }

            // Definição das únicas opções existentes no programa.
            if (opcao <= 0 || opcao > 9) {

                System.out.println();
                System.out.println("Opção inválida.");
                System.out.println();

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

                int IDremover = 0;
                do {
                    try {

                        // Primeiro verificação se é menor que 0
                        System.out.print("Digite o ID: ");
                        IDremover = sc.nextInt();

                        if (IDremover <= 0) {
                            System.out.println("ID inválido.");
                            continue;
                        }

                        // Depois se há algum caractere.
                    } catch (InputMismatchException e) {
                        System.out.println("ID inválido.");
                        sc.nextLine();
                        continue;
                    }
                    if (!b1.jaExisteLivro(IDremover)) {
                        System.out.println("ID inexistente.");
                    }
                } while (IDremover <= 0 || !b1.jaExisteLivro(IDremover));

                // Remoção do livro propriamente dito.
                b1.removerLivro(IDremover);

                System.out.println();
                System.out.println("Livro removido!");
                System.out.println();

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

                // Condicional apenas se ID não estiver de acordo.
                int idRemover = 0;
                do {
                    try {
                        System.out.print("Digite o ID: ");
                        idRemover = sc.nextInt();
                        if (idRemover <= 0) {
                            System.out.println("ID inválido.");
                            continue;
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("ID inválido.");
                        sc.nextLine();
                        continue;
                    }
                    if (!b1.jaExisteAluno(idRemover)) {
                        System.out.println("ID inexistente.");
                    }
                } while (idRemover <= 0 || !b1.jaExisteAluno(idRemover));

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

                int IDmodificarNomeLivro = 0;
                do {
                    try {
                        System.out.print("Digite o ID: ");
                        IDmodificarNomeLivro = sc.nextInt();

                        if (IDmodificarNomeLivro <= 0) {
                            System.out.println("ID inválido.");
                            continue;
                        }
                    } catch (InputMismatchException e) {
                        sc.nextLine();
                        System.out.println("ID inválido.");
                        continue;
                    }
                    if (!b1.jaExisteLivro(IDmodificarNomeLivro)) {
                        System.out.println("ID inexistente.");
                    }
                } while (IDmodificarNomeLivro <= 0 || !b1.jaExisteLivro(IDmodificarNomeLivro));

                System.out.print("Digite o novo nome do livro: ");
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

                int IDmodificarNomeAluno = 0;
                do {
                    try {
                        System.out.print("Digite o ID: ");
                        IDmodificarNomeAluno = sc.nextInt();

                        if (IDmodificarNomeAluno <= 0) {
                            System.out.println("ID inválido.");
                            continue;
                        }
                    } catch (InputMismatchException e) {
                        sc.nextLine();
                        System.out.println("ID inválido.");
                        continue;
                    }
                    if (!b1.jaExisteAluno(IDmodificarNomeAluno)) {
                        System.out.println("ID inexistente.");
                    }
                } while (IDmodificarNomeAluno <= 0 || !b1.jaExisteAluno(IDmodificarNomeAluno));

                System.out.print("Digite o novo nome do aluno: ");
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