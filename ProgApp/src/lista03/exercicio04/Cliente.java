package lista03.exercicio04;

public abstract class Cliente {
    protected String nome;
    protected String dataNascimento;
    protected String telefone;
    protected Endereco endereco;

    public Cliente(String nome, String dataNascimento, String telefone, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }
}
