package lista03.exercicio03;

public class Processo {
    private int numero;
    private String dataCriacao;
    private String descricao;

    public Processo(int numero, String dataCriacao, String descricao) {
        this.numero = numero;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
    }

    public void printData() {
        System.out.println("\tNúmero: " + this.numero);
        System.out.println("\tData de criação: " + this.dataCriacao);
        System.out.println("\tDescrição: " + this.descricao);
    }
}
