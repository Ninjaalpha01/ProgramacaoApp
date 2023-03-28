package lista01.exercicio05;

public class Colaborador {
    protected String nome;
    protected String endereco;
    protected String dataInicio;

    public Colaborador(String nome, String endereco, String dataInicio) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
    }

    public void printData() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Data de início: " + this.dataInicio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    @Override
    public String toString() {
        return "Colaborador {" +
                "nome: '" + this.nome + '\'' +
                ", endereco: '" + this.endereco + '\'' +
                ", dataInicio: '" + this.dataInicio + '\'' +
                '}';
    }
}
