package enzo.Calculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesIntrodutórios {

	@Test
	public void teste_de_soma() {
		Calculadora calc = new Calculadora();
		double total = calc.somar(10, 10.25);		
		assertEquals(20.25, total, 0);
		
		total = calc.somar(15, 77.10);		
		assertEquals(92.10, total, 0);
	}
	@Test
	public void testeSubtração() {
			Calculadora calc = new Calculadora();
			double total = calc.subtracao(10, 8);		
			assertEquals(2, total, 0);
			
			total = calc.subtracao(28, 11);		
			assertEquals(17, total, 0);
	}
	@Test
	public void testeDivisão() {
			Calculadora calc = new Calculadora();
			double total = calc.divisao(10, 2);		
			assertEquals(5, total, 0);
			
			total = calc.divisao(40, 5);		
			assertEquals(8, total, 0);
	}
	@Test
	public void testeMultiplicação() {
		Calculadora calc = new Calculadora();
		double total = calc.Mult(50, 2);		
		assertEquals(100, total, 0);
		
		total = calc.Mult(150, 5);		
		assertEquals(750, total, 0);
	}
}
