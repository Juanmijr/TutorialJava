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

		//Creo bucle for para saber letra por letra las coincidencias 
		for (int i = 0 ; i < palabra.length();i++) {
			char coincidencias[]= new char [palabra.length()];
			coincidencias [i] = '_';
			System.out.print(coincidencias[i] + " ");
		}
		System.out.println(" ");
		do {
			for (int i =0; i<6;i++) {
				//Petición de respuestas
				String respuesta = JOptionPane.showInputDialog("Introduzca la letra o palabra de la palabra");
				//Elige si es palabra o si es letra
				if (respuesta.length()>1){ 
					if (respuesta.equals(palabra)) {
						bandera = true;
					}
					else {
						contFallos ++; 
						fallos [i] = respuesta;
					}
				}
				else {
					
				}
				System.out.print(fallos[i]+ " ");
			}
		}while (bandera=false);
		System.out.println("Enhorabuena has acertado");


}
}

