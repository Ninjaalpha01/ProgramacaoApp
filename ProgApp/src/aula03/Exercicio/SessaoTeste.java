package aula03.Exercicio;

import java.util.ArrayList;

public class SessaoTeste {
    public static void main(String[] args) {
        ArrayList<Genero> generos = new ArrayList<Genero>();
        ArrayList<Ator> atores = new ArrayList<Ator>();

        generos.add(new Genero("Ação"));
        generos.add(new Genero("Aventura"));
        generos.add(new Genero("Comédia"));

        atores.add(new Ator("Robert Downey Jr."));
        atores.add(new Ator("Chris Evans"));
        atores.add(new Ator("Chris Hemsworth"));
        atores.add(new Ator("Mark Ruffalo"));
        atores.add(new Ator("Scarlett Johansson"));
        atores.add(new Ator("Jeremy Renner"));

        Filme filme = new Filme("Vingadores", 120, generos, atores);

        System.out.println(filme.toString());
    }
}
