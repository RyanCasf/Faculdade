package br.com.fj.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
	public static void main(String[] args) {
		imprimirDivisores(3);
	}
	
	private static void imprimirDivisores(int numero) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=1; i<100; i++) {
			if (numero%i == 0) {
				list.add(i);
			}
		}
		
		System.out.println(list.toString());
	}
}