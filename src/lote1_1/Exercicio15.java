package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio15 {
	public static void main(String[] args) {
		double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro cateto: "));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo cateto: "));
        
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa: " + (Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2))));
	}
}