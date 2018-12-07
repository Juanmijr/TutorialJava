package capítulo4.ejercicioExtra02_La_Oca.version07;



public class Principal {  
	String nombresJugadores;
	/**
	 * 
	 */
	public static void main (String args[]) {
			String nombresJugadores[] = new String [] {"Juanmi", "Jesús", "Enrique"};
			
			Jugador jugadores[]= new Jugador [4];
			for (int i = 0; i<jugadores.length;i++) {
				jugadores[i]= new Jugador(nombresJugadores[i]);
			}
			do {
				for (int i = 0; i<jugadores.length;i++) {
				if (!jugadores[i].isTerminado()) {
						System.out.println(jugadores[i].getNombre());
					jugadores[i].tirarDado();
				}
				if(jugadores[i].isTerminado()) {
					jugadores[i].setPodium(getMaxValorEnPodiumDeJugadores(jugadores) + 1);
				}
				}
			} while(!estaJuegoTerminado(jugadores));

	
	//IMPRESIÓN
			ordenaArrayJugadoresPorPodium(jugadores);
			System.out.println("\n\nOrdenación buena");
			for(int i=0; i<jugadores.length; i++) {
				System.out.println(jugadores[i].toString());			
				}
			
	}
	
	private static void ordenaArrayJugadoresPorPodium (Jugador jugadores[]) {
		for (int i =jugadores.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (jugadores[j].getPodium() > jugadores[j+1].getPodium()) {
					Jugador aux = jugadores[j];
					jugadores[j] = jugadores[j+1];
					jugadores [j+1] = aux;
				}
			}
		}
	}
	
	public static int getMaxValorEnPodiumDeJugadores(Jugador jugadores[]) {
		int maxValor =  0;
		
		for (int i = 0; i<jugadores.length; i++) {
		    	maxValor=jugadores[0].getPodium();
		    	for(int j = i+1 ; j < jugadores.length ; j++) {
		        	if (jugadores[i].getPodium() > maxValor) { 
		           		maxValor=jugadores[i].getPodium();
		        }
		    }
		}
		   return maxValor;  	
	}
	
	
	
	private static boolean estaJuegoTerminado (Jugador jugadores[]) {
		for(int i=0;i<jugadores.length; i++) {
			if(!jugadores[i].isTerminado()) {
				return false;
			}
		}
		return true;
	}
}


