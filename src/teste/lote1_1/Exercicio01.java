package teste.lote1_1;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Exercicio01 
{
	private final Random random = new Random();
	
	@Test
	@DisplayName("Calcular área")
	@Order(value = 1)
	@RepeatedTest(value = 10)
    public void testShowInputDialog() {
		double lado = random.nextDouble();
		assertEquals(calcularArea(lado), (lado * lado), (lado * lado)) ;
    }
	
	private double calcularArea(double lado) {
        return (lado * lado);
	}
}