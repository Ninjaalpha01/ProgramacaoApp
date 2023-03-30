package lista03.exercicio03;

public class Disciplina {
    private String codigo;
    private String nome;
    private String ementa;
    private int cargaHoraria;

    public Disciplina(String codigo, String nome, String ementa, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
    }

    public void printData() {
        System.out.println("\tCódigo: " + this.codigo);
        System.out.println("\tNome: " + this.nome);
        System.out.println("\tEmenta: " + this.ementa);
        System.out.println("\tCarga horária: " + this.cargaHoraria);
    }
}
