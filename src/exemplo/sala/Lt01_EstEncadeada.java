package exemplo.sala;

import javax.swing.*;

public class Lt01_EstEncadeada {
	public static void main(String args[]) {
		// declaração de variáveis
		double n1, n2, n3, n4, media; 
		
		// mensagem ao usuário e entrada de dados
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Dígite uma Nota Bimestral: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Dígite uma Nota Bimestral: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Dígite uma Nota Bimestral: "));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Dígite uma Nota Bimestral: "));
		
		// processamento de dados
		media = (n1 + n2 + n3 + n4) / 4;
		
		// saída de resultados
		System.out.println("A média é: " + media);
		
		// Condicionais
		if (media >= 7) {
			System.out.println("Aluno aprovado");
		} else {
			if (media < 3) {
				System.out.println("Aluno reprovado");
			} else {
				System.out.println("Aluno em exame");
			} // do media < 3
		} // do media >= 7
	} // fim do void main
} // fim da classe} //fim da classe