package lista01.exercicio03;

public class Ingresso {
    protected double valor;
    protected String tipo;

    public Ingresso(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public void imprimirDadosIngresso() {
        System.out.println("Tipo: " + this.tipo);
    }
}
