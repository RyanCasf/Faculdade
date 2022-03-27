package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio19 {
	public static void main(String[] args) {
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog(
				"Dígite o primeiro valor real: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog(
        		"Dígite o segundo valor real: "));
        
        if (valor1 > valor2)
            JOptionPane.showMessageDialog(null, "Primeiro valor: " + valor1);
        else
            JOptionPane.showMessageDialog(null, "Segundo valor: " + valor2);
	}
}