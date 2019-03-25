package examenes.ExamenDianaDeDardos;


public class Jugador {
	private String nombre ;
	private int puntuacion;
	private int podium;
	
	public static Jugador instancia = null;
	
	/**
	 * 
	 * @param nombre
	 * @param puntuacion
	 */
	public Jugador(String nombre, int puntuacion) {
		super();
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	} 
	
	public String getNombre() {
		return nombre;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public int getPodium() {
		return podium;
	}

	public void setPodium(int podium) {
		this.podium = podium;
	}


}
