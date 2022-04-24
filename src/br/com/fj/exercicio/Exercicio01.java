package br.com.fj.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Exercicio01 {
	public static void main(String[] args) {
		System.out.println("Cotagem de 150 - 300");
		List<Integer> lista = contagem.apply(150, 300);
		System.out.println(lista.toString());
	}

	static BiFunction<Integer, Integer, List<Integer>> contagem = (inicial, fim) -> {
		List<Integer> list = new ArrayList<Integer>();

		while (inicial < fim) {
			list.add(inicial);
			inicial++;
		}

		return list;
	};
}