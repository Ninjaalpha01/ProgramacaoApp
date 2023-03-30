package aula05.exemplo;

public class Aviao extends Veiculo {
    private int alturaVoo;

    public Aviao(String modelo, String fabricante, String combustivel, int numPassageiros, int numPortas, int ano, int alturaVoo){
        super(modelo, fabricante, combustivel, numPassageiros, ano);
        this.alturaVoo = alturaVoo;
    }

    public void embarcarPassageiros(){
        System.out.println("Embarcando passageiros");
    }

    public int getAlturaVoo(){
        return alturaVoo;
    }
}
