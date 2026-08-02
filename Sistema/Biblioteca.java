package Sistema;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {

    // Array da quantidade total de livros.
    private ArrayList<Livro> acervo = new ArrayList<>();
    // Array da quantidade total de alunos.
    private ArrayList<Aluno> alunos = new ArrayList<>();

    // Adiciona aluno.
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Adiciona livro.
    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    // Remove aluno pelo ID.
    public void removerAluno(int ID) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNumPessoa() == ID) {
                alunos.remove(i);
                break;
            }
        }
    }

    // Lógica metodo para modificação nome livro.
    public void mudarNomeLivro(int ID, String nome) {
        for (int i = 0; i < acervo.size(); i++) {
            if (acervo.get(i).getNumCadastro() == ID) {
                acervo.get(i).setNome(nome);
                break;
            }
        }
    }

    // Lógica metodo para modificação nome aluno.
    public void mudarNomeAluno(int ID, String nome) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNumPessoa() == ID) {
                alunos.get(i).setNome(nome);
                break;
            }
        }
    }

    // Verifica se já existe um aluno cadastrado com esse ID (evita duplicatas)
    public boolean jaExisteAluno(int ID) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNumPessoa() == ID) {
                return true;
            }
        }
        return false;
    }

    // Verifica se já existe um livro cadastrado com esse ID (evita duplicatas)
    public boolean jaExisteLivro(int ID) {
        for (int i = 0; i < acervo.size(); i++) {
            if (acervo.get(i).getNumCadastro() == ID) {
                return true;
            }
        }
        return false;
    }

    // Remove livro pelo ID.
    public void removerLivro(int ID) {
        for (int i = 0; i < acervo.size(); i++) {
            if (acervo.get(i).getNumCadastro() == ID) {
                acervo.remove(i);
                break;
            }
        }
    }

    // Listar todos livros de acordo com oque há no array.
    public void listarLivros() {

        //para cada Livro (que vou chamar de livro) dentro de acervo
        for (Livro livro : acervo) {
            System.out.printf(" ID:" + (livro.getNumCadastro()) + " Nome:" + livro.getNome() + "%n");
        }
    }

    // Listar todos Alunos de acordo com oque há no array.
    public void listarAlunos() {

        //para cada Aluno (que vou chamar de aluno) dentro de alunos
        for (Aluno aluno : alunos) {
            System.out.printf(" ID:" + aluno.getNumPessoa() + " Nome:" + aluno.getNome() + " %n");
        }
    }

    // Validação de ID do livro.
    public int lerIDLivroValidado(Scanner sc) {
        int IDLivro = 0;
        do {
            try {
                System.out.print("Digite o ID: ");
                IDLivro = sc.nextInt();
                if (IDLivro <= 0) {
                    System.out.println("ID Inválido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ID Inválido.");
                sc.nextLine();
                continue;
            }
            if (jaExisteLivro(IDLivro)) {
                System.out.println("ID já existente!");
            }
        } while (IDLivro <= 0 || jaExisteLivro(IDLivro));
        return IDLivro;

    }

    // Validação de ID do aluno.
    public int lerIDAlunoValidado(Scanner sc) {
        int IDAluno = 0;
        do {
            try {
                System.out.print("Digite o ID: ");
                IDAluno = sc.nextInt();
                if (IDAluno <= 0) {
                    System.out.println("ID Inválido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ID Inválido.");
                sc.nextLine();
                continue;
            }
            if (jaExisteAluno(IDAluno)) {
                System.out.println("ID já existente!");
            }
        } while (IDAluno <= 0 || jaExisteAluno(IDAluno));
        return IDAluno;
    }
}
