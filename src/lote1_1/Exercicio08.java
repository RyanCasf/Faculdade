package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio08 {
	public static void main(String[] args) {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(
        		"D�gite o valor do Dep�sito na Poupan�a: "));
        double rendimento = (deposito * 1.013);
        
        JOptionPane.showMessageDialog(
        		null, "O valor do rendimento desse m�s na poupan�a �: "+rendimento);
	}
}