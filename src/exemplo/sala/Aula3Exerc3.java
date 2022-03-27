package exemplo.sala;

public class Aula3Exerc3 {
	public static void main(String[] args) {
		int dado1, dado2;
		
		dado1 = 1;
		dado2 = 6;
		int i = 1;
		
		while (i<=6) {
			if (dado1 + dado2 == 7)
				System.out.println(dado1+" + "+dado2+" = 7");
			
			dado1 = dado1 + 1;
			dado2 = dado2 - 1;
			i = i + 1;
		}
	}
}