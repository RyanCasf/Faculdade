package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio26 {
	public static void main(String[] args) {
		int numero1, numero2;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º número: "));

		multiplosMenor(numero1, numero2);
	}

	public static void multiplosMenor(int num1, int num2) {
		if (num1 > num2) {
			if (num1 % num2 == 0) {
				JOptionPane.showMessageDialog(null, num1 + " é múltiplo de " + num2);
			} else {
				JOptionPane.showMessageDialog(null, num1 + " não é múltiplo de " + num2);
			}
		} else {
			if (num2 % num1 == 0) {
				JOptionPane.showMessageDialog(null, num2 + " é múltiplo de " + num1);
			} else {
				JOptionPane.showMessageDialog(null, num2 + " não é múltiplo de " + num1);
			}
		}
	}
}