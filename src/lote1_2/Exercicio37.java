package lote1_2;

import javax.swing.JOptionPane;

public class Exercicio37 {
	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		
		fibonacci(numero);
	}
	
	public static void fibonacci(int numero) {
		int x = 0, y = 1, aux;
		
		System.out.print(x + " " + y + " ");
		
		for (int i = 0; i <= numero; i++) {
			aux = x + y;
			System.out.print(aux + " ");
			x = y;
			y = aux;
		}
	}
}