package capítulo4.ejercicioExtra02_La_Oca.version06;

public class Juego {

	private Jugador jugadores;
	
	public Juego (int numJugadores) {
		jugadores = new Jugador (comprobarJugadores());
	
		
		crearJugadores();
		
		
	}
	
	private int comprobarJugadores (int numJugadores) {
		
		if(!(numJugadores>=1 && numJugadores<=4)) {
			numJugadores=4;
		}
		return numJugadores;
	}
	
	
	private void crearJugadores() {
		for (int i = 0 ; i<jugadores.length;i++) {
			jugadores[i] = new Jugador(i+1);
		}
	}
	
	public boolean finJuego() {
		
		for(int i=0; i<jugadores.length; i++) {
			if(!jugadores[i].isTerminado()) {
				return true;
			}
		}
		return false;
	}
	
	public void ronda() {
		for (int i = 0; i<jugadores.length; i++) {
			jugadores[i].tirarDado;
		}
	}
	
	
}
