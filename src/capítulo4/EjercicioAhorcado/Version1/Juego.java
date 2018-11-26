package capítulo4.EjercicioAhorcado.Version1;

import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
		String palabras [] = new String [] {"tabla", "pelo", "avion"}; 
		String palabra = palabras [((int)Math.round(Math.random()*(palabras.length -1)))];
		String fallos [] = new String [6];
		int contFallos=0;
		boolean bandera;
		int numintentos;
		char coincidencias[]= new char [palabra.length()];
		for(int i = 0; i<palabra.length();i++) {
			coincidencias[i]= '_';
		}
		String respuesta;
		do {
			//Petición de respuestas
			respuesta = JOptionPane.showInputDialog("Introduzca la letra o palabra de la palabra");
			// Si la respuesta es igual que la palabra 
			if (respuesta.equals(palabra)) {
				bandera = true;
			}
			else {
				if (respuesta.length()==1) {
					for (int i = 0; i<palabra.length();i++) {
						char decision = respuesta.charAt(0);
						char letraPalabra = palabra.charAt(i);
						System.out.print(coincidencias[i] + " ");
						if (letraPalabra==decision) {
							coincidencias[i]=decision;
							System.out.print(" " + coincidencias[i] + " ");
						}
						else {
							
						}	
						}
				}
			}
//
		}while (bandera=true);
		System.out.println("\n\nEnhorabuena has acertado");


}
}

