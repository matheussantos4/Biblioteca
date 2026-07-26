package Sistema;

public class Biblioteca {

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

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < 10) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        }
    }

    public void adicionarLivro(Livro livro) {
        if (quantidadeLivros < 20) {
            acervo[quantidadeLivros] = livro;
            quantidadeLivros++;
        }
    }

    public void listarLivros() {
        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.print(acervo[i].getNome());
        }
    }
}
