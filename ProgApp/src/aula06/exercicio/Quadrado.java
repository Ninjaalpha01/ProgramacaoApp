package aula06.exercicio;

public class Quadrado extends Quadrilatero {
    private double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area do quadrado: " + (lado * lado));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro do quadrado: " + (4 * lado));
    }
}
