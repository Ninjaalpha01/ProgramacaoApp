package lista01.exercicio03;

public class Teste {
    public static void main(String[] args) {
        IngressoNormal ingressoNormal = new IngressoNormal(75, "Normal");
        CamaroteInferior camaroteInferior = new CamaroteInferior(100, "Camarote Inferior", 50, "Camarote Inferior");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100, "Camarote Superior", 100, "Camarote Superior");
        
        ingressoNormal.imprimirDadosIngresso();
        System.out.println("======================================");
        camaroteInferior.imprimirDadosIngresso();
        System.out.println("======================================");
        camaroteSuperior.imprimirDadosIngresso();
    }
}
