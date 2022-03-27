package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio10 {
	public static void main(String[] args) {
		double real1 = Double.parseDouble(JOptionPane.showInputDialog("Dígite o Primeiro Real: "));
        double real2 = Double.parseDouble(JOptionPane.showInputDialog("Dígite o Segundo Real: "));
        
        JOptionPane.showMessageDialog(
        		null, "A diferença entre os valores reais é: "+(real1 - real2));
	}
}