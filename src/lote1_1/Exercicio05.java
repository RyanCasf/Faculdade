package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Dígite o valor do coeficiente A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Dígite o valor do coeficiente B: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Dígite o valor do coeficiente C: "));

        double delta = ((b * b) - (4 * a * c));
        double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
        double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
        
        JOptionPane.showMessageDialog(null, "Sua 1º raiz é: "+x1
        		+"\nSua 2º raiz é: "+x2);
	}
}