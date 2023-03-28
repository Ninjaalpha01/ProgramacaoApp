package lista01.exercicio02;

public abstract class Imovel {
    protected String endereco;
    protected double valor;

    public Imovel(String endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public abstract void printData();
}
