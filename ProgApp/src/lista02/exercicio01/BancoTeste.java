package lista02.exercicio01;

public class BancoTeste {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "123.456.789-00");
        Banco banco = new Banco();

        banco.adicionarConta("Gabriel", "123.456.789-00");
        banco.realizarDeposito(1, 500);
        banco.verificarSaldo(1);
        banco.realizarSaque(1, 100);
        banco.verificarSaldo(1);
        System.out.println("====================================");

        banco.adicionarConta(joao);
        banco.realizarDeposito(2, 1100);
        banco.verificarSaldo(2);
        banco.realizarSaque(2, 2000);
        banco.verificarSaldo(2);
        
    }
}
