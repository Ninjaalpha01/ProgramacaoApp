package gabriel;

public class Testes {
	public static void main(String[] args) {
		CartaoComum cartaoComum = new CartaoComum(1, 1234, "Gabriel", 1050.0);

		cartaoComum.bloquearCartao(1234);
		cartaoComum.fazerCompra(1234, new Produto("Camiseta", 100.0), "01/01/2023");
		
		System.out.println("\n---------------------------------------------\n");
		
		cartaoComum.visualizarFatura(1234);

		System.out.println("\n---------------------------------------------\n");
		
		cartaoComum.desbloquearCartao(1234);

		cartaoComum.fazerCompra(1234, new Produto("Camiseta", 10000.0), "01/01/2023");

		System.out.println("\n---------------------------------------------\n");
		
		cartaoComum.visualizarFatura(1234);

		System.out.println("\n---------------------------------------------\n");
		
		cartaoComum.fazerCompra(1234, new Produto("Camiseta", 100.0), "01/01/2023");

		cartaoComum.fazerCompra(1234, new Produto("Calca", 150.90), "01/01/2023");
		
		System.out.println("\n---------------------------------------------\n");
		
		cartaoComum.visualizarFatura(1234);

		System.out.println("\n=============================================\n");

		CartaoPremium cartaoPremium = new CartaoPremium(2, 1234, "Thiago");
		cartaoPremium.bloquearCartao(1234);
		cartaoPremium.fazerCompra(1234, new Produto("Camiseta", 1000.0), "01/01/2023");
		
		System.out.println("\n---------------------------------------------\n");
		
		cartaoPremium.visualizarFatura(1234);
		cartaoPremium.desbloquearCartao(1234);

		cartaoPremium.fazerCompra(1234, new Produto("Camiseta", 100.0), "01/01/2023");
		cartaoPremium.fazerCompra(1234, new Produto("Xbox", 4500.0), "01/01/2023");
		System.out.println("\n---------------------------------------------\n");
		cartaoPremium.visualizarFatura(1234);
	}
}
