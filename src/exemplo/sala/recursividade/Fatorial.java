package exemplo.sala.recursividade;

import javax.swing.JOptionPane;

public class Fatorial {
	public static void main(String[] args) {
		Integer valor = Integer.parseInt(JOptionPane.showInputDialog(
				"Dígite o valor desejado do Fatorial: "));
		
		JOptionPane.showMessageDialog(
				null, "O Fatorial de "+valor+" é: "+fatorial(valor));
	}
	
	private static int fatorial(int n) {
		return n != 1 ? n * fatorial(n-1) : 1;
	}
}