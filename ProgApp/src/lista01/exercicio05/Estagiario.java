package lista01.exercicio05;

public class Estagiario extends Funcionario {
    private int ciee;

    public Estagiario(String nome, String endereco, String dataInicio, String funcao, double salario, int ciee) {
        super(nome, endereco, dataInicio, funcao, salario);
        this.ciee = ciee;
    }

    public void printData() {
        super.printData();
        System.out.println("CIEE: " + this.ciee);
    }

    public int getCiee() {
        return ciee;
    }

    public void setCiee(int ciee) {
        this.ciee = ciee;
    }

    @Override
    public String toString() {
        return "Estagiario {" +
                "ciee: " + this.ciee +
                ", funcao: '" + super.funcao + '\'' +
                ", salario: " + super.salario +
                ", nome: '" + super.nome + '\'' +
                ", endereco: '" + super.endereco + '\'' +
                ", dataInicio: '" + super.dataInicio + '\'' +
                '}';
    }
}
