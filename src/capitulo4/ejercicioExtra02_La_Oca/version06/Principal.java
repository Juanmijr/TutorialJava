package capítulo4.ejercicioExtra02_La_Oca.version06;

import javax.swing.JOptionPane;

public class Principal {  

	/**
	 * 
	 */
	public static void main (String args[]) {
			
		
		// Prueba de uso del primer jugador
		Juego juego = new Juego(Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos jugadores van a jugar?")));
		
		juego.crearJugadores();
				
		do {
			juego.ronda();
			//jugador.imprimir();
		} while(!juego.finJuego());
		
		System.out.println("\t HAS GANADO EL JUEGO DE LA OCA!!");
	}
	

}
