package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
        double base = Integer.parseInt(JOptionPane.showInputDialog("D�gite a Base do Tri�ngulo: "));
        double altura = Integer.parseInt(JOptionPane.showInputDialog("D�gite a Altura do Tri�ngulo: "));
        
        double areaTriangulo = ((base * altura) / 2);
        JOptionPane.showMessageDialog(null, "A �rea do Tri�ngulo: "+areaTriangulo);
	}
}