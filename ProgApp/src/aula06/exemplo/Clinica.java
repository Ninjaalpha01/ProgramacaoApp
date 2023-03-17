package aula06.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinica {
    private String cnpj;
    private String razaoSocial;
    private List<Mamifero> animais;

    public Clinica(String cnpj, String razaoSocial, ArrayList<Mamifero> animais) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.animais = animais;
    }

    public Clinica(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.animais = new ArrayList<Mamifero>();
    }

    public void listarAnimais() {
        System.out.println("Lista de Animais:");

        for (Mamifero animal : animais)
            System.out.println(animal.toString());

        System.out.println();
    }

    public void cadastrarAnimal() {
        Scanner inKeyboard = new Scanner(System.in);
        Mamifero mamifero = null;

        mamifero = interacaoUsuario(inKeyboard, mamifero);

        animais.add(mamifero);
    }

    private Mamifero interacaoUsuario(Scanner inKeyboard, Mamifero mamifero) {
        System.out.print("\nInsira o animal: ");
        String animal = inKeyboard.nextLine();

        System.out.print("Nome: ");
        String nome = inKeyboard.nextLine();

        System.out.print("Raca: ");
        String raca = inKeyboard.nextLine();

        mamifero = instanciarMamifero(mamifero, animal, nome, raca);
        return mamifero;
    }

    private Mamifero instanciarMamifero(Mamifero mamifero, String animal, String nome, String raca) {
        switch (animal) {
            case "cachorro": {
                mamifero = new Cachorro(nome, raca);
                break;
            }
            case "gato": {
                mamifero = new Gato(nome, raca);
                break;
            }
            case "cavalo": {
                mamifero = new Cavalo(nome, raca);
                break;
            }
            default: {
                System.out.println("Animal não encontrado!");
                break;
            }
        }
        return mamifero;
    }

    public void playWithDogs() {
        for (Mamifero animal : animais)
            if (animal instanceof Cachorro)
                ((Cachorro) animal).brincar();
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }
}
