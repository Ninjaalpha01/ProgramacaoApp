package lista01.exercicio04;

public class Data {
    protected int dia;
    protected int mes;
    protected int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int mes, int ano) {
        this.dia = 1;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia) {
        this.dia = dia;
        this.mes = 1;
        this.ano = 2019;
    }

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2019;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
