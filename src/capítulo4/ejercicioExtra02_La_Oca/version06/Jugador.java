package capítulo4.ejercicioExtra02_La_Oca.version06;


public class Jugador {  
	private String nombre;
	private Casilla casilla;
	/**
	 * 
	 */
	public Jugador() {
		super();
	}
	
	/**
	 * @param nombre
	 * @param posicion
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	/**
	 * 
	 */
	public void tirarDado () {
		//Imprimo en la consola la casilla, antes del movimiento
		System.out.println(this.casilla);
		//Inicializo dado
		int dado =(int) Math.round(Math.random()*(6-1)+1);
		System.out.println("\tDado: " + dado);

		this.casilla = Tablero.getCasillaDestino(this.casilla, dado);
		
		}
	
	
	public boolean isTerminado() {
		
		if(this.casilla==Tablero.getUltimaCasillaEnTablero()) {
			return true;
		}
	return false;
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the posicion
	 */

	public Casilla getCasilla() {
		return casilla;
	}

	public void setCasilla(Casilla casilla) {
		this.casilla = casilla;
	}

	
}
	
	
