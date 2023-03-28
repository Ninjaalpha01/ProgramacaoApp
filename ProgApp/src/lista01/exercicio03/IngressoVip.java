package lista01.exercicio03;

public class IngressoVip extends Ingresso {
    private double valorAdicional;
    private String localizacao; //camarote superior, inferior

    public IngressoVip(double valor, String tipo, double valorAdicional, String localizacao) {
        super(valor, tipo);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    private double calcularValorIngressoVip() {
        return this.valor + this.valorAdicional;
    }

    public void imprimirDadosIngresso() {
        super.imprimirDadosIngresso();
        System.out.println("Localização: " + this.localizacao);
        System.out.printf("Valor total: R$%.2f\n", this.calcularValorIngressoVip());
    }
}
