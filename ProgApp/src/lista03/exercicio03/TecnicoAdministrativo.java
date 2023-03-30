package lista03.exercicio03;

import java.util.ArrayList;

public class TecnicoAdministrativo {
    private String registro;
    private String nome;
    private String dataAdimissao;
    private double salarioBase;
    private double adicionalNoturno;
    private ArrayList<Processo> processos;

    public TecnicoAdministrativo(String registro, String nome, String dataAdimissao, double salarioBase, double adicionalNoturno) {
        this.registro = registro;
        this.nome = nome;
        this.dataAdimissao = dataAdimissao;
        this.salarioBase = salarioBase;
        this.adicionalNoturno = adicionalNoturno;
        this.processos = new ArrayList<Processo>();
    }

    public void addProcesso(Processo processo) {
        this.processos.add(processo);
    }

    public double calcularSalario() {
        return this.salarioBase + this.adicionalNoturno;
    }

    public void printData() {
        System.out.println("Registro: " + this.registro);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de admissão: " + this.dataAdimissao);
        System.out.println("Salário total: " + this.calcularSalario());
        System.out.println("Processos: ");
        for (Processo processo : processos) {
            processo.printData();
        }
    }
}
