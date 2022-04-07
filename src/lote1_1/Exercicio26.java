package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio26 {
	public static void main(String[] args) {
		int numero1, numero2;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1� n�mero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2� n�mero: "));

		multiplosMenor(numero1, numero2);
	}

	public static void multiplosMenor(int num1, int num2) {
		if (num1 > num2) {
			if (num1 % num2 == 0) {
				JOptionPane.showMessageDialog(null, num1 + " � m�ltiplo de " + num2);
			} else {
				JOptionPane.showMessageDialog(null, num1 + " n�o � m�ltiplo de " + num2);
			}
		} else {
			if (num2 % num1 == 0) {
				JOptionPane.showMessageDialog(null, num2 + " � m�ltiplo de " + num1);
			} else {
				JOptionPane.showMessageDialog(null, num2 + " n�o � m�ltiplo de " + num1);
			}
		}
	}
}