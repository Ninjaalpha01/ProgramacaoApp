package lista01.exercicio05;

public class Teste {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "Rua 1", "01/01/2000", "Programador", 1000, 123);
        Funcionario funcionario = new Funcionario("Maria", "Rua 2", "02/02/2000", "Gerente", 2000);
        Estagiario estagiario = new Estagiario("Pedro", "Rua 3", "03/03/2000", "Estagiário", 500, 456);
        Autonomo autonomo = new Autonomo("José", "Rua 4", "04/04/2000", "Autônomo", 100, "46896868320");

        empregado.printData();
        System.out.println();
        funcionario.printData();
        System.out.println();
        estagiario.printData();
        System.out.println();
        autonomo.printData();
    }
}
