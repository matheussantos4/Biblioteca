package Sistema;

import java.util.ArrayList;

public class Biblioteca {

    // Array da quantidade total de livros.
    private ArrayList<Livro> acervo = new ArrayList<>();
    // Array da quantidade total de alunos.
    private ArrayList<Aluno> alunos = new ArrayList<>();

    // Adiciona aluno se ainda tiver espaço no array
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Adiciona livro se ainda tiver espaço no array
    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void removerLivro(Livro livro) {
        acervo.remove(livro);
    }

    // Percorre só até quantidadeLivros pra não imprimir posição vazia
    public void listarLivros() {
        for (int i = 0; i < acervo.size(); i++) {

            /* Do array acervo, consiga o nome
            através do metodo get com a ajuda
            do posicionamento do contador i.
             */
            System.out.printf(acervo.get(i).getNome());
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < alunos.size(); i++) {

            /* Do array alunos, consiga o nome
            através do metodo get com a ajuda
            do posicionamento do contador i.
             */
            System.out.printf(alunos.get(i).getNome());
        }
    }
}