package capítulo6.bloque2;

import java.util.Scanner;

public class PeticionNumero {

	public static int pedirNumeroPar() throws NumeroImparException {
		Scanner sc = new Scanner (System.in);
		int numUsuario = sc.nextInt();
		
		if (numUsuario % 2 == 1 ) {
			throw new NumeroImparException();
		}
	return numUsuario;
	}
	
	public static void main (String[] args) {
System.out.println("Introduce un número: ");
		int num;
		try {
			num = pedirNumeroPar();
			System.out.println("Número: " + num);
		} catch (NumeroImparException e) {
		System.out.println("Numero impar introducido");
		}
		

	}
}
