package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio06 {
	public static void main(String[] args) {
        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Dígite o Primeiro valor (X): "));
        int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Dígite o Segundo valor (Y): "));
        int aux;
        
        aux = primeiroValor;
        primeiroValor = segundoValor;
        segundoValor = aux;
        
        JOptionPane.showMessageDialog(null, "O Primeiro valor (X) é: "+primeiroValor
        		+"\nO Segundo valor (Y) é: "+segundoValor);
	}
}