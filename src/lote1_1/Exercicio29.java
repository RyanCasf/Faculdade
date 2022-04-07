package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio29 {
	public static void main(String args[]) {
		int tipoInvestimento;
		double valorInvestimento;
		
		tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("            MENU           "
				+ "\n1- Poupan�a"
				+ "\n2 - Renda Fixa"));
		valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento: "));
		
		investir(tipoInvestimento, valorInvestimento);
	}
	
	public static void investir(int tipoInvestimento, double valorInvestimento) {
		double total = 0;
		
		switch (tipoInvestimento) {
			case 1: 
				total = valorInvestimento * 1.03;
				JOptionPane.showMessageDialog(null, "Valor corrigido: " + total);
			break;
			case 2:
				total = valorInvestimento * 1.05;
				JOptionPane.showMessageDialog(null, "Valor corrigido: " + total);
			break;
			default: 
				JOptionPane.showMessageDialog(null, "Saindo...");
			break;
		}
	}
}