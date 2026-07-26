package Sistema;

public class Aluno {
    private String nome;
    private int numPessoa;

    public int getNumPessoa() {
        return numPessoa;
    }

    // Só aceita número de cadastro positivo
    public void setNumPessoa(int numPessoa) {
        if (numPessoa > 0) {
            this.numPessoa = numPessoa;
        }
    }

    public String getNome() {
        return nome;
    }

    // Evita nome nulo ou vazio
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    // Construtor já valida tudo passando pelos setters
    public Aluno(String nome, int numPessoa) {
        setNome(nome);
        setNumPessoa(numPessoa);
    }
}