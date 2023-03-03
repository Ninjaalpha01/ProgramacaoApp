package aula02;

public class Relogio {
    private String marca;
    private int horas;
    private int minutos;

    public Relogio(String marca, int horas, int minutos){
        this.marca = marca;
        restrictTime(horas, false);
        restrictTime(minutos, true);
        System.out.println("Relogio setado para " + this.horas + ":" + this.minutos);
    }

    private void restrictTime(int time, boolean isMinute) {
        if (isMinute)
        {
            
        }
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
        if(horas > 23 || horas < 0)
        {
            System.out.println("hora invalida\n");
            return;
        }
        this.horas = horas;
        System.out.println("hora alterada para " + this.horas + ":" + this.minutos);
    }

    public void setMinutos(int minutos) {
        if(minutos > 59 || minutos < 0)
        {
            System.out.println("minuto invalido\n");
            return;
        }
        this.minutos = minutos;
        System.out.println("hora alterada para " + this.horas + ":" + this.minutos);
    }
}
