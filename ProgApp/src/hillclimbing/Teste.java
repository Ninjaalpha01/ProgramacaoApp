package hillclimbing;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Integer> rainhas = new ArrayList<Integer>();
        rainhas.add(2);
		rainhas.add(2);
		rainhas.add(5);
		rainhas.add(4);
		rainhas.add(0);
		rainhas.add(5);
		rainhas.add(6);
		rainhas.add(1);

        System.out.println("Solucao de entrada: " + rainhas + "\n");

        HillClimbing alg = new HillClimbing(rainhas);
        alg.calcularHillClimbing();
    }
}
