package lista03.exercicio01;

public class Teste {
    public static void main(String[] args) {
        Sala sala = new Sala(1, 100);
        Filme filme = new Filme("O Poderoso Chefão", 175);
        Sessao sessao = new Sessao("01/01/2020", "20:00", sala, filme);
        
        sessao.exibirRelatorio();
        sessao.venderIngressos(50);
        System.out.println("=====================================");

        sessao.exibirRelatorio();
        sessao.venderIngressos(50);
        System.out.println("=====================================");

        sessao.exibirRelatorio();
        sessao.venderIngressos(50);
        System.out.println("=====================================");
        
        sessao.exibirRelatorio();
    }
}
