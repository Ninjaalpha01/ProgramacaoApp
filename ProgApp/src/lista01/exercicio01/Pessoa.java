package lista01.exercicio01;

public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected long rg;
    protected long cpf;

    public Pessoa(String nome, String dataNascimento, long rg, long cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
    }

    public void printData() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Pessoa: {\n" + "\tNome: " + this.nome
        + "\n\tData de Nascimento: " + this.dataNascimento
        + "\n\tRG: " + this.rg
        + "\n\tCPF: " + this.cpf + "\n}";
    }
}
