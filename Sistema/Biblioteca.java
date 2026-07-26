package Sistema;

public class Biblioteca {

    // Controlam quantas posições dos arrays já estão preenchidas de fato
    private int quantidadeAlunos, quantidadeLivros;

    // Array da quantidade total de livros.
    private Livro[] acervo = new Livro[20];
    // Array da quantidade total de alunos.
    private Aluno[] alunos = new Aluno[10];

    // Setters e Getters dos atributos privados da biblioteca.
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

    // Adiciona livro se ainda tiver espaço no array
    public void adicionarLivro(Livro livro) {
        if (quantidadeLivros < 20) {
            acervo[quantidadeLivros] = livro;
            quantidadeLivros++;
        }
    }

    // Percorre só até quantidadeLivros pra não imprimir posição vazia
    public void listarLivros() {
        for (int i = 0; i < quantidadeLivros; i++) {

            /* Do array acervo, consiga o nome
            através do metodo get com a ajuda
            do posicionamento do contador i.
             */
            System.out.print(acervo[i].getNome());
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < quantidadeAlunos; i++) {

            /* Do array alunos, consiga o nome
            através do metodo get com a ajuda
            do posicionamento do contador i.
             */
            System.out.print(alunos[i].getNome());
        }
    }
}