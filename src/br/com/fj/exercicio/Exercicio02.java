package br.com.fj.exercicio;

import java.util.function.BiFunction;

public class Exercicio02 {
	public static void main(String[] args) {
		System.out.println("Soma de 1 - 1000");
		int result = somarInicioAFim.apply(1, 1000);
		
		System.out.println(result);
	}
	
	static BiFunction<Integer, Integer, Integer> somarInicioAFim = (inicio, fim) -> {
		int result = inicio;
		while (inicio < fim) {
			inicio++;
			result += inicio;
		}
		
		return result;
	};
}