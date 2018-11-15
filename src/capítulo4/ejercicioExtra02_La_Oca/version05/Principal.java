package tutorialJava.capitulo4_OO.ejercicios.ejercicioExtra02_La_Oca.version05;

public class Principal {

	/**
	 * 
	 */
	public static void main (String args[]) {
		
		// Inicialización e impresión del tablero
		Tablero tablero = new Tablero();
		tablero.imprimeTablero();		
		
		// Prueba de uso del primer jugador
		Jugador jugador = new Jugador("Rojo", tablero);
		do {
			jugador.tirarDado();
			jugador.imprimir();
		} while(jugador.getPosicion() < 62);
	}
	
	
}
