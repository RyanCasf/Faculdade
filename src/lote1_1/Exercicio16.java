package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio16 {
	public static void main(String[] args) {
		int horasTrab = Integer.parseInt(JOptionPane.showInputDialog(
				"D�gite a quantidade de horas trabalhadas: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog(
        		"D�gite o valor por hora trabalhada: "));
        double desconto = Double.parseDouble(JOptionPane.showInputDialog(
        		"D�gite o desconto: "));
        int dependentes = Integer.parseInt(JOptionPane.showInputDialog(
        		"D�gite a quantidade de dependentes: "));
        
        desconto = 1 - (desconto / 100);
        JOptionPane.showMessageDialog(
        		null, "Valor do Sal�rio Trabalhado: " + (horasTrab * valorHora * desconto + (dependentes * 100)));
	}
}