package lote1_2;

import javax.swing.JOptionPane;

public class Exercicio43 {
	public static void main(String args[]) {
		double ana = 1.1, maria = 1.5, crescAna = 0.03, crescMaria = 0.02;
		int anos = 0;
		
		anos = igualitarIdades(ana, maria, crescAna, crescMaria, anos);
		
		JOptionPane.showMessageDialog(null, "Ser�o necess�rios " + anos + " anos para Ana ficar maior que Maria");
	}

	private static int igualitarIdades(double ana, double maria, double crescAna, double crescMaria, int anos) {
		do {
			ana += crescAna;
			maria += crescMaria;
		
			anos++;
		} while (ana <= maria);
		return anos;
	}
}