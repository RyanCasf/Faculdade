package lote1_3;

import java.util.Random;

public class Exercicio12 {
	public static void main(String[] args) {
		int[][] tabuleiro = new int[8][8];
		int[] pecas = new int[8];
		int resultado = 0;

		Random xadrez = new Random();

		resultado = cadastrarTabuleiro(tabuleiro, pecas, resultado, xadrez);

		System.out.println("Resultado: " + resultado);

		exibirPecas(pecas, Pecas.values());
	}

	private static void exibirPecas(int[] pecas, Pecas[] pecasXadrez) {
		for (int i = 0; i < pecasXadrez.length; i++)
			System.out.println("Quantidade de " + pecasXadrez[i] + ":" + pecas[i]);
	}

	private static int cadastrarTabuleiro(int[][] tabuleiro, int[] pecas, int resultado, Random xadrez) {
		for (int i = 0; i < tabuleiro.length; i++)
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = xadrez.nextInt(7) + 1;
				resultado += tabuleiro[i][j];
				contabilizarPecas(tabuleiro, pecas, resultado, i, j);
			}
		return resultado;
	}

	private static void contabilizarPecas(int[][] tabuleiro, int[] pecas, int resultado, int i, int j) {
		int valor;
		valor = tabuleiro[i][j];
		resultado += valor;
		pecas[valor - 1]++;
	}
}