package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio09 {
	public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Dígite o Primeiro valor: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Dígite o Segunda valor: "));
        
        JOptionPane.showMessageDialog(
        		null, "A soma dos quadrados é: "+((num1 * num1)+(num2 * num2)));
	}
}