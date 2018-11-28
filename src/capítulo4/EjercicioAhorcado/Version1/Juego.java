package capítulo4.EjercicioAhorcado.Version1;

import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
		String palabras [] = new String [] {"tabla", "pelo", "avion"}; 
		String palabra = palabras [((int)Math.round(Math.random()*(palabras.length -1)))];
		String fallos [] = new String [6];
		int contFallos=0;
		boolean aciertos;
		boolean fallos6;
		int numintentos=palabra.length();
		char barra = '_';
		int contBarras;
		char coincidencias[]= new char [palabra.length()];
		for(int i = 0; i<palabra.length();i++) {
			coincidencias[i]= '_';		
		}
		
		String respuesta;
		do {
			//Petici�n de respuestas
			respuesta = JOptionPane.showInputDialog("Introduzca la letra o palabra de la palabra");
			// Si la respuesta es igual que la palabra 
			if (respuesta.equals(palabra)) {
				aciertos = true;
			}
			else {
				if (respuesta.length()==1) {
					System.out.println();
					for (int i = 0; i<palabra.length();i++) {
						char decision = respuesta.charAt(0);
						char letraPalabra = palabra.charAt(i);
						if (letraPalabra==decision) {
							coincidencias[i]=decision;
							numintentos--;
						}
						System.out.print(" " + coincidencias[i] + " ");
						
						
					
					}	
				}
					else {
						for (int i=0;i<fallos.length;i++) {
						contFallos++;
						fallos[i]=respuesta;
						if(contFallos>=6){
							fallos6=true;
						}
						}
					}
			}
			

		}while (respuesta.equals(palabra)||pala);
		System.out.println("\n\nEnhorabuena has acertado");
	


}
}

