package lote1_3;

import javax.swing.JOptionPane;

public class Exercicio09 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));

				if (i == j) {
					System.out.print("[ " + matriz[i][j] + " ]");
				} else {
					System.out.print("[ ]");
				}
			}

			System.out.println();
		}
	}
}