package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio07 {
	public static void main(String[] args) {
        double comprimento = 
        		Double.parseDouble(JOptionPane.showInputDialog("D�gite o Comprimento do Paralelep�pedo: "));
        
        double altura = 
        		Double.parseDouble(JOptionPane.showInputDialog("D�gite a Altura do Paralelep�pedo: "));
        
        double largura = 
        		Double.parseDouble(JOptionPane.showInputDialog("D�gite a Largura do Paralelep�pedo: "));
        
        double areaP = (comprimento * altura * largura);
        JOptionPane.showMessageDialog(null, "Volume do Paralelep�pedo: "+areaP);
	}
}