package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio10 {
	public static void main(String[] args) {
		double real1 = Double.parseDouble(JOptionPane.showInputDialog("D�gite o Primeiro Real: "));
        double real2 = Double.parseDouble(JOptionPane.showInputDialog("D�gite o Segundo Real: "));
        
        JOptionPane.showMessageDialog(
        		null, "A diferen�a entre os valores reais �: "+(real1 - real2));
	}
}