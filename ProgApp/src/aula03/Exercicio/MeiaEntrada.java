package aula03.Exercicio;

public class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, int identificacao, boolean disponivel) {
        super(valor, identificacao, disponivel);
    }

    public double calcularValor() {
        return super.getValor() / 2;
    }
}
