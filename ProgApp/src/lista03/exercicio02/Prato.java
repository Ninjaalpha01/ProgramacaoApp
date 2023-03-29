package lista03.exercicio02;

public class Prato {
    private int numero;
    private String nome;
    private String tipo; //entrada, principal, sobremesa
    private String descricao;
    private double preco;

    public Prato(int numero, String nome, String tipo, String descricao, double preco) {
        this.numero = numero;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumero() {
        return numero;
    }
}
