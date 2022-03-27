package exemplo.sala;

import javax.swing.*;

public class Lt01_EstSimples {
	public static void main(String args[]) {
		// declaração de variáveis
		double x;

		// mensagem ao usuário e entrada de dados
		x = Double.parseDouble(JOptionPane.showInputDialog("Dígite um número real: "));

		// condicionais
		if (x > 0) {
			// saída de resultados
			System.out.println(x + " é positivo");
		} // fim do if
	} // fim do void main
} // fim da classe Positivo