package lote1_4;

import javax.swing.JOptionPane;

public class CaixaEletronicoController {
	public void abrirMenu() {
		Integer caixa = 0;
		int[] notas = new int[6];

		do {
			try {
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
					JOptionPane.showMessageDialog(null, "Dígite uma opção válido!");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Dígite uma opção válido");
			}
		} while (caixa != 9);
	}

	private int[] carregarNotas(int[] notas) {
		for (int i = 0; i < notas.length; i++)
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota: "));

		return notas;
	}

	private final String getTextoMenu() {
		return "CAIXA ELETRÔNICO\n\n1. Carregar Notas\n2. Retirar Notas\n3. Estatistica\n\n9. Fim";
	}
}