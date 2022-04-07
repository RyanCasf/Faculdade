package lote1_2;

import javax.swing.JOptionPane;

public class Exercicio33 {
	public static void main(String[] args) {
		int number;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		fatorialSequencia(number);
	}
	
	public static void fatorialSequencia(int number) {
		double fatorial = 1;
		
		for (int i = 2; i <= number ; i++) {
			double divisao = (double) 1 / i;
			fatorial = fatorial + divisao;
		}
		
		JOptionPane.showMessageDialog(null, "Resultado da sequência fatorial: " + fatorial);
	}
}