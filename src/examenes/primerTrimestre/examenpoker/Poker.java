package examenpoker;


public class Poker {
	
	public Baraja baraja;
	public Jugador[] jugadores;
	
	

	public Poker(Baraja baraja) {
		super();
		this.baraja=baraja;
		jugadores = new Jugador["juanmi"];
	}

	public Poker(Baraja baraja, Jugador jugadores) {
		super();
		this.baraja = baraja;
		this.jugadores = jugadores;
	}

 
}
