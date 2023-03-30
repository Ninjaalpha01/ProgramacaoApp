package aula03.Exercicio;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int duracao;
    private ArrayList<Genero> genero;
    private ArrayList<Ator> ator;

    public Filme(String titulo, int duracao, ArrayList<Genero> genero, ArrayList<Ator> ator) {
        this.titulo = titulo;
        this.duracao = duracao;
        addAll(genero, ator);
    }

    public Filme(String titulo, int duracao, ArrayList<Genero> genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = new ArrayList<Genero>();
        this.genero.addAll(genero);
    }

    public void addAll(ArrayList<Genero> genero, ArrayList<Ator> ator) {
        this.genero = new ArrayList<Genero>();
        this.ator = new ArrayList<Ator>();
        this.genero.addAll(genero);
        this.ator.addAll(ator);
    }

    private String getAllGeneros() {
        String generos = "\n\t";
        for (Genero genero : genero) {
            generos += genero.getDescricao() + ",\n\t";
        }
        return generos.substring(0, generos.length() - 2);
    }

    private String getAllNames() {
        String names = "\n\t";
        for (Ator ator : ator) {
            names += ator.getNome() + ",\n\t";
        }
        return names.substring(0, names.length() - 2);
    }

    @Override
    public String toString() {
        return "\nFilme {\n  Titulo: " + titulo +
                "\n  Duracao: " + duracao +
                "\n  Generos: { " + getAllGeneros() +
                "\n  }\n  Atores: { "
                + getAllNames() + "\n  }\n}";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Genero> getGenero() {
        return genero;
    }

    public void setGenero(ArrayList<Genero> genero) {
        this.genero = genero;
    }

    public ArrayList<Ator> getAtor() {
        return ator;
    }

    public void setAtor(ArrayList<Ator> ator) {
        this.ator = ator;
    }
}
