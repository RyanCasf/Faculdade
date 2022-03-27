package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio14 {
	public static void main(String[] args) {
		double angulo1 = Double.parseDouble(JOptionPane.showInputDialog(
				"Dígite o valor do primeiro triângulo: "));
		double angulo2 = Double.parseDouble(JOptionPane.showInputDialog(
				"Dígite o valor do segundo triângulo: "));

		JOptionPane.showMessageDialog(
				null, "O valor do 3º Ângulo: "+ Math.abs((angulo1 + angulo2) - 180) + "º");
	}
}