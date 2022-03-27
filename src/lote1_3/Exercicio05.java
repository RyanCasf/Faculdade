package lote1_3;

import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main(String[] args) {
		int[] vetores = new int[20];
		int total = 0;
		
		cadastrarValores(vetores);
		
		calcularSomatoria(vetores, total);
	}

	private static void calcularSomatoria(int[] vetores, int total) {
		for (int i = 0; i < (vetores.length / 2); i++) {
			total += (vetores[i] - vetores[(vetores.length - (i + 1))]);
		}
		
		System.out.println("Total: " + total);
	}

	private static int[] cadastrarValores(int[] vetores) {
		for (int i = 0; i < vetores.length; i++) {
			vetores[i] = Integer.parseInt(JOptionPane.showInputDialog("Dígite um valor: "));
		}
		
		return vetores;
	}
}