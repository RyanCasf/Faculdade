package lote1_2;

import javax.swing.JOptionPane;

public class Exercicio32 {
	public static void main(String[] args) {
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
		
		JOptionPane.showMessageDialog(null, "Fatorial de " + valor + ": " + calcularFatorial(valor));
	}
	
	public static int calcularFatorial(int valor) {
		int fatorial = 1;
		
		for (int i = 1; i <= valor; i++) {
			fatorial = fatorial * i;
		}
		
		return fatorial;
	}
}