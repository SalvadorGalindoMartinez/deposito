import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class DepositoCombustibleParametrizadaConsumir {
	 private double nivel;
	 private double consumir;
	 private double resultado;
	
	public DepositoCombustibleParametrizadaConsumir(double nivel, double consumir, double resultado) {
		this.nivel = nivel;
		this.consumir = consumir;
		this.resultado = resultado;
	}
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{50,10,40},{50,40,10},{-40,-20,-20}
		});
	}
	@Test
	public void consumirPrueba() {
		DepositoCombustible depo1 = new DepositoCombustible(50.0,nivel);
		
		depo1.consumir(consumir);
		assertEquals(resultado, depo1.getDepositoNivel(), 0);
	}
}
	

