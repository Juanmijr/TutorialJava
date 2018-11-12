package capítulo4.ejercicioExtra02_La_Oca.Version05;

public class Principal {

	/**
	 * 
	 */
	public static void main (String args[]) {
		
		// Inicializaci�n e impresi�n del tablero
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
