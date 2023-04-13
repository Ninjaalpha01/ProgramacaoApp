package Aestrela;

import java.util.Collections;


public class Teste {
	
	public static void main(String[] args) {
        No a11 = new No("a11");
        No a12 = new No("a12");
        No b21 = new No("b21");
        No b31 = new No("b31");
        No c22 = new No("c22");
        No c32 = new No("c32");
        No d41 = new No("d41");
        No d42 = new No("d42");
        No e51 = new No("e51");
        No e52 = new No("e52");
        No e61 = new No("e61");
        No e62 = new No("e62");
        No f71 = new No("f71");
        No f72 = new No("f72");
        No g13 = new No("g13");
        No g23 = new No("g23");
        No h33 = new No("h33");
        No h34 = new No("h34");
        No i43 = new No("i43");
        No i53 = new No("i53");
        No j63 = new No("j63");
        No j73 = new No("j73");
        No k14 = new No("k14");
        No k24 = new No("k24");
        No l44 = new No("l44");
        No l54 = new No("l54");
        No l45 = new No("l45");
        No l55 = new No("l55");
        No m64 = new No("m64");
        No m74 = new No("m74");
        No m65 = new No("m65");
        No m75 = new No("m75");
        No q17 = new No("q17");
        No q18 = new No("q18");
        No q27 = new No("q27");
        No q28 = new No("q28");
        No r37 = new No("r37");
        No r38 = new No("r38");
        No s47 = new No("s47");
        No s48 = new No("s48");
        No t57 = new No("t57");
        No t58 = new No("t58");
        No t67 = new No("t67");
        No t68 = new No("t68");
        No u77 = new No("u77");
        No u78 = new No("u78");
        No n15 = new No("n15");
        No n16 = new No("n16");
        No n25 = new No("n25");
        No n26 = new No("n26");
        No o35 = new No("o35");
        No o36 = new No("o36");
        No p46 = new No("p46");
        No p56 = new No("p56");
        No p76 = new No("p76");
        No p66 = new No("p66");

        Collections.addAll(a11.vizinhos, a12);
        Collections.addAll(a12.vizinhos, a11, c22);
        Collections.addAll(b21.vizinhos, b31, c22);
        Collections.addAll(b31.vizinhos, b21, c32, d41);
        Collections.addAll(c22.vizinhos, a12, b21, c32, g23);
        Collections.addAll(c32.vizinhos, b31, c22);
        Collections.addAll(d41.vizinhos, b31, d42, e51);
        Collections.addAll(d42.vizinhos, d41, e52);
        Collections.addAll(e51.vizinhos, d41, e52, e61);
        Collections.addAll(e52.vizinhos, d42, e51, e62);
        Collections.addAll(e61.vizinhos, e51, e62, f71);
        Collections.addAll(e62.vizinhos, e52, e61, f72);
        Collections.addAll(f71.vizinhos, e61, f72);
        Collections.addAll(f72.vizinhos, e62, f71, j73);
        Collections.addAll(g13.vizinhos, g23, k14);
        Collections.addAll(g23.vizinhos, c22, g13, h33, k24);
        Collections.addAll(h33.vizinhos, g23, h34, i43);
        Collections.addAll(h34.vizinhos, h33, k24, l44);
        Collections.addAll(i43.vizinhos, h33, i53);
        Collections.addAll(i53.vizinhos, i43, j63);
        Collections.addAll(j63.vizinhos, i53, j73, m64);
        Collections.addAll(j73.vizinhos, f72, j63, m74);
        Collections.addAll(k14.vizinhos, g13, k24, n15);
        Collections.addAll(k24.vizinhos, g23, h34, k14, n25);
        Collections.addAll(l44.vizinhos, h34, l45, l54);
        Collections.addAll(l45.vizinhos, l44, l55);
        Collections.addAll(l54.vizinhos, l44, l55, m64);
        Collections.addAll(l55.vizinhos, l45, l54, m65);
        Collections.addAll(m64.vizinhos, j63, l54, m65);
        Collections.addAll(m65.vizinhos, l55, m64, m75, p66);
        Collections.addAll(m74.vizinhos, j73, m64, m75);
        Collections.addAll(m75.vizinhos, m65, m74, p76);
        Collections.addAll(n15.vizinhos, k14, n16, n25);
        Collections.addAll(n16.vizinhos, n15, n26, q17);
        Collections.addAll(n25.vizinhos, k24, n15, n26, o35);
        Collections.addAll(n26.vizinhos, n16, n25, o36, q27);
        Collections.addAll(o35.vizinhos, n25, o36);
        Collections.addAll(o36.vizinhos, n26, o35, p46);
        Collections.addAll(p46.vizinhos, o36, p56);
        Collections.addAll(p56.vizinhos, p46, p66, t57);
        Collections.addAll(p66.vizinhos, m65, p56, p76, t67);
        Collections.addAll(p76.vizinhos, m75, p66);
        Collections.addAll(q17.vizinhos, n16, q18, q27);
        Collections.addAll(q18.vizinhos, q17, q28);
        Collections.addAll(q27.vizinhos, n26, q17, q28, r37);
        Collections.addAll(q28.vizinhos, q18, q27, r38);
        Collections.addAll(r37.vizinhos, q27, r38, s47);
        Collections.addAll(r38.vizinhos, q28, r37, s48);
        Collections.addAll(s47.vizinhos, r37, s48, t57);
        Collections.addAll(s48.vizinhos, r38, s47, t58);
        Collections.addAll(t57.vizinhos, p56, s47, t58, t67);
        Collections.addAll(t58.vizinhos, s48, t57, t68);
        Collections.addAll(t67.vizinhos, p66, t57, t68, u77);
        Collections.addAll(t68.vizinhos, t58, t67, u78);
        Collections.addAll(u77.vizinhos, t67, u78);
        Collections.addAll(u78.vizinhos, t68, u77);
        
        Busca busca = new Busca();
        
        busca.buscaAEstrela(a11, t57);
	}
	
}