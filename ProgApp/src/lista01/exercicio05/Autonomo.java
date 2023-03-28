package lista01.exercicio05;

public class Autonomo extends Prestador {
    private String cpf;

    public Autonomo(String nome, String endereco, String dataInicio, String tipoServico, double valorHora, String cpf) {
        super(nome, endereco, dataInicio, tipoServico, valorHora);
        this.cpf = cpf;
    }

    public void printData() {
        super.printData();
        System.out.println("CPF: " + this.cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Autonomo {" +
                "cpf: '" + this.cpf + '\'' +
                ", tipoServico: '" + super.tipoServico + '\'' +
                ", valorHora: " + super.valorHora +
                ", nome: '" + super.nome + '\'' +
                ", endereco: '" + super.endereco + '\'' +
                ", dataInicio: '" + super.dataInicio + '\'' +
                '}';
    }
}
