package lista02.exercicio01;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<Conta>();
    }

    public void adicionarConta(Cliente cliente) {
        Conta conta = new Conta(this.contas.size() + 1, cliente);
        this.contas.add(conta);
    }

    public void adicionarConta(String nome, String cpf) {
        Conta conta = new Conta(this.contas.size() + 1, new Cliente(nome, cpf));
        this.contas.add(conta);
    }

    public void realizarSaque(int numConta, double valor) {
        for (Conta conta : this.contas) {
            if (conta.getNumeroConta() == numConta) {
                conta.sacar(valor);
                System.out.println();
            }
        }
    }

    public void realizarDeposito(int numConta, double valor) {
        for (Conta conta : this.contas) {
            if (conta.getNumeroConta() == numConta) {
                conta.depositar(valor);
                System.out.println();
            }
        }
    }

    public void verificarSaldo(int numConta) {
        for (Conta conta : this.contas) {
            if (conta.getNumeroConta() == numConta) {
                System.out.printf("Saldo: R$%.2f\n", conta.getSaldo());
            }
        }
    }
}
