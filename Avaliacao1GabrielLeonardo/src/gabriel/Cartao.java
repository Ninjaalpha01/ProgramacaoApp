package gabriel;

import java.util.ArrayList;

public abstract class Cartao {
	protected int id;
	protected int senha;
	protected String nomeTitular;
	protected double valorFatura;
	protected boolean bloqueado;
	protected ArrayList<Produto> produtos;

	public Cartao(int id, int senha, String nomeTitular) {
		this.id = id;
		this.senha = senha;
		this.nomeTitular = nomeTitular;
		this.valorFatura = 0.0;
		this.bloqueado = false;
		this.produtos = new ArrayList<Produto>();
	}

    private void verificaSenha(int senha, boolean setBlock) throws SenhaIncorretaException {
        if (this.senha == senha) {
            if (setBlock)
                this.bloqueado = true;
            else
                this.bloqueado = false;
        } else
            throw new SenhaIncorretaException();
    }

    protected void verificaSenha(int senha) throws SenhaIncorretaException {
        if (this.senha != senha)
            throw new SenhaIncorretaException();
    }

    protected void verificaBloqueio() throws CartaoBloqueadoException {
        if (this.bloqueado)
            throw new CartaoBloqueadoException();
    }

    public void bloquearCartao(int senha) {
        try {
            verificaSenha(senha, true);
            System.out.println("Cartao bloqueado com sucesso.");
        } catch (SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void desbloquearCartao(int senha) {
        try {
            verificaSenha(senha, false);
            System.out.println("Cartao desbloqueado com sucesso.");
        } catch (SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }
    }

	protected void efetuarCompra(Produto produto, String dataCompra) {
        this.valorFatura += produto.getValor();
        produto.setDataCompra(dataCompra);
        this.produtos.add(produto);

        System.out.println("Compra realizada com sucesso!");
    }


    protected void printProdutos() {
        System.out.println("\nProdutos:");
		System.out.println("Nome\t\tValor(R$)\tData da Compra");
        for (Produto produto : this.produtos) {
            System.out.println(produto.getNome() + "\t" + String.format("%.2f", produto.getValor()) + "\t\t"
                    + produto.getDataCompra());
        }
    }

	public abstract void visualizarFatura(int senha);
}
