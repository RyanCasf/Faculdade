package exemplo.sala;

import javax.swing.JOptionPane;

public class Lt01_EscolhaCaso {
	public static void main(String[] args) {
		int codigo;
		double salario;
		double aumento = 0;
		String cargo;
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do cago: "));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio atual: "));
		
		switch (codigo) {
			case 1:
				cargo = "Escritur�rio";
				aumento = (salario * 0.50);
				salario = salario + aumento;
				System.out.println("O cargo " + cargo + " ter� um aumento de " + aumento
						+ " reais e seu novo sal�rio ser�: " + salario + " reais");
				break;
				
			case 2:
				cargo = "Secret�rio";
				aumento = (salario * 0.35);
				salario = salario + aumento;
				System.out.println("O cargo " + cargo + " ter� um aumento de " + aumento
						+ " reais e seu novo sal�rio ser�: " + salario + " reais");
				break;
				
			case 3:
				cargo = "Caixa";
				aumento = (salario * 0.20);
				salario = salario + aumento;
				System.out.println("O cargo " + cargo + " ter� um aumento de " + aumento
						+ " reais e seu novo sal�rio ser�: " + salario + " reais");
				break;
				
			case 4:
				cargo = "Gerente";
				aumento = (salario * 0.10);
				salario = salario + aumento;
				System.out.println("O cargo " + cargo + " ter� um aumento de " + aumento
						+ " reais e seu novo sal�rio ser�: " + salario + " reais");
				break;
				
			default:
				cargo = "N�o h� cargo";
				System.out.println(cargo);
		}
	}
}