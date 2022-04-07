package lote1_2;

import javax.swing.JOptionPane;

public class Exercicio42 {
	public static void main(String args[]) {
		int numero = 1;
		double somatoria = 0;
		
		somatoria = somarDiminuirDivisoes(numero, somatoria);
	}

	private static double somarDiminuirDivisoes(int numero, double somatoria) {
		for (int i = 1; i <= 99; i+=2) {
			
			double serie;
			serie = 0;
			
			serie = (double) numero / i;
			somatoria += serie;
			
			System.out.println(numero + " / " + i + " = " + serie);

			numero++;
		}
		
		JOptionPane.showMessageDialog(null, "Somatória da série: " + somatoria);
		
		return somatoria;
	}
}