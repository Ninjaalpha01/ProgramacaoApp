package lista02.exercicio01.exceptions;

public class ContaNaoEncontradaException extends Exception {
    final static String ANSI_RESET = "\u001B[0m";
    final static String ANSI_PURPLE = "\u001B[34m";

    public ContaNaoEncontradaException() {
        super(ANSI_PURPLE + "Nao foi possivel encontrar a conta." + ANSI_RESET);
    }
}
