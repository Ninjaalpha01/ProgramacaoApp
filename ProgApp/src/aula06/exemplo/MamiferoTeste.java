package aula06.exemplo;

import java.util.Scanner;

public class MamiferoTeste {
    public static void main(String[] args) {
        Scanner inKeyboard = new Scanner(System.in);
        
        Mamifero mamifero = null;

        System.out.print("Digite qual o animal: ");
        String animal = inKeyboard.nextLine();

        System.out.print("Digite o nome dele: ");
        String nome = inKeyboard.nextLine();

        switch(animal){
            case "cachorro":
            {
                mamifero = new Cachorro(nome, "Vira-lata");
                break;
            }
            case "gato":
            {
                mamifero = new Gato(nome, "Vira-lata");
                break;
            }
            case "cavalo":
            {
                mamifero = new Cavalo(nome, "Vira-lata");
                break;
            }
            default:
            {
                System.out.println("Animal não encontrado!");
                break;
            }
        }
        System.out.print("Nome: " + mamifero.nome + "\nSom: ");
        mamifero.emitirSom();
        inKeyboard.close();
    }
}
