package aula05.exercicio;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        generateFakeAdress();
    }

    private void generateFakeAdress() {
        this.endereco = new Endereco(
                "Laurentino Deco Fagundes",
                "Jd Carvalho",
                "Ponta Grossa",
                "PR",
                101);
    }

    public void printData() {
        System.out.println("Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nEndereco: ");
        this.endereco.printData();
    }
}
