package lista03.exercicio04;

public class Socio extends Cliente {
    private String cpf;
    private Dependente dependente;

    public Socio(String nome, String dataNascimento, String cpf, String telefone, Endereco endereco,
            Dependente dependente) {
        super(nome, dataNascimento, telefone, endereco);
        this.cpf = cpf;
        this.dependente = dependente;
    }
}
