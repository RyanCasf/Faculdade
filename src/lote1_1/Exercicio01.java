package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        int lado = Integer.parseInt(JOptionPane.showInputDialog("D�gite o lado do Quadrado: "));
        int area = (lado * lado);
        
        JOptionPane.showMessageDialog(null, "A �rea do quadrado �: " + area);
    }
}