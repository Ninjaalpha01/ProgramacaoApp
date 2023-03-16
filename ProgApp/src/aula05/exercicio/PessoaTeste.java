package aula05.exercicio;

public class PessoaTeste {
    public static void main(String[] args) {
        Professor pes = new Professor("Vinicius", 36, 4000.0);
        Aluno alu = new Aluno("Gabriel", 21, "Ciencia da Computacao", new Endereco("Rio Claro", "SP"));

        System.out.println("Professor:\n");
        pes.printData();

        System.out.println();
        pes.calcularSalario();

        System.out.println("\nAluno:");
        alu.printData();
        
        System.out.println();
        alu.realizarMatricula();
    }
}
