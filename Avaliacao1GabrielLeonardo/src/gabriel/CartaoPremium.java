package gabriel;

public class CartaoPremium extends Cartao {
    private int pontuacao;

    public CartaoPremium(int id, int senha, String nomeTitular) {
        super(id, senha, nomeTitular);
        this.valorFatura = 0;
        this.pontuacao = 0;
    }

    private int transformarReaisEmPontos(double valor) {
        double dolar = 5;
        return (int) (valor / dolar);
    }

    private void printDados() {
        System.out.println("Nome do Titular: " + this.nomeTitular);
        System.out.println("Valor da Fatura:\tR$" + String.format("%.2f", this.valorFatura));
        System.out.println("Pontuação:\t\t" + this.pontuacao + " pontos");
        super.printProdutos();
    }

    public void fazerCompra(int senha, Produto produto, String dataCompra) {
        try {
            verificaSenha(senha);
            verificaBloqueio();
            super.efetuarCompra(produto, dataCompra);
            this.pontuacao += transformarReaisEmPontos(produto.getValor());
        } catch (SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        } catch (CartaoBloqueadoException e) {
            System.out.println(e.getMessage());
        }
    }

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
