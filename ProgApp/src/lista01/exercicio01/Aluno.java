package lista01.exercicio01;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, String dataNascimento, long rg, long cpf, int matricula) {
        super(nome, dataNascimento, rg, cpf);
        this.matricula = matricula;
    }

    public void printData() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Aluno: {" + super.toString().replace("Pessoa: {", "").replaceAll("}", "")
        + "\tMatricula: " + this.matricula + "\n}";
    }
}
