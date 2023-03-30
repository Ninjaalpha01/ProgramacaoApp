package aula08.exercicios;

import java.util.Scanner;

public class LetraTeste {
    public static void main(String[] args) {
        String str = "Hello World";
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String str2 = input.nextLine();

        Letra letra = new Letra();
        System.out.println("isEqual: " + letra.compareStrings(str, str2));

        System.out.println("countChar: " + letra.countChar(str));

        System.out.println("toLowerCase: " + letra.toLowerCase(str));

        System.out.println("toUpperCase: " + letra.toUpperCase(str2));

        input.close();
    }
}
