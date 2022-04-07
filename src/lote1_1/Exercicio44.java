package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio44 {
	public static void main(String args[]) {
		int base = 0, expoente;
		double potencia = 0;
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
		expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));
		
		potencia = potencializar(base, expoente);
	
		JOptionPane.showMessageDialog(null, "O valor da potência é: " + potencia);
	}

	private static double potencializar(int base, int expoente) {
		double potencia;
		potencia = Math.pow(base, expoente);
		return potencia;
	}
}