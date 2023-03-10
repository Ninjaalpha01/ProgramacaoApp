package aula03.Exercicio;

public class Genero {
    private String descricao;

    public Genero(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Genero [descricao=" + descricao + "]";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
