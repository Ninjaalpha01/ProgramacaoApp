package lista03.exercicio02;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "123.456.789-00");
        Prato prato1 = new Prato(1, "Salada", "entrada", "Salada de folhas", 10.00);
        Prato prato2 = new Prato(2, "Bife", "principal", "Bife acebolado", 20.00);
        Prato prato3 = new Prato(3, "Sorvete", "sobremesa", "Sorvete de creme", 5.00);

        cliente.getConta().adicionarPrato(prato1);
        cliente.getConta().adicionarPrato(prato2);
        cliente.getConta().adicionarPrato(prato3);

        cliente.getConta().fecharConta();
    }
}
