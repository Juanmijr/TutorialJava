package capitulo4.EjercicioAhorcado.Version1;

import javax.swing.JOptionPane;

public class Juego {

	
		static String palabras [] = new String [] {"tabla", "pelo", "avion"}; 
		static String fallo [] = new String [6];
		static String palabra= palabras [((int)Math.round(Math.random()*(palabras.length -1)))];
		static int contIndice = 0;
		static int contFallos=0;
		public static Juego juego = null;
		static boolean existeLetra=false;
		static int numintentos=palabra.length();
		static String respuesta;
		static char[] coincidencias= new char [palabra.length()];
		static boolean juegoTerminado = false;
		
	public static void comienzajuego() {

		
		for (int i=0;i<fallo.length;i++) {
		if (fallo[i]==null) {
			fallo[i] = " ";
		}
		}
	for(int i = 0; i<palabra.length();i++) {
		coincidencias[i]= '_';		
	}
		do {
						
			existeLetra=false;
			//Peticiï¿½n de respuestas
			respuesta = JOptionPane.showInputDialog("Introduzca la letra o palabra de la palabra");
			//Si respuesta es igual a palabra
			if (respuesta.equals(palabra)) {
				for(int i = 0 ; i<palabra.length();i++) {
					//Decimos que imprima la palabra
					coincidencias[i]= palabra.charAt(i);
				}
				//Repinta la ventana
				Ventana.getventana().repaint();
			}
			// Si la respuesta no es igual que la palabra y mas de un caracter
			if (respuesta.length()>1 && !respuesta.equals(palabra)) {
				//Sumamos el contador de fallos
				contFallos++;
				//le decimos que metemos los fallos
				fallo[contIndice]=respuesta;
				//Sacamos los errores
				System.out.println("\n Errores: ");
				for(int i=0;i<fallo.length;i++) {
					if(fallo[i]==null) {
						fallo[i]=" ";
					}
					System.out.print(" " + fallo[i]+ " ");
					Ventana.getventana().repaint();
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
						Ventana.getventana().repaint();
					
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
							Ventana.getventana().repaint();
						}
						contIndice++;
						}
				}
					
				if (respuesta.equals(palabra)|| numintentos==0) {
					System.out.println("\nEnhorabuena, has acertado!!");
					JOptionPane.showMessageDialog(null, "Enhorabuena, has acertado la palabra" + palabra);
				}
				if(contFallos==6) {
					System.out.println("\nHas perdido");
					JOptionPane.showMessageDialog(null, "Has sobrepasado el número de fallos, la palabra correcta es: " + palabra);
				}
					
				if (respuesta=="hint") {
					int i = ((int)Math.round(Math.random()*(palabra.length() -1)));
					coincidencias[i]=palabra.charAt(i);
				}
			

		}while (!(respuesta.equals(palabra)||(contFallos>=6)||(numintentos==0||respuesta=="hint")));
		juegoTerminado = true;
	

	}
	


	public static String[] getPalabras() {
		return palabras;
	}


	public static void setPalabras(String[] palabras) {
		Juego.palabras = palabras;
	}


	public static String getPalabra() {
		return palabra;
	}


	public static void setPalabra(String palabra) {
		Juego.palabra = palabra;
	}


	public static String[] getFallo() {
		return fallo;
	}


	public static void setFallo(String[] fallo) {
		Juego.fallo = fallo;
	}


	public static int getContIndice() {
		return contIndice;
	}


	public static void setContIndice(int contIndice) {
		Juego.contIndice = contIndice;
	}


	public static int getContFallos() {
		return contFallos;
	}


	public static void setContFallos(int contFallos) {
		Juego.contFallos = contFallos;
	}


	public static boolean isExisteLetra() {
		return existeLetra;
	}


	public static void setExisteLetra(boolean existeLetra) {
		Juego.existeLetra = existeLetra;
	}


	public static int getNumintentos() {
		return numintentos;
	}


	public static void setNumintentos(int numintentos) {
		Juego.numintentos = numintentos;
	}


	public static String getRespuesta() {
		return respuesta;
	}


	public static void setRespuesta(String respuesta) {
		Juego.respuesta = respuesta;
	}


	public static char[] getCoincidencias() {
		return coincidencias;
	}


	public static void setCoincidencias(char[] coincidencias) {
		Juego.coincidencias = coincidencias;
	}
		
	public static Juego getJuego() {
		if (juego==null) {
			juego=new Juego();
		}
		return juego;
	}


}



