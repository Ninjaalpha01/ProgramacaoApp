package aula06.exemplo;

import java.util.Scanner;

public class ClinicaTeste {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("99999999/00", "VetAmigo");

        clinica.cadastrarAnimal();
        clinica.cadastrarAnimal();

        System.out.println("\nClinica " + clinica.getRazaoSocial());
        clinica.listarAnimais();

        clinica.playWithDogs();
    }
}
