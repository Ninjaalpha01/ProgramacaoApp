package gabriel;

public class Produto {
	private String nome;
	private double valor;
    private String dataCompra;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
}
