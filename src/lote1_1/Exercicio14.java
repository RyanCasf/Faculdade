package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio14 {
	public static void main(String[] args) {
		double angulo1 = Double.parseDouble(JOptionPane.showInputDialog(
				"D�gite o valor do primeiro tri�ngulo: "));
		double angulo2 = Double.parseDouble(JOptionPane.showInputDialog(
				"D�gite o valor do segundo tri�ngulo: "));

		JOptionPane.showMessageDialog(
				null, "O valor do 3� �ngulo: "+ Math.abs((angulo1 + angulo2) - 180) + "�");
	}
}