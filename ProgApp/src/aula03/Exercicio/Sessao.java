package aula03.Exercicio;

public class Sessao implements TemplateCinema {
    private String data;
    private String hora;
    private Sala sala;
    private Filme filme;
    private Ingresso[] ingresso;

    public Sessao(String data, String hora, Sala sala, Filme filme, Ingresso[] ingresso) {
        this.data = data;
        this.hora = hora;
        this.sala = sala;
        this.filme = filme;
        this.ingresso = ingresso;
    }

    @Override
    public void buscar() {
    }

    @Override
    public void remover() {
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public Sala getSala() {
        return sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public Ingresso[] getIngresso() {
        return ingresso;
    }

    @Override
    public void cadastrar() {
        throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
    }

    @Override
    public void editar() {
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }
}
