package lote1_1;

import javax.swing.JOptionPane;

public class Exercicio12 {
	public static void main(String[] args) {
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento: "));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));
        
        JOptionPane.showMessageDialog(null, "Idade atual: " + (anoAtual - anoNasc) + 
                "\nIdade daqui 17 anos: " + ((anoAtual - anoNasc) + 17));
	}
}