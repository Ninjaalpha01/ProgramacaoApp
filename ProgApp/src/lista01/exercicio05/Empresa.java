package lista01.exercicio05;

public class Empresa extends Prestador {
    private String cnpj;

    public Empresa(String nome, String endereco, String dataInicio, String tipoServico, double valorHora, String cnpj) {
        super(nome, endereco, dataInicio, tipoServico, valorHora);
        this.cnpj = cnpj;
    }

    public void printData() {
        super.printData();
        System.out.println("CNPJ: " + this.cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Empresa {" +
                "cnpj: '" + this.cnpj + '\'' +
                ", tipoServico: '" + super.tipoServico + '\'' +
                ", valorHora: " + super.valorHora +
                ", nome: '" + super.nome + '\'' +
                ", endereco: '" + super.endereco + '\'' +
                ", dataInicio: '" + super.dataInicio + '\'' +
                '}';
    }
}
