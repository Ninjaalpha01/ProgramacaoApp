package aula05.exercicio;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso, Endereco endereco) {
        super(nome, idade, endereco);
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public Aluno(String nome, int idade) {
        super(nome, idade);
        this.curso = "Engenharia qualquer";
    }

    public void realizarMatricula() {
        System.out.println("fazendo matricula");
    }

    public void printData(){
        super.printData();
        System.out.println("Curso: " + this.curso);
    }
}
