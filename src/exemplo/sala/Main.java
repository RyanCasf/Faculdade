package exemplo.sala;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int num1, num2, a, b = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "D�gite o primeiro n�mero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "D�gite o segundo n�mero: "));
		
		if (num1 > num2) {
			System.out.println("O n�mero maior �: "+num1);
			
			for (a = num2; a <= num1; a++)
				if (a % 2 == 0)
					b = b + a;
			
			System.out.println("A somat�ria dos n�meros �mpares �: "+b);
		}
		else {
			System.out.println("O n�mero maior �: "+num2);
			
			for (a = num1; a <= num2; a++)
				if (a % 2 == 0)
					b = b + a;
			
			System.out.println("A somat�ria dos n�meros �mpares �: "+b);
		}
	}
}