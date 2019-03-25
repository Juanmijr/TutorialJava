package simulacroexamen;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class JUnit {

	@Test
	void testNumeroMayor() {
		Menormayor_primo menormayor = new Menormayor_primo();
		int [] resultado = menormayor.numeroMayor(9,4,5);
		int [] loquecreo = new int [2];
		loquecreo [0] = 9;
		loquecreo [1] =4;
		assertArrayEquals(loquecreo, resultado);
 	}

}
