package exemplo.sala;

import javax.swing.*;

public class Lt01_EstComposta {
	public static void main(String args[]) {
		// declara��o de vari�veis e/ou constantes
		int num1, num2, num3, soma;
		
		// mensagem ao usu�rio e entrada de dados
		num1 = Integer.parseInt(JOptionPane.showInputDialog("D�gite um valor inteiro: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("D�gite um valor inteiro: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("D�gite um valor inteiro: "));
		
		// processamento de dados
		soma = num1 + num2 + num3;
		
		// sa�da de resultados
		System.out.println("A soma dos tr�s valores digitados �: " + soma);
		if (soma > 100) {
			// sa�da de resultados
			System.out.println("A soma � maior que 100");
		} // fim do if
		else {
			// sa�da de resultados
			System.out.println("A soma � menor ou igual a 100");
		} // fim do else
	} // fim do void main
} // fim da classe