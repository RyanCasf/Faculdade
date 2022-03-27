package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio16 {
	public static void main(String[] args) {
		int horasTrab = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por hora trabalhada: "));
        double desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o desconto: "));
        int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes: "));
        
        desconto = 1 - (desconto / 100);
        
        JOptionPane.showMessageDialog(null, "Valor do salário trabalhado: " + (horasTrab * valorHora * desconto + (dependentes * 100)));
	}
}