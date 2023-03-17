package aula06.exemplo;

public class Cavalo extends Mamifero {
    public Cavalo(String nome, String raca) {
        super(nome, raca);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Relinchando!");
    }

    @Override
    public String toString(){
        return "Cavalo:\n\tNome: " + super.nome + "\n\tRaca: " + super.raca;
    }
}