package aula07.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args) {
        Scanner inKeyboard = new Scanner(System.in);
        try {

        } catch (InputMismatchException ime) {
            System.out.println("Erro de entrada de dados");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            inKeyboard.close();
        }
    }
}
