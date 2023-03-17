package aula06.exercicio;

public abstract class Quadrilatero {
    protected String cor;

    public Quadrilatero(String cor) {
        this.cor = cor;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();
}
