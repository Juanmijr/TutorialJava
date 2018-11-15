package capítulo4.ejercicioExtra02_La_Oca.version06;

public class Principal {  

	/**
	 * 
	 */
	public static void main (String args[]) {
			
		
		// Prueba de uso del primer jugador
		Jugador jugador = new Jugador("Rojo");
		do {
			jugador.tirarDado();
			jugador.imprimir();
		} while(jugador.getPosicion() < 62);
	}
	
	
}
