package lista01.exercicio05;

public class Prestador extends Colaborador {
    protected String tipoServico;
    protected double valorHora;

    public Prestador(String nome, String endereco, String dataInicio, String tipoServico, double valorHora) {
        super(nome, endereco, dataInicio);
        this.tipoServico = tipoServico;
        this.valorHora = valorHora;
    }

    public void printData() {
        super.printData();
        System.out.println("Tipo de serviço: " + this.tipoServico);
        System.out.println("Valor da hora: " + this.valorHora);
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Prestador {" +
                "tipoServico: '" + this.tipoServico + '\'' +
                ", valorHora: " + this.valorHora +
                ", nome: '" + super.nome + '\'' +
                ", endereco: '" + super.endereco + '\'' +
                ", dataInicio: '" + super.dataInicio + '\'' +
                '}';
    }
}
