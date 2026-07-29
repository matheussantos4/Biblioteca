package Sistema;

import java.util.ArrayList;

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

    // Remove aluno.
    public void removerAluno(int ID) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNumPessoa() == ID) {
                alunos.remove(i);
            }
        }
    }

    // Remove livro.
    public void removerLivro(int ID) {
        for (int i = 0; i < acervo.size(); i++) {
            if (acervo.get(i).getNumCadastro() == ID) {
                acervo.remove(i);
            }
        }
    }

    // Percorre o array completo de acordo com oque há nele.
    public void listarLivros() {
        for (int i = 0; i < acervo.size(); i++) {

            /* Do array acervo, consiga o nome
            através do metodo get com a ajuda
            do posicionamento do contador i.
             */

            System.out.printf(" ID:" + (acervo.get(i).getNumCadastro()) + " Nome:" + acervo.get(i).getNome() + "%n");

        }
    }

    public void listarAlunos() {
        for (int i = 0; i < alunos.size(); i++) {

            /* Do array alunos, consiga o nome
            através do metodo get com a ajuda
            do posicionamento do contador i.
             */
            System.out.printf(" ID:" + alunos.get(i).getNumPessoa() + " Nome:" + alunos.get(i).getNome() + " %n");
        }
    }
}