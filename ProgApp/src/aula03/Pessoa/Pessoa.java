package aula03.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String email;
    private EstadoCivil estadoCivil;
    private Endereco endereco;

    Pessoa(String nome, int idade, String sexo, String email, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.endereco = endereco;
        this.estadoCivil = EstadoCivil.SOLTEIRO;
    }

    @Override
    public String toString() {
        return "Pessoa: \n{\n  nome: " + nome + ", \n  idade: " + idade + ", \n  sexo: " + sexo + ", \n  email: " + email + ", \n  estadoCivil: "
                + estadoCivil + ", \n  endereco: " + endereco.toString() + "\n}";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
