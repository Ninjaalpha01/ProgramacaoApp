package aula06.exercicio;

public class Losango extends Quadrilatero {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(String cor, double diagonalMaior, double diagonalMenor) {
        super(cor);
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area do losango: " + (diagonalMaior * diagonalMenor) / 2);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro do losango: " + (4 * diagonalMaior));
    }
}
