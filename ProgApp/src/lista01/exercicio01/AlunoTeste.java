package lista01.exercicio01;

public class AlunoTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "01/01/2000", 123456789, 123456789);
        Aluno aluno = new Aluno("Maria", "01/01/2000", 123456789, 123456789, 123456789);

        pessoa.printData();
        System.out.println("====================================");
        aluno.printData();
    }
}
