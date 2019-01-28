package simulacroexamen;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Parametrizada {
	private int num1 ;
	private int num2;
	private int num3;
	private int[] resultados;
	
	public Parametrizada(int num1, int num2, int num3, int[] resultados) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.resultados = resultados;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {{6,3,2},{6,-3,-2},{6,3,3}});
	}
	
	@Test
	public void testMayorMenor () {
		Menormayor_primo test = new Menormayor_primo ();
		int [] res = test.numeroMayor(num1, num2, num3);
		assertArrayEquals(resultados, res);
	}
	
	@Test
	public void testPrimos () {
		Menormayor_primo test = new Menormayor_primo ();
		int[] res = test.numerosPrimos(num1);
		assertArrayEquals(resultados, res);
	}
	

}
