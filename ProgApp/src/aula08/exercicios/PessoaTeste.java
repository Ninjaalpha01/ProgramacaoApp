package aula08.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean error = false;

        try {
            System.out.println("Digite o nome: ");
            String nome = input.nextLine();

            System.out.println("Digite o CPF: ");
            String cpf = input.nextLine();

            System.out.println("Digite a cidade: ");
            String cidade = input.nextLine();

            System.out.println("Digite o número: ");
            int numero = input.nextInt();

            System.out.println("Digite a idade: ");
            int idade = input.nextInt();

            System.out.println("Manda uma raiz negativa ai: ");
            int raiz = input.nextInt();

            if (raiz < 0) {
                input.close();
                throw new NumeroNaoNaturalException();
            }

            Pessoa pessoa = new Pessoa(nome, cpf, cidade, numero, idade);
            System.out.println(pessoa.toString());

        } catch (NumeroNaoNaturalException nnne) {
            System.out.println(nnne.getMessage());
            error = true;
        } catch (InputMismatchException ime) {
            System.out.println("Entrada de dados invalida, digite os dados novamente:");
            error = true;
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        if (error) {
            main(args);
        }

        input.close();
    }
}
