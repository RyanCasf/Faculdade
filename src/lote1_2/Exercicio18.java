package lote1_2;

import javax.swing.JOptionPane;

public class Exercicio18 {
	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("D�gite o primeiro valor: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("D�gite o segundo valor: "));
        
        if (valor1 > valor2)
            JOptionPane.showMessageDialog(null, "A diferen�a do primeiro n�mero pelo segundo �: " + (valor1 - valor2));
        else
            JOptionPane.showMessageDialog(null, "A diferen�a do segundo valor para o primeiro �: " + (valor2 - valor1));
	}
}