package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio09 {
	public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("D�gite o Primeiro valor: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("D�gite o Segunda valor: "));
        
        JOptionPane.showMessageDialog(
        		null, "A soma dos quadrados �: "+((num1 * num1)+(num2 * num2)));
	}
}