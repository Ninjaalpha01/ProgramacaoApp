package lista03.exercicio04.exceptions;

public class DiaInvalidoException extends Exception {
    public DiaInvalidoException() {
        super("Dia não pode ser menor que 1 ou maior que 31.");
    }
}
