package Sistema;

public class Biblioteca {

    // Controlam quantas posições dos arrays já estão preenchidas de fato
    private int quantidadeAlunos, quantidadeLivros;

    private Livro[] acervo = new Livro[20];
    private Aluno[] alunos = new Aluno[10];

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }

    // Adiciona aluno se ainda tiver espaço no array
    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < 10) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        }
    }

    // Mesma lógica, só que pro acervo de livros
    public void adicionarLivro(Livro livro) {
        if (quantidadeLivros < 20) {
            acervo[quantidadeLivros] = livro;
            quantidadeLivros++;
        }
    }

    // Percorre só até quantidadeLivros pra não imprimir posição vazia
    public void listarLivros() {
        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.print(acervo[i].getNome());
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print(alunos[i].getNome());
        }
    }
}