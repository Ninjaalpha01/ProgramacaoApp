package Aestrela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Busca {
	
	private Map<No, No> caminho = new HashMap<No, No>();
	
	public void buscaAEstrela(No noInicial, No noFinal) {
    	No noAtual = noInicial;
    	ArrayList<No> caminhosPossiveis = new ArrayList<No>();
    	caminhosPossiveis.add(noAtual);
    	No noMenorDistancia = noAtual;
    	
    	while(!noAtual.getNome().equals(noFinal.getNome())) {
    		//System.out.println("No atual: "+ noAtual);
    		adicionarVizinhosNaListaDeCaminhosPossiveis(caminhosPossiveis, noAtual, noFinal);
    		removerNoJaVizitado(caminhosPossiveis);
        	noAtual = pegarMenorDistanciaDaListaDeCaminhosPossiveis(caminhosPossiveis, noMenorDistancia);
        	//System.out.println(caminhosPossiveis);
    	}
    	mostrarCaminho(noAtual, noFinal, caminhosPossiveis);
    }
	
	private void adicionarVizinhosNaListaDeCaminhosPossiveis(ArrayList<No> caminhosPossiveis, No noAtual, No noFinal) {
		for (No no : noAtual.vizinhos) {
			if(!no.isJaVisitado() && !no.isJaVisto()) {
				no.setDistanciaManhattan(no.calculaDistanciaManhattan(noFinal));
				no.setJaVisto(true);
				caminhosPossiveis.add(no);
				
				caminho.put(no, noAtual); //  Serve para printar o caminhhho final
			}
		}
		noAtual.setJaVisitado(true);
	}
	
	private void removerNoJaVizitado(ArrayList<No> caminhosPossiveis) {
		for (int i = 0; i < caminhosPossiveis.size(); i++) {
			if(caminhosPossiveis.get(i).isJaVisitado()) 
				caminhosPossiveis.remove(i);
		}
	}
	
	private No pegarMenorDistanciaDaListaDeCaminhosPossiveis(ArrayList<No> caminhosPossiveis, No noMenorDistancia) {
		if(caminhosPossiveis.size() == 1) {
			noMenorDistancia = caminhosPossiveis.get(0);
		}else {
			noMenorDistancia = caminhosPossiveis.get(0);
			for(int i = 1; i < caminhosPossiveis.size(); i++) {
				if(caminhosPossiveis.get(i).getDistanciaManhattan() < noMenorDistancia.getDistanciaManhattan()) 
					noMenorDistancia = caminhosPossiveis.get(i);
			}
		}
		return noMenorDistancia;
	}
	
	private void mostrarCaminho(No noAtual, No noFinal, ArrayList<No> caminhosPossiveis) {
		while(caminhosPossiveis.size() != 0) {
    		if (noAtual == noFinal) {
                ArrayList<No> caminhoFinal = new ArrayList<No>();
                caminhoFinal.add(noAtual);
                while (caminho.containsKey(noAtual)) {
                	noAtual = caminho.get(noAtual);
                    caminhoFinal.add(noAtual);
                }
                Collections.reverse(caminhoFinal);
                System.out.println("Caminho encontrado: " + caminhoFinal);
                System.out.println("Custo do caminho final encontrado: " + (caminhoFinal.size() - 1));
                System.out.println("Custo de todo o percurso feito pelo algoritmo: " + caminho.size());
                System.out.println("Todos os caminhos vistos: " + caminho);
                return;
            }
    	}
	}
}