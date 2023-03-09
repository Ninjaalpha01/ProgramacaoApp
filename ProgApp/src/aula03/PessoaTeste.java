package aula03;

public class PessoaTeste {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua 1", 1, "Bairro 1", "Cidade 1", "UF 1");
        
        Pessoa pessoa1 = new Pessoa("João", 20, "M", "teste@teste.com", endereco1);
        
        System.out.println(pessoa1.toString());
    }
}
