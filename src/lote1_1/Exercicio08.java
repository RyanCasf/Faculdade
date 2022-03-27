package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio08 {
	public static void main(String[] args) {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Dígite o valor do Depósito na Poupança: "));
        double rendimento = (deposito * 1.013);
        
        JOptionPane.showMessageDialog(null, "O valor do rendimento desse mês na poupança é: "+rendimento);
	}
}