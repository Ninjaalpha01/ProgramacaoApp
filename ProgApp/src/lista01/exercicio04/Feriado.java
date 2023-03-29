package lista01.exercicio04;

public class Feriado extends Data {
    private String descricao;

    public Feriado(int dia, int mes, int ano, String descricao) {
        super(dia, mes, ano);
        this.descricao = descricao;
    }

    public Feriado(String descricao) {
        super();
        this.descricao = descricao;
    }

    public Feriado(){
        super();
        this.descricao = "Feriado";
    }

    public String toString() {
        return String.format("%s - %s", super.toString(), this.descricao);
    }
}
