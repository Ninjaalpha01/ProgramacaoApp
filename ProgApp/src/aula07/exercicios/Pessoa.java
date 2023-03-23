package aula07.exercicios;

public class Pessoa {
    private String nome;
    private String rua;
    private String cidade;
    private String bairro;
    private String estado;
    private int numero;
    private int cpf;
    private int idade;
    private int cep;

    public Pessoa(String nome, String rua, String cidade, String bairro, String estado, int numero, int cpf, int idade, int cep) {
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.numero = numero;
        this.cpf = cpf;
        this.idade = idade;
        this.cep = cep;
    }
}
