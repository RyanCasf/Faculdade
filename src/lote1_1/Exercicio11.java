package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio11 {
	public static void main(String[] args) {
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio da circunferência: "));
        JOptionPane.showMessageDialog(null, "Comprimento da circunferência: " + (2 * Math.PI * raio));
	}
}