package capítulo4.ejercicioExtra02_La_Oca.version06.pormi;

public class Juego {

	public Jugador jugadores[] = null;
	
	public Juego (int numJugadores) {
		
		jugadores = new Jugador [numJugadores];
		
	}
	
	
	public Juego crearJugadores() {
		for (int i = 0 ; i<this.jugadores.length;i++) {
			this.jugadores[i].setNombre("Jugador"+i);
		}
		return this;
		
	}
	
	public boolean finJuego() {
		
		for(int i=0; i<jugadores.length; i++) {
			if(jugadores[i].isTerminado()) {
				return true;
			}
		}
		return false;
	}
	
	public void ronda() {
		for (int i = 0; i<jugadores.length; i++) {
			jugadores[i].tirarDado();
		}
	}
	
	
}
