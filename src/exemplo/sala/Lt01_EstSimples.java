package exemplo.sala;

import javax.swing.*;

public class Lt01_EstSimples {
	public static void main(String args[]) {
		// declara��o de vari�veis
		double x;

		// mensagem ao usu�rio e entrada de dados
		x = Double.parseDouble(JOptionPane.showInputDialog("D�gite um n�mero real: "));

		// condicionais
		if (x > 0) {
			// sa�da de resultados
			System.out.println(x + " � positivo");
		} // fim do if
	} // fim do void main
} // fim da classe Positivo