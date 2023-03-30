package aula03.Exercicio;

public class Ingresso {
    private double valor;
    private int identificacao;
    private boolean disponivel;

    public Ingresso(double valor, int identificacao, boolean disponivel) {
        this.valor = valor;
        this.identificacao = identificacao;
        this.disponivel = disponivel;
    }

    public void venderIngresso() {
        if (disponivel) {
            System.out.println("Vendendo ingresso...");
            disponivel = false;
        } else {
            System.out.println("Ingresso indisponível");
        }
    }

    public double getValor() {
        return valor;
    }

    public int getIdentificacao() {
        return identificacao;
    }
}
