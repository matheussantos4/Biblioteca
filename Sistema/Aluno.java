package Sistema;

public class Aluno {
    private String nome;
    private int numPessoa;

    public int getNumPessoa() {
        return numPessoa;
    }

    public void setNumPessoa(int numPessoa) {
        if (numPessoa > 0) {
            this.numPessoa = numPessoa;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public Aluno(String nome, int numPessoa) {
        setNome(nome);
        setNumPessoa(numPessoa);
    }
}
