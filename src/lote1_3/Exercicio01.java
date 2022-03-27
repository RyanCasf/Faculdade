package lote1_3;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		int[] numeros = new int[50];
		double media = 0;
		int j = 0;
		int impares = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Dígite um número: "));

			if (numeros[i] >= 10 && numeros[i] <= 200) {
				media += numeros[i];
				j++;
			}

			if (numeros[i] % 2 == 1) {
				impares += numeros[i];
			}
		}

		if (j == 0)
			j++;

		media = (media / j);
		JOptionPane.showMessageDialog(null,
				"Média dos valores entre 10 e 200: " + media + "\nSomatória dos ímpares: " + impares);
	}
}