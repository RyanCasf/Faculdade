package exemplo.sala.estrutura.sequencial;

/*
 * Nome do programa : ExercLt1_02 Objetivo : Receba o salário de um funcionário
 * e mostre o novo salário com reajuste de 15% Nome do Programador : Ricardo
 * Satoshi Data de desenvolvimento : 15/02/2018
 */
import javax.swing.JOptionPane;

public class ExercLt1_02 {
	public static void main(String args[]) {
		Double SalarioReceber, SalarioReajuste;
		SalarioReceber = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM SALÁRIO "));
		SalarioReajuste = SalarioReceber * 1.15;
		JOptionPane.showMessageDialog(null, "SALÁRIO COM REAJUSTE  " + SalarioReajuste);
	}
}