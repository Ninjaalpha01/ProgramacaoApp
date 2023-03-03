package aula02;

public class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome){
        this.nome = nome;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("R$" + valor + " foi depositado\n");
    }

    public void sacar(double valor) {
        if(this.saldo - valor >= 0)
        {
            this.saldo -= valor;
            System.out.println("R$" + valor + " foi sacado\n");
            return;
        }
        System.out.println("Não há saldo o suficiente.\n");
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nSaldo: " + this.saldo + "\n";
    }
}
