package aula02;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("gabriel");

        conta.depositar(3500.0);
        System.out.println(conta.toString());

        conta.sacar(3000);
        System.out.println(conta.toString());

        conta.sacar(1000);
    }
}
