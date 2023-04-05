package hillclimbing;

import java.util.ArrayList;

public class HillClimbing {
    private ArrayList<Integer> rainhas;
    private ArrayList<Integer> melhorSolucao;
    private int melhorPontuacao;

    public HillClimbing(ArrayList<Integer> rainhas) {
        this.rainhas = rainhas;
        this.melhorSolucao = rainhas;
        this.melhorPontuacao = 50;
    }

    private ArrayList<ArrayList<Integer>> encontrarVizinhos(ArrayList<Integer> solucao) {
        ArrayList<ArrayList<Integer>> vizinhos = new ArrayList<ArrayList<Integer>>();

        for (int peca = 0; peca < 8; peca++) {
            ArrayList<Integer> vizinhosPeca = vizinhoPeca(solucao.indexOf(peca));
            for (Integer vizinho : vizinhosPeca) {
                ArrayList<Integer> solucaoVizinho = new ArrayList<Integer>(solucao);
                solucaoVizinho.set(peca, vizinho);
                vizinhos.add(solucaoVizinho);
            }
        }

        return vizinhos;
    }

    private ArrayList<Integer> vizinhoPeca(Integer peca) {
        ArrayList<Integer> vizinhos = new ArrayList<Integer>();

        for (int i = 0; i < 8; i++) {
            if (i != peca)
                vizinhos.add(i);
        }

        return vizinhos;
    }

    private int calcularPontuacao(ArrayList<Integer> solucao) {
        int pontuacao = 0;

        for (int i = 0; i < solucao.size(); i++) {
            for (int j = i + 1; j < solucao.size(); j++) {
                if (solucao.get(i) == solucao.get(j))
                    pontuacao++;
                else if (Math.abs(solucao.get(i) - solucao.get(j)) == Math.abs(i - j))
                    pontuacao++;
            }
        }

        return pontuacao;
    }

    public void calcularHillClimbing() {
        ArrayList<Integer> solucaoAtual = this.rainhas;
        int pontuacaoAtual = calcularPontuacao(solucaoAtual);

        System.out.println("Solucoes:");

        while (true) {
            ArrayList<ArrayList<Integer>> vizinhos = encontrarVizinhos(solucaoAtual);

            for (ArrayList<Integer> solucao : vizinhos) {
                int pontuacao = calcularPontuacao(solucao);

                System.out.println("\t" + solucao + " - " + pontuacao);

                if (pontuacao < melhorPontuacao) {
                    this.melhorSolucao = solucao;
                    melhorPontuacao = pontuacao;
                }
            }

            if (melhorPontuacao < pontuacaoAtual) {
                solucaoAtual = this.melhorSolucao;
                pontuacaoAtual = melhorPontuacao;
            } else
                break;
        }

        System.out.println("\nMelhor Solução: " + this.melhorSolucao);
        System.out.println("Melhor Pontuação: " + this.melhorPontuacao);
    }

    public ArrayList<Integer> getMelhorSolucao() {
        return this.melhorSolucao;
    }
}
