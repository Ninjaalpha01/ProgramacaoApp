package lista03.exercicio03;

import java.util.ArrayList;

public class Professor {
    private String registro;
    private String nome;
    private String titulacao; // mestre ou doutor
    private String dataAdimissao;
    private double salarioBase;
    private double gratificacao;
    private ArrayList<Disciplina> disciplinas;

    public Professor(String registro, String nome, String titulacao, String dataAdimissao, double salarioBase) {
        this.registro = registro;
        this.nome = nome;
        this.titulacao = titulacao;
        this.dataAdimissao = dataAdimissao;
        this.salarioBase = salarioBase;
        this.disciplinas = new ArrayList<Disciplina>();
        this.definirGratificacao();
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    private void definirGratificacao() {
        if (this.titulacao.equals("mestre"))
            this.gratificacao = 1000;
        else if (this.titulacao.equals("doutor"))
            this.gratificacao = 2000;
    }

    private double calcularSalario() {
        return this.salarioBase + this.gratificacao;
    }

    public void printData() {
        System.out.println("Registro: " + this.registro);
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Data de admissão: " + this.dataAdimissao);
        System.out.println("Salário total: " + this.calcularSalario());
        System.out.println("Disciplinas: ");
        for (Disciplina disciplina : disciplinas) {
            disciplina.printData();
        }
    }
}
