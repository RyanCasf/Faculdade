package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
    	double salario = Double.parseDouble(JOptionPane.showInputDialog("Dígite o seu salário: R$ "));
    	double salarioReajustado = (salario * 1.15);
        
        JOptionPane.showMessageDialog(null, "O reajuste do salário é: "+salarioReajustado);
    }
}