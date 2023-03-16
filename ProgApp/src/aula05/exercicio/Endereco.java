package aula05.exercicio;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;
    private int numero;

    public Endereco(String rua, String bairro, String cidade, String uf, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
    }

    public Endereco(String cidade, String uf) {
        this.cidade = cidade;
        this.uf = uf;
    }

    public Endereco(String cidade) {
        this.cidade = cidade;
    }

    public void printData() {
        System.out.println("\tCidade: " + this.cidade + "/" + this.uf);
        System.out.println("\tBairro: " + this.bairro);
        System.out.println("\tRua: " + this.rua + "\tNumero: " + this.numero);
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getUf() {
        return uf;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return this.cidade;
    }
}
