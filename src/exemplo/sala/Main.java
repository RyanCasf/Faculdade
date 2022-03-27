package exemplo.sala;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int num1, num2, a, b = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dígite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dígite o segundo número: "));
		
		if (num1 > num2) {
			System.out.println("O número maior é: "+num1);
			
			for (a = num2; a <= num1; a++)
				if (a % 2 == 0)
					b = b + a;
			
			System.out.println("A somatória dos números ímpares é: "+b);
		}
		else {
			System.out.println("O número maior é: "+num2);
			
			for (a = num1; a <= num2; a++)
				if (a % 2 == 0)
					b = b + a;
			
			System.out.println("A somatória dos números ímpares é: "+b);
		}
	}
}