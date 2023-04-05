package hillclimbing;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class HillClimbing {
    private ArrayList<Integer> rainhas;
    private ArrayList<Integer> melhorSolucao;
    private int melhorPontuacao;

    public HillClimbing(ArrayList<Integer> rainhas) {
        this.rainhas = rainhas;
        ArrayList<Integer> melhorSolucao = new ArrayList<Integer>();
        int melhorPontuacao = 50;
    }

    private ArrayList<ArrayList<Integer>> encontrarVizinhos(ArrayList<Integer> solucao) {
        ArrayList<ArrayList<Integer>> vizinhos = new ArrayList<ArrayList<Integer>>();

        for (int rainha : solucao) {
            ArrayList<Integer> vetor = solucao;
            for (int i = 0; i < 8; i++)
                if (rainha != i) {
                    vetor.set(rainha, i);
                    vizinhos.add(vetor);
                }
        }

        return vizinhos;
    }

    private int calcularPontuacao(ArrayList<Integer> solucao) {
        int pontuacao = 0;
        for (int linha : solucao)
            for (int coluna : solucao) {
                if (linha == coluna)
                    pontuacao++;
            }

        return pontuacao;
    }

    public void calcularHillClimbing() {
        ArrayList<Integer> solucaoAtual = this.rainhas;
        int pontuacaoAtual = calcularPontuacao(solucaoAtual);

        while (true) {
            ArrayList<ArrayList<Integer>> vizinhos = encontrarVizinhos(solucaoAtual);

            for (ArrayList<Integer> solucao : vizinhos) {
                int pontuacao = calcularPontuacao(solucao);

                if (pontuacao > melhorPontuacao) {
                    melhorSolucao = solucao;
                    melhorPontuacao = pontuacao;
                }
            }

            if (melhorPontuacao > pontuacaoAtual) {
                solucaoAtual = melhorSolucao;
                pontuacaoAtual = melhorPontuacao;
            } else
                break;
        }
    }

    public ArrayList<Integer> getMelhorSolucao() {
        return this.melhorSolucao;
    }
}
