package lista03.exercicio01;

public class Sessao {
    private String data;
    private String hora;
    private int numIngressos;
    private Sala sala;
    private Filme filme;

    public Sessao(String data, String hora, Sala sala, Filme filme) {
        this.data = data;
        this.hora = hora;
        this.sala = sala;
        this.filme = filme;
        this.numIngressos = sala.getCapacidadeMax();
    }

    public void venderIngressos(int numIngressos) {
        if (numIngressos > this.numIngressos) {
            System.out.println("Não há ingressos suficientes para a venda.");
        } else {
            this.numIngressos -= numIngressos;
            System.out.println("Venda efetuada.");
        }
    }

    public void exibirRelatorio() {
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.println("Sala: " + this.sala.getId());
        System.out.println("Filme: " + this.filme.getTitulo());
        System.out.println("Duração: " + this.filme.getDuracao() + " minutos"); 
        System.out.println("Ingressos disponíveis: " + this.numIngressos);
    }
}
