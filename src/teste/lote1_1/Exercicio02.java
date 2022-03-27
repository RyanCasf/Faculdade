package teste.lote1_1;

import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Exercicio02 {
private final Random random = new Random();
	
	@Test
	@DisplayName("Calcular Salário")
	@Order(value = 1)
	@RepeatedTest(value = 100)
    public void calcularSalario() {
		double salario = random.nextDouble();
		assertEquals(reajustarSalario(salario), (salario * 1.15), (salario * 1.15));
	}
	
	private double reajustarSalario(double salario) {
		return (salario * 1.15);
	}
}