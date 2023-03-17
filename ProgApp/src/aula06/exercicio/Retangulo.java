package aula06.exercicio;

public class Retangulo extends Quadrilatero{
    private double base;
    private double altura;

    public Retangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area do retangulo: " + (base * altura));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro do retangulo: " + (2 * (base + altura)));
    }
}
