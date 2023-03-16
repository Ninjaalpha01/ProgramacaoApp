package aula05.exemplo;

public class Veiculo {
    protected String modelo;
    protected String fabricante;
    protected String combustivel;
    protected int numPassageiros;
    protected int ano;

    public Veiculo(String modelo, String fabricante, String combustivel, int numPassageiros, int ano) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.combustivel = combustivel;
        this.numPassageiros = numPassageiros;
        this.ano = ano;
    }

    public void abastecer() {
        System.out.println(this.fabricante + " " + this.modelo + " esta abastecendo");
    }
}
