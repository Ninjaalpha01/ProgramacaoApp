package lista03.exercicio04;

import lista03.exercicio04.exceptions.DiaInvalidoException;
import lista03.exercicio04.exceptions.PrecoDivergenteException;

public class Filme {
    private String titulo;
    private int duracao;
    private double valor;
    private double valorMulta;
    private int diaLocacao;
    private int diaPrevisto;
    private int diaDevolucao;
    private Cliente cliente;
    private boolean disponivel;

    public Filme(String titulo, int duracao, double valor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.valor = valor;
        this.disponivel = true;
    }

    public void locarFilme(Cliente cliente, int diaLocacao, double preco) throws DiaInvalidoException, PrecoDivergenteException  {
        if (diaLocacao <= 0 || diaLocacao > 31) {
            throw new DiaInvalidoException();
        } 
        if (this.disponivel) {
            if (this.valor != preco)
                throw new PrecoDivergenteException();
            this.cliente = cliente;
            this.diaLocacao = diaLocacao;
            this.diaPrevisto = diaLocacao + 3;
            this.disponivel = false;
            System.out.println(this.titulo + " locado com sucesso.");
        } else
            System.out.println("Filme indisponível.");
    }

    public void devolverFilme(int diaDevolucao) throws DiaInvalidoException {
        if (!this.disponivel) {
            if (diaDevolucao > 0 && diaDevolucao <= 31) {
                this.diaDevolucao = diaDevolucao;
                this.disponivel = true;
                if (diaDevolucao > diaPrevisto) {
                    this.valorMulta = (diaDevolucao - diaPrevisto) * 2;
                    System.out.println("Filme devolvido com atraso.");
                    printRelatorio();
                } else
                    System.out.println("Filme devolvido com sucesso.");
                return;
            }
            throw new DiaInvalidoException();
        }
        System.out.println("Filme já devolvido.");
    }

    private void printRelatorio() {
        System.out.println("Relatório de locação:");
        System.out.println("Filme: " + this.titulo);
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Data de locação: " + this.diaLocacao);
        System.out.println("Data prevista de devolução: " + this.diaPrevisto);
        System.out.println("Data de devolução: " + this.diaDevolucao);
        System.out.println("Valor do filme: R$" + String.format("%.2f", this.valor));
        System.out.println("Valor da multa: R$" + String.format("%.2f", this.valorMulta));
        System.out.println("Valor Total: R$" + String.format("%.2f", this.valor + this.valorMulta));
    }

    public int getDuracao() {
        return duracao;
    }
}
