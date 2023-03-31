package lista03.exercicio04.exceptions;

public class PrecoDivergenteException extends Exception {
    public PrecoDivergenteException() {
        super("Preço não bate com o valor do produto.");
    }
}
