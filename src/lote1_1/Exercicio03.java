package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
        double base = Integer.parseInt(JOptionPane.showInputDialog("Dígite a Base do Triângulo: "));
        double altura = Integer.parseInt(JOptionPane.showInputDialog("Dígite a Altura do Triângulo: "));
        
        double areaTriangulo = ((base * altura) / 2);
        JOptionPane.showMessageDialog(null, "A Área do Triângulo: "+areaTriangulo);
	}
}