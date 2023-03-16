package aula05.exemplo;

public class Carro extends Veiculo{
    private int numPortas;

    public Carro(String modelo, String fabricante, String combustivel, int ano, int numPassageiros, int numPortas){
        super(modelo, fabricante, combustivel, numPassageiros, ano);
        this.numPortas = numPortas;
    }

    public void trocarPneus(){
        System.out.println("Trocando pneus");
    }
}
