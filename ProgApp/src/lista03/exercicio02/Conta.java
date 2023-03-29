package lista03.exercicio02;

import java.util.ArrayList;

public class Conta {
    private double valorTotal;
    private ArrayList<Prato> pratos;

    public Conta() {
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        this.pratos.add(prato);
    }

    public void fecharConta() {
        calcularTotal();
        System.out.println("=====================================");
        System.out.println("Total: " + String.format("%.2f", this.valorTotal));
    }

    private void calcularTotal() {
        for (Prato prato : pratos) {
            this.valorTotal += prato.getPreco();
            System.out.println(prato.getNome() + ": R$" + String.format("%.2f", prato.getPreco()));
        }
        this.valorTotal += this.valorTotal * 0.1;
    }
}
