package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog(
				"D�gite o valor do Coeficiente A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog(
        		"D�gite o valor do Coeficiente B: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog(
        		"D�gite o valor do Coeficiente C: "));

        double delta = ((b * b) - (4 * a * c));
        double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
        double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
        
        JOptionPane.showMessageDialog(null, "Sua 1� raiz �: "+x1
        		+"\nSua 2� raiz �: "+x2);
	}
}