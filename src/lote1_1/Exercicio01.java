package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        double lado = Integer.parseInt(JOptionPane.showInputDialog("Dígite o lado do Quadrado: "));
        double area = (lado * lado);
        
        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
    }
}