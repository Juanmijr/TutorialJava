package capitulo4.Ejercicioprueba;

import javax.swing.JOptionPane;

public class Menormayor_primo {

	public static void main(String[] args) {
		// EJERCICIO1
		int numeroElegido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		int array[] = numerosPrimos(numeroElegido);
		for (int i = 0; i< array.length; i++) {
		System.out.print (array[i]+ " ");
		}
		// EJERCICIO2
		int numero1= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		
		int mayormenor[] = numeroMayor(numero1,numero2, numero3);
		
			System.out.print ("El número mayor es: "+mayormenor[0] + 
					"\n El número menor es: " + mayormenor[1]);
		
		
	}

	public static int[] numerosPrimos (int numeroElegido) {
		int numerosPrimos[]= new int [3];
		int contador = 0;
		for (int i = numeroElegido; i > 0; i--) {
			if (i % 2 != 0 && i % 3 != 0 && i % 3 != 0 && i%5 !=0 && contador<=2) {
				numerosPrimos[contador]= i;
				contador++;
			
			}
		}
		
		return numerosPrimos;
	}
	
	public static int[] numeroMayor (int numero1, int numero2, int numero3) {
		int array[] = new int [2];
		
		if (numero1 > numero2 && numero1 > numero3) {
			array[0] = numero1;
		}
		if (numero2 > numero3 && numero2 > numero1) {
			array[0] = numero2;
		}
		if (numero3 > numero2 && numero3 > numero1) {
			array[0] = numero3;
		}
		if (numero1 < numero2 && numero1 < numero3) {
			array[1] = numero1;
		}
		if (numero2 < numero1 && numero2 < numero3) {
			array[1] = numero2;
		}
		if (numero3 < numero2 && numero3 < numero1) {
			array[1] = numero3;
		}
		return array;
	}
}
