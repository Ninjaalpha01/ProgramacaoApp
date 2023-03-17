package aula06.exemplo;

public class Cachorro extends Mamifero {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }
    
    public void brincar(){
        System.out.println(super.nome + " esta brincando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public String toString(){
        return "Cachorro:\n\tNome: " + super.nome + "\n\tRaca: " + super.raca;
    }
}
