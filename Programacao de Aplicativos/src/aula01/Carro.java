package aula01;

public class Carro {
    String modelo;
    String marca;
    String placa;
    String cor;
    int ano;

    Carro(String modelo, String marca, String placa, String cor, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    public void buzinar() {
        System.out.print("\007");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void desligar() {
        System.out.println("Desligando...");
    }
}

