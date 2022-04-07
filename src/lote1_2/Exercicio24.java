package lote1_2;

import javax.swing.JOptionPane;

public class Exercicio24 {
	public static void main(String[] args) {
		int valor1;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º valor: "));
		
		dividir(valor1);
	}
	
	public static void dividir(int v1) {
		if (v1 % 2 == 0 & v1 % 3 == 0) {
			JOptionPane.showMessageDialog(null, "Valor inserido é divisível por 2 e 3");
		} else {
			JOptionPane.showMessageDialog(null, "Valor inserido não é divisível por 2 e 3");
		}
	}
}