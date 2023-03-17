package aula06.exercicio;

import java.util.Scanner;

public class QuadrilateroTeste {
    public static void main(String[] args) {
        Scanner inKeyboard = new Scanner(System.in);
        
        Quadrilatero forma = null;

        System.out.print("Digite qual o quadrilatero: ");
        String quadrilatero = inKeyboard.nextLine();

        System.out.print("Digite a cor dele: ");
        String cor = inKeyboard.nextLine();

        switch (quadrilatero){
            case "retangulo":
            {
                System.out.print("Digite a base: ");
                double base = inKeyboard.nextDouble();
                System.out.print("Digite a altura: ");
                double altura = inKeyboard.nextDouble();
                forma = new Retangulo(cor, base, altura);
                break;
            }
            case "quadrado":
            {
                System.out.print("Digite o lado: ");
                double lado = inKeyboard.nextDouble();
                forma = new Quadrado(cor, lado);
                break;
            }
            case "losango":
            {
                System.out.print("Digite a diagonal maior: ");
                double diagonalMaior = inKeyboard.nextDouble();
                System.out.print("Digite a diagonal menor: ");
                double diagonalMenor = inKeyboard.nextDouble();
                forma = new Losango(cor, diagonalMaior, diagonalMenor);
                break;
            }
        }
        quadrilatero = quadrilatero.substring(0, 1).toUpperCase() + quadrilatero.substring(1);
        System.out.println(quadrilatero + " de cor " + forma.cor);
        forma.calcularArea();
        forma.calcularPerimetro();

        inKeyboard.close();
    }
}
