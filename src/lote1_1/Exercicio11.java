package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio11 {
	public static void main(String[] args) {
		double raio = Double.parseDouble(JOptionPane.showInputDialog("D�gite o raio da circunfer�ncia: "));
        JOptionPane.showMessageDialog(null, "Comprimento da Circunfer�ncia: "+(2 * Math.PI * raio));
	}
}