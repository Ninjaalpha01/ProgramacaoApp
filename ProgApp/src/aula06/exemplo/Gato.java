package aula06.exemplo;

public class Gato extends Mamifero {
    public Gato(String nome, String raca) {
        super(nome, raca);
    }
    
    @Override
    public void emitirSom() {
        if(super.nome.equals("Garfield"))
            System.out.println("Quero lasanha!");
        else
            System.out.println("Miau!");
    }

    @Override
    public String toString(){
        return "Gato:\n\tNome: " + super.nome + "\n\tRaca: " + super.raca;
    }
}
