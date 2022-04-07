package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio36 {
	public static void main(String[] args) {
		int numero; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero: "));
		
		sequenciaFatorial(numero);
	}
	
	public static void sequenciaFatorial(int numero) {
		double fatorial = 1, sequenciaFatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			
			for (int j = i; j >= 1; j--) {
				fatorial = fatorial * j;
			}
			
			sequenciaFatorial = sequenciaFatorial + (1 / fatorial);
			fatorial = 1;
		}
		
		JOptionPane.showMessageDialog(null, "Valor da sequ�ncia fatorial: " + sequenciaFatorial);
	}
}