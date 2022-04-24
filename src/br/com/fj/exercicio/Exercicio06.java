package br.com.fj.exercicio;

public class Exercicio06 {
	public static void main(String[] args) {
		imprimirDesenho(1);
	}
	
	private static void imprimirDesenho(long numero) {
		for (int i=0; i<5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print((numero*j)+"     ");
			}
			
			System.out.println("");
		}
	}
}