package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio17 {
	public static void main(String[] args) {
		int tempoPercurso = Integer.parseInt(JOptionPane.showInputDialog(
				"D�gite o tempo de percurso (H): "));
        double velocMedia = Double.parseDouble(JOptionPane.showInputDialog(
        		"D�gite a velocidade m�dia (Km): "));
        
        double distancia = tempoPercurso * velocMedia;
        double gastoCombustivel = distancia / 12;
        
        JOptionPane.showMessageDialog(
        		null, "A quantidade de litros gastos �: "+gastoCombustivel);
	}
}