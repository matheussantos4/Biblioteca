package Sistema;

public class Livro {
    private String nome;
    private int numCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
        this.nome = nome;
        }
    }

    public int getNumCadastro() {
        return numCadastro;
    }

    public void setNumCadastro(int numCadastro) {
        if (numCadastro > 0) {
        this.numCadastro = numCadastro; }
    }

    public Livro (String nome, int numCadastro) {
        setNome(nome);
        setNumCadastro(numCadastro);

    }
}
