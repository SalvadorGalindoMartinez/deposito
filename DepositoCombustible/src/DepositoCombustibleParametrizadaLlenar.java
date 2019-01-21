import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class DepositoCombustibleParametrizadaLlenar {
	 private double nivel;
	 private double llenado;
	 private double resultado;
	 private double maximo;
	
	public DepositoCombustibleParametrizadaLlenar(double nivel, double llenado, double resultado, double maximo) {
		this.nivel = nivel;
		this.llenado = llenado;
		this.resultado = resultado;
		this.maximo = maximo;
	}
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{20,10,30,50},{0,50,50,50},{-40,60,20,50}
		});
	}
	@Test
	public void llenarPrueba() {
		DepositoCombustible depo1 = new DepositoCombustible(50.0,nivel);
		
		depo1.fill(llenado);
		assertEquals(resultado, depo1.getDepositoNivel(), 0);
	}
}
	