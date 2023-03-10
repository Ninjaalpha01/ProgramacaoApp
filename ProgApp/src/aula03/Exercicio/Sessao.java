package aula03.Exercicio;

import java.util.Date;
import java.util.Timer;

public class Sessao implements TemplateCinema {
    private Date data;
    private Timer hora;
    private Sala sala;
    private Filme filme;
    private Ingresso[] ingresso;

    public Sessao(Date data, Timer hora, Sala sala, Filme filme, Ingresso[] ingresso) {
        this.data = data;
        this.hora = hora;
        this.sala = sala;
        this.filme = filme;
        this.ingresso = ingresso;
    }

    @Override
    public void cadastrar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void editar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void buscar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void remover() {
        // TODO Auto-generated method stub

    }
}
