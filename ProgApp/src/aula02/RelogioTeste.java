package aula02;

public class RelogioTeste {
    public static void main(String[] args) {
        Relogio relogio = new Relogio("Yamaha", 14, 47);

        relogio.getHoras();
        relogio.getMinutos();

        relogio.setHoras(7);
        relogio.setMinutos(35);

        relogio.setHoras(49);
        relogio.setMinutos(90);
    }
}
