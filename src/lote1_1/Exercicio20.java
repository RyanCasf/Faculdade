package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio20 {
	public static void main(String[] args) {
		double a, b, c, x1, x2;

		a = Double.parseDouble(JOptionPane.showInputDialog("Dígite o Coeficiente A: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Dígite o Coeficiente B: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Dígite o Coeficiente C: "));

		double delta = (b * b) - (4 * a * c);

		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / 2 * a;
			x2 = (-b - Math.sqrt(delta)) / 2 * a;

			JOptionPane.showMessageDialog(null, "Primeira raíz Real: " + x1);
			JOptionPane.showMessageDialog(null, "Segunda raíz Real: " + x2);
		} 
		else {
			JOptionPane.showMessageDialog(null, "Sem raízes reais");
		}
	}
}