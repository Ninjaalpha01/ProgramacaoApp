package aula08.exercicios;

public class Pessoa {
    private String nome;
    private String cpf;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private int numero;
    private int idade;

    public Pessoa(String nome, String cpf, String rua, String bairro, String cidade, String estado, String cep, int numero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;
        this.idade = idade;
    }

    public Pessoa(String nome, String cpf, String cidade, int numero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.cidade = cidade;
        this.numero = numero;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade
                + ", estado=" + estado + ", cep=" + cep + ", numero=" + numero + ", idade=" + idade + "]";
    }
}
