package br.com.fj.exercicio;

import java.util.Random;

public class Exercicio05 {
	public static void main(String[] args) {
		Random random = new Random();
		long numero = random.nextInt(10);
		
		System.out.println("O n�mero " + numero + " �.: " + (isPar(numero) ? "Par" : "�mpar"));
	}
	
	private static boolean isPar(long numero) {
		return (numero % 2 == 0);
	}
}