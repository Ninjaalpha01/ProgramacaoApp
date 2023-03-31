package lista03.exercicio04;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Laurentino Deco Fagundes", "101", "Jd Carvalho",
                "84015-780", "Ponta Grossa", "PR");
        Dependente dependente = new Dependente("João", "01/01/2000",
                "9999-9999", endereco);
        Socio socio = new Socio("Maria", "01/01/2000", "123.456.789-00",
                "9999-9999", endereco, dependente);

        Filme filme = new Filme("O Poderoso Chefão", 175, 20.99);
        Filme filme2 = new Filme("O Poderoso Chefão 2", 200, 25.99);

        filme.locarFilme(socio, 1, 20.99);
        System.out.println("-------------------------------------");

        filme.locarFilme(dependente, 23, 20.99);
        System.out.println("-------------------------------------");

        filme.devolverFilme(10);
        System.out.println("=====================================");

        filme.locarFilme(dependente, 23, 20.99);
        System.out.println("-------------------------------------");

        filme.devolverFilme(26);
        System.out.println("=====================================");
        filme.devolverFilme(30);
        System.out.println("-------------------------------------");

        filme2.locarFilme(dependente, 1, 25.99);
        System.out.println("-------------------------------------");

        filme2.devolverFilme(40);
        System.out.println("-------------------------------------");
        filme2.devolverFilme(30);
        System.out.println("=====================================");
    }
}
