package gabriel;

public class CartaoComum extends Cartao {
    private double valorLimite;

    public CartaoComum(int id, int senha, String nomeTitular, double valorLimite) {
        super(id, senha, nomeTitular);
        this.valorLimite = valorLimite;
    }

    private void verificaLimite(double valorCompra) throws LimiteInsuficienteException {
        if (this.valorLimite < valorCompra)
            throw new LimiteInsuficienteException();
    }

    private void printDados() {
        System.out.println("Nome do Titular: " + this.nomeTitular);
        System.out.println("Valor da Fatura:\t\tR$" + String.format("%.2f", this.valorFatura));
        System.out.println("Valor do Limite Disponivel:\tR$" + String.format("%.2f", this.valorLimite));
        super.printProdutos();
    }

    public void fazerCompra(int senha, Produto produto, String dataCompra) {
        try {
            verificaSenha(senha);
            verificaBloqueio();
            verificaLimite(produto.getValor());
            this.valorLimite -= produto.getValor();
            super.efetuarCompra(produto, dataCompra);
        } catch (SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        } catch (CartaoBloqueadoException e) {
            System.out.println(e.getMessage());
        } catch (LimiteInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void visualizarFatura(int senha) {
        try {
            verificaSenha(senha);
            printDados();
            System.out.println();
        } catch (SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }
    }
}
