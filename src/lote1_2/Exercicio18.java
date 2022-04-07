package lote1_2;

import javax.swing.JOptionPane;

public class Exercicio18 {
	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Dígite o primeiro valor: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Dígite o segundo valor: "));
        
        if (valor1 > valor2)
            JOptionPane.showMessageDialog(null, "A diferença do primeiro número pelo segundo é: " + (valor1 - valor2));
        else
            JOptionPane.showMessageDialog(null, "A diferença do segundo valor para o primeiro é: " + (valor2 - valor1));
	}
}