package lista02.exercicio01.exceptions;

public class ValorNaoPositivoException extends Exception {
    final static String ANSI_RESET = "\u001B[0m";
    final static String ANSI_PURPLE = "\u001B[34m";

    public ValorNaoPositivoException() {
        super(ANSI_PURPLE + "Valor passado deve ser positivo nao nulo." + ANSI_RESET);
    }
}
