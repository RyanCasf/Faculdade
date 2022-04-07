package lote1_2;

public class Exercicio39 {
	public static void main(String args[]) {
		double[] casa = new double[65];
		double[] quantidade = new double[65];
		
		qntGraos(casa, quantidade);
	}
	
	public static void qntGraos(double[] casa, double[] quantidade) {
		for (int i = 0; i < casa.length - 1; i++) {
			int j = i + 1;
			
			casa[j] = j;
			quantidade[j] = j;
			
			if (j > 1) {
				quantidade[j] = quantidade[j-1] * 2;				
			}
			
			System.out.print(casa[j] + "");
			System.out.print("/");
			System.out.print(quantidade[j] + " ");
		}
	}
}