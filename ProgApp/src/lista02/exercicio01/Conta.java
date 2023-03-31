package lista02.exercicio01;

import lista02.exercicio01.exceptions.ValorNaoPositivoException;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, Cliente titular) {
        this.numeroConta = numero;
        this.saldo = 0;
        this.titular = titular;
    }

    public void sacar(double valor) throws ValorNaoPositivoException {
        if (valor <= 0)
            throw new ValorNaoPositivoException();
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso\nConta: " + this.numeroConta + " / Titular: "
                    + this.titular.getNome());
        }
    }

    public void depositar(double valor) throws ValorNaoPositivoException {
        if (valor <= 0)
            throw new ValorNaoPositivoException();
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso\nConta: " + this.numeroConta + " / Titular: "
                + this.titular.getNome());
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getTitular() {
        return this.titular;
    }
}
