package lote1_2;

import javax.swing.JOptionPane;

public class Exercicio35 {
	public static void main(String[] args) {
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro n�mero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo n�mero: "));
		
		JOptionPane.showMessageDialog(null, "Somat�rio dos n�meros �mpares: " + somatorioImpares(num1, num2));
	}
	
	public static int somatorioImpares(int num1, int num2) {
		int somatorio = 0, menor = 0, maior = 0;
		
		if (num1 > num2) {
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}
		
		for (int i = 0; i <= maior; i++) {
			if (i % 2 == 1) {
				if (menor >= i) {
					somatorio += i;
				}
				
				somatorio += i;
			}
		}
		
		return somatorio;
	}
}