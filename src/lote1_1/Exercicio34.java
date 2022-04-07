package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio34 {
	public static void main(String args[]) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		
		tabuada(num);
	}
	
	public static void tabuada(int num) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}