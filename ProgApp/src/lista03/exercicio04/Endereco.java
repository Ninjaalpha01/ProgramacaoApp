package lista03.exercicio04;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String rua, String numero, String bairro, String cep, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
