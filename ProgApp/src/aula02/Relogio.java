package aula02;

public class Relogio {
    private String marca;
    private int horas;
    private int minutos;

    public Relogio(String marca, int horas, int minutos) {
        this.marca = marca;
        this.horas = restrictTime(horas, false);
        this.minutos = restrictTime(minutos, true);
        System.out.println("Relogio setado para " + this.horas + ":" + this.minutos);
    }

    private int restrictTime(int time, boolean isMinute) { // melhorar isso
        if (time < 0)
            return 0;

        if (isMinute) {
            if (time > 59)
                return 59;
            return time;
        }

        if (time > 23)
            return 23;
        return time;
    }

    public String getMarca() {
        return marca;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setHoras(int horas) {
        if (horas > 23 || horas < 0)
            System.out.println("hora invalida");

        this.horas = restrictTime(horas, false);
        System.out.println("hora alterada para " + this.horas + ":" + this.minutos + "\n");
    }

    public void setMinutos(int minutos) {
        if (minutos > 59 || minutos < 0)
            System.out.println("minuto invalido");

        this.minutos = restrictTime(minutos, true);
        System.out.println("hora alterada para " + this.horas + ":" + this.minutos + "\n");
    }
}
