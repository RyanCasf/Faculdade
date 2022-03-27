package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio13 {
	public static void main(String[] args) {
		int quantAlimento = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alimentos (Kg): "));
        quantAlimento *= 1000;
        JOptionPane.showMessageDialog(null, "A comida durará: " + (quantAlimento / 50));
	}
}