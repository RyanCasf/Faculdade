package lote1_4;

import javax.swing.JOptionPane;

public class CaixaEletronicoController 
{
	public void abrirMenu() {
		Integer caixa;
		int[] notas = new int[6];
		
		do {
			caixa = Integer.parseInt(JOptionPane.showInputDialog(getTextoMenu()));
			
			switch (caixa) {
				case 1:
					carregarNotas(notas);
					break;
					
				case 2:
					break;
					
				case 3:
					break;
				
				case 9:
					JOptionPane.showMessageDialog(null, "Saindo...");
					break;
				
				default: 
					JOptionPane.showMessageDialog(null, "Digite um valor valido!");
			}
		} while(caixa != 9);
	}
	
	private int[] carregarNotas(int[] notas) {
		for (int i = 0; i < notas.length; i++)
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira sua nota: "));
		
		return notas;
	}
	
	private final String getTextoMenu() {
		return "CAIXA ELETRÔNICO\n\n 1 - Carregar Notas\n 2 - Retirar Notas\n 3 - Estatistica\n 9 - Fim";
	}
}