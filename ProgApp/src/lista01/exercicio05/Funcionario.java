package lista01.exercicio05;

public class Funcionario extends Colaborador {
    protected String funcao;
    protected double salario;

    public Funcionario(String nome, String endereco, String dataInicio, String funcao, double salario) {
        super(nome, endereco, dataInicio);
        this.funcao = funcao;
        this.salario = salario;
    }

    public void printData() {
        super.printData();
        System.out.println("Função: " + this.funcao);
        System.out.println("Salário: " + this.salario);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "funcao: '" + this.funcao + '\'' +
                ", salario: " + this.salario +
                ", nome: '" + super.nome + '\'' +
                ", endereco: '" + super.endereco + '\'' +
                ", dataInicio: '" + super.dataInicio + '\'' +
                '}';
    }
}
