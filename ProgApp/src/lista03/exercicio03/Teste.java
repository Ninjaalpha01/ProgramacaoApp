package lista03.exercicio03;

public class Teste {
    public static void main(String[] args) {
        Professor professor = new Professor("123", "João", "mestre", "01/01/2000", 2500);
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("456", "Maria", "01/01/2000", 1250, 150);
        
        Disciplina disciplina1 = new Disciplina("123", "Programação Orientada a Objetos", "Programação orientada a objetos", 80);
        Disciplina disciplina2 = new Disciplina("456", "Banco de Dados", "Banco de dados", 80);

        professor.addDisciplina(disciplina1);
        professor.addDisciplina(disciplina2);

        Processo processo1 = new Processo(123, "01/01/2000", "Processo 1");
        Processo processo2 = new Processo(456, "01/01/2000", "Processo 2");

        tecnico.addProcesso(processo1);
        tecnico.addProcesso(processo2);

        professor.printData();

        System.out.println();
        System.out.println("==================================");

        tecnico.printData();
    }
}
