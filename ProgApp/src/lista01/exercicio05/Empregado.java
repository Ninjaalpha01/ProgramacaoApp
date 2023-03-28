package lista01.exercicio05;

public class Empregado extends Funcionario {
    private int carteiraTrabalho;

    public Empregado(String nome, String endereco, String dataInicio, String funcao, double salario,
            int carteiraTrabalho) {
        super(nome, endereco, dataInicio, funcao, salario);
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public void printData() {
        super.printData();
        System.out.println("Carteira de Trabalho: " + this.carteiraTrabalho);
    }

    public int getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(int carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    @Override
    public String toString() {
        return "Empregado {" +
                "carteiraTrabalho: " + this.carteiraTrabalho +
                ", funcao: '" + super.funcao + '\'' +
                ", salario: " + super.salario +
                ", nome: '" + super.nome + '\'' +
                ", endereco: '" + super.endereco + '\'' +
                ", dataInicio: '" + super.dataInicio + '\'' +
                '}';
    }
}
