package lista01.exercicio02;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(String endereco, double valor, double adicional) {
        super(endereco, valor);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public double getValor() {
        return valor + adicional;
    }

    @Override
    public void printData() {
        System.out.println("Endereço: " + super.getEndereco());
        System.out.println("Valor: R$" + String.format("%.2f", this.getValor()));
        System.out.println("Adicional: " + String.format("%.2f", this.getAdicional()));
    }
}
