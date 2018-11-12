package capítulo4.JuegoOca.Version3;

public class Principal {

	
	
	/**
	 * 
	 */
	public static void main (String args[]) {
		//inicializo e impresión de tablero
		Tablero tablero = new Tablero ();
		tablero.imprimeTablero();

		//Prueba de uso del primer jugador
		Jugador jugador = new Jugador("Rojo");
		do {
			jugador.tirarDado();
			System.out.println("Posición del jugador: " + jugador.getPosicion());
		}while(jugador.getPosicion()<=62);
	}
	
	
	
	

}





