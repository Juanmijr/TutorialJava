package capítulo4.ejercicioExtra02_La_Oca.version06;

import javax.swing.JOptionPane;

public class Principal {  

	/**
	 * 
	 */
	public static void main (String args[]) {
			
		
		// Prueba de uso del primer jugador
		Juego juego = new Juego(Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos jugadores van a jugar?")));
		Jugador jugador = new Jugador("Rojo");
		do {
			jugador.tirarDado();
			//jugador.imprimir();
		} while(!jugador.isTerminado());
		
		System.out.println("\t HAS GANADO EL JUEGO DE LA OCA!!");
	}
	

}
