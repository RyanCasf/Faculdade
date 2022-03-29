package lote1_3;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		int[] valores = new int[100];
		int maior = 0;
		int menor = 0;
		int i = 0;
		double media = 0;

		for (i = 0; i < valores.length; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog(
					"Dígite um valor: "));

			if (i == 0) {
				maior = valores[0];
				menor = valores[0];
			}

			if (maior < valores[i]) {
				maior = valores[i];
			}

			if (menor > valores[i]) {
				menor = valores[i];
			}

			media += valores[i];
		}

		media /= (i == 0 ? 1 : i);

		JOptionPane.showMessageDialog(null,
				"Maior valor: " + maior + "\nMenor valor: " + menor + "\nMédia dos valores: " + media);
	}
}