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

    public void adicionarlivro(Livro livro) {
        if (quantidadeLivros < 20) {
            acervo[quantidadeLivros] = livro;
            quantidadeLivros++;
        }


    }

}
