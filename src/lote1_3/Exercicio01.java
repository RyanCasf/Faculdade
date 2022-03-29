package lote1_3;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		int[] numeros = new int[2];
		double media = 0;
		int quantidadeMedia = 0;
		int impares = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
					"Dígite um número: "));
			
			if (numeros[i] % 2 != 0)
				impares += numeros[i];

			if (numeros[i] >= 10 && numeros[i] <= 200) {
				media += numeros[i];
				quantidadeMedia++;
			}
		}

		media = (media / (quantidadeMedia == 0 ? 1 : quantidadeMedia));
		
		JOptionPane.showMessageDialog(null,
				"Média dos valores entre 10 e 200: " + media + "\nSomatória dos ímpares: " + impares);
	}
}