package aula05.exercicio;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void calcularSalario() {
        System.out.println("Salario de " + super.nome + ": R$" + this.salario);
    }

    public void printData(){
        super.printData();
        System.out.println("Salario: R$" + this.salario);
    }
}
