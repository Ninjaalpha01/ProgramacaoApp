package lista02.exercicio01;

import java.util.ArrayList;

import lista02.exercicio01.exceptions.ContaNaoEncontradaException;
import lista02.exercicio01.exceptions.ValorNaoPositivoException;

public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<Conta>();
    }

    private Conta findConta(int numConta) {
        for (Conta conta : this.contas) {
            if (conta.getNumeroConta() == numConta)
                return conta;
        }
        return null;
    }

    public void adicionarConta(Cliente cliente) {
        Conta conta = new Conta(this.contas.size() + 1, cliente);
        this.contas.add(conta);
    }

    public void adicionarConta(String nome, String cpf) {
        Conta conta = new Conta(this.contas.size() + 1, new Cliente(nome, cpf));
        this.contas.add(conta);
    }

    public void realizarSaque(int numConta, double valor) throws ContaNaoEncontradaException {
        try {
            Conta conta = findConta(numConta);
            if (conta != null) {
                conta.sacar(valor);
                System.out.println();
                return;
            }
            throw new ContaNaoEncontradaException();
        } catch (ValorNaoPositivoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void realizarDeposito(int numConta, double valor) throws ContaNaoEncontradaException {
        try {
            Conta conta = findConta(numConta);
            if (conta != null) {
                conta.depositar(valor);
                System.out.println();
                return;
            }
            throw new ContaNaoEncontradaException();
        } catch (ValorNaoPositivoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void verificarSaldo(int numConta) throws ContaNaoEncontradaException {
        Conta conta = findConta(numConta);
        if (conta != null) {
            System.out.printf("Saldo: R$%.2f\n", conta.getSaldo());
            return;
        }
        throw new ContaNaoEncontradaException();
    }
}
