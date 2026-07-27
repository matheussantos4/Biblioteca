package Sistema;

public class Livro {
    private String nome;
    private int numCadastro;

    public String getNome() {
        return nome;
    }

    // Evita nome nulo ou vazio
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public int getNumCadastro() {
        return numCadastro;
    }

    // Só aceita número de cadastro positivo
    public void setNumCadastro(int numCadastro) {
        if (numCadastro >= 0 && numCadastro <= 20) {
            this.numCadastro = numCadastro;
        }
    }

    // Construtor já valida tudo passando pelos setters
    public Livro(String nome, int numCadastro) {
        setNome(nome);
        setNumCadastro(numCadastro);
    }
}