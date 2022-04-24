package br.com.fj.exercicio;

public class Exercicio04 {
	public static void main(String[] args) {
		for (int i=0; i<11; i++) {
			System.out.println("Fatorial de " + i + " é.: " + fatorial(i));
		}
	}

	private static long fatorial(long numero) {
		if (numero < 0) {
			return numero;
		}
		
		return (numero == 0 ? 1 : (numero * (fatorial(numero - 1))));
	}
}