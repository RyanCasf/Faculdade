package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Dígite a Base do triângulo: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Dígite a Altura do triângulo: "));
        
        int areaTriangulo = ((base * altura) / 2);
        JOptionPane.showMessageDialog(null, "Área do triângulo: "+areaTriangulo);
	}
}