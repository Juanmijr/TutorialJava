package capítulo4.ejercicioExtra02_La_Oca.version04;

public class Principal {

	/**
	 * 
	 */
	public static void main (String args[]) {
		
		// Inicialización e impresión del tablero
		Tablero tablero = new Tablero();
		tablero.imprimeTablero();		
		
		// Prueba de uso del primer jugador
		Jugador jugador = new Jugador("Rojo");
		do {
			jugador.tirarDado();
			jugador.imprimir();
		} while(jugador.getPosicion() < 62);
	}
	
	
}
