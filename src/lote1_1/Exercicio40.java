package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio40 {
	public static void main(String args[]) {
		int num1, num2, qtdDivid = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1� n�mero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2� n�mero: "));
		
		cadastrarNumeros(num1, qtdDivid);
		
		obterQuantidade(num1, num2);
	}

	private static void cadastrarNumeros(int num1, int qtdDivid) {
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.print(i + " ");
				qtdDivid += 1;
			}
		}
	}

	private static void obterQuantidade(int num1, int num2) {
		int qtdDivid;
		qtdDivid = 0;

		if (qtdDivid > 2) {
			System.out.println(" | " + num1 + " n�o � n�mero primo");
		} else {
			System.out.println(" | " + num1 + " � um n�mero primo!");
		}
		
		for (int i = 1; i <= num2; i++) {
			if (num2 % i == 0) {
				System.out.print(i + " ");
				qtdDivid += 1;
			}
		}
		
		if (qtdDivid > 2) {
			System.out.println(" | " + num2 + " n�o � um n�mero primo!");
		} else {
			System.out.println(" | " + num2 + " � um n�mero primo!");
		}
	}
}