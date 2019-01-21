import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {
	
	DepositoCombustible depo1 = new DepositoCombustible(50.0,0.0);


	@Test
	public void getDepositoNivelPrueba() {
		double resultado = depo1.getDepositoNivel();
		double esperado = 0.0;
		assertEquals(esperado,resultado,0);
		//System.out.println(resultado);
		}
	
	@Test
	public void getDepositoMaxPrueba() {
		double resultado = depo1.getDepositoMax();
		double esperado = 50.0;
		assertEquals(esperado,resultado,0);
	}
	
	@Test
	public void vacioPrueba() {
		
		assertTrue(depo1.estaVacio());
	}
	
	@Test
	public void mitadPrueba() {
		depo1.fill(25);
		double max = depo1.getDepositoMax();
		double nivel = depo1.getDepositoNivel();
		double resultado = max/nivel;
		double esperado = 2;
		assertEquals(esperado, resultado,0);
	}
	
	@Test
	public void consumirPrueba() {
		depo1.consumir(10);
		System.out.println(depo1.getDepositoNivel());
		depo1.consumir(200);
		System.out.println(depo1.getDepositoNivel());
		depo1.consumir(-20);
		System.out.println(depo1.getDepositoNivel());
	}
}
