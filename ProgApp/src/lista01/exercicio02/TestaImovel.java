package lista01.exercicio02;

public class TestaImovel {
    public static void main(String[] args) {
        ImovelNovo apartamento = new ImovelNovo("Rua Laurentino Deco Fagundes", 40000, 15000);
        ImovelVelho casa = new ImovelVelho("Rua João de Barro", 20000, 5000);

        System.out.println("Apartamento:");
        apartamento.printData();
        System.out.println("\nCasa:");
        casa.printData();
    }
}
