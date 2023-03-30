package lista03.exercicio01;

public class Sala {
    private int id;
    private int capacidadeMax;

    public Sala(int id, int capacidade) {
        this.id = id;
        this.capacidadeMax = capacidade;
    }

    public int getId() {
        return id;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }
}
