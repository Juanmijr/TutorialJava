package simulacroexamen;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ParametrizadPrimo {
	private int numprimo;
	private int [] resultados;
	
	public ParametrizadPrimo(int numprimo,int[] resultados) {
		super();
		this.numprimo = numprimo;
		this.resultados = resultados;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {{100, new int[]{97,89,83}}});
	}
	
	
	@Test
	public void testPrimos () {
		Menormayor_primo test = new Menormayor_primo ();
		int[] res = Menormayor_primo.numerosPrimos(numprimo);
		assertArrayEquals(resultados, res);
	}
	
}
