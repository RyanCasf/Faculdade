package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio04 {
	public static void main(String[] args) {
        double celsius = Integer.parseInt(JOptionPane.showInputDialog("Dígite a Temperatura em graus Celsius: (°C) "));
        double fahrenheit = ((9 * celsius + 160) / 5);
        
        JOptionPane.showMessageDialog(null, "Temperatura em graus Fahrenheit: "+fahrenheit+" °F");
	}
}