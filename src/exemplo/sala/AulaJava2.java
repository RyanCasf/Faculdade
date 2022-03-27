package exemplo.sala;

public class AulaJava2 {
	public static void main(String[] args) {
		int num;
		int quad;
		num = 10;
		
		while (num >= 10 && num <= 150) {
			quad = num * num;
			System.out.println("O quadrado de "+num+" é: "+quad);
			num = num + 1;
		}
	}
}