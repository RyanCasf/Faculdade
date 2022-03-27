package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio15 {
	public static void main(String[] args) {
		double cateto1 = Double.parseDouble(JOptionPane.showInputDialog(
				"Dígite o valor do Primeiro Cateto: "));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog(
        		"Dígite o valor do Segundo Cateto: "));
        
        JOptionPane.showMessageDialog(
        		null, "O valor da Hipotenusa: "+(Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2))));
	}
}