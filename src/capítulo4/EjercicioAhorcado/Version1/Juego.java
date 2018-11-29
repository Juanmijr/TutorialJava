package capítulo4.EjercicioAhorcado.Version1;

import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
		String palabras [] = new String [] {"tabla", "pelo", "avion"}; 
		String palabra = palabras [((int)Math.round(Math.random()*(palabras.length -1)))];
		String fallosLetras [] = new String [6];
		String fallosPalabras[]= new String [6];
		int contFallos=0;
		boolean existeLetra=false;
		int numintentos=palabra.length();
		char coincidencias[]= new char [palabra.length()];
		for(int i = 0; i<palabra.length();i++) {
			coincidencias[i]= '_';		
		}
		
		String respuesta;
		do {
			existeLetra=false;
			//Petici�n de respuestas
			respuesta = JOptionPane.showInputDialog("Introduzca la letra o palabra de la palabra");
			// Si la respuesta es igual que la palabra 
			if (respuesta.length()>1 && !respuesta.equals(palabra)) {
				contFallos++;
			}
				if (respuesta.length()==1) {
					System.out.println();
					for (int i = 0; i<palabra.length();i++) {
						char decision = respuesta.charAt(0);
						char letraPalabra = palabra.charAt(i);
						if (letraPalabra==decision) {
							coincidencias[i]=decision;
							numintentos--;
							existeLetra=true;
						}
						System.out.print(" " + coincidencias[i] + " ");
					
					}	
				}
					if(existeLetra==false) {
						contFallos++;
						}
					

			

		}while (!(respuesta.equals(palabra)||(contFallos>=6)||(numintentos==0)));
		System.out.println("\n\nEnhorabuena has acertado");
		System.out.println("Los errores son: ");

	}

}

