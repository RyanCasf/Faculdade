package teste.lote1_1;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Exercicio03 
{
	private final Random random = new Random();
	
	@Test
	@DisplayName("Calcular área do triângulo")
	@Order(value = 1)
	@RepeatedTest(value = 100)
    public void calcularSalario() {
		double base = random.nextDouble();
		double altura = random.nextDouble();
		
		assertEquals(calcularArea(base, altura), ((base * altura) / 2), (base * altura) / 2);
	}
	
	private double calcularArea(double baseP, double alturaP) {
		double base = baseP;
		double altura = alturaP;
        
        return ((base * altura) / 2);
	}
}