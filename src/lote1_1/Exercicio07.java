package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio07 {
	public static void main(String[] args) {
        double comprimento = 
        		Double.parseDouble(JOptionPane.showInputDialog("Dígite o Comprimento do Paralelepípedo: "));
        
        double altura = 
        		Double.parseDouble(JOptionPane.showInputDialog("Dígite a Altura do Paralelepípedo: "));
        
        double largura = 
        		Double.parseDouble(JOptionPane.showInputDialog("Dígite a Largura do Paralelepípedo: "));
        
        double areaP = (comprimento * altura * largura);
        JOptionPane.showMessageDialog(null, "Volume do Paralelepípedo: "+areaP);
	}
}