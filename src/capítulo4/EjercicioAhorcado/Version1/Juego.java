package capítulo4.EjercicioAhorcado.Version1;

import javax.swing.JOptionPane;

public class Juego {

	
		static String palabras [] = new String [] {"tabla", "pelo", "avion"}; 
		static String palabra = palabras [((int)Math.round(Math.random()*(palabras.length -1)))];
		static String fallo [] = new String [6];
		static int contIndice = 0;
		static int contFallos=0;
		static boolean existeLetra=false;
		static int numintentos=palabra.length();
		static String respuesta;
		static char[] coincidencias= new char [palabra.length()];
		
		
	public static void comienzajuego() {

	for(int i = 0; i<palabra.length();i++) {
		coincidencias[i]= '_';		
	}
		do {
			existeLetra=false;
			//Petici�n de respuestas
			respuesta = JOptionPane.showInputDialog("Introduzca la letra o palabra de la palabra");
			// Si la respuesta es igual que la palabra 
			if (respuesta.length()>1 && !respuesta.equals(palabra)) {
				contFallos++;
				fallo[contIndice]=respuesta;
				System.out.println("\n Errores: ");
				for(int i=0;i<fallo.length;i++) {
					if(fallo[i]==null) {
						fallo[i]=" ";
					}
					System.out.print(" " + fallo[i]+ " ");
				}
				contIndice++;
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
				
					if(existeLetra==false) {
						contFallos++;
						fallo[contIndice]=respuesta;
						System.out.println("\n Errores: ");
						for(int i=0;i<fallo.length;i++) {
							if(fallo[i]==null) {
								fallo[i]="";
							}
							System.out.print(fallo[i]+ " ");
						}
						contIndice++;
						}
				}
					

			

		}while (!(respuesta.equals(palabra)||(contFallos>=6)||(numintentos==0)));
	}
		


}



