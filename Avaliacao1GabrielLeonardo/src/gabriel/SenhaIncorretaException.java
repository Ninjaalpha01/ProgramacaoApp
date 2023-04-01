package gabriel;

public class SenhaIncorretaException extends Exception {
	public SenhaIncorretaException() {
		super("A senha digitada esta incorreta.");
	}
}
