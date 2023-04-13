package Aestrela;

import java.util.ArrayList;
import java.util.List;

public class No {
    
    private String nome;
    private boolean jaVisitado;
    private boolean jaVisto;
    public boolean isJaVisto() {
        return jaVisto;
    }

    public void setJaVisto(boolean jaVisto) {
        this.jaVisto = jaVisto;
    }

    public List<No> vizinhos;
    private int distanciaManhattan; // Distância de Manhattan até o destino

    public No(String nome) {
        this.nome = nome;
        this.jaVisitado = false;
        this.jaVisto = false;
        this.vizinhos = new ArrayList<>();
        this.distanciaManhattan = 0;
    }

    public String getNome() {
        return nome;
    }

    public boolean isJaVisitado() {
        return jaVisitado;
    }

    public void setJaVisitado(boolean jaVisitado) {
        this.jaVisitado = jaVisitado;
    }

    public List<No> getVizinhos() {
        return vizinhos;
    }

    public void addVizinho(No vizinho) {
        this.vizinhos.add(vizinho);
    }

    public int getDistanciaManhattan() {
        return distanciaManhattan;
    }

    public void setDistanciaManhattan(int distanciaManhattan) {
        this.distanciaManhattan = distanciaManhattan;
    }

    public int calculaDistanciaManhattan(No destino) {
        int distanciaX = Math.abs(destino.getCoordenadaX(destino.nome) - this.getCoordenadaX(this.nome));
        int distanciaY = Math.abs(destino.getCoordenadaY(destino.nome) - this.getCoordenadaY(this.nome));
        System.out.println("Distancia do " + this +"para o " + destino + (distanciaX + distanciaY));
        return distanciaX + distanciaY;
    }

    public int getCoordenadaX(String nome) {
        return Integer.parseInt(nome.substring(1, 2));
    }

    public int getCoordenadaY(String nome) {
        return Integer.parseInt(nome.substring(2, 3));
    }

    @Override
    public String toString() {
        return nome + " ";
    }

}