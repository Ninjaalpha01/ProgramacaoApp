package lista01.exercicio02;

public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(String endereco, double valor, double desconto) {
        super(endereco, valor);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValor() {
        return valor - desconto;
    }

    @Override
    public void printData() {
        System.out.println("Endereço: " + super.getEndereco());
        System.out.println("Valor: R$" + String.format("%.2f", this.getValor()));
        System.out.println("Desconto: " + this.getDesconto());
    }
}
