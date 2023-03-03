package aula01;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Volkswagen", "ABC-1234", "Azul", 1969);
        Carro carro2 = new Carro("Ferrari", "Ferrari", "DEF-5678", "Vermelho", 2010);
        Carro carro3 = new Carro("Celta", "Chevrolet", "GHI-9012", "Preto", 2008);

        System.out.println("------MODELOS------");
        System.out.println("Carro 1: " + carro1.modelo);
        System.out.println("Carro 2: " + carro2.modelo);
        System.out.println("Carro 3: " + carro3.modelo);

        carro1.buzinar();
    }

}
