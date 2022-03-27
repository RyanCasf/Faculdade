package teste.lote1_1;

import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Exercicio04 {
	private final Random random = new Random();
	
	@Test
	@DisplayName("Calcular �rea do tri�ngulo")
	@Order(value = 1)
	@RepeatedTest(value = 100)
    public void calcularSalario() {
		double celsius = random.nextDouble();
		assertEquals(celsiusToFahrenheit(celsius), celsiusToFahrenheit(celsius), celsiusToFahrenheit(celsius));
	}
	
	private double celsiusToFahrenheit(double celsius) {
//		F = (9 * C + 160) / 5.
        return ((9 * celsius + 160) / 5);
	}
}